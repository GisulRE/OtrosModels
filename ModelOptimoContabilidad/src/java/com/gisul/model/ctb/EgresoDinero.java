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
 * @author admin
 */
@Entity
@Table(name = "ctb_egreso_dinero")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EgresoDinero.findAll", query = "SELECT e FROM EgresoDinero e"),
    @NamedQuery(name = "EgresoDinero.findByIdegreso", query = "SELECT e FROM EgresoDinero e WHERE e.idegreso = :idegreso"),
    @NamedQuery(name = "EgresoDinero.findByTipoEgreso", query = "SELECT e FROM EgresoDinero e WHERE e.tipoEgreso = :tipoEgreso"),
    @NamedQuery(name = "EgresoDinero.findByFechaEgreso", query = "SELECT e FROM EgresoDinero e WHERE e.fechaEgreso = :fechaEgreso"),
    @NamedQuery(name = "EgresoDinero.findByTasaCambio", query = "SELECT e FROM EgresoDinero e WHERE e.tasaCambio = :tasaCambio"),
    @NamedQuery(name = "EgresoDinero.findByMonedaEgreso", query = "SELECT e FROM EgresoDinero e WHERE e.monedaEgreso = :monedaEgreso"),
    @NamedQuery(name = "EgresoDinero.findByGlosa", query = "SELECT e FROM EgresoDinero e WHERE e.glosa = :glosa"),
    @NamedQuery(name = "EgresoDinero.findByFormaDePago", query = "SELECT e FROM EgresoDinero e WHERE e.formaDePago = :formaDePago"),
    @NamedQuery(name = "EgresoDinero.findByMontoTotalEgreso", query = "SELECT e FROM EgresoDinero e WHERE e.montoTotalEgreso = :montoTotalEgreso"),
    @NamedQuery(name = "EgresoDinero.findByEstado", query = "SELECT e FROM EgresoDinero e WHERE e.estado = :estado"),
    @NamedQuery(name = "EgresoDinero.findByFormatoImpresion", query = "SELECT e FROM EgresoDinero e WHERE e.formatoImpresion = :formatoImpresion"),
    @NamedQuery(name = "EgresoDinero.findByFechaAlta", query = "SELECT e FROM EgresoDinero e WHERE e.fechaAlta = :fechaAlta"),
    @NamedQuery(name = "EgresoDinero.findByUsuarioAlta", query = "SELECT e FROM EgresoDinero e WHERE e.usuarioAlta = :usuarioAlta"),
    @NamedQuery(name = "EgresoDinero.findByFechaModificacion", query = "SELECT e FROM EgresoDinero e WHERE e.fechaModificacion = :fechaModificacion"),
    @NamedQuery(name = "EgresoDinero.findByUsuarioModificacion", query = "SELECT e FROM EgresoDinero e WHERE e.usuarioModificacion = :usuarioModificacion"),
    @NamedQuery(name = "EgresoDinero.findByFechaBaja", query = "SELECT e FROM EgresoDinero e WHERE e.fechaBaja = :fechaBaja"),
    @NamedQuery(name = "EgresoDinero.findByUsuarioBaja", query = "SELECT e FROM EgresoDinero e WHERE e.usuarioBaja = :usuarioBaja")})
public class EgresoDinero implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idegreso")
    private Integer idegreso;

    @ManyToOne
    @JoinColumn(name = "idempresa")
    private Empresa empresa;

    @ManyToOne
    @JoinColumn(name = "idpersona")
    private Persona persona;

    @ManyToOne
    @JoinColumn(name = "idlibrodiario")
    private LibroDiario libroDiario;

    @Size(max = 60)
    @Column(name = "tipo_egreso")
    private String tipoEgreso;
    @Column(name = "fecha_egreso")
    @Temporal(TemporalType.DATE)
    private Date fechaEgreso;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "tasa_cambio")
    private BigDecimal tasaCambio;
    @Size(max = 10)
    @Column(name = "moneda_egreso")
    private String monedaEgreso;
    @Size(max = 300)
    @Column(name = "glosa")
    private String glosa;
    @Size(max = 60)
    @Column(name = "forma_de_pago")
    private String formaDePago;
    @Column(name = "monto_total_egreso")
    private BigDecimal montoTotalEgreso;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idegreso")
    private Collection<EgresoDineroCuenta> egresoDineroCuentaCollection;

    public EgresoDinero() {
    }

    public EgresoDinero(Integer idegreso) {
        this.idegreso = idegreso;
    }

    public Integer getIdegreso() {
        return idegreso;
    }

    public void setIdegreso(Integer idegreso) {
        this.idegreso = idegreso;
    }

    public String getTipoEgreso() {
        return tipoEgreso;
    }

    public void setTipoEgreso(String tipoEgreso) {
        this.tipoEgreso = tipoEgreso;
    }

    public Date getFechaEgreso() {
        return fechaEgreso;
    }

    public void setFechaEgreso(Date fechaEgreso) {
        this.fechaEgreso = fechaEgreso;
    }

    public BigDecimal getTasaCambio() {
        return tasaCambio;
    }

    public void setTasaCambio(BigDecimal tasaCambio) {
        this.tasaCambio = tasaCambio;
    }

    public String getMonedaEgreso() {
        return monedaEgreso;
    }

    public void setMonedaEgreso(String monedaEgreso) {
        this.monedaEgreso = monedaEgreso;
    }

    public String getGlosa() {
        return glosa;
    }

    public void setGlosa(String glosa) {
        this.glosa = glosa;
    }

    public String getFormaDePago() {
        return formaDePago;
    }

    public void setFormaDePago(String formaDePago) {
        this.formaDePago = formaDePago;
    }

    public BigDecimal getMontoTotalEgreso() {
        return montoTotalEgreso;
    }

    public void setMontoTotalEgreso(BigDecimal montoTotalEgreso) {
        this.montoTotalEgreso = montoTotalEgreso;
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

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public LibroDiario getLibroDiario() {
        return libroDiario;
    }

    public void setLibroDiario(LibroDiario libroDiario) {
        this.libroDiario = libroDiario;
    }
    
    
    

    @XmlTransient
    public Collection<EgresoDineroCuenta> getEgresoDineroCuentaCollection() {
        return egresoDineroCuentaCollection;
    }

    public void setEgresoDineroCuentaCollection(Collection<EgresoDineroCuenta> egresoDineroCuentaCollection) {
        this.egresoDineroCuentaCollection = egresoDineroCuentaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idegreso != null ? idegreso.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EgresoDinero)) {
            return false;
        }
        EgresoDinero other = (EgresoDinero) object;
        if ((this.idegreso == null && other.idegreso != null) || (this.idegreso != null && !this.idegreso.equals(other.idegreso))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eveliz.model.ctb.EgresoDinero[ idegreso=" + idegreso + " ]";
    }

}
