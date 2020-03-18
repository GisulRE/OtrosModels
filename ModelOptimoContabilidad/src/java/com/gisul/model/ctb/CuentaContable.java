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
@Table(name = "opt.ctb_cuenta_contable")
public class CuentaContable implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idcuenta")
    private long idCuenta;

    @ManyToOne
    @JoinColumn(name = "idempresa")
    private Empresa empresa;

    @Size(max = 50)
    @Column(name = "cuenta")
    private String cuenta;

    @Size(max = 100)
    @Column(name = "nombre")
    private String nombre;

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

    @Column(name = "moneda")
    private String moneda;

    @Column(name = "nivel")
    private int nivel;

    @Column(name = "padre")
    private Long padre;

    @Column(name = "nro_cuenta")
    private Long nroCuenta;

    @ManyToOne
    @JoinColumn(name = "idcapitulo")
    private CapituloContable capituloContable;

    public long getIdCuenta() {
        return idCuenta;
    }

    public void setIdCuenta(long idCuenta) {
        this.idCuenta = idCuenta;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
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

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public Long getPadre() {
        return padre;
    }

    public void setPadre(Long padre) {
        this.padre = padre;
    }

    public Long getNroCuenta() {
        return nroCuenta;
    }

    public void setNroCuenta(Long nroCuenta) {
        this.nroCuenta = nroCuenta;
    }

    public CapituloContable getCapituloContable() {
        return capituloContable;
    }

    public void setCapituloContable(CapituloContable capituloContable) {
        this.capituloContable = capituloContable;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + (int) (this.idCuenta ^ (this.idCuenta >>> 32));
        hash = 37 * hash + Objects.hashCode(this.empresa);
        hash = 37 * hash + Objects.hashCode(this.cuenta);
        hash = 37 * hash + Objects.hashCode(this.nombre);
        hash = 37 * hash + Objects.hashCode(this.estado);
        hash = 37 * hash + Objects.hashCode(this.fechaAlta);
        hash = 37 * hash + Objects.hashCode(this.usuarioAlta);
        hash = 37 * hash + Objects.hashCode(this.fechaModificacion);
        hash = 37 * hash + Objects.hashCode(this.usuarioModificacion);
        hash = 37 * hash + Objects.hashCode(this.fechaBaja);
        hash = 37 * hash + Objects.hashCode(this.usuarioBaja);
        hash = 37 * hash + Objects.hashCode(this.moneda);
        hash = 37 * hash + this.nivel;
        hash = 37 * hash + Objects.hashCode(this.padre);
        hash = 37 * hash + Objects.hashCode(this.nroCuenta);
        hash = 37 * hash + Objects.hashCode(this.capituloContable);
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
        final CuentaContable other = (CuentaContable) obj;
        if (this.idCuenta != other.idCuenta) {
            return false;
        }
        if (!Objects.equals(this.empresa, other.empresa)) {
            return false;
        }
        if (!Objects.equals(this.cuenta, other.cuenta)) {
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
        if (!Objects.equals(this.moneda, other.moneda)) {
            return false;
        }
        if (this.nivel != other.nivel) {
            return false;
        }
        if (!Objects.equals(this.padre, other.padre)) {
            return false;
        }
        if (!Objects.equals(this.nroCuenta, other.nroCuenta)) {
            return false;
        }
        if (!Objects.equals(this.capituloContable, other.capituloContable)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CuentaContable{" + "idCuenta=" + idCuenta + ", empresa=" + empresa + ", cuenta=" + cuenta + ", nombre=" + nombre + ", estado=" + estado + ", fechaAlta=" + fechaAlta + ", usuarioAlta=" + usuarioAlta + ", fechaModificacion=" + fechaModificacion + ", usuarioModificacion=" + usuarioModificacion + ", fechaBaja=" + fechaBaja + ", usuarioBaja=" + usuarioBaja + ", moneda=" + moneda + ", nivel=" + nivel + ", padre=" + padre + ", nroCuenta=" + nroCuenta + ", capituloContable=" + capituloContable + '}';
    }
    
    
    
    

}

/* Comentarios de la Clase
 *
 *
 *
 */
