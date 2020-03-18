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
package com.gisul.adm.model.cli;

import java.io.Serializable;
import java.util.Date;
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

/**
 *
 * @author desarrollo
 */
@Entity

@Table(name = "opt.cli_cliente")
public class Cliente implements Serializable {      

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "idcliente")
   private long idCliente;

   @ManyToOne
   @JoinColumn(name = "idempresa")
   private Empresa empresa;

   @ManyToOne
   @JoinColumn(name = "idpersona")
   private Persona persona;

   @Column(name = "tipo_cliente")
   private String tipoCliente;

   @Column(name = "nombre_cliente")
   private String nombreCliente;

   @Column(name = "nit")
   private String nit;

   @Column(name = "razon_social")
   private String razonSocial;

   @Column(name = "representante_legal")
   private String representanteLegal;

   @Column(name = "cargo_representante")
   private String cargoRepresentante;

   @Column(name = "departamento_representante")
   private String departamentoRepresentante;

   @Column(name = "contacto_principal")
   private String contactoPrincipal;

   @Column(name = "cargo_contacto")
   private String cargoContacto;

   @Column(name = "telefono_contacto")
   private String telefonoContacto;

   @Column(name = "email_contacto")
   private String emailContact;

   @Column(name = "estado")
   private String estado;

   @Temporal(TemporalType.DATE)
   @Column(name = "fecha_fidelizacion")
   private Date fechaFidelizacion;

   @Column(name = "fecha_aniversario")
   @Temporal(javax.persistence.TemporalType.DATE)
   private Date fechaAniversario;

   @Column(name = "correo_electronico")
   private String correoElectronico;

   @Column(name = "telefono_fijo")
   private String telefonoFijo;

   @Column(name = "telefono_celular")
   private String telefonoCelular;

   @Column(name = "pagina_web")
   private String paginaWeb;

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

   /**
    *
    * @return
    */
   public long getIdCliente() {
      return idCliente;
   }

   /**
    *
    * @param idCliente
    */
   public void setIdCliente(long idCliente) {
      this.idCliente = idCliente;
   }

   /**
    *
    * @return
    */
   public Empresa getEmpresa() {
      return empresa;
   }

   /**
    *
    * @param empresa
    */
   public void setEmpresa(Empresa empresa) {
      this.empresa = empresa;
   }

   /**
    *
    * @return
    */
   public Persona getPersona() {
      return persona;
   }

   /**
    *
    * @param persona
    */
   public void setPersona(Persona persona) {
      this.persona = persona;
   }

   /**
    *
    * @return
    */
   public String getTipoCliente() {
      return tipoCliente;
   }

   /**
    *
    * @param tipoCliente
    */
   public void setTipoCliente(String tipoCliente) {
      this.tipoCliente = tipoCliente;
   }

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
   public String getRepresentanteLegal() {
      return representanteLegal;
   }

   /**
    *
    * @param representanteLegal
    */
   public void setRepresentanteLegal(String representanteLegal) {
      this.representanteLegal = representanteLegal;
   }

   /**
    *
    * @return
    */
   public String getCargoRepresentante() {
      return cargoRepresentante;
   }

   /**
    *
    * @param cargoRepresentante
    */
   public void setCargoRepresentante(String cargoRepresentante) {
      this.cargoRepresentante = cargoRepresentante;
   }

   /**
    *
    * @return
    */
   public String getDepartamentoRepresentante() {
      return departamentoRepresentante;
   }

   /**
    *
    * @param departamentoRepresentante
    */
   public void setDepartamentoRepresentante(String departamentoRepresentante) {
      this.departamentoRepresentante = departamentoRepresentante;
   }

   /**
    *
    * @return
    */
   public String getContactoPrincipal() {
      return contactoPrincipal;
   }

   /**
    *
    * @param contactoPrincipal
    */
   public void setContactoPrincipal(String contactoPrincipal) {
      this.contactoPrincipal = contactoPrincipal;
   }

   /**
    *
    * @return
    */
   public String getCargoContacto() {
      return cargoContacto;
   }

   /**
    *
    * @param cargoContacto
    */
   public void setCargoContacto(String cargoContacto) {
      this.cargoContacto = cargoContacto;
   }

   /**
    *
    * @return
    */
   public String getTelefonoContacto() {
      return telefonoContacto;
   }

   /**
    *
    * @param telefonoContacto
    */
   public void setTelefonoContacto(String telefonoContacto) {
      this.telefonoContacto = telefonoContacto;
   }

   /**
    *
    * @return
    */
   public String getEmailContact() {
      return emailContact;
   }

   /**
    *
    * @param emailContact
    */
   public void setEmailContact(String emailContact) {
      this.emailContact = emailContact;
   }

   /**
    *
    * @return
    */
   public String getEstado() {
      return estado;
   }

   /**
    *
    * @param estado
    */
   public void setEstado(String estado) {
      this.estado = estado;
   }

   /**
    *
    * @return
    */
   public Date getFechaFidelizacion() {
      return fechaFidelizacion;
   }

   /**
    *
    * @param fechaFidelizacion
    */
   public void setFechaFidelizacion(Date fechaFidelizacion) {
      this.fechaFidelizacion = fechaFidelizacion;
   }

   /**
    *
    * @return
    */
   public Date getFechaAniversario() {
      return fechaAniversario;
   }

   /**
    *
    * @param fechaAniversario
    */
   public void setFechaAniversario(Date fechaAniversario) {
      this.fechaAniversario = fechaAniversario;
   }

   /**
    *
    * @return
    */
   public String getCorreoElectronico() {
      return correoElectronico;
   }

   /**
    *
    * @param correoElectronico
    */
   public void setCorreoElectronico(String correoElectronico) {
      this.correoElectronico = correoElectronico;
   }

   /**
    *
    * @return
    */
   public String getTelefonoFijo() {
      return telefonoFijo;
   }

   /**
    *
    * @param telefonoFijo
    */
   public void setTelefonoFijo(String telefonoFijo) {
      this.telefonoFijo = telefonoFijo;
   }

   /**
    *
    * @return
    */
   public String getTelefonoCelular() {
      return telefonoCelular;
   }

   /**
    *
    * @param telefonoCelular
    */
   public void setTelefonoCelular(String telefonoCelular) {
      this.telefonoCelular = telefonoCelular;
   }

   /**
    *
    * @return
    */
   public String getPaginaWeb() {
      return paginaWeb;
   }

   /**
    *
    * @param paginaWeb
    */
   public void setPaginaWeb(String paginaWeb) {
      this.paginaWeb = paginaWeb;
   }

   /**
    *
    * @return
    */
   public Date getFechaAlta() {
      return fechaAlta;
   }

   /**
    *
    * @param fechaAlta
    */
   public void setFechaAlta(Date fechaAlta) {
      this.fechaAlta = fechaAlta;
   }

   /**
    *
    * @return
    */
   public String getUsuarioAlta() {
      return usuarioAlta;
   }

   /**
    *
    * @param usuarioAlta
    */
   public void setUsuarioAlta(String usuarioAlta) {
      this.usuarioAlta = usuarioAlta;
   }

   /**
    *
    * @return
    */
   public Date getFechaModificacion() {
      return fechaModificacion;
   }

   /**
    *
    * @param fechaModificacion
    */
   public void setFechaModificacion(Date fechaModificacion) {
      this.fechaModificacion = fechaModificacion;
   }

   /**
    *
    * @return
    */
   public String getUsuarioModificacion() {
      return usuarioModificacion;
   }

   /**
    *
    * @param usuarioModificacion
    */
   public void setUsuarioModificacion(String usuarioModificacion) {
      this.usuarioModificacion = usuarioModificacion;
   }

   /**
    *
    * @return
    */
   public Date getFechaBaja() {
      return fechaBaja;
   }

   /**
    *
    * @param fechaBaja
    */
   public void setFechaBaja(Date fechaBaja) {
      this.fechaBaja = fechaBaja;
   }

   /**
    *
    * @return
    */
   public String getUsuarioBaja() {
      return usuarioBaja;
   }

   /**
    *
    * @param usuarioBaja
    */
   public void setUsuarioBaja(String usuarioBaja) {
      this.usuarioBaja = usuarioBaja;
   }

   @Override
   public int hashCode() {
      final int prime = 31;
      int result = 1;
      result = prime * result + (idCliente == 0 ? 0 : new Long(idCliente).hashCode());
      return result;
   }

   @Override
   public boolean equals(Object obj) {
      if (this == obj) {
         return true;
      }
      if (obj == null) {
         return false;
      }
      if (getClass() != obj.getClass()) {
         return false;
      }
      Cliente other = (Cliente) obj;
      if (idCliente == 0) {
         if (other.idCliente != 0) {
            return false;
         }
      } else if (idCliente != other.idCliente) {
         return false;
      }
      return true;
   }

   @Override
   public String toString() {
      return "Classe [id=" + idCliente + ", nome=" + nombreCliente + "]";
   }
}

/* Comentarios de la Clase
 *
 *
 *
 */
