/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gisul.adm.ejb.par;

import com.gisul.adm.model.par.Globales;
import com.gisul.adm.model.cli.Empresa;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Edgar
 */
@Local
public interface GlobalesFacadeLocal {

   /**
    *
    * @param globales
    */
   void create(Globales globales);

   /**
    *
    * @param globales
    */
   void edit(Globales globales);

   /**
    *
    * @param globales
    */
   void remove(Globales globales);

   /**
    *
    * @param id
    * @return
    */
   Globales find(Object id);

   /**
    *
    * @return
    */
   List<Globales> findAll();

   /**
    *
    * @param range
    * @return
    */
   List<Globales> findRange(int[] range);

   /**
    *
    * @return
    */
   int count();


    public Globales findByCodigo(Empresa e, String codigoGlobal);

     public List<Globales> findByEmpresa(Empresa e);
    
    
}
