/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gisul.optimo.rrhh.beans;

import com.gisul.optimo.rrhh.entity.PlaAportePatronal;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author eveliz
 */
@Local
public interface PlaAportePatronalFacadeLocal {

    void create(PlaAportePatronal plaAportePatronal);

    void edit(PlaAportePatronal plaAportePatronal);

    void remove(PlaAportePatronal plaAportePatronal);

    PlaAportePatronal find(Object id);

    List<PlaAportePatronal> findAll();

    List<PlaAportePatronal> findRange(int[] range);

    int count();
    
}
