/**
 * Nombre : .java Version : 1.0.0 Creado : Copyright(c) {2016} Bolitel S.R.L.
 * All Rights Reserved. This software is the proprietary information of Bolitel
 * S.R.L.
 *
 * @author Rolando Escobar <Bolitel>
 */

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.     
 */
package com.gisul.administracion.utils;

import com.gisul.adm.model.cli.Empresa;
import java.io.Serializable;

/**
 *
 * @author desarrollo
 */
public class ParBusCliente implements Serializable {
   
   private String nombreCliente;
   private String razonSocial;
   private String telefono;
   private String email;
   private String nit;
   
   private int primerRegistro;
   private int cantidadRegistros;
   private String propiedadOrdenacion;
   private boolean ascendente;
   private Empresa empresa;

   //<editor-fold defaultstate="collapsed" desc="DEFINICION DE ATRIBUTOS">
   /**
    *
    * @return
    */
   public String getNombreCliente() {
      return nombreCliente;
   }

   /**
    *
    * @param nombreCliente
    */
   public void setNombreCliente(String nombreCliente) {
      this.nombreCliente = nombreCliente;
   }

   /**
    *
    * @return
    */
   public String getRazonSocial() {
      return razonSocial;
   }

   /**
    *
    * @param razonSocial
    */
   public void setRazonSocial(String razonSocial) {
      this.razonSocial = razonSocial;
   }

   /**
    *
    * @return
    */
   public String getTelefono() {
      return telefono;
   }

   /**
    *
    * @param telefono
    */
   public void setTelefono(String telefono) {
      this.telefono = telefono;
   }

   /**
    *
    * @return
    */
   public String getEmail() {
      return email;
   }

   /**
    *
    * @param email
    */
   public void setEmail(String email) {
      this.email = email;
   }

   /**
    *
    * @return
    */
   public String getNit() {
      return nit;
   }

   /**
    *
    * @param nit
    */
   public void setNit(String nit) {
      this.nit = nit;
   }
   
   public int getPrimerRegistro() {
      return primerRegistro;
   }
   
   public void setPrimerRegistro(int primerRegistro) {
      this.primerRegistro = primerRegistro;
   }
   
   public int getCantidadRegistros() {
      return cantidadRegistros;
   }
   
   public void setCantidadRegistros(int cantidadRegistros) {
      this.cantidadRegistros = cantidadRegistros;
   }
   
   public String getPropiedadOrdenacion() {
      return propiedadOrdenacion;
   }
   
   public void setPropiedadOrdenacion(String propiedadOrdenacion) {
      this.propiedadOrdenacion = propiedadOrdenacion;
   }
   
   public boolean isAscendente() {
      return ascendente;
   }
   
   public void setAscendente(boolean ascendente) {
      this.ascendente = ascendente;
   }
   
   public Empresa getEmpresa() {
      return empresa;
   }
   
   public void setEmpresa(Empresa empresa) {
      this.empresa = empresa;
   }

//</editor-fold>
}

/* Comentarios de la Clase
 *
 *
 *
 */
