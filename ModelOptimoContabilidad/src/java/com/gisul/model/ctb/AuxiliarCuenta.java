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
import java.math.BigDecimal;
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
@Table(name = "opt.ctb_auxiliar_cuenta")
public class AuxiliarCuenta implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idauxcuenta")
    private long idAuxCuenta;

    @ManyToOne
    @JoinColumn(name = "idempresa")
    private Empresa empresa;

    @Size(max = 100)
    @Column(name = "nombre")
    private String nombre;

    @Size(max = 60)
    @Column(name = "rubro")
    private String rubro; // Tesoreria, Cuentas x Cobrar, Pagar, Inventarios

    @Size(max = 60)
    @Column(name = "subrubro")
    private String subrubro; // Bancos/Cajas, 

    @Size(max = 60)
    @Column(name = "aplica_a")
    private String aplicaA;

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

    @ManyToOne
    @JoinColumn(name = "idgrupobanco")
    private GrupoBanco grupoBanco;

    @Column(name = "cuenta_banco")
    private String cuentaBanco;

    @Column(name = "tipo_cuenta")
    private String tipoCuenta;

    @Column(name = "nro_documeto_abonado")
    private String nroDocumentoAbonado;

    @Column(name = "nombre_abonado")
    private String nombreAbonado;

    @Column(name = "emite_cheque")
    private String emiteCheque;

    @Column(name = "formato_cheque_banco")
    private String formatoChequeBanco;

    @Column(name = "contador_cheque")
    private long contadorCheque;

    @Column(name = "saldo_caja_banco")
    private BigDecimal saldoCajaBanco;

    @Column(name = "arqueo_caja")
    private String arqueoCaja;

    @Column(name = "saldo_caja")
    private BigDecimal saldoCaja;

    @Column(name = "cierre_caja")
    private BigDecimal cierreCaja;

    @Column(name = "emite_recibo")
    private String emiteRecibo;

    public long getIdAuxCuenta() {
        return idAuxCuenta;
    }

    public void setIdAuxCuenta(long idAuxCuenta) {
        this.idAuxCuenta = idAuxCuenta;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRubro() {
        return rubro;
    }

    public void setRubro(String rubro) {
        this.rubro = rubro;
    }

    public String getSubrubro() {
        return subrubro;
    }

    public void setSubrubro(String subrubro) {
        this.subrubro = subrubro;
    }

    public String getAplicaA() {
        return aplicaA;
    }

    public void setAplicaA(String aplicaA) {
        this.aplicaA = aplicaA;
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

    public GrupoBanco getGrupoBanco() {
        return grupoBanco;
    }

    public void setGrupoBanco(GrupoBanco grupoBanco) {
        this.grupoBanco = grupoBanco;
    }

    public String getCuentaBanco() {
        return cuentaBanco;
    }

    public void setCuentaBanco(String cuentaBanco) {
        this.cuentaBanco = cuentaBanco;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public String getNroDocumentoAbonado() {
        return nroDocumentoAbonado;
    }

    public void setNroDocumentoAbonado(String nroDocumentoAbonado) {
        this.nroDocumentoAbonado = nroDocumentoAbonado;
    }

    public String getNombreAbonado() {
        return nombreAbonado;
    }

    public void setNombreAbonado(String nombreAbonado) {
        this.nombreAbonado = nombreAbonado;
    }

    public String getEmiteCheque() {
        return emiteCheque;
    }

    public void setEmiteCheque(String emiteCheque) {
        this.emiteCheque = emiteCheque;
    }

    public String getFormatoChequeBanco() {
        return formatoChequeBanco;
    }

    public void setFormatoChequeBanco(String formatoChequeBanco) {
        this.formatoChequeBanco = formatoChequeBanco;
    }

    public long getContadorCheque() {
        return contadorCheque;
    }

    public void setContadorCheque(long contadorCheque) {
        this.contadorCheque = contadorCheque;
    }

    public BigDecimal getSaldoCajaBanco() {
        return saldoCajaBanco;
    }

    public void setSaldoCajaBanco(BigDecimal saldoCajaBanco) {
        this.saldoCajaBanco = saldoCajaBanco;
    }

    public String getArqueoCaja() {
        return arqueoCaja;
    }

    public void setArqueoCaja(String arqueoCaja) {
        this.arqueoCaja = arqueoCaja;
    }

    public BigDecimal getSaldoCaja() {
        return saldoCaja;
    }

    public void setSaldoCaja(BigDecimal saldoCaja) {
        this.saldoCaja = saldoCaja;
    }

    public BigDecimal getCierreCaja() {
        return cierreCaja;
    }

    public void setCierreCaja(BigDecimal cierreCaja) {
        this.cierreCaja = cierreCaja;
    }

    public String getEmiteRecibo() {
        return emiteRecibo;
    }

    public void setEmiteRecibo(String emiteRecibo) {
        this.emiteRecibo = emiteRecibo;
    }

    //<editor-fold defaultstate="collapsed" desc="Override">
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + (int) (this.idAuxCuenta ^ (this.idAuxCuenta >>> 32));
        hash = 59 * hash + Objects.hashCode(this.empresa);
        hash = 59 * hash + Objects.hashCode(this.rubro);
        hash = 59 * hash + Objects.hashCode(this.subrubro);
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
        final AuxiliarCuenta other = (AuxiliarCuenta) obj;
        if (this.idAuxCuenta != other.idAuxCuenta) {
            return false;
        }
        if (!Objects.equals(this.empresa, other.empresa)) {
            return false;
        }
        if (!Objects.equals(this.rubro, other.rubro)) {
            return false;
        }
        if (!Objects.equals(this.subrubro, other.subrubro)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "AuxiliarCuenta{" + "idAuxCuenta=" + idAuxCuenta + ", empresa=" + empresa + ", nombre=" + nombre + ", rubro=" + rubro + ", subrubro=" + subrubro + ", aplicaA=" + aplicaA + ", estado=" + estado + ", fechaAlta=" + fechaAlta + ", usuarioAlta=" + usuarioAlta + ", fechaModificacion=" + fechaModificacion + ", usuarioModificacion=" + usuarioModificacion + ", fechaBaja=" + fechaBaja + ", usuarioBaja=" + usuarioBaja + '}';
    }
//</editor-fold>

}

/* Comentarios de la Clase
 *
 *
 *
 */
