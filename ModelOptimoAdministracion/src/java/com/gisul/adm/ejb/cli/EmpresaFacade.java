/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gisul.adm.ejb.cli;

import com.gisul.adm.model.cli.Empresa;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Edgar
 */
@Stateless
public class EmpresaFacade extends AbstractFacade<Empresa> implements EmpresaFacadeLocal {
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
   public EmpresaFacade() {
        super(Empresa.class);
    }
    
}
