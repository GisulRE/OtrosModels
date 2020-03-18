/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gisul.optimo.rrhh.beans;

import com.gisul.optimo.rrhh.entity.CliPersona;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author eveliz
 */
@Local
public interface CliPersonaFacadeLocal {

    void create(CliPersona cliPersona);

    void edit(CliPersona cliPersona);

    void remove(CliPersona cliPersona);

    CliPersona find(Object id);

    List<CliPersona> findAll();

    List<CliPersona> findRange(int[] range);

    int count();
    
}
