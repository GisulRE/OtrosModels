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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author eveliz
 */
@Entity
@Table(name = "prh.rrh_contrato")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RrhContrato.findAll", query = "SELECT r FROM RrhContrato r"),
    @NamedQuery(name = "RrhContrato.findByIdcontrato", query = "SELECT r FROM RrhContrato r WHERE r.idcontrato = :idcontrato"),
    @NamedQuery(name = "RrhContrato.findByIdpersona", query = "SELECT r FROM RrhContrato r WHERE r.idpersona = :idpersona"),
    @NamedQuery(name = "RrhContrato.findByTipoContrato", query = "SELECT r FROM RrhContrato r WHERE r.tipoContrato = :tipoContrato"),
    @NamedQuery(name = "RrhContrato.findByNumeroContrato", query = "SELECT r FROM RrhContrato r WHERE r.numeroContrato = :numeroContrato"),
    @NamedQuery(name = "RrhContrato.findByFechaIngreso", query = "SELECT r FROM RrhContrato r WHERE r.fechaIngreso = :fechaIngreso"),
    @NamedQuery(name = "RrhContrato.findByFechaFin", query = "SELECT r FROM RrhContrato r WHERE r.fechaFin = :fechaFin"),
    @NamedQuery(name = "RrhContrato.findByTipoPlanilla", query = "SELECT r FROM RrhContrato r WHERE r.tipoPlanilla = :tipoPlanilla"),
    @NamedQuery(name = "RrhContrato.findByDescripcionContrato", query = "SELECT r FROM RrhContrato r WHERE r.descripcionContrato = :descripcionContrato"),
    @NamedQuery(name = "RrhContrato.findByEstado", query = "SELECT r FROM RrhContrato r WHERE r.estado = :estado"),
    @NamedQuery(name = "RrhContrato.findByOpcional3", query = "SELECT r FROM RrhContrato r WHERE r.opcional3 = :opcional3"),
    @NamedQuery(name = "RrhContrato.findByOpcional4", query = "SELECT r FROM RrhContrato r WHERE r.opcional4 = :opcional4"),
    @NamedQuery(name = "RrhContrato.findByFechaAlta", query = "SELECT r FROM RrhContrato r WHERE r.fechaAlta = :fechaAlta"),
    @NamedQuery(name = "RrhContrato.findByUsuarioAlta", query = "SELECT r FROM RrhContrato r WHERE r.usuarioAlta = :usuarioAlta"),
    @NamedQuery(name = "RrhContrato.findByFechaModificacion", query = "SELECT r FROM RrhContrato r WHERE r.fechaModificacion = :fechaModificacion"),
    @NamedQuery(name = "RrhContrato.findByUsuarioModificacion", query = "SELECT r FROM RrhContrato r WHERE r.usuarioModificacion = :usuarioModificacion"),
    @NamedQuery(name = "RrhContrato.findByFechaBaja", query = "SELECT r FROM RrhContrato r WHERE r.fechaBaja = :fechaBaja"),
    @NamedQuery(name = "RrhContrato.findByUsuarioBaja", query = "SELECT r FROM RrhContrato r WHERE r.usuarioBaja = :usuarioBaja")})
public class RrhContrato implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idcontrato")
    private Integer idcontrato;
    @Column(name = "idpersona")
    private BigInteger idpersona;
    @Size(max = 255)
    @Column(name = "tipo_contrato")
    private String tipoContrato;
    @Size(max = 255)
    @Column(name = "numero_contrato")
    private String numeroContrato;
    @Column(name = "fecha_ingreso")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaIngreso;
    @Column(name = "fecha_fin")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaFin;
    @Size(max = 255)
    @Column(name = "tipo_planilla")
    private String tipoPlanilla;
    @Size(max = 255)
    @Column(name = "descripcion_contrato")
    private String descripcionContrato;
    @Size(max = 5)
    @Column(name = "estado")
    private String estado;
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
    @Column(name = "fecha_modificacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaModificacion;
    @Size(max = 255)
    @Column(name = "usuario_modificacion")
    private String usuarioModificacion;
    @Column(name = "fecha_baja")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaBaja;
    @Size(max = 255)
    @Column(name = "usuario_baja")
    private String usuarioBaja;
    @OneToMany(mappedBy = "idcontrato")
    private Collection<RrhEmpleado> rrhEmpleadoCollection;
    @JoinColumn(name = "idempresa", referencedColumnName = "idempresa")
    @ManyToOne
    private CliEmpresa idempresa;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idcontrato")
    private Collection<RrhEmpleadoHbasico> rrhEmpleadoHbasicoCollection;

    public RrhContrato() {
    }

    public RrhContrato(Integer idcontrato) {
        this.idcontrato = idcontrato;
    }

    public Integer getIdcontrato() {
        return idcontrato;
    }

    public void setIdcontrato(Integer idcontrato) {
        this.idcontrato = idcontrato;
    }

    public BigInteger getIdpersona() {
        return idpersona;
    }

    public void setIdpersona(BigInteger idpersona) {
        this.idpersona = idpersona;
    }

    public String getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    public String getNumeroContrato() {
        return numeroContrato;
    }

    public void setNumeroContrato(String numeroContrato) {
        this.numeroContrato = numeroContrato;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getTipoPlanilla() {
        return tipoPlanilla;
    }

    public void setTipoPlanilla(String tipoPlanilla) {
        this.tipoPlanilla = tipoPlanilla;
    }

    public String getDescripcionContrato() {
        return descripcionContrato;
    }

    public void setDescripcionContrato(String descripcionContrato) {
        this.descripcionContrato = descripcionContrato;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
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
    public Collection<RrhEmpleado> getRrhEmpleadoCollection() {
        return rrhEmpleadoCollection;
    }

    public void setRrhEmpleadoCollection(Collection<RrhEmpleado> rrhEmpleadoCollection) {
        this.rrhEmpleadoCollection = rrhEmpleadoCollection;
    }

    public CliEmpresa getIdempresa() {
        return idempresa;
    }

    public void setIdempresa(CliEmpresa idempresa) {
        this.idempresa = idempresa;
    }

    @XmlTransient
    public Collection<RrhEmpleadoHbasico> getRrhEmpleadoHbasicoCollection() {
        return rrhEmpleadoHbasicoCollection;
    }

    public void setRrhEmpleadoHbasicoCollection(Collection<RrhEmpleadoHbasico> rrhEmpleadoHbasicoCollection) {
        this.rrhEmpleadoHbasicoCollection = rrhEmpleadoHbasicoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcontrato != null ? idcontrato.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RrhContrato)) {
            return false;
        }
        RrhContrato other = (RrhContrato) object;
        if ((this.idcontrato == null && other.idcontrato != null) || (this.idcontrato != null && !this.idcontrato.equals(other.idcontrato))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.gisul.optimo.rrhh.entity.RrhContrato[ idcontrato=" + idcontrato + " ]";
    }
    
}
