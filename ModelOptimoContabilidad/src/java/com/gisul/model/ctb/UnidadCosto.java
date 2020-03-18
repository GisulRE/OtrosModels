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
package com.gisul.model.ctb;

import com.gisul.adm.model.cli.Empresa;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

/**
 *
 * @author desarrollo
 */
@Entity
@Table(name = "opt.ctb_unidad_costo")
public class UnidadCosto implements Serializable {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "idunidad")
   private long idUnidad;

   @ManyToOne
   @JoinColumn(name = "idempresa")
   private Empresa empresa;
   
   @Column(name="idpadre")
   private long idPadre;

   @Size(max =100)
   @Column(name = "codigo")
   private String codigo;
   
   @Size(max = 100)
   @Column(name = "nombre")
   private String nombre;

   
   
   @Size(max=100)
   @Column(name = "tipo")
   private String tipo;
   
   @Size(max=20)
   @Column(name = "estado")
   private String estado;

   @Temporal(TemporalType.TIMESTAMP)
   @Column(name = "fecha_alta")
   private Date fechaAlta;

   @Column(name = "usuario_alta")
   private String usuarioAlta;

   @Temporal(TemporalType.TIMESTAMP)
   @Column(name = "fecha_modificacion")
   private Date fechaModificacion;

   @Column(name = "usuario_modificacion")
   private String usuarioModificacion;

   @Temporal(TemporalType.TIMESTAMP)
   @Column(name = "fecha_baja")
   private Date fechaBaja;

   @Column(name = "usuario_baja")
   private String usuarioBaja;

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
      final UnidadCosto other = (UnidadCosto) obj;
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
