/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gisul.adm.ejb.cli;

import com.gisul.adm.model.cli.Cliente;
import com.gisul.adm.model.cli.Empresa;
import com.gisul.adm.model.cli.Persona;
import com.gisul.administracion.utils.ParBusCliente;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Rolando Escobar <Bolitel>
 */
@Local
public interface ClienteFacadeLocal {

   /**
    *
    * @param cliente
    */
   void create(Cliente cliente);

   /**
    *
    * @param cliente
    */
   void edit(Cliente cliente);

   /**
    *
    * @param cliente
    */
   void remove(Cliente cliente);

   /**
    *
    * @param id
    * @return
    */
   Cliente find(Object id);

   /**
    *
    * @return
    */
   List<Cliente> findAll();

   /**
    *
    * @param range
    * @return
    */
   List<Cliente> findRange(int[] range);
   
   /**
    *
    * @param attr
    * @param value
    * @return
    */
   List<Cliente> findByAttr(String attr, Object value);

   /**
    *
    * @return
    */
   int count();

   /**
    *
    * @param idEmpresa
    * @return
    */
   public List<Cliente> findAllByEmpresa(Long idEmpresa);

   /**
    *
    * @param idEmpresa
    * @param attr
    * @param value
    * @return
    */
   public List<Cliente> findAllByCriteria(Long idEmpresa, String attr, Object value);

   /**
    *
    * @param empresa
    * @param idPersona
    * @return
    */
   public Cliente findByPersona(Empresa empresa, Long idPersona);

   /**
    *
    * @param filtros
    * @return
    */
   public int cantidadFiltrados(ParBusCliente filtros);


   public List<Cliente> findByEmpresaLazy(ParBusCliente filtros);
   
}
