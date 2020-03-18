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
@Table(name = "prh.pla_planilla")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PlaPlanilla.findAll", query = "SELECT p FROM PlaPlanilla p"),
    @NamedQuery(name = "PlaPlanilla.findByIdplanilla", query = "SELECT p FROM PlaPlanilla p WHERE p.idplanilla = :idplanilla"),
    @NamedQuery(name = "PlaPlanilla.findByPeriodo", query = "SELECT p FROM PlaPlanilla p WHERE p.periodo = :periodo"),
    @NamedQuery(name = "PlaPlanilla.findByEstado", query = "SELECT p FROM PlaPlanilla p WHERE p.estado = :estado"),
    @NamedQuery(name = "PlaPlanilla.findByDiasTrabajado", query = "SELECT p FROM PlaPlanilla p WHERE p.diasTrabajado = :diasTrabajado"),
    @NamedQuery(name = "PlaPlanilla.findByHaberBasico", query = "SELECT p FROM PlaPlanilla p WHERE p.haberBasico = :haberBasico"),
    @NamedQuery(name = "PlaPlanilla.findByBonoAntiguedad", query = "SELECT p FROM PlaPlanilla p WHERE p.bonoAntiguedad = :bonoAntiguedad"),
    @NamedQuery(name = "PlaPlanilla.findByBonoTransporte", query = "SELECT p FROM PlaPlanilla p WHERE p.bonoTransporte = :bonoTransporte"),
    @NamedQuery(name = "PlaPlanilla.findByComisiones", query = "SELECT p FROM PlaPlanilla p WHERE p.comisiones = :comisiones"),
    @NamedQuery(name = "PlaPlanilla.findByOtrosBonos", query = "SELECT p FROM PlaPlanilla p WHERE p.otrosBonos = :otrosBonos"),
    @NamedQuery(name = "PlaPlanilla.findByTotalGanado", query = "SELECT p FROM PlaPlanilla p WHERE p.totalGanado = :totalGanado"),
    @NamedQuery(name = "PlaPlanilla.findByAporteAfp", query = "SELECT p FROM PlaPlanilla p WHERE p.aporteAfp = :aporteAfp"),
    @NamedQuery(name = "PlaPlanilla.findByAporteNacionalSolidario", query = "SELECT p FROM PlaPlanilla p WHERE p.aporteNacionalSolidario = :aporteNacionalSolidario"),
    @NamedQuery(name = "PlaPlanilla.findByAnticipos", query = "SELECT p FROM PlaPlanilla p WHERE p.anticipos = :anticipos"),
    @NamedQuery(name = "PlaPlanilla.findByRcIva", query = "SELECT p FROM PlaPlanilla p WHERE p.rcIva = :rcIva"),
    @NamedQuery(name = "PlaPlanilla.findByAsistencia", query = "SELECT p FROM PlaPlanilla p WHERE p.asistencia = :asistencia"),
    @NamedQuery(name = "PlaPlanilla.findByOtrosDescuentos", query = "SELECT p FROM PlaPlanilla p WHERE p.otrosDescuentos = :otrosDescuentos"),
    @NamedQuery(name = "PlaPlanilla.findByTotalDescuento", query = "SELECT p FROM PlaPlanilla p WHERE p.totalDescuento = :totalDescuento"),
    @NamedQuery(name = "PlaPlanilla.findByLiquidoPagable", query = "SELECT p FROM PlaPlanilla p WHERE p.liquidoPagable = :liquidoPagable"),
    @NamedQuery(name = "PlaPlanilla.findByFechaAlta", query = "SELECT p FROM PlaPlanilla p WHERE p.fechaAlta = :fechaAlta"),
    @NamedQuery(name = "PlaPlanilla.findByUsuarioAlta", query = "SELECT p FROM PlaPlanilla p WHERE p.usuarioAlta = :usuarioAlta"),
    @NamedQuery(name = "PlaPlanilla.findByFechaModificacion", query = "SELECT p FROM PlaPlanilla p WHERE p.fechaModificacion = :fechaModificacion"),
    @NamedQuery(name = "PlaPlanilla.findByUsuarioModificacion", query = "SELECT p FROM PlaPlanilla p WHERE p.usuarioModificacion = :usuarioModificacion"),
    @NamedQuery(name = "PlaPlanilla.findByFechaBaja", query = "SELECT p FROM PlaPlanilla p WHERE p.fechaBaja = :fechaBaja"),
    @NamedQuery(name = "PlaPlanilla.findByUsuarioBaja", query = "SELECT p FROM PlaPlanilla p WHERE p.usuarioBaja = :usuarioBaja")})
public class PlaPlanilla implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idplanilla")
    private Integer idplanilla;
    @Size(max = 10)
    @Column(name = "periodo")
    private String periodo;
    @Size(max = 10)
    @Column(name = "estado")
    private String estado;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "dias_trabajado")
    private BigDecimal diasTrabajado;
    @Column(name = "haber_basico")
    private BigDecimal haberBasico;
    @Column(name = "bono_antiguedad")
    private BigDecimal bonoAntiguedad;
    @Column(name = "bono_transporte")
    private BigDecimal bonoTransporte;
    @Column(name = "comisiones")
    private BigDecimal comisiones;
    @Column(name = "otros_bonos")
    private BigDecimal otrosBonos;
    @Column(name = "total_ganado")
    private BigDecimal totalGanado;
    @Column(name = "aporte_afp")
    private BigDecimal aporteAfp;
    @Column(name = "aporte_nacional_solidario")
    private BigDecimal aporteNacionalSolidario;
    @Column(name = "anticipos")
    private BigDecimal anticipos;
    @Column(name = "rc_iva")
    private BigDecimal rcIva;
    @Column(name = "asistencia")
    private BigDecimal asistencia;
    @Column(name = "otros_descuentos")
    private BigDecimal otrosDescuentos;
    @Column(name = "total_descuento")
    private BigDecimal totalDescuento;
    @Column(name = "liquido_pagable")
    private BigDecimal liquidoPagable;
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

    public PlaPlanilla() {
    }

    public PlaPlanilla(Integer idplanilla) {
        this.idplanilla = idplanilla;
    }

    public PlaPlanilla(Integer idplanilla, Date fechaAlta) {
        this.idplanilla = idplanilla;
        this.fechaAlta = fechaAlta;
    }

    public Integer getIdplanilla() {
        return idplanilla;
    }

    public void setIdplanilla(Integer idplanilla) {
        this.idplanilla = idplanilla;
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

    public BigDecimal getDiasTrabajado() {
        return diasTrabajado;
    }

    public void setDiasTrabajado(BigDecimal diasTrabajado) {
        this.diasTrabajado = diasTrabajado;
    }

    public BigDecimal getHaberBasico() {
        return haberBasico;
    }

    public void setHaberBasico(BigDecimal haberBasico) {
        this.haberBasico = haberBasico;
    }

    public BigDecimal getBonoAntiguedad() {
        return bonoAntiguedad;
    }

    public void setBonoAntiguedad(BigDecimal bonoAntiguedad) {
        this.bonoAntiguedad = bonoAntiguedad;
    }

    public BigDecimal getBonoTransporte() {
        return bonoTransporte;
    }

    public void setBonoTransporte(BigDecimal bonoTransporte) {
        this.bonoTransporte = bonoTransporte;
    }

    public BigDecimal getComisiones() {
        return comisiones;
    }

    public void setComisiones(BigDecimal comisiones) {
        this.comisiones = comisiones;
    }

    public BigDecimal getOtrosBonos() {
        return otrosBonos;
    }

    public void setOtrosBonos(BigDecimal otrosBonos) {
        this.otrosBonos = otrosBonos;
    }

    public BigDecimal getTotalGanado() {
        return totalGanado;
    }

    public void setTotalGanado(BigDecimal totalGanado) {
        this.totalGanado = totalGanado;
    }

    public BigDecimal getAporteAfp() {
        return aporteAfp;
    }

    public void setAporteAfp(BigDecimal aporteAfp) {
        this.aporteAfp = aporteAfp;
    }

    public BigDecimal getAporteNacionalSolidario() {
        return aporteNacionalSolidario;
    }

    public void setAporteNacionalSolidario(BigDecimal aporteNacionalSolidario) {
        this.aporteNacionalSolidario = aporteNacionalSolidario;
    }

    public BigDecimal getAnticipos() {
        return anticipos;
    }

    public void setAnticipos(BigDecimal anticipos) {
        this.anticipos = anticipos;
    }

    public BigDecimal getRcIva() {
        return rcIva;
    }

    public void setRcIva(BigDecimal rcIva) {
        this.rcIva = rcIva;
    }

    public BigDecimal getAsistencia() {
        return asistencia;
    }

    public void setAsistencia(BigDecimal asistencia) {
        this.asistencia = asistencia;
    }

    public BigDecimal getOtrosDescuentos() {
        return otrosDescuentos;
    }

    public void setOtrosDescuentos(BigDecimal otrosDescuentos) {
        this.otrosDescuentos = otrosDescuentos;
    }

    public BigDecimal getTotalDescuento() {
        return totalDescuento;
    }

    public void setTotalDescuento(BigDecimal totalDescuento) {
        this.totalDescuento = totalDescuento;
    }

    public BigDecimal getLiquidoPagable() {
        return liquidoPagable;
    }

    public void setLiquidoPagable(BigDecimal liquidoPagable) {
        this.liquidoPagable = liquidoPagable;
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
        hash += (idplanilla != null ? idplanilla.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PlaPlanilla)) {
            return false;
        }
        PlaPlanilla other = (PlaPlanilla) object;
        if ((this.idplanilla == null && other.idplanilla != null) || (this.idplanilla != null && !this.idplanilla.equals(other.idplanilla))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.gisul.optimo.rrhh.entity.PlaPlanilla[ idplanilla=" + idplanilla + " ]";
    }
    
}
