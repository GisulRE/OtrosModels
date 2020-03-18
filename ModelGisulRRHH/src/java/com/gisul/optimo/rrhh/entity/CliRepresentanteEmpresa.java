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
    @NamedQuery(name = "CliRepresentanteEmpresa.findAll", query = "SELECT c FROM CliRepresentanteEmpresa c"),
    @NamedQuery(name = "CliRepresentanteEmpresa.findByIdrepresentante", query = "SELECT c FROM CliRepresentanteEmpresa c WHERE c.idrepresentante = :idrepresentante"),
    @NamedQuery(name = "CliRepresentanteEmpresa.findByNroPoder", query = "SELECT c FROM CliRepresentanteEmpresa c WHERE c.nroPoder = :nroPoder"),
    @NamedQuery(name = "CliRepresentanteEmpresa.findByEstado", query = "SELECT c FROM CliRepresentanteEmpresa c WHERE c.estado = :estado"),
    @NamedQuery(name = "CliRepresentanteEmpresa.findByFechaAlta", query = "SELECT c FROM CliRepresentanteEmpresa c WHERE c.fechaAlta = :fechaAlta"),
    @NamedQuery(name = "CliRepresentanteEmpresa.findByUsuarioAlta", query = "SELECT c FROM CliRepresentanteEmpresa c WHERE c.usuarioAlta = :usuarioAlta"),
    @NamedQuery(name = "CliRepresentanteEmpresa.findByFechaBaja", query = "SELECT c FROM CliRepresentanteEmpresa c WHERE c.fechaBaja = :fechaBaja"),
    @NamedQuery(name = "CliRepresentanteEmpresa.findByUsuarioBaja", query = "SELECT c FROM CliRepresentanteEmpresa c WHERE c.usuarioBaja = :usuarioBaja")})
public class CliRepresentanteEmpresa implements Serializable {
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
    private CliEmpresa idempresa;
    @JoinColumn(name = "idpersona", referencedColumnName = "idpersona")
    @ManyToOne
    private CliPersona idpersona;

    public CliRepresentanteEmpresa() {
    }

    public CliRepresentanteEmpresa(Integer idrepresentante) {
        this.idrepresentante = idrepresentante;
    }

    public CliRepresentanteEmpresa(Integer idrepresentante, Date fechaAlta) {
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

    public CliEmpresa getIdempresa() {
        return idempresa;
    }

    public void setIdempresa(CliEmpresa idempresa) {
        this.idempresa = idempresa;
    }

    public CliPersona getIdpersona() {
        return idpersona;
    }

    public void setIdpersona(CliPersona idpersona) {
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
        if (!(object instanceof CliRepresentanteEmpresa)) {
            return false;
        }
        CliRepresentanteEmpresa other = (CliRepresentanteEmpresa) object;
        if ((this.idrepresentante == null && other.idrepresentante != null) || (this.idrepresentante != null && !this.idrepresentante.equals(other.idrepresentante))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.gisul.optimo.rrhh.entity.CliRepresentanteEmpresa[ idrepresentante=" + idrepresentante + " ]";
    }
    
}
