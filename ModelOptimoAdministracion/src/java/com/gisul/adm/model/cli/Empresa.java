/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gisul.adm.model.cli;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Edgar
 *
 */
@Entity
@Table(name = "opt.cli_empresa")
@XmlRootElement
public class Empresa implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idempresa")
    private long idEmpresa;

    @Column(name = "nombre")
    private String nombre;

    @Size(max = 255)
    @Column(name = "razon_social")
    private String razonSocial;

    @Column(name = "nit")
    private String nit;

    @Column(name = "rubro")
    private String rubro;

      @Size(max = 60)
    @Column(name = "tipoentidad")
    private String tipoEntidad;
      
      
    @Size(max = 10)
    @Column(name = "estado")
    private String estado;
    @Size(max = 200)
    @Column(name = "telefono_fijo")
    private String telefonoFijo;
    @Size(max = 200)
    @Column(name = "telefono_movil")
    private String telefonoMovil;
    @Size(max = 250)
    @Column(name = "direccion")
    private String direccion;
    
    @Size(max = 200)
    @Column(name = "url_portal")
    private String urlPortal;
    
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_alta")
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaAlta;
    
    @Size(max = 60)
    @Column(name = "usuario_alta")
    private String usuarioAlta;
    
    @Column(name = "fecha_modificacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaModificacion;
    
    
    @Size(max = 60)
    @Column(name = "usuario_modificacion")
    private String usuarioModificacion;
    
    @Column(name = "fecha_baja")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaBaja;
    
    @Size(max = 60)
    @Column(name = "usuario_baja")
    private String usuarioBaja;
      
      
      
   /**
    *
    * @return
    */
   public long getIdEmpresa() {
        return idEmpresa;
    }

   /**
    *
    * @param idEmpresa
    */
   public void setIdEmpresa(long idEmpresa) {
        this.idEmpresa = idEmpresa;
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
   public String getRubro() {
        return rubro;
    }

   /**
    *
    * @param rubro
    */
   public void setRubro(String rubro) {
        this.rubro = rubro;
    }

    public String getTipoEntidad() {
        return tipoEntidad;
    }

    public void setTipoEntidad(String tipoEntidad) {
        this.tipoEntidad = tipoEntidad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTelefonoFijo() {
        return telefonoFijo;
    }

    public void setTelefonoFijo(String telefonoFijo) {
        this.telefonoFijo = telefonoFijo;
    }

    public String getTelefonoMovil() {
        return telefonoMovil;
    }

    public void setTelefonoMovil(String telefonoMovil) {
        this.telefonoMovil = telefonoMovil;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getUrlPortal() {
        return urlPortal;
    }

    public void setUrlPortal(String urlPortal) {
        this.urlPortal = urlPortal;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public String getUsuarioAlta() {
        return usuarioAlta;
    }

    public void setUsuarioAlta(String usuarioAlta) {
        this.usuarioAlta = usuarioAlta;
    }

    public Date getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }



    public String getUsuarioModificacion() {
        return usuarioModificacion;
    }

    public void setUsuarioModificacion(String usuarioModificacion) {
        this.usuarioModificacion = usuarioModificacion;
    }

    public Date getFechaBaja() {
        return fechaBaja;
    }

    public void setFechaBaja(Date fechaBaja) {
        this.fechaBaja = fechaBaja;
    }

    public String getUsuarioBaja() {
        return usuarioBaja;
    }

    public void setUsuarioBaja(String usuarioBaja) {
        this.usuarioBaja = usuarioBaja;
    }

   
   
   
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (idEmpresa == 0 ? 0 : new Long(idEmpresa).hashCode());
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
        Empresa other = (Empresa) obj;
        if (idEmpresa == 0) {
            if (other.idEmpresa != 0) {
                return false;
            }
        } else if (idEmpresa != other.idEmpresa) {
            return false;
        }
        return true;
    }

}
