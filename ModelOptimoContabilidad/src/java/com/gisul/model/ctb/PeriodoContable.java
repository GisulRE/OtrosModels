/**
 * Nombre : .java Version : 1.0.0 Creado : Copyright(c) {2016} Bolitel S.R.L.
 * All Rights Reserved. This software is the proprietary information of Bolitel
 * S.R.L.
 *
 * @author Rolando Escobar <Bolitel>
 */

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gisul.model.ctb;

import com.gisul.adm.model.cli.Empresa;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

/**
 *
 * @author desarrollo
 */
@Entity
@Table(name = "ctb_periodo_contable", schema = "opt")
public class PeriodoContable implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idperiodo")
    private long idPeriodo;

    @ManyToOne
    @JoinColumn(name = "idempresa")
    private Empresa empresa;

    @Column(name = "numero_periodo")
    private Integer numeroPeriodo;

    @Size(max = 100)
    @Column(name = "nombre")
    private String nombre;

    @Column(name = "mes_calendario")
    private Integer mesCalendario;

    @Column(name = "ano_calendario")
    private Integer anoCalendario;

    @Column(name = "fecha_inicio")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaInicio;

    @Column(name = "fecha_fin")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaFin;

    @Size(max = 20)
    @Column(name = "estado")
    private String estado;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fecha_alta")
    private Date fechaAlta;

    @Column(name = "usuario_alta")
    private String usuarioAlta;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fecha_modificacion")
    private Date fechaModificacion;

    @Column(name = "usuario_modificacion")
    private String usuarioModificacion;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fecha_baja")
    private Date fechaBaja;

    @Column(name = "usuario_baja")
    private String usuarioBaja;

    public long getIdPeriodo() {
        return idPeriodo;
    }

    public void setIdPeriodo(long idPeriodo) {
        this.idPeriodo = idPeriodo;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Integer getNumeroPeriodo() {
        return numeroPeriodo;
    }

    public void setNumeroPeriodo(Integer numeroPeriodo) {
        this.numeroPeriodo = numeroPeriodo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getMesCalendario() {
        return mesCalendario;
    }

    public void setMesCalendario(Integer mesCalendario) {
        this.mesCalendario = mesCalendario;
    }

    public Integer getAnoCalendario() {
        return anoCalendario;
    }

    public void setAnoCalendario(Integer anoCalendario) {
        this.anoCalendario = anoCalendario;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + (int) (this.idPeriodo ^ (this.idPeriodo >>> 32));
        hash = 29 * hash + Objects.hashCode(this.empresa);
        hash = 29 * hash + Objects.hashCode(this.numeroPeriodo);
        hash = 29 * hash + Objects.hashCode(this.nombre);
        hash = 29 * hash + Objects.hashCode(this.mesCalendario);
        hash = 29 * hash + Objects.hashCode(this.anoCalendario);
        hash = 29 * hash + Objects.hashCode(this.fechaInicio);
        hash = 29 * hash + Objects.hashCode(this.fechaFin);
        hash = 29 * hash + Objects.hashCode(this.estado);
        hash = 29 * hash + Objects.hashCode(this.fechaAlta);
        hash = 29 * hash + Objects.hashCode(this.usuarioAlta);
        hash = 29 * hash + Objects.hashCode(this.fechaModificacion);
        hash = 29 * hash + Objects.hashCode(this.usuarioModificacion);
        hash = 29 * hash + Objects.hashCode(this.fechaBaja);
        hash = 29 * hash + Objects.hashCode(this.usuarioBaja);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PeriodoContable other = (PeriodoContable) obj;
        if (this.idPeriodo != other.idPeriodo) {
            return false;
        }
        if (!Objects.equals(this.empresa, other.empresa)) {
            return false;
        }
        if (!Objects.equals(this.numeroPeriodo, other.numeroPeriodo)) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.mesCalendario, other.mesCalendario)) {
            return false;
        }
        if (!Objects.equals(this.anoCalendario, other.anoCalendario)) {
            return false;
        }
        if (!Objects.equals(this.fechaInicio, other.fechaInicio)) {
            return false;
        }
        if (!Objects.equals(this.fechaFin, other.fechaFin)) {
            return false;
        }
        if (!Objects.equals(this.estado, other.estado)) {
            return false;
        }
        if (!Objects.equals(this.fechaAlta, other.fechaAlta)) {
            return false;
        }
        if (!Objects.equals(this.usuarioAlta, other.usuarioAlta)) {
            return false;
        }
        if (!Objects.equals(this.fechaModificacion, other.fechaModificacion)) {
            return false;
        }
        if (!Objects.equals(this.usuarioModificacion, other.usuarioModificacion)) {
            return false;
        }
        if (!Objects.equals(this.fechaBaja, other.fechaBaja)) {
            return false;
        }
        if (!Objects.equals(this.usuarioBaja, other.usuarioBaja)) {
            return false;
        }
        return true;
    }

}

/* Comentarios de la Clase
 *
 *
 *
 */
