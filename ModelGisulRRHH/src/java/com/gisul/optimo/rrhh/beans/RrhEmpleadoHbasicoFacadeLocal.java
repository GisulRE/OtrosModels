/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gisul.optimo.rrhh.beans;

import com.gisul.optimo.rrhh.entity.RrhEmpleadoHbasico;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author eveliz
 */
@Local
public interface RrhEmpleadoHbasicoFacadeLocal {

    void create(RrhEmpleadoHbasico rrhEmpleadoHbasico);

    void edit(RrhEmpleadoHbasico rrhEmpleadoHbasico);

    void remove(RrhEmpleadoHbasico rrhEmpleadoHbasico);

    RrhEmpleadoHbasico find(Object id);

    List<RrhEmpleadoHbasico> findAll();

    List<RrhEmpleadoHbasico> findRange(int[] range);

    int count();
    
}
