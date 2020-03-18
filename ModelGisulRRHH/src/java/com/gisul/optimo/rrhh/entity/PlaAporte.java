/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gisul.optimo.rrhh.entity;

import java.io.Serializable;
import java.math.BigDecimal;
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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author eveliz
 */
@Entity
@Table(name = "prh.pla_aporte")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PlaAporte.findAll", query = "SELECT p FROM PlaAporte p"),
    @NamedQuery(name = "PlaAporte.findByIdaporte", query = "SELECT p FROM PlaAporte p WHERE p.idaporte = :idaporte"),
    @NamedQuery(name = "PlaAporte.findByTipo", query = "SELECT p FROM PlaAporte p WHERE p.tipo = :tipo"),
    @NamedQuery(name = "PlaAporte.findByNombre", query = "SELECT p FROM PlaAporte p WHERE p.nombre = :nombre"),
    @NamedQuery(name = "PlaAporte.findByDescripcion", query = "SELECT p FROM PlaAporte p WHERE p.descripcion = :descripcion"),
    @NamedQuery(name = "PlaAporte.findByEstado", query = "SELECT p FROM PlaAporte p WHERE p.estado = :estado"),
    @NamedQuery(name = "PlaAporte.findByPorcentaje", query = "SELECT p FROM PlaAporte p WHERE p.porcentaje = :porcentaje"),
    @NamedQuery(name = "PlaAporte.findByFechaAlta", query = "SELECT p FROM PlaAporte p WHERE p.fechaAlta = :fechaAlta"),
    @NamedQuery(name = "PlaAporte.findByUsuarioAlta", query = "SELECT p FROM PlaAporte p WHERE p.usuarioAlta = :usuarioAlta"),
    @NamedQuery(name = "PlaAporte.findByFechaModificacion", query = "SELECT p FROM PlaAporte p WHERE p.fechaModificacion = :fechaModificacion"),
    @NamedQuery(name = "PlaAporte.findByUsuarioModificacion", query = "SELECT p FROM PlaAporte p WHERE p.usuarioModificacion = :usuarioModificacion"),
    @NamedQuery(name = "PlaAporte.findByFechaBaja", query = "SELECT p FROM PlaAporte p WHERE p.fechaBaja = :fechaBaja"),
    @NamedQuery(name = "PlaAporte.findByUsuarioBaja", query = "SELECT p FROM PlaAporte p WHERE p.usuarioBaja = :usuarioBaja")})
public class PlaAporte implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idaporte")
    private Integer idaporte;
    @Size(max = 30)
    @Column(name = "tipo")
    private String tipo;
    @Size(max = 150)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 150)
    @Column(name = "descripcion")
    private String descripcion;
    @Size(max = 10)
    @Column(name = "estado")
    private String estado;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "porcentaje")
    private BigDecimal porcentaje;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_alta")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaAlta;
    @Size(max = 60)
    @Column(name = "usuario_alta")
    private String usuarioAlta;
    @Column(name = "fecha_modificacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaModificacion;
    @Size(max = 60)
    @Column(name = "usuario_modificacion")
    private String usuarioModificacion;
    @Column(name = "fecha_baja")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaBaja;
    @Size(max = 60)
    @Column(name = "usuario_baja")
    private String usuarioBaja;
    @OneToMany(mappedBy = "idaporte")
    private Collection<PlaAportePatronal> plaAportePatronalCollection;
    @OneToMany(mappedBy = "idaporte")
    private Collection<PlaAporteLaboral> plaAporteLaboralCollection;
    @JoinColumn(name = "idempresa", referencedColumnName = "idempresa")
    @ManyToOne
    private CliEmpresa idempresa;

    public PlaAporte() {
    }

    public PlaAporte(Integer idaporte) {
        this.idaporte = idaporte;
    }

    public PlaAporte(Integer idaporte, Date fechaAlta) {
        this.idaporte = idaporte;
        this.fechaAlta = fechaAlta;
    }

    public Integer getIdaporte() {
        return idaporte;
    }

    public void setIdaporte(Integer idaporte) {
        this.idaporte = idaporte;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public BigDecimal getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(BigDecimal porcentaje) {
        this.porcentaje = porcentaje;
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

    @XmlTransient
    public Collection<PlaAportePatronal> getPlaAportePatronalCollection() {
        return plaAportePatronalCollection;
    }

    public void setPlaAportePatronalCollection(Collection<PlaAportePatronal> plaAportePatronalCollection) {
        this.plaAportePatronalCollection = plaAportePatronalCollection;
    }

    @XmlTransient
    public Collection<PlaAporteLaboral> getPlaAporteLaboralCollection() {
        return plaAporteLaboralCollection;
    }

    public void setPlaAporteLaboralCollection(Collection<PlaAporteLaboral> plaAporteLaboralCollection) {
        this.plaAporteLaboralCollection = plaAporteLaboralCollection;
    }

    public CliEmpresa getIdempresa() {
        return idempresa;
    }

    public void setIdempresa(CliEmpresa idempresa) {
        this.idempresa = idempresa;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idaporte != null ? idaporte.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PlaAporte)) {
            return false;
        }
        PlaAporte other = (PlaAporte) object;
        if ((this.idaporte == null && other.idaporte != null) || (this.idaporte != null && !this.idaporte.equals(other.idaporte))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.gisul.optimo.rrhh.entity.PlaAporte[ idaporte=" + idaporte + " ]";
    }
    
}
