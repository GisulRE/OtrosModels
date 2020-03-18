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
@Table(name = "prh.rrh_cargos_area")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RrhCargosArea.findAll", query = "SELECT r FROM RrhCargosArea r"),
    @NamedQuery(name = "RrhCargosArea.findByIdcargosArea", query = "SELECT r FROM RrhCargosArea r WHERE r.idcargosArea = :idcargosArea"),
    @NamedQuery(name = "RrhCargosArea.findByEstado", query = "SELECT r FROM RrhCargosArea r WHERE r.estado = :estado"),
    @NamedQuery(name = "RrhCargosArea.findByFechaAlta", query = "SELECT r FROM RrhCargosArea r WHERE r.fechaAlta = :fechaAlta"),
    @NamedQuery(name = "RrhCargosArea.findByUsuarioAlta", query = "SELECT r FROM RrhCargosArea r WHERE r.usuarioAlta = :usuarioAlta"),
    @NamedQuery(name = "RrhCargosArea.findByFechaBaja", query = "SELECT r FROM RrhCargosArea r WHERE r.fechaBaja = :fechaBaja"),
    @NamedQuery(name = "RrhCargosArea.findByUsuarioBaja", query = "SELECT r FROM RrhCargosArea r WHERE r.usuarioBaja = :usuarioBaja")})
public class RrhCargosArea implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idcargos_area")
    private Integer idcargosArea;
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
    @JoinColumn(name = "idarea", referencedColumnName = "idarea")
    @ManyToOne
    private RrhArea idarea;
    @JoinColumn(name = "idcargo", referencedColumnName = "idcargo")
    @ManyToOne
    private RrhCargo idcargo;

    public RrhCargosArea() {
    }

    public RrhCargosArea(Integer idcargosArea) {
        this.idcargosArea = idcargosArea;
    }

    public Integer getIdcargosArea() {
        return idcargosArea;
    }

    public void setIdcargosArea(Integer idcargosArea) {
        this.idcargosArea = idcargosArea;
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

    public RrhArea getIdarea() {
        return idarea;
    }

    public void setIdarea(RrhArea idarea) {
        this.idarea = idarea;
    }

    public RrhCargo getIdcargo() {
        return idcargo;
    }

    public void setIdcargo(RrhCargo idcargo) {
        this.idcargo = idcargo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcargosArea != null ? idcargosArea.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RrhCargosArea)) {
            return false;
        }
        RrhCargosArea other = (RrhCargosArea) object;
        if ((this.idcargosArea == null && other.idcargosArea != null) || (this.idcargosArea != null && !this.idcargosArea.equals(other.idcargosArea))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.gisul.optimo.rrhh.entity.RrhCargosArea[ idcargosArea=" + idcargosArea + " ]";
    }
    
}
