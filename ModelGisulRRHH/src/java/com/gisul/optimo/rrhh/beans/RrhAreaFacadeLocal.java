/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gisul.optimo.rrhh.beans;

import com.gisul.optimo.rrhh.entity.RrhArea;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author eveliz
 */
@Local
public interface RrhAreaFacadeLocal {

    void create(RrhArea rrhArea);

    void edit(RrhArea rrhArea);

    void remove(RrhArea rrhArea);

    RrhArea find(Object id);

    List<RrhArea> findAll();

    List<RrhArea> findRange(int[] range);

    int count();
    
}
