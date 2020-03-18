/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gisul.ejb.ctb;

import com.gisul.adm.model.cli.Empresa;
import com.gisul.model.ctb.AuxiliarCuenta;
import com.gisul.model.ctb.AuxiliarCuentaDetalle;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Rolando Escobar <Bolitel>
 */
@Local
public interface AuxiliarCuentaFacadeLocal {

   void create(AuxiliarCuenta auxiliarCuenta);

   void edit(AuxiliarCuenta auxiliarCuenta);

   void remove(AuxiliarCuenta auxiliarCuenta);

   AuxiliarCuenta find(Object id);

   List<AuxiliarCuenta> findAll();

   List<AuxiliarCuenta> findRange(int[] range);

   int count();

   public List<AuxiliarCuenta> findAllByEmpresa(Empresa empresa);

   public void transaccionGrabaAuxiliarCuenta(AuxiliarCuenta ac, List<AuxiliarCuentaDetalle> acd);
   
}
