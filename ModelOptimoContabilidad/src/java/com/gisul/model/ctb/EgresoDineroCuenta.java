/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gisul.model.ctb;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author admin
 */
@Entity
@Table(name = "ctb_egreso_dinero_cuenta", schema = "opt")
@XmlRootElement
public class EgresoDineroCuenta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idegresocuenta")
    private Integer idegresocuenta;

    @JoinColumn(name = "idegreso", referencedColumnName = "idegreso")
    @ManyToOne(optional = false)
    private EgresoDinero idegreso;

    @JoinColumn(name = "idauxcuenta")
    @ManyToOne(optional = false)
    private AuxiliarCuenta auxiliarCuenta;

    @JoinColumn(name = "idcuenta")
    @ManyToOne(optional = false)
    private CuentaContable cuentaContable;

    @JoinColumn(name = "idregional")
    @ManyToOne(optional = false)
    private RegionalSucursal regionalSucursal;

    @JoinColumn(name = "idunidad")
    @ManyToOne(optional = false)
    private UnidadCosto unidadCosto;

    @Size(max = 10)
    @Column(name = "estado")
    private String estado;
    @Column(name = "fecha_alta")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaAlta;
    @Size(max = 50)
    @Column(name = "usuario_alta")
    private String usuarioAlta;
    @Column(name = "fecha_modificacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaModificacion;
    @Size(max = 50)
    @Column(name = "usuario_modificacion")
    private String usuarioModificacion;
    @Column(name = "fecha_baja")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaBaja;
    @Size(max = 50)
    @Column(name = "usuario_baja")
    private String usuarioBaja;

    public EgresoDineroCuenta() {
    }

    public Integer getIdegresocuenta() {
        return idegresocuenta;
    }

    public void setIdegresocuenta(Integer idegresocuenta) {
        this.idegresocuenta = idegresocuenta;
    }

    public EgresoDinero getIdegreso() {
        return idegreso;
    }

    public void setIdegreso(EgresoDinero idegreso) {
        this.idegreso = idegreso;
    }

    public AuxiliarCuenta getAuxiliarCuenta() {
        return auxiliarCuenta;
    }

    public void setAuxiliarCuenta(AuxiliarCuenta auxiliarCuenta) {
        this.auxiliarCuenta = auxiliarCuenta;
    }

    public CuentaContable getCuentaContable() {
        return cuentaContable;
    }

    public void setCuentaContable(CuentaContable cuentaContable) {
        this.cuentaContable = cuentaContable;
    }

    public RegionalSucursal getRegionalSucursal() {
        return regionalSucursal;
    }

    public void setRegionalSucursal(RegionalSucursal regionalSucursal) {
        this.regionalSucursal = regionalSucursal;
    }

    public UnidadCosto getUnidadCosto() {
        return unidadCosto;
    }

    public void setUnidadCosto(UnidadCosto unidadCosto) {
        this.unidadCosto = unidadCosto;
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
        int hash = 0;
        hash += (idegresocuenta != null ? idegresocuenta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EgresoDineroCuenta)) {
            return false;
        }
        EgresoDineroCuenta other = (EgresoDineroCuenta) object;
        if ((this.idegresocuenta == null && other.idegresocuenta != null) || (this.idegresocuenta != null && !this.idegresocuenta.equals(other.idegresocuenta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eveliz.model.ctb.EgresoDineroCuenta[ idegresocuenta=" + idegresocuenta + " ]";
    }

}
