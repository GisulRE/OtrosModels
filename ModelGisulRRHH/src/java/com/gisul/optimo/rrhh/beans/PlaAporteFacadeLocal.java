/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gisul.optimo.rrhh.beans;

import com.gisul.optimo.rrhh.entity.PlaAporte;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author eveliz
 */
@Local
public interface PlaAporteFacadeLocal {

    void create(PlaAporte plaAporte);

    void edit(PlaAporte plaAporte);

    void remove(PlaAporte plaAporte);

    PlaAporte find(Object id);

    List<PlaAporte> findAll();

    List<PlaAporte> findRange(int[] range);

    int count();
    
}
