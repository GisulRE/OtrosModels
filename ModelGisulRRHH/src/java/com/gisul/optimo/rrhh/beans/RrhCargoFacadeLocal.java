/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gisul.optimo.rrhh.beans;

import com.gisul.optimo.rrhh.entity.RrhCargo;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author eveliz
 */
@Local
public interface RrhCargoFacadeLocal {

    void create(RrhCargo rrhCargo);

    void edit(RrhCargo rrhCargo);

    void remove(RrhCargo rrhCargo);

    RrhCargo find(Object id);

    List<RrhCargo> findAll();

    List<RrhCargo> findRange(int[] range);

    int count();
    
}
