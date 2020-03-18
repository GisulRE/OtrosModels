/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gisul.optimo.rrhh.beans;

import com.gisul.optimo.rrhh.entity.CliEmpresa;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author eveliz
 */
@Local
public interface CliEmpresaFacadeLocal {

    void create(CliEmpresa cliEmpresa);

    void edit(CliEmpresa cliEmpresa);

    void remove(CliEmpresa cliEmpresa);

    CliEmpresa find(Object id);

    List<CliEmpresa> findAll();

    List<CliEmpresa> findRange(int[] range);

    int count();
    
}
