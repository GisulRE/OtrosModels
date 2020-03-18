/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gisul.optimo.rrhh.beans;

import com.gisul.optimo.rrhh.entity.PlaAporteLaboral;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author eveliz
 */
@Local
public interface PlaAporteLaboralFacadeLocal {

    void create(PlaAporteLaboral plaAporteLaboral);

    void edit(PlaAporteLaboral plaAporteLaboral);

    void remove(PlaAporteLaboral plaAporteLaboral);

    PlaAporteLaboral find(Object id);

    List<PlaAporteLaboral> findAll();

    List<PlaAporteLaboral> findRange(int[] range);

    int count();
    
}
