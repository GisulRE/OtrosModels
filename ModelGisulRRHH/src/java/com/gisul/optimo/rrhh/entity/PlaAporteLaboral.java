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
@Table(name = "prh.pla_aporte_laboral")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PlaAporteLaboral.findAll", query = "SELECT p FROM PlaAporteLaboral p"),
    @NamedQuery(name = "PlaAporteLaboral.findByIdaporteLaboral", query = "SELECT p FROM PlaAporteLaboral p WHERE p.idaporteLaboral = :idaporteLaboral"),
    @NamedQuery(name = "PlaAporteLaboral.findByPeriodo", query = "SELECT p FROM PlaAporteLaboral p WHERE p.periodo = :periodo"),
    @NamedQuery(name = "PlaAporteLaboral.findByEstado", query = "SELECT p FROM PlaAporteLaboral p WHERE p.estado = :estado"),
    @NamedQuery(name = "PlaAporteLaboral.findByMonto", query = "SELECT p FROM PlaAporteLaboral p WHERE p.monto = :monto"),
    @NamedQuery(name = "PlaAporteLaboral.findByFechaAlta", query = "SELECT p FROM PlaAporteLaboral p WHERE p.fechaAlta = :fechaAlta"),
    @NamedQuery(name = "PlaAporteLaboral.findByUsuarioAlta", query = "SELECT p FROM PlaAporteLaboral p WHERE p.usuarioAlta = :usuarioAlta"),
    @NamedQuery(name = "PlaAporteLaboral.findByFechaModificacion", query = "SELECT p FROM PlaAporteLaboral p WHERE p.fechaModificacion = :fechaModificacion"),
    @NamedQuery(name = "PlaAporteLaboral.findByUsuarioModificacion", query = "SELECT p FROM PlaAporteLaboral p WHERE p.usuarioModificacion = :usuarioModificacion"),
    @NamedQuery(name = "PlaAporteLaboral.findByFechaBaja", query = "SELECT p FROM PlaAporteLaboral p WHERE p.fechaBaja = :fechaBaja"),
    @NamedQuery(name = "PlaAporteLaboral.findByUsuarioBaja", query = "SELECT p FROM PlaAporteLaboral p WHERE p.usuarioBaja = :usuarioBaja")})
public class PlaAporteLaboral implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idaporte_laboral")
    private Integer idaporteLaboral;
    @Size(max = 10)
    @Column(name = "periodo")
    private String periodo;
    @Size(max = 10)
    @Column(name = "estado")
    private String estado;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "monto")
    private BigDecimal monto;
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
    @JoinColumn(name = "idaporte", referencedColumnName = "idaporte")
    @ManyToOne
    private PlaAporte idaporte;
    @JoinColumn(name = "idempleado", referencedColumnName = "idempleado")
    @ManyToOne
    private RrhEmpleado idempleado;

    public PlaAporteLaboral() {
    }

    public PlaAporteLaboral(Integer idaporteLaboral) {
        this.idaporteLaboral = idaporteLaboral;
    }

    public PlaAporteLaboral(Integer idaporteLaboral, Date fechaAlta) {
        this.idaporteLaboral = idaporteLaboral;
        this.fechaAlta = fechaAlta;
    }

    public Integer getIdaporteLaboral() {
        return idaporteLaboral;
    }

    public void setIdaporteLaboral(Integer idaporteLaboral) {
        this.idaporteLaboral = idaporteLaboral;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public BigDecimal getMonto() {
        return monto;
    }

    public void setMonto(BigDecimal monto) {
        this.monto = monto;
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

    public PlaAporte getIdaporte() {
        return idaporte;
    }

    public void setIdaporte(PlaAporte idaporte) {
        this.idaporte = idaporte;
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
        hash += (idaporteLaboral != null ? idaporteLaboral.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PlaAporteLaboral)) {
            return false;
        }
        PlaAporteLaboral other = (PlaAporteLaboral) object;
        if ((this.idaporteLaboral == null && other.idaporteLaboral != null) || (this.idaporteLaboral != null && !this.idaporteLaboral.equals(other.idaporteLaboral))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.gisul.optimo.rrhh.entity.PlaAporteLaboral[ idaporteLaboral=" + idaporteLaboral + " ]";
    }
    
}
