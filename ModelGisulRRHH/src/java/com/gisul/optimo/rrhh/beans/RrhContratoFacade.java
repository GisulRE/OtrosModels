/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gisul.optimo.rrhh.beans;

import com.gisul.optimo.rrhh.entity.RrhContrato;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author eveliz
 */
@Stateless
public class RrhContratoFacade extends AbstractFacade<RrhContrato> implements RrhContratoFacadeLocal {
    @PersistenceContext(unitName = "modelRRHHoptimo")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public RrhContratoFacade() {
        super(RrhContrato.class);
    }
    
}
