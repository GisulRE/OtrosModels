/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gisul.optimo.rrhh.beans;

import com.gisul.optimo.rrhh.entity.CliEmpresa;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author eveliz
 */
@Stateless
public class CliEmpresaFacade extends AbstractFacade<CliEmpresa> implements CliEmpresaFacadeLocal {
    @PersistenceContext(unitName = "modelRRHHoptimo")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CliEmpresaFacade() {
        super(CliEmpresa.class);
    }
    
}
