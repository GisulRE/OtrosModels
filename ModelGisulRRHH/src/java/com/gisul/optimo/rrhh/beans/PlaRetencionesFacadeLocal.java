/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gisul.optimo.rrhh.beans;

import com.gisul.optimo.rrhh.entity.PlaRetenciones;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author eveliz
 */
@Local
public interface PlaRetencionesFacadeLocal {

    void create(PlaRetenciones plaRetenciones);

    void edit(PlaRetenciones plaRetenciones);

    void remove(PlaRetenciones plaRetenciones);

    PlaRetenciones find(Object id);

    List<PlaRetenciones> findAll();

    List<PlaRetenciones> findRange(int[] range);

    int count();
    
}
