/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gisul.adm.ejb.cli;

import com.gisul.adm.model.cli.Empresa;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Edgar
 */
@Local
public interface EmpresaFacadeLocal {

   /**
    *
    * @param empresa
    */
   void create(Empresa empresa);

   /**
    *
    * @param empresa
    */
   void edit(Empresa empresa);

   /**
    *
    * @param empresa
    */
   void remove(Empresa empresa);

   /**
    *
    * @param id
    * @return
    */
   Empresa find(Object id);

   /**
    *
    * @return
    */
   List<Empresa> findAll();

   /**
    *
    * @param range
    * @return
    */
   List<Empresa> findRange(int[] range);

   /**
    *
    * @return
    */
   int count();
    
}
