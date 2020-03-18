/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gisul.optimo.rrhh.beans;

import com.gisul.optimo.rrhh.entity.PlaBonoEmpleado;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author eveliz
 */
@Local
public interface PlaBonoEmpleadoFacadeLocal {

    void create(PlaBonoEmpleado plaBonoEmpleado);

    void edit(PlaBonoEmpleado plaBonoEmpleado);

    void remove(PlaBonoEmpleado plaBonoEmpleado);

    PlaBonoEmpleado find(Object id);

    List<PlaBonoEmpleado> findAll();

    List<PlaBonoEmpleado> findRange(int[] range);

    int count();
    
}
