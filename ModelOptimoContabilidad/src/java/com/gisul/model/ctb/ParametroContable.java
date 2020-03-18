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
import java.math.BigDecimal;
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
@Table(name = "opt.ctb_parametros_contables")
public class ParametroContable implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idparcontable")
    private long idparcontable;

    @ManyToOne
    @JoinColumn(name = "idempresa")
    private Empresa empresa;

    @Size(max = 100)
    @Column(name = "codigo_global")
    private String codigoGlobal;

    @Size(max = 300)
    @Column(name = "descripcion")
    private String descripcion;

    @ManyToOne
    @JoinColumn(name = "idcuenta_activo")
    private CuentaContable cuentaActivo;

    @ManyToOne
    @JoinColumn(name = "idcuenta_pasivo")
    private CuentaContable cuentaPasivo;

    @ManyToOne
    @JoinColumn(name = "idcuenta_ingreso")
    private CuentaContable cuentaIngreso;

    @ManyToOne
    @JoinColumn(name = "idcuenta_egreso")
    private CuentaContable cuentaEgreso;

    @ManyToOne
    @JoinColumn(name = "idcuenta_patrimonio")
    private CuentaContable cuentaPatrimonio;

    
    @Column(name = "porcentaje_impuesto")
    private BigDecimal porcentajeImpuesto;
    
    
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

    public long getIdparcontable() {
        return idparcontable;
    }

    public void setIdparcontable(long idparcontable) {
        this.idparcontable = idparcontable;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public String getCodigoGlobal() {
        return codigoGlobal;
    }

    public void setCodigoGlobal(String codigoGlobal) {
        this.codigoGlobal = codigoGlobal;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public CuentaContable getCuentaActivo() {
        return cuentaActivo;
    }

    public void setCuentaActivo(CuentaContable cuentaActivo) {
        this.cuentaActivo = cuentaActivo;
    }

    public CuentaContable getCuentaPasivo() {
        return cuentaPasivo;
    }

    public void setCuentaPasivo(CuentaContable cuentaPasivo) {
        this.cuentaPasivo = cuentaPasivo;
    }

    public CuentaContable getCuentaIngreso() {
        return cuentaIngreso;
    }

    public void setCuentaIngreso(CuentaContable cuentaIngreso) {
        this.cuentaIngreso = cuentaIngreso;
    }

    public CuentaContable getCuentaEgreso() {
        return cuentaEgreso;
    }

    public void setCuentaEgreso(CuentaContable cuentaEgreso) {
        this.cuentaEgreso = cuentaEgreso;
    }

    public CuentaContable getCuentaPatrimonio() {
        return cuentaPatrimonio;
    }

    public void setCuentaPatrimonio(CuentaContable cuentaPatrimonio) {
        this.cuentaPatrimonio = cuentaPatrimonio;
    }

    public BigDecimal getPorcentajeImpuesto() {
        return porcentajeImpuesto;
    }

    public void setPorcentajeImpuesto(BigDecimal porcentajeImpuesto) {
        this.porcentajeImpuesto = porcentajeImpuesto;
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
        hash = 97 * hash + (int) (this.idparcontable ^ (this.idparcontable >>> 32));
        hash = 97 * hash + Objects.hashCode(this.empresa);
        hash = 97 * hash + Objects.hashCode(this.codigoGlobal);
        hash = 97 * hash + Objects.hashCode(this.descripcion);
        hash = 97 * hash + Objects.hashCode(this.cuentaActivo);
        hash = 97 * hash + Objects.hashCode(this.cuentaPasivo);
        hash = 97 * hash + Objects.hashCode(this.cuentaIngreso);
        hash = 97 * hash + Objects.hashCode(this.cuentaEgreso);
        hash = 97 * hash + Objects.hashCode(this.cuentaPatrimonio);
        hash = 97 * hash + Objects.hashCode(this.porcentajeImpuesto);
        hash = 97 * hash + Objects.hashCode(this.fechaAlta);
        hash = 97 * hash + Objects.hashCode(this.usuarioAlta);
        hash = 97 * hash + Objects.hashCode(this.fechaModificacion);
        hash = 97 * hash + Objects.hashCode(this.usuarioModificacion);
        hash = 97 * hash + Objects.hashCode(this.fechaBaja);
        hash = 97 * hash + Objects.hashCode(this.usuarioBaja);
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
        final ParametroContable other = (ParametroContable) obj;
        if (this.idparcontable != other.idparcontable) {
            return false;
        }
        if (!Objects.equals(this.empresa, other.empresa)) {
            return false;
        }
        if (!Objects.equals(this.codigoGlobal, other.codigoGlobal)) {
            return false;
        }
        if (!Objects.equals(this.descripcion, other.descripcion)) {
            return false;
        }
        if (!Objects.equals(this.cuentaActivo, other.cuentaActivo)) {
            return false;
        }
        if (!Objects.equals(this.cuentaPasivo, other.cuentaPasivo)) {
            return false;
        }
        if (!Objects.equals(this.cuentaIngreso, other.cuentaIngreso)) {
            return false;
        }
        if (!Objects.equals(this.cuentaEgreso, other.cuentaEgreso)) {
            return false;
        }
        if (!Objects.equals(this.cuentaPatrimonio, other.cuentaPatrimonio)) {
            return false;
        }
        if (!Objects.equals(this.porcentajeImpuesto, other.porcentajeImpuesto)) {
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
        return "ParametroContable{" + "idparcontable=" + idparcontable + ", empresa=" + empresa + ", codigoGlobal=" + codigoGlobal + ", descripcion=" + descripcion + ", cuentaActivo=" + cuentaActivo + ", cuentaPasivo=" + cuentaPasivo + ", cuentaIngreso=" + cuentaIngreso + ", cuentaEgreso=" + cuentaEgreso + ", cuentaPatrimonio=" + cuentaPatrimonio + ", porcentajeImpuesto=" + porcentajeImpuesto + ", fechaAlta=" + fechaAlta + ", usuarioAlta=" + usuarioAlta + ", fechaModificacion=" + fechaModificacion + ", usuarioModificacion=" + usuarioModificacion + ", fechaBaja=" + fechaBaja + ", usuarioBaja=" + usuarioBaja + '}';
    }


}

/* Comentarios de la Clase
 *
 *
 *
 */
