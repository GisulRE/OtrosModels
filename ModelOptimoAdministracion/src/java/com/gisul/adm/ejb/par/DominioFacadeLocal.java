/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gisul.adm.ejb.par;

import com.gisul.adm.model.par.Dominio;
import com.gisul.adm.model.cli.Empresa;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Edgar
 */
@Local
public interface DominioFacadeLocal {

   /**
    *
    * @param dominio
    */
   void create(Dominio dominio);

   /**
    *
    * @param dominio
    */
   void edit(Dominio dominio);

   /**
    *
    * @param dominio
    */
   void remove(Dominio dominio);

   /**
    *
    * @param id
    * @return
    */
   Dominio find(Object id);

   /**
    *
    * @return
    */
   List<Dominio> findAll();

   /**
    *
    * @param range
    * @return
    */
   List<Dominio> findRange(int[] range);

   /**
    *
    * @return
    */
   int count();
    


    public List<Dominio> listarDominioAlfabetico(Empresa empresa, String Dominio, String SubDominio);

    public List<Dominio> listarDominioOwner(Empresa empresa, String Dominio, String SubDominio, String tipoValor);

    public Dominio consultaParDominio(Empresa empresa, String dom, String subdom, String valor);

    public List<Dominio> listarDominio(Empresa empresa, String Dominio, String SubDominio);
    
}
