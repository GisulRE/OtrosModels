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
@Table(name = "prh.pla_retenciones")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PlaRetenciones.findAll", query = "SELECT p FROM PlaRetenciones p"),
    @NamedQuery(name = "PlaRetenciones.findByIdretencion", query = "SELECT p FROM PlaRetenciones p WHERE p.idretencion = :idretencion"),
    @NamedQuery(name = "PlaRetenciones.findByPeriodo", query = "SELECT p FROM PlaRetenciones p WHERE p.periodo = :periodo"),
    @NamedQuery(name = "PlaRetenciones.findByMotivo", query = "SELECT p FROM PlaRetenciones p WHERE p.motivo = :motivo"),
    @NamedQuery(name = "PlaRetenciones.findByDescripcion", query = "SELECT p FROM PlaRetenciones p WHERE p.descripcion = :descripcion"),
    @NamedQuery(name = "PlaRetenciones.findByMonto", query = "SELECT p FROM PlaRetenciones p WHERE p.monto = :monto"),
    @NamedQuery(name = "PlaRetenciones.findByEstado", query = "SELECT p FROM PlaRetenciones p WHERE p.estado = :estado"),
    @NamedQuery(name = "PlaRetenciones.findByFechaAlta", query = "SELECT p FROM PlaRetenciones p WHERE p.fechaAlta = :fechaAlta"),
    @NamedQuery(name = "PlaRetenciones.findByUsuarioAlta", query = "SELECT p FROM PlaRetenciones p WHERE p.usuarioAlta = :usuarioAlta"),
    @NamedQuery(name = "PlaRetenciones.findByFechaModificacion", query = "SELECT p FROM PlaRetenciones p WHERE p.fechaModificacion = :fechaModificacion"),
    @NamedQuery(name = "PlaRetenciones.findByUsuarioModificacion", query = "SELECT p FROM PlaRetenciones p WHERE p.usuarioModificacion = :usuarioModificacion"),
    @NamedQuery(name = "PlaRetenciones.findByFechaBaja", query = "SELECT p FROM PlaRetenciones p WHERE p.fechaBaja = :fechaBaja"),
    @NamedQuery(name = "PlaRetenciones.findByUsuarioBaja", query = "SELECT p FROM PlaRetenciones p WHERE p.usuarioBaja = :usuarioBaja")})
public class PlaRetenciones implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idretencion")
    private Integer idretencion;
    @Size(max = 10)
    @Column(name = "periodo")
    private String periodo;
    @Size(max = 150)
    @Column(name = "motivo")
    private String motivo;
    @Size(max = 150)
    @Column(name = "descripcion")
    private String descripcion;
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
    @JoinColumn(name = "idempresa", referencedColumnName = "idempresa")
    @ManyToOne
    private CliEmpresa idempresa;
    @JoinColumn(name = "idempleado", referencedColumnName = "idempleado")
    @ManyToOne
    private RrhEmpleado idempleado;

    public PlaRetenciones() {
    }

    public PlaRetenciones(Integer idretencion) {
        this.idretencion = idretencion;
    }

    public PlaRetenciones(Integer idretencion, Date fechaAlta) {
        this.idretencion = idretencion;
        this.fechaAlta = fechaAlta;
    }

    public Integer getIdretencion() {
        return idretencion;
    }

    public void setIdretencion(Integer idretencion) {
        this.idretencion = idretencion;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
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

    public CliEmpresa getIdempresa() {
        return idempresa;
    }

    public void setIdempresa(CliEmpresa idempresa) {
        this.idempresa = idempresa;
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
        hash += (idretencion != null ? idretencion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PlaRetenciones)) {
            return false;
        }
        PlaRetenciones other = (PlaRetenciones) object;
        if ((this.idretencion == null && other.idretencion != null) || (this.idretencion != null && !this.idretencion.equals(other.idretencion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.gisul.optimo.rrhh.entity.PlaRetenciones[ idretencion=" + idretencion + " ]";
    }
    
}
