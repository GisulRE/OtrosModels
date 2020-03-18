/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gisul.optimo.rrhh.entity;

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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author eveliz
 */
@Entity
@Table(name = "prh.rrh_cargos_empleado")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RrhCargosEmpleado.findAll", query = "SELECT r FROM RrhCargosEmpleado r"),
    @NamedQuery(name = "RrhCargosEmpleado.findByIdcargosEmpleado", query = "SELECT r FROM RrhCargosEmpleado r WHERE r.idcargosEmpleado = :idcargosEmpleado"),
    @NamedQuery(name = "RrhCargosEmpleado.findByEstado", query = "SELECT r FROM RrhCargosEmpleado r WHERE r.estado = :estado"),
    @NamedQuery(name = "RrhCargosEmpleado.findByFechaAlta", query = "SELECT r FROM RrhCargosEmpleado r WHERE r.fechaAlta = :fechaAlta"),
    @NamedQuery(name = "RrhCargosEmpleado.findByUsuarioAlta", query = "SELECT r FROM RrhCargosEmpleado r WHERE r.usuarioAlta = :usuarioAlta"),
    @NamedQuery(name = "RrhCargosEmpleado.findByFechaBaja", query = "SELECT r FROM RrhCargosEmpleado r WHERE r.fechaBaja = :fechaBaja"),
    @NamedQuery(name = "RrhCargosEmpleado.findByUsuarioBaja", query = "SELECT r FROM RrhCargosEmpleado r WHERE r.usuarioBaja = :usuarioBaja")})
public class RrhCargosEmpleado implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idcargos_empleado")
    private Integer idcargosEmpleado;
    @Size(max = 255)
    @Column(name = "estado")
    private String estado;
    @Column(name = "fecha_alta")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaAlta;
    @Size(max = 255)
    @Column(name = "usuario_alta")
    private String usuarioAlta;
    @Column(name = "fecha_baja")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaBaja;
    @Size(max = 255)
    @Column(name = "usuario_baja")
    private String usuarioBaja;
    @JoinColumn(name = "idcargo", referencedColumnName = "idcargo")
    @ManyToOne
    private RrhCargo idcargo;
    @JoinColumn(name = "idempleado", referencedColumnName = "idempleado")
    @ManyToOne
    private RrhEmpleado idempleado;

    public RrhCargosEmpleado() {
    }

    public RrhCargosEmpleado(Integer idcargosEmpleado) {
        this.idcargosEmpleado = idcargosEmpleado;
    }

    public Integer getIdcargosEmpleado() {
        return idcargosEmpleado;
    }

    public void setIdcargosEmpleado(Integer idcargosEmpleado) {
        this.idcargosEmpleado = idcargosEmpleado;
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

    public String getUsuarioBaja() {
        return usuarioBaja;
    }

    public void setUsuarioBaja(String usuarioBaja) {
        this.usuarioBaja = usuarioBaja;
    }

    public RrhCargo getIdcargo() {
        return idcargo;
    }

    public void setIdcargo(RrhCargo idcargo) {
        this.idcargo = idcargo;
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
        hash += (idcargosEmpleado != null ? idcargosEmpleado.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RrhCargosEmpleado)) {
            return false;
        }
        RrhCargosEmpleado other = (RrhCargosEmpleado) object;
        if ((this.idcargosEmpleado == null && other.idcargosEmpleado != null) || (this.idcargosEmpleado != null && !this.idcargosEmpleado.equals(other.idcargosEmpleado))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.gisul.optimo.rrhh.entity.RrhCargosEmpleado[ idcargosEmpleado=" + idcargosEmpleado + " ]";
    }
    
}
