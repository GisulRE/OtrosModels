/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gisul.optimo.rrhh.beans;

import com.gisul.optimo.rrhh.entity.PlaPlanilla;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author eveliz
 */
@Local
public interface PlaPlanillaFacadeLocal {

    void create(PlaPlanilla plaPlanilla);

    void edit(PlaPlanilla plaPlanilla);

    void remove(PlaPlanilla plaPlanilla);

    PlaPlanilla find(Object id);

    List<PlaPlanilla> findAll();

    List<PlaPlanilla> findRange(int[] range);

    int count();
    
}
