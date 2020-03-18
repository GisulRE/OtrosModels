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
@Table(name = "prh.rrh_empleado_hbasico")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RrhEmpleadoHbasico.findAll", query = "SELECT r FROM RrhEmpleadoHbasico r"),
    @NamedQuery(name = "RrhEmpleadoHbasico.findByIdempleadohb", query = "SELECT r FROM RrhEmpleadoHbasico r WHERE r.idempleadohb = :idempleadohb"),
    @NamedQuery(name = "RrhEmpleadoHbasico.findByMonto", query = "SELECT r FROM RrhEmpleadoHbasico r WHERE r.monto = :monto"),
    @NamedQuery(name = "RrhEmpleadoHbasico.findByEstado", query = "SELECT r FROM RrhEmpleadoHbasico r WHERE r.estado = :estado"),
    @NamedQuery(name = "RrhEmpleadoHbasico.findByFechaAlta", query = "SELECT r FROM RrhEmpleadoHbasico r WHERE r.fechaAlta = :fechaAlta"),
    @NamedQuery(name = "RrhEmpleadoHbasico.findByUsuarioAlta", query = "SELECT r FROM RrhEmpleadoHbasico r WHERE r.usuarioAlta = :usuarioAlta"),
    @NamedQuery(name = "RrhEmpleadoHbasico.findByFechaBaja", query = "SELECT r FROM RrhEmpleadoHbasico r WHERE r.fechaBaja = :fechaBaja"),
    @NamedQuery(name = "RrhEmpleadoHbasico.findByUsuarioBaja", query = "SELECT r FROM RrhEmpleadoHbasico r WHERE r.usuarioBaja = :usuarioBaja")})
public class RrhEmpleadoHbasico implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idempleadohb")
    private Integer idempleadohb;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "monto")
    private BigDecimal monto;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
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
    @Column(name = "fecha_baja")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaBaja;
    @Column(name = "usuario_baja")
    @Temporal(TemporalType.TIMESTAMP)
    private Date usuarioBaja;
    @JoinColumn(name = "idcontrato", referencedColumnName = "idcontrato")
    @ManyToOne(optional = false)
    private RrhContrato idcontrato;
    @JoinColumn(name = "idempleado", referencedColumnName = "idempleado")
    @ManyToOne(optional = false)
    private RrhEmpleado idempleado;

    public RrhEmpleadoHbasico() {
    }

    public RrhEmpleadoHbasico(Integer idempleadohb) {
        this.idempleadohb = idempleadohb;
    }

    public RrhEmpleadoHbasico(Integer idempleadohb, BigDecimal monto, String estado, Date fechaAlta) {
        this.idempleadohb = idempleadohb;
        this.monto = monto;
        this.estado = estado;
        this.fechaAlta = fechaAlta;
    }

    public Integer getIdempleadohb() {
        return idempleadohb;
    }

    public void setIdempleadohb(Integer idempleadohb) {
        this.idempleadohb = idempleadohb;
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

    public Date getFechaBaja() {
        return fechaBaja;
    }

    public void setFechaBaja(Date fechaBaja) {
        this.fechaBaja = fechaBaja;
    }

    public Date getUsuarioBaja() {
        return usuarioBaja;
    }

    public void setUsuarioBaja(Date usuarioBaja) {
        this.usuarioBaja = usuarioBaja;
    }

    public RrhContrato getIdcontrato() {
        return idcontrato;
    }

    public void setIdcontrato(RrhContrato idcontrato) {
        this.idcontrato = idcontrato;
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
        hash += (idempleadohb != null ? idempleadohb.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RrhEmpleadoHbasico)) {
            return false;
        }
        RrhEmpleadoHbasico other = (RrhEmpleadoHbasico) object;
        if ((this.idempleadohb == null && other.idempleadohb != null) || (this.idempleadohb != null && !this.idempleadohb.equals(other.idempleadohb))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.gisul.optimo.rrhh.entity.RrhEmpleadoHbasico[ idempleadohb=" + idempleadohb + " ]";
    }
    
}
