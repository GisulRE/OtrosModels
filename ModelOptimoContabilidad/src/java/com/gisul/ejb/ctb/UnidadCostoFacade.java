/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gisul.ejb.ctb;

import com.gisul.adm.model.cli.Empresa;
import com.gisul.model.ctb.UnidadCosto;
import com.gisul.administracion.utils.CentrosDeCosto;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Rolando Escobar <Bolitel>
 */
@Stateless
public class UnidadCostoFacade extends AbstractFacade<UnidadCosto> implements UnidadCostoFacadeLocal {

    @PersistenceContext(unitName = "ModelOptimoContabilidadPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UnidadCostoFacade() {
        super(UnidadCosto.class);
    }

    /**
     *
     * @param empresa
     * @return
     */
    @Override
    public UnidadCosto firstUnidadDeNegocio(Empresa empresa) {
        try {
            String jpql = "SELECT uc FROM Empresa e, UnidadCosto uc "
                    + " WHERE uc.empresa = e "
                    + " AND e  = ?1 "
                    + " AND uc.idPadre = 0 "
                    + " ORDER BY uc.nombre ";
            Query query = em.createQuery(jpql);
            query.setParameter(1, empresa);

            return (UnidadCosto) query.setMaxResults(1).getSingleResult();

        } catch (Exception e) {
            throw e;
        }
    }

    /**
     *
     * @param empresa
     * @return
     */
    @Override
    public List<UnidadCosto> unidadesDeNegocio(Empresa empresa) {

        List<UnidadCosto> salida = new ArrayList<>();
        try {
            String jpql = "SELECT uc FROM Empresa e, UnidadCosto uc "
                    + " WHERE uc.empresa = e "
                    + " AND e  = ?1 "
                    + " AND uc.idPadre = 0 "
                    + " ORDER BY uc.nombre ";
            Query query = em.createQuery(jpql);
            query.setParameter(1, empresa);

            List<UnidadCosto> resultList = query.getResultList();

            for (UnidadCosto uni : resultList) {
                salida.add(uni);  // Adiciona Padre a la salida
                jpql = "SELECT uc FROM UnidadCosto uc"
                        + " WHERE uc.idPadre = ?1 ";
                query = em.createQuery(jpql);
                query.setParameter(1, uni.getIdUnidad());

                List<UnidadCosto> hijos = query.getResultList();
                for (UnidadCosto sal : hijos) {
                    salida.add(sal); // Adiciona hijo a la salida
                }

            }

        } catch (Exception e) {
            throw e;
        }

        return salida;
    }

    @Override
    public List<UnidadCosto> MostrarUnidadesNegocio(Empresa empresa, String estado) {
        String estadoInicial = "", estadoFinal = "";
        List<UnidadCosto> salida = new ArrayList<>();
        try {
            String jpql = "SELECT uc FROM Empresa e, UnidadCosto uc "
                    + " WHERE uc.empresa = e "
                    + " AND e  = ?1 "
                    + " AND uc.idPadre = 0 "
                    + " ORDER BY uc.nombre ";
            Query query = em.createQuery(jpql);
            query.setParameter(1, empresa);

            List<UnidadCosto> resultList = query.getResultList();

            for (UnidadCosto uni : resultList) {
                salida.add(uni);  // Adiciona Padre a la salida
                jpql = "SELECT uc FROM UnidadCosto uc"
                        + " WHERE uc.idPadre = ?1 ";
                query = em.createQuery(jpql);
                query.setParameter(1, uni.getIdUnidad());

                List<UnidadCosto> hijos = query.getResultList();
                for (UnidadCosto sal : hijos) {
                    salida.add(sal); // Adiciona hijo a la salida

                    jpql = "SELECT uc FROM UnidadCosto uc"
                            + " WHERE uc.idPadre = ?1 ";
                    query = em.createQuery(jpql);
                    query.setParameter(1, sal.getIdUnidad());

                    List<UnidadCosto> nietos = query.getResultList();

                    for (UnidadCosto nieto : nietos) {
                        salida.add(nieto);
                    }
                }

            }

        } catch (Exception e) {
            throw e;
        }

        List<UnidadCosto> listaFinal= new ArrayList<>();
        for(UnidadCosto sal : salida){
           if (estado.equals("%")){
               listaFinal.add(sal);
           } else {
             if (estado.equals(sal.getEstado())){
               listaFinal.add(sal);
             }
           }
        }
        return listaFinal;
    }

    /**
     *
     * @param empresa
     * @param unidadCosto
     * @return
     */
    @Override
    public List<CentrosDeCosto> centrosDeCosto(Empresa empresa, long unidadCosto) {
        try {
            String jpql = "SELECT new com.eveliz.utils.CentrosDeCosto(c.idUnidad, c.empresa, c.idPadre, c.codigo, c.nombre, c.tipo, c.estado, "
                    + "                                               c.fechaAlta, c.usuarioAlta, c.fechaModificacion, c.usuarioModificacion, "
                    + "                                               c.fechaBaja, c.usuarioBaja, (select uc.nombre from UnidadCosto uc  "
                    + "          where uc.idUnidad = c.idPadre) ) from UnidadCosto c, Empresa e  "
                    + " WHERE c.empresa = e "
                    + " AND e  = ?1 "
                    + " AND c.idPadre != 0 "
                    + " AND c.idPadre = ?2 "
                    + " ORDER BY c.idPadre, c.nombre ";

            Query query = em.createQuery(jpql);
            query.setParameter(1, empresa);
            query.setParameter(2, unidadCosto);

            return query.getResultList();

        } catch (Exception e) {
            throw e;
        }
    }

}
