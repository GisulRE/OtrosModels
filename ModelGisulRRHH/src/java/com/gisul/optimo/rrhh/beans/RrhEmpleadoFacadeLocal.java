/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gisul.optimo.rrhh.beans;

import com.gisul.optimo.rrhh.entity.RrhEmpleado;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author eveliz
 */
@Local
public interface RrhEmpleadoFacadeLocal {

    void create(RrhEmpleado rrhEmpleado);

    void edit(RrhEmpleado rrhEmpleado);

    void remove(RrhEmpleado rrhEmpleado);

    RrhEmpleado find(Object id);

    List<RrhEmpleado> findAll();

    List<RrhEmpleado> findRange(int[] range);

    int count();
    
}
