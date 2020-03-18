/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gisul.optimo.rrhh.beans;

import com.gisul.optimo.rrhh.entity.PlaBono;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author eveliz
 */
@Local
public interface PlaBonoFacadeLocal {

    void create(PlaBono plaBono);

    void edit(PlaBono plaBono);

    void remove(PlaBono plaBono);

    PlaBono find(Object id);

    List<PlaBono> findAll();

    List<PlaBono> findRange(int[] range);

    int count();
    
}
