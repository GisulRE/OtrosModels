/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gisul.optimo.rrhh.beans;

import com.gisul.optimo.rrhh.entity.ParDominio;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author eveliz
 */
@Local
public interface ParDominioFacadeLocal {

    void create(ParDominio parDominio);

    void edit(ParDominio parDominio);

    void remove(ParDominio parDominio);

    ParDominio find(Object id);

    List<ParDominio> findAll();

    List<ParDominio> findRange(int[] range);

    int count();
    
}
