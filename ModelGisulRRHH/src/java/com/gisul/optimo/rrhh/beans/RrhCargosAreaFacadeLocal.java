/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gisul.optimo.rrhh.beans;

import com.gisul.optimo.rrhh.entity.RrhCargosArea;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author eveliz
 */
@Local
public interface RrhCargosAreaFacadeLocal {

    void create(RrhCargosArea rrhCargosArea);

    void edit(RrhCargosArea rrhCargosArea);

    void remove(RrhCargosArea rrhCargosArea);

    RrhCargosArea find(Object id);

    List<RrhCargosArea> findAll();

    List<RrhCargosArea> findRange(int[] range);

    int count();
    
}
