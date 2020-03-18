/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gisul.optimo.rrhh.beans;

import com.gisul.optimo.rrhh.entity.RrhCargosEmpleado;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author eveliz
 */
@Local
public interface RrhCargosEmpleadoFacadeLocal {

    void create(RrhCargosEmpleado rrhCargosEmpleado);

    void edit(RrhCargosEmpleado rrhCargosEmpleado);

    void remove(RrhCargosEmpleado rrhCargosEmpleado);

    RrhCargosEmpleado find(Object id);

    List<RrhCargosEmpleado> findAll();

    List<RrhCargosEmpleado> findRange(int[] range);

    int count();
    
}
