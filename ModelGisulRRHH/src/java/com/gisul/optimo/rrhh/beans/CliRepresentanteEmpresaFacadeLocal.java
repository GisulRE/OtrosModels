/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gisul.optimo.rrhh.beans;

import com.gisul.optimo.rrhh.entity.CliRepresentanteEmpresa;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author eveliz
 */
@Local
public interface CliRepresentanteEmpresaFacadeLocal {

    void create(CliRepresentanteEmpresa cliRepresentanteEmpresa);

    void edit(CliRepresentanteEmpresa cliRepresentanteEmpresa);

    void remove(CliRepresentanteEmpresa cliRepresentanteEmpresa);

    CliRepresentanteEmpresa find(Object id);

    List<CliRepresentanteEmpresa> findAll();

    List<CliRepresentanteEmpresa> findRange(int[] range);

    int count();
    
}
