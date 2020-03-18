/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gisul.model.ctb;

import com.gisul.adm.model.cli.Empresa;
import com.gisul.adm.model.cli.Persona;
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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author admin
 */
@Entity
@Table(name = "ctb_libro_diario", schema = "opt")
@XmlRootElement
public class LibroDiario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idlibrodiario")
    private Integer idlibrodiario;

    @ManyToOne
    @JoinColumn(name = "idempresa")
    private Empresa empresa;

    @ManyToOne
    @JoinColumn(name = "idperiodo")
    private PeriodoContable periodo;

    @ManyToOne
    @JoinColumn(name = "idpersona")
    private Persona persona;

    @Size(max = 60)
    @Column(name = "tipo_asiento")
    private String tipoAsiento;
    @Column(name = "fecha_asiento")
    @Temporal(TemporalType.DATE)
    private Date fechaAsiento;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "tasa_cambio")
    private BigDecimal tasaCambio;
    @Size(max = 10)
    @Column(name = "moneda_asiento")
    private String monedaAsiento;
    @Size(max = 300)
    @Column(name = "glosa")
    private String glosa;
    @Column(name = "monto_asiento")
    private BigDecimal montoAsiento;
    @Size(max = 10)
    @Column(name = "estado")
    private String estado;
    @Column(name = "formato_impresion")
    private Integer formatoImpresion;
    @Column(name = "fecha_alta")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaAlta;
    @Size(max = 50)
    @Column(name = "usuario_alta")
    private String usuarioAlta;
    @Column(name = "fecha_modificacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaModificacion;
    @Size(max = 50)
    @Column(name = "usuario_modificacion")
    private String usuarioModificacion;
    @Column(name = "fecha_baja")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaBaja;
    @Size(max = 50)
    @Column(name = "usuario_baja")
    private String usuarioBaja;

    public LibroDiario() {
    }

    public LibroDiario(Integer idlibrodiario) {
        this.idlibrodiario = idlibrodiario;
    }

    public Integer getIdlibrodiario() {
        return idlibrodiario;
    }

    public void setIdlibrodiario(Integer idlibrodiario) {
        this.idlibrodiario = idlibrodiario;
    }

    public String getTipoAsiento() {
        return tipoAsiento;
    }

    public void setTipoAsiento(String tipoAsiento) {
        this.tipoAsiento = tipoAsiento;
    }

    public Date getFechaAsiento() {
        return fechaAsiento;
    }

    public void setFechaAsiento(Date fechaAsiento) {
        this.fechaAsiento = fechaAsiento;
    }

    public BigDecimal getTasaCambio() {
        return tasaCambio;
    }

    public void setTasaCambio(BigDecimal tasaCambio) {
        this.tasaCambio = tasaCambio;
    }

    public String getMonedaAsiento() {
        return monedaAsiento;
    }

    public void setMonedaAsiento(String monedaAsiento) {
        this.monedaAsiento = monedaAsiento;
    }

    public String getGlosa() {
        return glosa;
    }

    public void setGlosa(String glosa) {
        this.glosa = glosa;
    }

    public BigDecimal getMontoAsiento() {
        return montoAsiento;
    }

    public void setMontoAsiento(BigDecimal montoAsiento) {
        this.montoAsiento = montoAsiento;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Integer getFormatoImpresion() {
        return formatoImpresion;
    }

    public void setFormatoImpresion(Integer formatoImpresion) {
        this.formatoImpresion = formatoImpresion;
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

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public PeriodoContable getPeriodo() {
        return periodo;
    }

    public void setPeriodo(PeriodoContable periodo) {
        this.periodo = periodo;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idlibrodiario != null ? idlibrodiario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LibroDiario)) {
            return false;
        }
        LibroDiario other = (LibroDiario) object;
        if ((this.idlibrodiario == null && other.idlibrodiario != null) || (this.idlibrodiario != null && !this.idlibrodiario.equals(other.idlibrodiario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eveliz.model.ctb.CtbLibroDiario[ idlibrodiario=" + idlibrodiario + " ]";
    }

}
