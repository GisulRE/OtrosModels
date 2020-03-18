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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author desarrollo
 */
@Entity
@Table(name = "opt.ctb_auxiliar_cuenta_detalle")
@XmlRootElement
public class AuxiliarCuentaDetalle implements Serializable {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "iddetalle")
   private long iddetalle;

   @ManyToOne
   @JoinColumn(name = "idauxcuenta")
   private AuxiliarCuenta auxiliarCuenta;

   @Size(max = 100)
   @Column(name = "etiqueta")
   private String etiqueta;

   @Size(max = 30)
   @Column(name = "capitulo_cuenta")
   private String capituloCuenta;

   @Size(max = 30)
   @Column(name = "saldo_cuenta")
   private String saldoCuenta;

      @ManyToOne
   @JoinColumn(name = "idcuentacontable")
   private CuentaContable cuentaContable;

      @ManyToOne
   @JoinColumn(name = "unidad_negocio")
   private RegionalSucursal unidadNegocio;

      @ManyToOne
   @JoinColumn(name = "centro_costo")
   private UnidadCosto centroCosto;

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
   public long getIddetalle() {
      return iddetalle;
   }

   public AuxiliarCuenta getAuxiliarCuenta() {
      return auxiliarCuenta;
   }

   public String getEtiqueta() {
      return etiqueta;
   }

   public String getCapituloCuenta() {
      return capituloCuenta;
   }

   public String getSaldoCuenta() {
      return saldoCuenta;
   }

    public CuentaContable getCuentaContable() {
        return cuentaContable;
    }

    public RegionalSucursal getUnidadNegocio() {
        return unidadNegocio;
    }

    public void setUnidadNegocio(RegionalSucursal unidadNegocio) {
        this.unidadNegocio = unidadNegocio;
    }

    public UnidadCosto getCentroCosto() {
        return centroCosto;
    }

    public void setCentroCosto(UnidadCosto centroCosto) {
        this.centroCosto = centroCosto;
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
   public void setIddetalle(long iddetalle) {
      this.iddetalle = iddetalle;
   }

   public void setAuxiliarCuenta(AuxiliarCuenta auxiliarCuenta) {
      this.auxiliarCuenta = auxiliarCuenta;
   }

   public void setEtiqueta(String etiqueta) {
      this.etiqueta = etiqueta;
   }

   public void setCapituloCuenta(String capituloCuenta) {
      this.capituloCuenta = capituloCuenta;
   }

   public void setSaldoCuenta(String saldoCuenta) {
      this.saldoCuenta = saldoCuenta;
   }

    public void setCuentaContable(CuentaContable cuentaContable) {
        this.cuentaContable = cuentaContable;
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
   //<editor-fold defaultstate="collapsed" desc="OVERRIDE">
   @Override
   public int hashCode() {
      int hash = 7;
      hash = 47 * hash + (int) (this.iddetalle ^ (this.iddetalle >>> 32));
      hash = 47 * hash + Objects.hashCode(this.auxiliarCuenta);
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
      final AuxiliarCuentaDetalle other = (AuxiliarCuentaDetalle) obj;
      if (this.iddetalle != other.iddetalle) {
         return false;
      }
      if (!Objects.equals(this.auxiliarCuenta, other.auxiliarCuenta)) {
         return false;
      }
      return true;
   }

   @Override
   public String toString() {
      return "AuxiliarCuentaDetalle{" + "iddetalle=" + iddetalle + ", auxiliarCuenta=" + auxiliarCuenta + ", etiqueta=" + etiqueta + ", capituloCuenta=" + capituloCuenta + ", saldoCuenta=" + saldoCuenta + ", cuentaContable=" + cuentaContable + ", unidadNegocio=" + unidadNegocio + ", centroCosto=" + centroCosto + ", estado=" + estado + ", fechaAlta=" + fechaAlta + ", usuarioAlta=" + usuarioAlta + ", fechaModificacion=" + fechaModificacion + ", usuarioModificacion=" + usuarioModificacion + ", fechaBaja=" + fechaBaja + ", usuarioBaja=" + usuarioBaja + '}';
   }

//</editor-fold>
}

/* Comentarios de la Clase
 *
 *
 *
 */
