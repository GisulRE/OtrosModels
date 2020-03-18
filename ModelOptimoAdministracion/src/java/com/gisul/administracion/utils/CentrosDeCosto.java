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
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author desarrollo
 */
public class CentrosDeCosto  implements Serializable{

   private long idUnidad;
   private Empresa empresa;
   private long idPadre;
   private String codigo;
   private String nombre;
   private String tipo;
   private String estado;
   private Date fechaAlta;
   private String usuarioAlta;
   private Date fechaModificacion;
   private String usuarioModificacion;
   private Date fechaBaja;
   private String usuarioBaja;
   private String nombrePadre;

   public CentrosDeCosto(){
   }
   /**
    *
    * @param idUnidad
    * @param empresa
    * @param idPadre
    * @param codigo
    * @param nombre
    * @param tipo
    * @param estado
    * @param fechaAlta
    * @param usuarioAlta
    * @param fechaModificacion
    * @param usuarioModificacion
    * @param fechaBaja
    * @param usuarioBaja
    * @param nombrePadre
    */
   public CentrosDeCosto(long idUnidad, Empresa empresa, long idPadre, String codigo, String nombre, String tipo,
                         String estado, Date fechaAlta, String usuarioAlta, Date fechaModificacion, String usuarioModificacion, 
                         Date fechaBaja, String usuarioBaja, String nombrePadre) {
      this.idUnidad = idUnidad;
      this.empresa = empresa;
      this.idPadre = idPadre;
      this.codigo = codigo;
      this.nombre = nombre;
      this.tipo = tipo;
      this.estado = estado;
      this.fechaAlta = fechaAlta;
      this.usuarioAlta = usuarioAlta;
      this.fechaModificacion = fechaModificacion;
      this.usuarioModificacion = usuarioModificacion;
      this.fechaBaja = fechaBaja;
      this.usuarioBaja = usuarioBaja;
      this.nombrePadre = nombrePadre;
   }
   

   //<editor-fold defaultstate="collapsed" desc="GETTERS">

   public long getIdUnidad() {
      return idUnidad;
   }
   
   
   public Empresa getEmpresa() {
      return empresa;
   }

   public long getIdPadre() {
      return idPadre;
   }

   public String getCodigo() {
      return codigo;
   }

   public String getTipo() {
      return tipo;
   }

   
   
   
   public String getNombre() {
      return nombre;
   }
   
   public String getEstado() {
      return estado;
   }
   
   public Date getFechaAlta() {
      return fechaAlta;
   }
   
   public String getUsuarioAlta() {
      return usuarioAlta;
   }
   
   public Date getFechaModificacion() {
      return fechaModificacion;
   }
   
   public String getUsuarioModificacion() {
      return usuarioModificacion;
   }
   
   public Date getFechaBaja() {
      return fechaBaja;
   }
   
   public String getUsuarioBaja() {
      return usuarioBaja;
   }

   public String getNombrePadre() {
      return nombrePadre;
   }
   
   
   
   
   
//</editor-fold>

   //<editor-fold defaultstate="collapsed" desc="SETTERS">
   
   public void setEmpresa(Empresa empresa) {
      this.empresa = empresa;
   }

   public void setIdUnidad(long idUnidad) {
      this.idUnidad = idUnidad;
   }

   public void setIdPadre(long idPadre) {
      this.idPadre = idPadre;
   }

   public void setCodigo(String codigo) {
      this.codigo = codigo;
   }

   public void setTipo(String tipo) {
      this.tipo = tipo;
   }

   
   
   
   
   public void setNombre(String nombre) {
      this.nombre = nombre;
   }
   
   public void setEstado(String estado) {
      this.estado = estado;
   }
   
   public void setFechaAlta(Date fechaAlta) {
      this.fechaAlta = fechaAlta;
   }
   
   public void setUsuarioAlta(String usuarioAlta) {
      this.usuarioAlta = usuarioAlta;
   }
   
   public void setFechaModificacion(Date fechaModificacion) {
      this.fechaModificacion = fechaModificacion;
   }
   
   public void setUsuarioModificacion(String usuarioModificacion) {
      this.usuarioModificacion = usuarioModificacion;
   }
   
   public void setFechaBaja(Date fechaBaja) {
      this.fechaBaja = fechaBaja;
   }
   
   public void setUsuarioBaja(String usuarioBaja) {
      this.usuarioBaja = usuarioBaja;
   }

   public void setNombrePadre(String nombrePadre) {
      this.nombrePadre = nombrePadre;
   }
   
   
   
//</editor-fold>

   //<editor-fold defaultstate="collapsed" desc="Override">
   @Override
   public int hashCode() {
      int hash = 7;
      hash = 59 * hash + (int) (this.idUnidad ^ (this.idUnidad >>> 32));
      hash = 59 * hash + Objects.hashCode(this.empresa);
      return hash;
   }
   
   @Override
   public boolean equals(Object obj) {
      if (obj == null) {
         return false;
      }
      if (getClass() != obj.getClass()) {
         return false;
      }
      final CentrosDeCosto other = (CentrosDeCosto) obj;
      if (this.idUnidad != other.idUnidad) {
         return false;
      }
      if (!Objects.equals(this.empresa, other.empresa)) {
         return false;
      }
      return true;
   }
   
   
   
   @Override
   public String toString() {
      return "AuxiliarCuenta{" + "idUnidad=" + idUnidad + ", empresa=" + empresa + ", nombre=" + nombre + ", estado=" + estado + ", fechaAlta=" + fechaAlta + ", usuarioAlta=" + usuarioAlta + ", fechaModificacion=" + fechaModificacion + ", usuarioModificacion=" + usuarioModificacion + ", fechaBaja=" + fechaBaja + ", usuarioBaja=" + usuarioBaja + '}';
   }
//</editor-fold>
   
   
}

/* Comentarios de la Clase
 *
 *
 *
 */
