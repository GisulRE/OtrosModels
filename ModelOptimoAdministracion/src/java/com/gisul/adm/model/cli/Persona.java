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
 * @author Edgar
 */
@Entity
@Table(name = "opt.cli_persona")
public class Persona implements Serializable {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "idpersona")
   private long idPersona;

   @ManyToOne
   @JoinColumn(name = "idempresa")
   private Empresa empresa;

   @Column(name = "nombre")
   private String nombre;
   
   @Column(name = "segundo_nombre")
   private String segundoNombre;

   @Column(name = "apellido_paterno")
   private String apellidoPaterno;

   @Column(name = "apellido_materno")
   private String apellidoMaterno;

   @Column(name = "apellido_casado")
   private String apellidoCasado;

   @Column(name = "tipo_documento")
   private String tipoDocumento;

   @Column(name = "valor_documento")
   private String valorDocumento;

   @Column(name = "estado_civil")
   private String estadoCivil;

   @Column(name = "emision_documento")
   private String emisionDocumento;

   @Temporal(TemporalType.DATE)
   @Column(name = "fecha_nacimiento")
   private Date fechaNacimiento;

   @Column(name = "lugar_nacimiento")
   private String lugarNacimiento;

   @Column(name = "nacionalidad")
   private String nacionalidad;

   @Temporal(TemporalType.TIMESTAMP)
   @Column(name = "fecha_alta")
   private Date fechaAlta;

   @Column(name = "usuario_alta")
   private String usuarioAlta;

   @Temporal(TemporalType.TIMESTAMP)
   @Column(name = "fecha_baja")
   private Date fechaBaja;

   @Column(name = "usuario_baja")
   private String usuarioBaja;

      @Column(name = "tipo_persona")
   private String tipoPersona;
   
   /**
    *
    * @return
    */
   public long getIdPersona() {
      return idPersona;
   }

   /**
    *
    * @param idPersona
    */
   public void setIdPersona(long idPersona) {
      this.idPersona = idPersona;
   }

   /**
    *
    * @return
    */
   public String getNombre() {
      return nombre;
   }

   /**
    *
    * @param nombre
    */
   public void setNombre(String nombre) {
      this.nombre = nombre;
   }

   /**
    *
    * @return
    */
   public String getApellidoPaterno() {
      return apellidoPaterno;
   }

   /**
    *
    * @param apellidoPaterno
    */
   public void setApellidoPaterno(String apellidoPaterno) {
      this.apellidoPaterno = apellidoPaterno;
   }

   /**
    *
    * @return
    */
   public String getApellidoMaterno() {
      return apellidoMaterno;
   }

   /**
    *
    * @param apellidoMaterno
    */
   public void setApellidoMaterno(String apellidoMaterno) {
      this.apellidoMaterno = apellidoMaterno;
   }

   /**
    *
    * @return
    */
   public String getApellidoCasado() {
      return apellidoCasado;
   }

   /**
    *
    * @param apellidoCasado
    */
   public void setApellidoCasado(String apellidoCasado) {
      this.apellidoCasado = apellidoCasado;
   }

   /**
    *
    * @return
    */
   public String getTipoDocumento() {
      return tipoDocumento;
   }

   /**
    *
    * @param tipoDocumento
    */
   public void setTipoDocumento(String tipoDocumento) {
      this.tipoDocumento = tipoDocumento;
   }

   /**
    *
    * @return
    */
   public String getValorDocumento() {
      return valorDocumento;
   }

   /**
    *
    * @param valorDocumento
    */
   public void setValorDocumento(String valorDocumento) {
      this.valorDocumento = valorDocumento;
   }

   /**
    *
    * @return
    */
   public String getEstadoCivil() {
      return estadoCivil;
   }

   /**
    *
    * @param estadoCivil
    */
   public void setEstadoCivil(String estadoCivil) {
      this.estadoCivil = estadoCivil;
   }

   /**
    *
    * @return
    */
   public Date getFechaNacimiento() {
      return fechaNacimiento;
   }

   /**
    *
    * @param fechaNacimiento
    */
   public void setFechaNacimiento(Date fechaNacimiento) {
      this.fechaNacimiento = fechaNacimiento;
   }

   /**
    *
    * @return
    */
   public String getLugarNacimiento() {
      return lugarNacimiento;
   }

   /**
    *
    * @param lugarNacimiento
    */
   public void setLugarNacimiento(String lugarNacimiento) {
      this.lugarNacimiento = lugarNacimiento;
   }

   /**
    *
    * @return
    */
   public String getNacionalidad() {
      return nacionalidad;
   }

   /**
    *
    * @param nacionalidad
    */
   public void setNacionalidad(String nacionalidad) {
      this.nacionalidad = nacionalidad;
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

   /**
    *
    * @return
    */
   public String getEmisionDocumento() {
      return emisionDocumento;
   }

   public Empresa getEmpresa() {
      return empresa;
   }

   public void setEmpresa(Empresa empresa) {
      this.empresa = empresa;
   }

   /**
    *
    * @param emisionDocumento
    */
   public void setEmisionDocumento(String emisionDocumento) {
      this.emisionDocumento = emisionDocumento;
   }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public String getTipoPersona() {
        return tipoPersona;
    }

    public void setTipoPersona(String tipoPersona) {
        this.tipoPersona = tipoPersona;
    }
   
   

   @Override
   public int hashCode() {
      final int prime = 31;
      int result = 1;
      result = prime * result + (idPersona == 0 ? 0 : new Long(idPersona).hashCode());
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
      Persona other = (Persona) obj;
      if (idPersona == 0) {
         if (other.idPersona != 0) {
            return false;
         }
      } else if (idPersona != other.idPersona) {
         return false;
      }
      return true;
   }

   @Override
   public String toString() {
      return "Classe [id=" + idPersona + ", nome=" + nombre + "]";
   }

}
