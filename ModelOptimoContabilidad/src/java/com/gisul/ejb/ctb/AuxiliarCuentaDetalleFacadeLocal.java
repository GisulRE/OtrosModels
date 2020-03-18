/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gisul.ejb.ctb;

import com.gisul.adm.model.cli.Empresa;
import com.gisul.model.ctb.AuxiliarCuentaDetalle;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Rolando Escobar <Bolitel>
 */
@Local
public interface AuxiliarCuentaDetalleFacadeLocal {

   void create(AuxiliarCuentaDetalle auxiliarCuentaDetalle);

   void edit(AuxiliarCuentaDetalle auxiliarCuentaDetalle);

   void remove(AuxiliarCuentaDetalle auxiliarCuentaDetalle);

   AuxiliarCuentaDetalle find(Object id);

   List<AuxiliarCuentaDetalle> findAll();

   List<AuxiliarCuentaDetalle> findRange(int[] range);

   int count();

   public List<AuxiliarCuentaDetalle> findAllByEmpresa(Empresa empresa);
   
}
