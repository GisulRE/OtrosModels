/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gisul.ejb.ctb;

import com.gisul.adm.model.cli.Empresa;
import com.gisul.model.ctb.ParametroContable;
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
public class ParametroContableFacade extends AbstractFacade<ParametroContable> implements ParametroContableFacadeLocal {

    @PersistenceContext(unitName = "ModelOptimoContabilidadPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ParametroContableFacade() {
        super(ParametroContable.class);
    }

    @Override
    public List<ParametroContable> parametrosContables(Empresa empresa) {
        try {
            String jpql = "SELECT pc FROM ParametroContable pc, Empresa e "
                    + " WHERE pc.empresa = e "
                    + " AND e  = ?1 ";
            Query query = em.createQuery(jpql);
            query.setParameter(1, empresa);

            return query.getResultList();

        } catch (Exception e) {
            throw e;
        }
    }
    
    @Override
    public ParametroContable parametroContablePorCodigo(Empresa empresa, String codigoGlobal){
        ParametroContable salida = null;
     try {
            String jpql = "SELECT pc FROM ParametroContable pc, Empresa e "
                    + " WHERE pc.empresa = e "
                    + " AND e  = ?1"
                    + " AND pc.codigoGlobal = ?2 ";
            Query query = em.createQuery(jpql);
            query.setParameter(1, empresa);
            query.setParameter(2, codigoGlobal);

            List<ParametroContable> resultList = query.getResultList();
            
            if (resultList.size() > 0){
               salida = (ParametroContable) resultList.get(0);
            }

        } catch (Exception e) {
            throw e;
        }
     
     return salida;
    }
   

}
 