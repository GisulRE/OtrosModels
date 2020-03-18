/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gisul.optimo.rrhh.beans;

import com.gisul.optimo.rrhh.entity.RrhContrato;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author eveliz
 */
@Local
public interface RrhContratoFacadeLocal {

    void create(RrhContrato rrhContrato);

    void edit(RrhContrato rrhContrato);

    void remove(RrhContrato rrhContrato);

    RrhContrato find(Object id);

    List<RrhContrato> findAll();

    List<RrhContrato> findRange(int[] range);

    int count();
    
}
