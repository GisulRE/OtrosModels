/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gisul.adm.ejb.cli;

import com.gisul.adm.model.cli.Empresa;
import com.gisul.adm.model.cli.Persona;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Edgar
 */
@Stateless
public class PersonaFacade extends AbstractFacade<Persona> implements PersonaFacadeLocal {

    @PersistenceContext(unitName = "ModelOptimoAdministracionPU")
    private EntityManager em;

    /**
     *
     * @return
     */
    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    /**
     *
     */
    public PersonaFacade() {
        super(Persona.class);
    }

    /**
     *
     * @param idEmpresa
     * @param nombre
     * @param paterno
     * @param materno
     * @return
     */
    @Override
    public List<Persona> findHomonimosNivel1(Long idEmpresa, String nombre, String paterno, String materno) {
        try {
            String jpql = "SELECT p FROM Empresa e, Persona p "
                    + " WHERE p.empresa = e "
                    + "   AND e.idEmpresa = ?1 "
                    + "   AND UPPER(p.nombre) like UPPER(?2) "
                    + "   AND UPPER(p.apellidoPaterno) LIKE UPPER(?3) "
                    + "   AND UPPER(p.apellidoMaterno) LIKE UPPER(?4) "
                    + " ORDER BY p.fechaAlta desc ";

            Query query = em.createQuery(jpql);

            if (nombre == null) {
                nombre = "";
            }
            if (paterno == null) {
                paterno = "";
            }
            if (materno == null) {
                materno = "";
            }

            query.setParameter(1, idEmpresa);

            if (nombre.length() == 0) {
                query.setParameter(2, nombre);
            } else {
                query.setParameter(2, nombre.concat("%"));
            }

            if (paterno.length() == 0) {
                query.setParameter(3, paterno);
            } else {
                query.setParameter(3, paterno.concat("%"));
            }

            if (materno.length() == 0) {
                query.setParameter(4, materno);
            } else {
                query.setParameter(4, materno.concat("%"));
            }

            return query.getResultList();

        } catch (Exception e) {
            throw e;
        }
    }

    /**
     *
     * @param idEmpresa
     * @param nombre
     * @param paterno
     * @return
     */
    @Override
    public List<Persona> findHomonimosNivel2(Long idEmpresa, String nombre, String paterno) {
        try {
            String jpql = "SELECT p FROM Empresa e, Persona p "
                    + " WHERE p.empresa = e "
                    + "   AND e.idEmpresa = ?1 "
                    + "   AND UPPER(p.nombre) like UPPER(?2)"
                    + "   AND UPPER(p.apellidoPaterno) LIKE UPPER(?3) "
                    + " ORDER BY p.fechaAlta desc ";
            Query query = em.createQuery(jpql);
            query.setParameter(1, idEmpresa);
            if (nombre == null) {
                nombre = "";
            }
            if (paterno == null) {
                paterno = "";
            }

            if (nombre.length() == 0) {
                query.setParameter(2, nombre);
            } else {
                query.setParameter(2, nombre.concat("%"));
            }

            if (paterno.length() == 0) {
                query.setParameter(3, paterno);
            } else {
                query.setParameter(3, paterno.concat("%"));
            }

            return query.getResultList();

        } catch (Exception e) {
            throw e;
        }
    }

    /**
     *
     * @param idEmpresa
     * @param nombre
     * @return
     */
    @Override
    public List<Persona> findHomonimosNivel3(Long idEmpresa, String nombre) {
        try {
            String jpql = "SELECT p FROM Empresa e, Persona p "
                    + " WHERE p.empresa = e "
                    + "   AND e.idEmpresa = ?1 "
                    + "   AND UPPER(p.nombre) like UPPER(?2)"
                    + " ORDER BY p.fechaAlta desc ";

            Query query = em.createQuery(jpql);
            query.setParameter(1, idEmpresa);

            if (nombre == null) {
                nombre = "";
            }

            if (nombre.length() == 0) {
                query.setParameter(2, nombre);
            } else {
                query.setParameter(2, nombre.concat("%"));
            }
            return query.getResultList();

        } catch (Exception e) {
            throw e;
        }
    }

    /**
     *
     * @param idEmpresa
     * @param nombre
     * @return
     */
    @Override
    public List<Persona> encuentraHomonimosProveedores(Long idEmpresa, String nombre) {
        try {
            String jpql = ""
                    + " SELECT p FROM Empresa e, Persona p"
                    + "  WHERE p.empresa = e  "
                    + "    AND e.idEmpresa = ?1 "
                    + "    AND UPPER(p.nombre) like UPPER(?2) "
                    + "  ORDER BY p.fechaAlta desc  ";

            Query query = em.createQuery(jpql);
            query.setParameter(1, idEmpresa);

            if (nombre == null) {
                nombre = "";
            }

            if (nombre.length() == 0) {
                query.setParameter(2, nombre);
            } else {
                query.setParameter(2, nombre.concat("%"));
            }
            return query.getResultList();

        } catch (Exception e) {
            throw e;
        }

    }

    /**
     *
     * @param idEmpresa
     * @param documento
     * @return
     */
    @Override
    public Long verificaPorDocumento(Long idEmpresa, String documento) {
        String consulta = "";
        Long contador = Long.valueOf("0");

        try {
            // Verifica si esta en una Dosificacion
            consulta = "SELECT COUNT(p) FROM  Empresa e, Persona p "
                    + "   WHERE p.empresa = e "
                    + "     AND e.idEmpresa = ?1 "
                    + "     AND p.valorDocumento like ?2 ";
            Query query = em.createQuery(consulta);
            query.setParameter(1, idEmpresa);
            query.setParameter(2, documento.concat("%"));

            contador = (Long) query.getSingleResult();

        } catch (Exception e) {
            throw e;
        }
        return contador;
    }

    @Override
    public List<Persona> buscaPersona(Empresa empresa, String textoBusqueda) {
        String consulta = "";

        // Verifica si esta en una Dosificacion
        consulta = "SELECT p FROM  Empresa e, Persona p "
                + "   WHERE p.empresa = e "
                + "     AND e = ?1 "
                + "     AND  ( UPPER(p.nombre) like   UPPER(CONCAT('%', ?2 , '%')) "
                + "      OR UPPER(p.nombre) like   UPPER(CONCAT('%', ?3 , '%'))"
                + "      OR UPPER(p.apellidoPaterno)  like UPPER(CONCAT('%', ?4 , '%')) "
                + "      OR UPPER(p.apellidoMaterno) like UPPER(CONCAT('%', ?5 , '%')) "
                + "      OR UPPER(p.valorDocumento)  like UPPER(CONCAT('%', ?6 , '%'))) ";

        Query query = em.createQuery(consulta);
        query.setParameter(1, empresa);
        query.setParameter(2, textoBusqueda);
        query.setParameter(3, textoBusqueda);
        query.setParameter(4, textoBusqueda);
        query.setParameter(5, textoBusqueda);
        query.setParameter(6, textoBusqueda);

        return query.getResultList();

    }

    @Override
    public Persona findPorDocumento(Long idEmpresa, String documento) {
        String consulta = "";
        Persona encontrado = null;

        // Verifica si esta en una Dosificacion
        consulta = "SELECT p FROM  Empresa e, Persona p "
                + "   WHERE p.empresa = e "
                + "     AND e.idEmpresa = ?1 "
                + "     AND p.valorDocumento = ?2 ";
        Query query = em.createQuery(consulta);
        query.setParameter(1, idEmpresa);
        query.setParameter(2, documento);

        if (query.getResultList().isEmpty()) {
            return null;
        }
        encontrado = (Persona) query.getSingleResult();
        return encontrado;
    }
}
