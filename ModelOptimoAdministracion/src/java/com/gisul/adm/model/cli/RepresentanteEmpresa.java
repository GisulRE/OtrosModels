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
@Table(name = "opt.cli_representante_empresa")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RepresentanteEmpresa.findAll", query = "SELECT c FROM RepresentanteEmpresa c"),
    @NamedQuery(name = "RepresentanteEmpresa.findByIdrepresentante", query = "SELECT c FROM RepresentanteEmpresa c WHERE c.idrepresentante = :idrepresentante"),
    @NamedQuery(name = "RepresentanteEmpresa.findByNroPoder", query = "SELECT c FROM RepresentanteEmpresa c WHERE c.nroPoder = :nroPoder"),
    @NamedQuery(name = "RepresentanteEmpresa.findByEstado", query = "SELECT c FROM RepresentanteEmpresa c WHERE c.estado = :estado"),
    @NamedQuery(name = "RepresentanteEmpresa.findByFechaAlta", query = "SELECT c FROM RepresentanteEmpresa c WHERE c.fechaAlta = :fechaAlta"),
    @NamedQuery(name = "RepresentanteEmpresa.findByUsuarioAlta", query = "SELECT c FROM RepresentanteEmpresa c WHERE c.usuarioAlta = :usuarioAlta"),
    @NamedQuery(name = "RepresentanteEmpresa.findByFechaBaja", query = "SELECT c FROM RepresentanteEmpresa c WHERE c.fechaBaja = :fechaBaja"),
    @NamedQuery(name = "RepresentanteEmpresa.findByUsuarioBaja", query = "SELECT c FROM RepresentanteEmpresa c WHERE c.usuarioBaja = :usuarioBaja")})
public class RepresentanteEmpresa implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idrepresentante")
    private Integer idrepresentante;
    @Size(max = 60)
    @Column(name = "nro_poder")
    private String nroPoder;
    @Size(max = 60)
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
    @Size(max = 60)
    @Column(name = "usuario_baja")
    private String usuarioBaja;
    @JoinColumn(name = "idempresa", referencedColumnName = "idempresa")
    @ManyToOne
    private Empresa idempresa;
    @JoinColumn(name = "idpersona", referencedColumnName = "idpersona")
    @ManyToOne
    private Persona idpersona;

    public RepresentanteEmpresa() {
    }

    public RepresentanteEmpresa(Integer idrepresentante) {
        this.idrepresentante = idrepresentante;
    }

    public RepresentanteEmpresa(Integer idrepresentante, Date fechaAlta) {
        this.idrepresentante = idrepresentante;
        this.fechaAlta = fechaAlta;
    }

    public Integer getIdrepresentante() {
        return idrepresentante;
    }

    public void setIdrepresentante(Integer idrepresentante) {
        this.idrepresentante = idrepresentante;
    }

    public String getNroPoder() {
        return nroPoder;
    }

    public void setNroPoder(String nroPoder) {
        this.nroPoder = nroPoder;
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

    public Empresa getIdempresa() {
        return idempresa;
    }

    public void setIdempresa(Empresa idempresa) {
        this.idempresa = idempresa;
    }

    public Persona getIdpersona() {
        return idpersona;
    }

    public void setIdpersona(Persona idpersona) {
        this.idpersona = idpersona;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idrepresentante != null ? idrepresentante.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RepresentanteEmpresa)) {
            return false;
        }
        RepresentanteEmpresa other = (RepresentanteEmpresa) object;
        if ((this.idrepresentante == null && other.idrepresentante != null) || (this.idrepresentante != null && !this.idrepresentante.equals(other.idrepresentante))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.gisul.optimo.rrhh.entity.RepresentanteEmpresa[ idrepresentante=" + idrepresentante + " ]";
    }
    
}
