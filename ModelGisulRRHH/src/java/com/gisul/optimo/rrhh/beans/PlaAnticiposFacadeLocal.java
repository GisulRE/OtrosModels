/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gisul.optimo.rrhh.beans;

import com.gisul.optimo.rrhh.entity.PlaAnticipos;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author eveliz
 */
@Local
public interface PlaAnticiposFacadeLocal {

    void create(PlaAnticipos plaAnticipos);

    void edit(PlaAnticipos plaAnticipos);

    void remove(PlaAnticipos plaAnticipos);

    PlaAnticipos find(Object id);

    List<PlaAnticipos> findAll();

    List<PlaAnticipos> findRange(int[] range);

    int count();
    
}
