/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gisul.adm.ejb.par;

import com.gisul.adm.model.par.Globales;
import com.gisul.adm.model.cli.Empresa;
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
public class GlobalesFacade extends AbstractFacade<Globales> implements GlobalesFacadeLocal {

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
    public GlobalesFacade() {
        super(Globales.class);
    }

    /**
     *
     * @param e
     * @return
     */
    @Override
    public List<Globales> findByEmpresa(Empresa e) {
        String consulta;
        consulta = "SELECT g FROM Globales g, Empresa e "
                + " WHERE g.empresa = e "
                + "    AND e = ?1 ";
        Query query = em.createQuery(consulta);
        query.setParameter(1, e);
        return query.getResultList();
    }

    /**
     *
     * @param e
     * @param codigoGlobal
     * @return
     */
    @Override
    public Globales findByCodigo(Empresa e, String codigoGlobal) {
        Globales global = null;
        String consulta;
        consulta = "SELECT g FROM Globales g, Empresa e "
                + " WHERE g.empresa = e "
                + "    AND e = ?1 "
                + "    AND g.codigoGlobal = ?2 ";
        Query query = em.createQuery(consulta);
        query.setParameter(1, e);
        query.setParameter(2, codigoGlobal);

        if (query.getResultList().size() > 0) {
            global = (Globales) query.setMaxResults(1).getSingleResult();
        }

        return global;

    }

}
