/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gisul.ejb.ctb;

import com.gisul.adm.model.cli.Empresa;
import com.gisul.model.ctb.CapituloContable;
import com.gisul.model.ctb.CuentaContable;
import com.gisul.administracion.utils.CuentaExcel;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Rolando Escobar <Bolitel>
 */
@Stateless
public class CuentaContableFacade extends AbstractFacade<CuentaContable> implements CuentaContableFacadeLocal {

    @PersistenceContext(unitName = "ModelOptimoContabilidadPU")
    private EntityManager em;
    @EJB
    private CapituloContableFacadeLocal capituloEJB;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CuentaContableFacade() {
        super(CuentaContable.class);
    }

    @Override
    public List<CuentaContable> cuentasContables(Empresa empresa) {
        try {
            String jpql = "SELECT cc FROM CuentaContable cc, Empresa e "
                    + " WHERE cc.empresa = e "
                    + " AND e  = ?1 "
                    + " ORDER BY cc.cuenta desc ";
            Query query = em.createQuery(jpql);
            query.setParameter(1, empresa);

            return query.getResultList();

        } catch (Exception e) {
            throw e;
        }
    }
   
    @Override
    public List<CuentaContable> cuentasContablesPorCriterio(Empresa empresa, String busqueda, Integer nivel,
            String estadoInicial, String estadoFinal,
            boolean verNivel6) {
        try {
            Query query;
            if (!verNivel6) {
                String jpql = "SELECT cc FROM CuentaContable cc, Empresa e "
                        + "     WHERE cc.empresa = e "
                        + "       AND e  = ?1 "
                        + "       AND (upper(cc.cuenta) like UPPER(CONCAT('%', ?2, '%')) "
                        + "             OR  upper(cc.nombre) like UPPER(CONCAT('%', ?3, '%')))"
                        + "       AND cc.nivel between 1 and ?4 "
                        + "       AND cc.estado IN (?5, ?6) "
                        + "    ORDER BY cc.cuenta desc  ";
                query = em.createQuery(jpql);
                query.setParameter(1, empresa);
                query.setParameter(2, busqueda);
                query.setParameter(3, busqueda);
                query.setParameter(4, nivel);
                query.setParameter(5, estadoInicial);
                query.setParameter(6, estadoFinal);
            } else {
                String jpql = "SELECT cc FROM CuentaContable cc, Empresa e "
                        + "     WHERE cc.empresa = e "
                        + "       AND e  = ?1 "
                        + "       AND (upper(cc.cuenta) like UPPER(CONCAT('%', ?2, '%')) "
                        + "             OR  upper(cc.nombre) like UPPER(CONCAT('%', ?3, '%')))"
                        + "       AND cc.nivel between 1 and 6 "
                        + "       AND cc.estado IN (?4, ?5)"
                        + "    ORDER BY cc.cuenta desc  ";
                query = em.createQuery(jpql);
                query.setParameter(1, empresa);
                query.setParameter(2, busqueda);
                query.setParameter(3, busqueda);
                query.setParameter(4, estadoInicial);
                query.setParameter(5, estadoFinal);
            }

            /*
             SELECT cc FROM CuentaContable cc, Empresa e 
             WHERE cc.empresa = e 
             AND e.idEmpresa  = 1 
             AND (upper(cc.cuenta) like UPPER(CONCAT('%', '%')) 
             OR  upper(cc.nombre) like UPPER(CONCAT('%', '%')))
             AND cc.nivel between 0 and 3
             AND cc.estado IN ('A','B')
             ORDER BY cc.cuenta asc 
             */
            return query.getResultList();

        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public CapituloContable obtieneCapituloContable(Empresa empresa, int capitulo) {

        CapituloContable salida = null;
        try {
            String jpql = "SELECT cc FROM CapituloContable cc, Empresa e "
                    + "     WHERE cc.empresa = e "
                    + "       AND e  = ?1 "
                    + "       AND cc.nroCuenta = ?2 ";
            Query query = em.createQuery(jpql);

            query.setParameter(1, empresa);
            query.setParameter(2, capitulo);

            List<CapituloContable> lista = query.getResultList();
            if (lista != null) {
                if (lista.size() > 0) {
                    salida = lista.get(0);
                }
            }

            return salida;

        } catch (Exception e) {
            throw e;
        }

    }

    //  get idpadre  ( string Cuenta,nivel)
    /**
     *
     * @param empresa
     * @param cuenta
     * @return
     */
    @Override
    public CuentaContable ConsultaCuenta(Empresa empresa, String cuenta) {

        CuentaContable salida = null;
        try {
            String jpql = "SELECT cc FROM CuentaContable cc, Empresa e "
                    + "     WHERE cc.empresa = e "
                    + "       AND e  = ?1 "
                    + "       AND cc.cuenta = ?2 ";
            Query query = em.createQuery(jpql);

            query.setParameter(1, empresa);
            query.setParameter(2, cuenta);

            List<CuentaContable> lista = query.getResultList();
            if (lista != null) {
                if (lista.size() > 0) {
                    salida = lista.get(0);
                }
            }

            return salida;

        } catch (Exception e) {
            throw e;
        }

    }

    /**
     *
     * @param padre
     * @param nroCuenta
     * @return
     */
    @Override
    public Long verificaNroCuenta(CuentaContable padre, Long nroCuenta) {
        Long contador;
        try {
            String jpql = "SELECT count(cc) "
                    + "      FROM CuentaContable cc, Empresa e  "
                    + "     WHERE cc.empresa = e  "
                    + "       and e = ?1 "
                    + "and cc.padre = ?2 "
                    + "and cc.nroCuenta = ?3 ";
            Query query = em.createQuery(jpql);

            query.setParameter(1, padre.getEmpresa());
            query.setParameter(2, padre.getIdCuenta());
            query.setParameter(3, nroCuenta);
            contador = (long) query.getSingleResult();

        } catch (Exception e) {
            throw e;
        }
        return contador;

    }

    @Override
    public Map<String, Object> CargaCuentasExcel(Empresa empresa, List<CuentaExcel> datos) {
        Map<String, Object> map = new HashMap<>();
        int totalProcesadas = 0;
        int totalErradas = 0;
        int totalInsertadas = 0;
        System.out.println("Total Filas recepcionadas : " + datos.size());
        List<CuentaExcel> cuentasErradas = new ArrayList<>();
        int idPadre = 0;
        for (CuentaExcel ex : datos) {
            System.out.println("cuenta a procesar : " + ex.getCuenta());
            totalProcesadas++;
            CuentaContable cuenta = new CuentaContable();
            CapituloContable capitulo = encuentraCapitulo(ex.getCuenta());
            if (capitulo != null) {
                System.out.println("Capitulo Contable encontrado : " + capitulo.getNombre());

                cuenta.setCapituloContable(capitulo);
                cuenta.setCuenta(String.valueOf(ex.getCuenta()));
                cuenta.setEmpresa(empresa);
                cuenta.setEstado("A");
                cuenta.setFechaAlta(new Date());
                cuenta.setMoneda(ex.getMoneda());
                cuenta.setNivel(ex.getNivel());
                cuenta.setNombre(ex.getNombre());

                cuenta.setNroCuenta(obtenerNroCuenta(String.valueOf(ex.getCuenta())));

                System.out.println("Nro. de Cuentra a insertar : " + cuenta.getNroCuenta());
                if (ex.getNivel() == 1) {
                    cuenta.setPadre(Long.valueOf(0));
                } else {

                    CuentaContable obtienePadre = obtienePadre(empresa, String.valueOf(ex.getCuenta()));

                    if (obtienePadre != null) {
                        System.out.println("Padre Entontrado : " + obtienePadre.getCuenta() + " - " + obtienePadre.getNombre());
                    } else {
                        System.out.println("No tiene Padre");
                    }
                    if (obtienePadre != null) {
                        cuenta.setPadre(Long.valueOf(obtienePadre.getIdCuenta()) );

                        // Verifica si cuenta ya esta registrada
                        CuentaContable ConsultaCuenta = ConsultaCuenta(empresa, cuenta.getCuenta());
                        if (ConsultaCuenta == null) {
                            totalInsertadas++;
                            ex.setError(false);
                            ex.setObservaciones("OK");
                            cuentasErradas.add(ex);
                            cuenta.setUsuarioAlta(ex.getUsuarioAlta());
                            em.persist(cuenta);
                        } else {
                            totalErradas++;
                            ex.setError(true);
                            ex.setObservaciones("Cuenta ya Registrada");
                            cuentasErradas.add(ex);
                        }
                    } else {
                        totalErradas++;
                        ex.setError(true);
                        ex.setObservaciones("No tiene Cuenta Padre");
                        cuentasErradas.add(ex);
                    }
                }

            }
        }

        map.put("lista", cuentasErradas);
        map.put("total_procesadas", totalProcesadas);
        map.put("total_erradas", totalErradas);
        map.put("total_insertadas", totalInsertadas);
        return map;
    }

    public CapituloContable encuentraCapitulo(long cuenta) {
        String cadena = String.valueOf(cuenta);
        String capitulo = cadena.substring(0, 1);
        CapituloContable cap = capituloEJB.find(Long.valueOf(capitulo));
        return cap;
    }

    public Long obtenerNroCuenta(String cuenta) {
        // Obtener el tamaño del string de la cuenta
        int size = cuenta.length();
        String valor = "";
        switch (size) {
            case 1:  // Nivel 1
                valor = right(cuenta, 1);
                break;
            case 2: // Nivel 2
                valor = right(cuenta, 1);
                break;
            case 3: // Nivel 3
                valor = right(cuenta, 1);
                break;
            case 4:  // Nivel 3
                valor = right(cuenta, 2);
                break;
            case 6:  // Nivel 4
                valor = right(cuenta, 3);
                break;
            case 8:  // Nivel 5 1.1.01.01.01
                valor = right(cuenta, 2);
                break;
            case 10:  // Nivel 6
                valor = right(cuenta, 2);
                break;
        }

        Long salida = Long.valueOf(valor);
        return salida;
    }

    public String right(String value, int length) {
        // To get right characters from a string, change the begin index.
        return value.substring(value.length() - length);
    }

    public CuentaContable obtienePadre(Empresa empresa, String cuenta) {
        // Obtener el tamaño del string de la cuenta
        int size = cuenta.length();
        String valor = "";
        System.out.println("Tamaño de la cuenta : " + size);
        switch (size) {
            case 2: // Nivel 2 Obtiene cuenta del Padre
                valor = cuenta.substring(0, 1);
                break;
            case 4:  // Nivel 3  1.1.01
                valor = cuenta.substring(0, 2);
                break;
            case 6:  // Nivel 4 1.1.01.01
                valor = cuenta.substring(0, 4);
                break;
            case 8:  // Nivel 5 1.1.01.01.01
                valor = cuenta.substring(0, 6);
                break;
            case 10:  // Nivel 6
                valor = cuenta.substring(0, 8);
                break;
        }

        System.out.println("Valor a Buscar en Consulta Cuenta : " + valor);
        CuentaContable ConsultaCuenta = this.ConsultaCuenta(empresa, valor);

        return ConsultaCuenta;
    }


}
