/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gisul.ejb.ctb;

import com.gisul.adm.model.cli.Empresa;
import com.gisul.model.ctb.GrupoBanco;
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
public class GrupoBancoFacade extends AbstractFacade<GrupoBanco> implements GrupoBancoFacadeLocal {

    @PersistenceContext(unitName = "ModelOptimoContabilidadPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public GrupoBancoFacade() {
        super(GrupoBanco.class);
    }

    @Override
    public List<GrupoBanco> listaGrupoBancos(Empresa empresa) {
        try {
            String jpql = "SELECT gb FROM GrupoBanco gb, Empresa e "
                    + " WHERE gb.empresa = e "
                    + " AND e  = ?1 ";
            Query query = em.createQuery(jpql);
            query.setParameter(1, empresa);

            return query.getResultList();

        } catch (Exception e) {
            throw e;
        }
    }
   


}
