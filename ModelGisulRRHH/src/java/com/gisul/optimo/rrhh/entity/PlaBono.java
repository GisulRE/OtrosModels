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
import javax.persistence.CascadeType;
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
@Table(name = "prh.pla_bono")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PlaBono.findAll", query = "SELECT p FROM PlaBono p"),
    @NamedQuery(name = "PlaBono.findByIdbono", query = "SELECT p FROM PlaBono p WHERE p.idbono = :idbono"),
    @NamedQuery(name = "PlaBono.findByTipo", query = "SELECT p FROM PlaBono p WHERE p.tipo = :tipo"),
    @NamedQuery(name = "PlaBono.findByNombre", query = "SELECT p FROM PlaBono p WHERE p.nombre = :nombre"),
    @NamedQuery(name = "PlaBono.findByDescripcion", query = "SELECT p FROM PlaBono p WHERE p.descripcion = :descripcion"),
    @NamedQuery(name = "PlaBono.findByMonto", query = "SELECT p FROM PlaBono p WHERE p.monto = :monto"),
    @NamedQuery(name = "PlaBono.findByPorcentaje", query = "SELECT p FROM PlaBono p WHERE p.porcentaje = :porcentaje"),
    @NamedQuery(name = "PlaBono.findByEstado", query = "SELECT p FROM PlaBono p WHERE p.estado = :estado"),
    @NamedQuery(name = "PlaBono.findByFechaAlta", query = "SELECT p FROM PlaBono p WHERE p.fechaAlta = :fechaAlta"),
    @NamedQuery(name = "PlaBono.findByUsuarioAlta", query = "SELECT p FROM PlaBono p WHERE p.usuarioAlta = :usuarioAlta"),
    @NamedQuery(name = "PlaBono.findByFechaModificacion", query = "SELECT p FROM PlaBono p WHERE p.fechaModificacion = :fechaModificacion"),
    @NamedQuery(name = "PlaBono.findByUsuarioModificacion", query = "SELECT p FROM PlaBono p WHERE p.usuarioModificacion = :usuarioModificacion"),
    @NamedQuery(name = "PlaBono.findByFechaBaja", query = "SELECT p FROM PlaBono p WHERE p.fechaBaja = :fechaBaja"),
    @NamedQuery(name = "PlaBono.findByUsuarioBaja", query = "SELECT p FROM PlaBono p WHERE p.usuarioBaja = :usuarioBaja")})
public class PlaBono implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idbono")
    private Integer idbono;
    @Size(max = 30)
    @Column(name = "tipo")
    private String tipo;
    @Size(max = 150)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 150)
    @Column(name = "descripcion")
    private String descripcion;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "monto")
    private BigDecimal monto;
    @Column(name = "porcentaje")
    private BigDecimal porcentaje;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idbono")
    private Collection<PlaBonoEmpleado> plaBonoEmpleadoCollection;
    @JoinColumn(name = "idempresa", referencedColumnName = "idempresa")
    @ManyToOne
    private CliEmpresa idempresa;

    public PlaBono() {
    }

    public PlaBono(Integer idbono) {
        this.idbono = idbono;
    }

    public PlaBono(Integer idbono, Date fechaAlta) {
        this.idbono = idbono;
        this.fechaAlta = fechaAlta;
    }

    public Integer getIdbono() {
        return idbono;
    }

    public void setIdbono(Integer idbono) {
        this.idbono = idbono;
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

    public BigDecimal getMonto() {
        return monto;
    }

    public void setMonto(BigDecimal monto) {
        this.monto = monto;
    }

    public BigDecimal getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(BigDecimal porcentaje) {
        this.porcentaje = porcentaje;
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

    @XmlTransient
    public Collection<PlaBonoEmpleado> getPlaBonoEmpleadoCollection() {
        return plaBonoEmpleadoCollection;
    }

    public void setPlaBonoEmpleadoCollection(Collection<PlaBonoEmpleado> plaBonoEmpleadoCollection) {
        this.plaBonoEmpleadoCollection = plaBonoEmpleadoCollection;
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
        hash += (idbono != null ? idbono.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PlaBono)) {
            return false;
        }
        PlaBono other = (PlaBono) object;
        if ((this.idbono == null && other.idbono != null) || (this.idbono != null && !this.idbono.equals(other.idbono))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.gisul.optimo.rrhh.entity.PlaBono[ idbono=" + idbono + " ]";
    }
    
}
