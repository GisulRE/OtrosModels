/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gisul.optimo.rrhh.entity;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Collection;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author eveliz
 */
@Entity
@Table(name = "prh.rrh_cargo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RrhCargo.findAll", query = "SELECT r FROM RrhCargo r"),
    @NamedQuery(name = "RrhCargo.findByIdcargo", query = "SELECT r FROM RrhCargo r WHERE r.idcargo = :idcargo"),
    @NamedQuery(name = "RrhCargo.findByNombre", query = "SELECT r FROM RrhCargo r WHERE r.nombre = :nombre"),
    @NamedQuery(name = "RrhCargo.findByDescripcion", query = "SELECT r FROM RrhCargo r WHERE r.descripcion = :descripcion"),
    @NamedQuery(name = "RrhCargo.findByOpcional1", query = "SELECT r FROM RrhCargo r WHERE r.opcional1 = :opcional1"),
    @NamedQuery(name = "RrhCargo.findByOpcional2", query = "SELECT r FROM RrhCargo r WHERE r.opcional2 = :opcional2"),
    @NamedQuery(name = "RrhCargo.findByOpcional3", query = "SELECT r FROM RrhCargo r WHERE r.opcional3 = :opcional3"),
    @NamedQuery(name = "RrhCargo.findByOpcional4", query = "SELECT r FROM RrhCargo r WHERE r.opcional4 = :opcional4"),
    @NamedQuery(name = "RrhCargo.findByFechaAlta", query = "SELECT r FROM RrhCargo r WHERE r.fechaAlta = :fechaAlta"),
    @NamedQuery(name = "RrhCargo.findByUsuarioAlta", query = "SELECT r FROM RrhCargo r WHERE r.usuarioAlta = :usuarioAlta"),
    @NamedQuery(name = "RrhCargo.findByFechaBaja", query = "SELECT r FROM RrhCargo r WHERE r.fechaBaja = :fechaBaja"),
    @NamedQuery(name = "RrhCargo.findByUsuarioBaja", query = "SELECT r FROM RrhCargo r WHERE r.usuarioBaja = :usuarioBaja")})
public class RrhCargo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idcargo")
    private Integer idcargo;
    @Size(max = 255)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 255)
    @Column(name = "descripcion")
    private String descripcion;
    @Size(max = 255)
    @Column(name = "opcional1")
    private String opcional1;
    @Size(max = 255)
    @Column(name = "opcional2")
    private String opcional2;
    @Column(name = "opcional3")
    private BigInteger opcional3;
    @Column(name = "opcional4")
    private BigInteger opcional4;
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
    @OneToMany(mappedBy = "idcargoPadre")
    private Collection<RrhCargo> rrhCargoCollection;
    @JoinColumn(name = "idcargo_padre", referencedColumnName = "idcargo")
    @ManyToOne
    private RrhCargo idcargoPadre;
    @OneToMany(mappedBy = "idcargo")
    private Collection<RrhCargosEmpleado> rrhCargosEmpleadoCollection;
    @OneToMany(mappedBy = "idcargo")
    private Collection<RrhCargosArea> rrhCargosAreaCollection;

    public RrhCargo() {
    }

    public RrhCargo(Integer idcargo) {
        this.idcargo = idcargo;
    }

    public Integer getIdcargo() {
        return idcargo;
    }

    public void setIdcargo(Integer idcargo) {
        this.idcargo = idcargo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getOpcional1() {
        return opcional1;
    }

    public void setOpcional1(String opcional1) {
        this.opcional1 = opcional1;
    }

    public String getOpcional2() {
        return opcional2;
    }

    public void setOpcional2(String opcional2) {
        this.opcional2 = opcional2;
    }

    public BigInteger getOpcional3() {
        return opcional3;
    }

    public void setOpcional3(BigInteger opcional3) {
        this.opcional3 = opcional3;
    }

    public BigInteger getOpcional4() {
        return opcional4;
    }

    public void setOpcional4(BigInteger opcional4) {
        this.opcional4 = opcional4;
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

    @XmlTransient
    public Collection<RrhCargo> getRrhCargoCollection() {
        return rrhCargoCollection;
    }

    public void setRrhCargoCollection(Collection<RrhCargo> rrhCargoCollection) {
        this.rrhCargoCollection = rrhCargoCollection;
    }

    public RrhCargo getIdcargoPadre() {
        return idcargoPadre;
    }

    public void setIdcargoPadre(RrhCargo idcargoPadre) {
        this.idcargoPadre = idcargoPadre;
    }

    @XmlTransient
    public Collection<RrhCargosEmpleado> getRrhCargosEmpleadoCollection() {
        return rrhCargosEmpleadoCollection;
    }

    public void setRrhCargosEmpleadoCollection(Collection<RrhCargosEmpleado> rrhCargosEmpleadoCollection) {
        this.rrhCargosEmpleadoCollection = rrhCargosEmpleadoCollection;
    }

    @XmlTransient
    public Collection<RrhCargosArea> getRrhCargosAreaCollection() {
        return rrhCargosAreaCollection;
    }

    public void setRrhCargosAreaCollection(Collection<RrhCargosArea> rrhCargosAreaCollection) {
        this.rrhCargosAreaCollection = rrhCargosAreaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcargo != null ? idcargo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RrhCargo)) {
            return false;
        }
        RrhCargo other = (RrhCargo) object;
        if ((this.idcargo == null && other.idcargo != null) || (this.idcargo != null && !this.idcargo.equals(other.idcargo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.gisul.optimo.rrhh.entity.RrhCargo[ idcargo=" + idcargo + " ]";
    }
    
}
