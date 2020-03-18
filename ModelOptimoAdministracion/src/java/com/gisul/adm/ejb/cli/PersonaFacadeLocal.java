/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gisul.adm.ejb.cli;

import com.gisul.adm.model.cli.Empresa;
import com.gisul.adm.model.cli.Persona;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Edgar
 */
@Local
public interface PersonaFacadeLocal {

   /**
    *
    * @param persona
    */
   void create(Persona persona);

   /**
    *
    * @param persona
    */
   void edit(Persona persona);

   /**
    *
    * @param persona
    */
   void remove(Persona persona);

   /**
    *
    * @param id
    * @return
    */
   Persona find(Object id);

   /**
    *
    * @return
    */
   List<Persona> findAll();

   /**
    *
    * @param range
    * @return
    */
   List<Persona> findRange(int[] range);

   /**
    *
    * @return
    */
   int count();

   /**
    *
    * @param idEmpresa
    * @param nombre
    * @param paterno
    * @param materno
    * @return
    */
   public List<Persona> findHomonimosNivel1(Long idEmpresa, String nombre, String paterno, String materno);

   /**
    *
    * @param idEmpresa
    * @param nombre
    * @param paterno
    * @return
    */
   public List<Persona> findHomonimosNivel2(Long idEmpresa, String nombre, String paterno);

   /**
    *
    * @param idEmpresa
    * @param nombre
    * @return
    */
   public List<Persona> findHomonimosNivel3(Long idEmpresa, String nombre);

   /**
    *
    * @param idEmpresa
    * @param documento
    * @return
    */
   public Long verificaPorDocumento(Long idEmpresa, String documento);

   /**
    *
    * @param idEmpresa
    * @param nombre
    * @return
    */
   public List<Persona> encuentraHomonimosProveedores(Long idEmpresa, String nombre);

    public List<Persona> buscaPersona(Empresa empresa, String textoBusqueda);

    public Persona findPorDocumento(Long idEmpresa, String documento);

    
}
