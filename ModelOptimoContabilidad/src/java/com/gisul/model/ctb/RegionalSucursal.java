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
@Table(name = "opt.ctb_regional_sucursal")
public class RegionalSucursal implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idregional")
    private long idRegional;

    @ManyToOne
    @JoinColumn(name = "idempresa")
    private Empresa empresa;

    @Size(max = 100)
    @Column(name = "codigo")
    private String codigo;

    @Size(max = 100)
    @Column(name = "nombre")
    private String nombre;

    @Size(max = 20)
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

    public long getIdRegional() {
        return idRegional;
    }

    public void setIdRegional(long idRegional) {
        this.idRegional = idRegional;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
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
        int hash = 5;
        hash = 89 * hash + (int) (this.idRegional ^ (this.idRegional >>> 32));
        hash = 89 * hash + Objects.hashCode(this.empresa);
        hash = 89 * hash + Objects.hashCode(this.codigo);
        hash = 89 * hash + Objects.hashCode(this.nombre);
        hash = 89 * hash + Objects.hashCode(this.estado);
        hash = 89 * hash + Objects.hashCode(this.fechaAlta);
        hash = 89 * hash + Objects.hashCode(this.usuarioAlta);
        hash = 89 * hash + Objects.hashCode(this.fechaModificacion);
        hash = 89 * hash + Objects.hashCode(this.usuarioModificacion);
        hash = 89 * hash + Objects.hashCode(this.fechaBaja);
        hash = 89 * hash + Objects.hashCode(this.usuarioBaja);
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
        final RegionalSucursal other = (RegionalSucursal) obj;
        if (this.idRegional != other.idRegional) {
            return false;
        }
        if (!Objects.equals(this.empresa, other.empresa)) {
            return false;
        }
        if (!Objects.equals(this.codigo, other.codigo)) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.estado, other.estado)) {
            return false;
        }
        if (!Objects.equals(this.fechaAlta, other.fechaAlta)) {
            return false;
        }
        if (!Objects.equals(this.usuarioAlta, other.usuarioAlta)) {
            return false;
        }
        if (!Objects.equals(this.fechaModificacion, other.fechaModificacion)) {
            return false;
        }
        if (!Objects.equals(this.usuarioModificacion, other.usuarioModificacion)) {
            return false;
        }
        if (!Objects.equals(this.fechaBaja, other.fechaBaja)) {
            return false;
        }
        if (!Objects.equals(this.usuarioBaja, other.usuarioBaja)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "RegionalSucursal{" + "idRegional=" + idRegional + ", empresa=" + empresa + ", codigo=" + codigo + ", nombre=" + nombre + ", estado=" + estado + ", fechaAlta=" + fechaAlta + ", usuarioAlta=" + usuarioAlta + ", fechaModificacion=" + fechaModificacion + ", usuarioModificacion=" + usuarioModificacion + ", fechaBaja=" + fechaBaja + ", usuarioBaja=" + usuarioBaja + '}';
    }

    
    
    
}

/* Comentarios de la Clase
 *
 *
 *
 */
