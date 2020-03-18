/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gisul.ejb.ctb;

import com.gisul.adm.model.cli.Empresa;
import com.gisul.model.ctb.RegionalSucursal;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Rolando Escobar <Bolitel>
 */
@Local
public interface RegionalSucursalFacadeLocal {

   void create(RegionalSucursal regionalSucursal);

   void edit(RegionalSucursal regionalSucursal);

   void remove(RegionalSucursal regionalSucursal);

   RegionalSucursal find(Object id);

   List<RegionalSucursal> findAll();

   List<RegionalSucursal> findRange(int[] range);

   int count();

    public List<RegionalSucursal> findByEmpresa(Empresa empresa);

   
}
