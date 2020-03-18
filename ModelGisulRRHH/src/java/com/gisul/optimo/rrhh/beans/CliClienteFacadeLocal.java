/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gisul.optimo.rrhh.beans;

import com.gisul.optimo.rrhh.entity.CliCliente;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author eveliz
 */
@Local
public interface CliClienteFacadeLocal {

    void create(CliCliente cliCliente);

    void edit(CliCliente cliCliente);

    void remove(CliCliente cliCliente);

    CliCliente find(Object id);

    List<CliCliente> findAll();

    List<CliCliente> findRange(int[] range);

    int count();
    
}
