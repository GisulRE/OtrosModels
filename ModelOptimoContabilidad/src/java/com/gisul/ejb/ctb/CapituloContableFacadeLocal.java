/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gisul.ejb.ctb;

import com.gisul.adm.model.cli.Empresa;
import com.gisul.model.ctb.CapituloContable;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Rolando Escobar <Bolitel>
 */
@Local
public interface CapituloContableFacadeLocal {

   void create(CapituloContable capituloContable);

   void edit(CapituloContable capituloContable);

   void remove(CapituloContable capituloContable);

   CapituloContable find(Object id);

   List<CapituloContable> findAll();

   List<CapituloContable> findRange(int[] range);

   int count();

   public List<CapituloContable> findAllByEmpresa(Empresa empresa);

   
}
