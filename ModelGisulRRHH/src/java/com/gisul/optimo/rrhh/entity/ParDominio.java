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
@Table(name = "opt.par_dominio")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ParDominio.findAll", query = "SELECT p FROM ParDominio p"),
    @NamedQuery(name = "ParDominio.findByIddominio", query = "SELECT p FROM ParDominio p WHERE p.iddominio = :iddominio"),
    @NamedQuery(name = "ParDominio.findByDominio", query = "SELECT p FROM ParDominio p WHERE p.dominio = :dominio"),
    @NamedQuery(name = "ParDominio.findBySubDominio", query = "SELECT p FROM ParDominio p WHERE p.subDominio = :subDominio"),
    @NamedQuery(name = "ParDominio.findByDescripcion", query = "SELECT p FROM ParDominio p WHERE p.descripcion = :descripcion"),
    @NamedQuery(name = "ParDominio.findByTipoValor", query = "SELECT p FROM ParDominio p WHERE p.tipoValor = :tipoValor"),
    @NamedQuery(name = "ParDominio.findByValor", query = "SELECT p FROM ParDominio p WHERE p.valor = :valor"),
    @NamedQuery(name = "ParDominio.findByEstado", query = "SELECT p FROM ParDominio p WHERE p.estado = :estado"),
    @NamedQuery(name = "ParDominio.findByFechaAlta", query = "SELECT p FROM ParDominio p WHERE p.fechaAlta = :fechaAlta"),
    @NamedQuery(name = "ParDominio.findByUsuarioAlta", query = "SELECT p FROM ParDominio p WHERE p.usuarioAlta = :usuarioAlta"),
    @NamedQuery(name = "ParDominio.findByFechaBaja", query = "SELECT p FROM ParDominio p WHERE p.fechaBaja = :fechaBaja"),
    @NamedQuery(name = "ParDominio.findByUsuarioBaja", query = "SELECT p FROM ParDominio p WHERE p.usuarioBaja = :usuarioBaja")})
public class ParDominio implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "iddominio")
    private Integer iddominio;
    @Size(max = 255)
    @Column(name = "dominio")
    private String dominio;
    @Size(max = 255)
    @Column(name = "sub_dominio")
    private String subDominio;
    @Size(max = 255)
    @Column(name = "descripcion")
    private String descripcion;
    @Size(max = 255)
    @Column(name = "tipo_valor")
    private String tipoValor;
    @Size(max = 255)
    @Column(name = "valor")
    private String valor;
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

    public ParDominio() {
    }

    public ParDominio(Integer iddominio) {
        this.iddominio = iddominio;
    }

    public Integer getIddominio() {
        return iddominio;
    }

    public void setIddominio(Integer iddominio) {
        this.iddominio = iddominio;
    }

    public String getDominio() {
        return dominio;
    }

    public void setDominio(String dominio) {
        this.dominio = dominio;
    }

    public String getSubDominio() {
        return subDominio;
    }

    public void setSubDominio(String subDominio) {
        this.subDominio = subDominio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipoValor() {
        return tipoValor;
    }

    public void setTipoValor(String tipoValor) {
        this.tipoValor = tipoValor;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iddominio != null ? iddominio.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ParDominio)) {
            return false;
        }
        ParDominio other = (ParDominio) object;
        if ((this.iddominio == null && other.iddominio != null) || (this.iddominio != null && !this.iddominio.equals(other.iddominio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.gisul.optimo.rrhh.entity.ParDominio[ iddominio=" + iddominio + " ]";
    }
    
}
