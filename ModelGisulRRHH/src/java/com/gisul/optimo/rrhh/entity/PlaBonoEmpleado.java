/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gisul.optimo.rrhh.entity;

import java.io.Serializable;
import java.math.BigDecimal;
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
 * @author eveliz
 */
@Entity
@Table(name = "prh.pla_bono_empleado")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PlaBonoEmpleado.findAll", query = "SELECT p FROM PlaBonoEmpleado p"),
    @NamedQuery(name = "PlaBonoEmpleado.findByIdbonoEmpleado", query = "SELECT p FROM PlaBonoEmpleado p WHERE p.idbonoEmpleado = :idbonoEmpleado"),
    @NamedQuery(name = "PlaBonoEmpleado.findByPeriodo", query = "SELECT p FROM PlaBonoEmpleado p WHERE p.periodo = :periodo"),
    @NamedQuery(name = "PlaBonoEmpleado.findByMonto", query = "SELECT p FROM PlaBonoEmpleado p WHERE p.monto = :monto"),
    @NamedQuery(name = "PlaBonoEmpleado.findByEstado", query = "SELECT p FROM PlaBonoEmpleado p WHERE p.estado = :estado"),
    @NamedQuery(name = "PlaBonoEmpleado.findByFechaAlta", query = "SELECT p FROM PlaBonoEmpleado p WHERE p.fechaAlta = :fechaAlta"),
    @NamedQuery(name = "PlaBonoEmpleado.findByUsuarioAlta", query = "SELECT p FROM PlaBonoEmpleado p WHERE p.usuarioAlta = :usuarioAlta"),
    @NamedQuery(name = "PlaBonoEmpleado.findByFechaModificaicon", query = "SELECT p FROM PlaBonoEmpleado p WHERE p.fechaModificaicon = :fechaModificaicon"),
    @NamedQuery(name = "PlaBonoEmpleado.findByUsuarioModificacion", query = "SELECT p FROM PlaBonoEmpleado p WHERE p.usuarioModificacion = :usuarioModificacion"),
    @NamedQuery(name = "PlaBonoEmpleado.findByFechaBaja", query = "SELECT p FROM PlaBonoEmpleado p WHERE p.fechaBaja = :fechaBaja"),
    @NamedQuery(name = "PlaBonoEmpleado.findByUsuarioBaja", query = "SELECT p FROM PlaBonoEmpleado p WHERE p.usuarioBaja = :usuarioBaja")})
public class PlaBonoEmpleado implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idbono_empleado")
    private Integer idbonoEmpleado;
    @Size(max = 10)
    @Column(name = "periodo")
    private String periodo;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "monto")
    private BigDecimal monto;
    @Size(max = 10)
    @Column(name = "estado")
    private String estado;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_alta")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaAlta;
    @Size(max = 60)
    @Column(name = "usuario_alta")
    private String usuarioAlta;
    @Column(name = "fecha_modificaicon")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaModificaicon;
    @Size(max = 60)
    @Column(name = "usuario_modificacion")
    private String usuarioModificacion;
    @Column(name = "fecha_baja")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaBaja;
    @Size(max = 60)
    @Column(name = "usuario_baja")
    private String usuarioBaja;
    @JoinColumn(name = "idbono", referencedColumnName = "idbono")
    @ManyToOne(optional = false)
    private PlaBono idbono;
    @JoinColumn(name = "idempleado", referencedColumnName = "idempleado")
    @ManyToOne(optional = false)
    private RrhEmpleado idempleado;

    public PlaBonoEmpleado() {
    }

    public PlaBonoEmpleado(Integer idbonoEmpleado) {
        this.idbonoEmpleado = idbonoEmpleado;
    }

    public PlaBonoEmpleado(Integer idbonoEmpleado, Date fechaAlta) {
        this.idbonoEmpleado = idbonoEmpleado;
        this.fechaAlta = fechaAlta;
    }

    public Integer getIdbonoEmpleado() {
        return idbonoEmpleado;
    }

    public void setIdbonoEmpleado(Integer idbonoEmpleado) {
        this.idbonoEmpleado = idbonoEmpleado;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public BigDecimal getMonto() {
        return monto;
    }

    public void setMonto(BigDecimal monto) {
        this.monto = monto;
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

    public Date getFechaModificaicon() {
        return fechaModificaicon;
    }

    public void setFechaModificaicon(Date fechaModificaicon) {
        this.fechaModificaicon = fechaModificaicon;
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

    public PlaBono getIdbono() {
        return idbono;
    }

    public void setIdbono(PlaBono idbono) {
        this.idbono = idbono;
    }

    public RrhEmpleado getIdempleado() {
        return idempleado;
    }

    public void setIdempleado(RrhEmpleado idempleado) {
        this.idempleado = idempleado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idbonoEmpleado != null ? idbonoEmpleado.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PlaBonoEmpleado)) {
            return false;
        }
        PlaBonoEmpleado other = (PlaBonoEmpleado) object;
        if ((this.idbonoEmpleado == null && other.idbonoEmpleado != null) || (this.idbonoEmpleado != null && !this.idbonoEmpleado.equals(other.idbonoEmpleado))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.gisul.optimo.rrhh.entity.PlaBonoEmpleado[ idbonoEmpleado=" + idbonoEmpleado + " ]";
    }
    
}
