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
@Table(name = "prh.rrh_empleado")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RrhEmpleado.findAll", query = "SELECT r FROM RrhEmpleado r"),
    @NamedQuery(name = "RrhEmpleado.findByIdempleado", query = "SELECT r FROM RrhEmpleado r WHERE r.idempleado = :idempleado"),
    @NamedQuery(name = "RrhEmpleado.findByReferencias", query = "SELECT r FROM RrhEmpleado r WHERE r.referencias = :referencias"),
    @NamedQuery(name = "RrhEmpleado.findByDatosGarantia", query = "SELECT r FROM RrhEmpleado r WHERE r.datosGarantia = :datosGarantia"),
    @NamedQuery(name = "RrhEmpleado.findByNua", query = "SELECT r FROM RrhEmpleado r WHERE r.nua = :nua"),
    @NamedQuery(name = "RrhEmpleado.findByAfpAporta", query = "SELECT r FROM RrhEmpleado r WHERE r.afpAporta = :afpAporta"),
    @NamedQuery(name = "RrhEmpleado.findBySeguroSocial", query = "SELECT r FROM RrhEmpleado r WHERE r.seguroSocial = :seguroSocial"),
    @NamedQuery(name = "RrhEmpleado.findByEsJubilado", query = "SELECT r FROM RrhEmpleado r WHERE r.esJubilado = :esJubilado"),
    @NamedQuery(name = "RrhEmpleado.findByFechaIngreso", query = "SELECT r FROM RrhEmpleado r WHERE r.fechaIngreso = :fechaIngreso"),
    @NamedQuery(name = "RrhEmpleado.findByFechaRetiro", query = "SELECT r FROM RrhEmpleado r WHERE r.fechaRetiro = :fechaRetiro"),
    @NamedQuery(name = "RrhEmpleado.findByOpcional3", query = "SELECT r FROM RrhEmpleado r WHERE r.opcional3 = :opcional3"),
    @NamedQuery(name = "RrhEmpleado.findByOpcional4", query = "SELECT r FROM RrhEmpleado r WHERE r.opcional4 = :opcional4"),
    @NamedQuery(name = "RrhEmpleado.findByFechaAlta", query = "SELECT r FROM RrhEmpleado r WHERE r.fechaAlta = :fechaAlta"),
    @NamedQuery(name = "RrhEmpleado.findByUsuarioAlta", query = "SELECT r FROM RrhEmpleado r WHERE r.usuarioAlta = :usuarioAlta"),
    @NamedQuery(name = "RrhEmpleado.findByFechaModificacion", query = "SELECT r FROM RrhEmpleado r WHERE r.fechaModificacion = :fechaModificacion"),
    @NamedQuery(name = "RrhEmpleado.findByUsuarioModificacion", query = "SELECT r FROM RrhEmpleado r WHERE r.usuarioModificacion = :usuarioModificacion"),
    @NamedQuery(name = "RrhEmpleado.findByFechaBaja", query = "SELECT r FROM RrhEmpleado r WHERE r.fechaBaja = :fechaBaja"),
    @NamedQuery(name = "RrhEmpleado.findByUsuarioBaja", query = "SELECT r FROM RrhEmpleado r WHERE r.usuarioBaja = :usuarioBaja")})
public class RrhEmpleado implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idempleado")
    private Integer idempleado;
    @Size(max = 255)
    @Column(name = "referencias")
    private String referencias;
    @Size(max = 255)
    @Column(name = "datos_garantia")
    private String datosGarantia;
    @Size(max = 255)
    @Column(name = "nua")
    private String nua;
    @Size(max = 255)
    @Column(name = "afp_aporta")
    private String afpAporta;
    @Size(max = 255)
    @Column(name = "seguro_social")
    private String seguroSocial;
    @Size(max = 255)
    @Column(name = "es_jubilado")
    private String esJubilado;
    @Column(name = "fecha_ingreso")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaIngreso;
    @Column(name = "fecha_retiro")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRetiro;
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
    @OneToMany(mappedBy = "idempleado")
    private Collection<PlaAportePatronal> plaAportePatronalCollection;
    @OneToMany(mappedBy = "idempleado")
    private Collection<PlaAporteLaboral> plaAporteLaboralCollection;
    @OneToMany(mappedBy = "idempleado")
    private Collection<RrhCargosEmpleado> rrhCargosEmpleadoCollection;
    @OneToMany(mappedBy = "idempleado")
    private Collection<PlaRetenciones> plaRetencionesCollection;
    @OneToMany(mappedBy = "idempleado")
    private Collection<PlaPlanilla> plaPlanillaCollection;
    @JoinColumn(name = "idempresa", referencedColumnName = "idempresa")
    @ManyToOne
    private CliEmpresa idempresa;
    @JoinColumn(name = "idpersona", referencedColumnName = "idpersona")
    @ManyToOne
    private CliPersona idpersona;
    @JoinColumn(name = "idcontrato", referencedColumnName = "idcontrato")
    @ManyToOne
    private RrhContrato idcontrato;
    @OneToMany(mappedBy = "idempleado")
    private Collection<PlaAnticipos> plaAnticiposCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idempleado")
    private Collection<RrhEmpleadoHbasico> rrhEmpleadoHbasicoCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idempleado")
    private Collection<PlaBonoEmpleado> plaBonoEmpleadoCollection;

    public RrhEmpleado() {
    }

    public RrhEmpleado(Integer idempleado) {
        this.idempleado = idempleado;
    }

    public Integer getIdempleado() {
        return idempleado;
    }

    public void setIdempleado(Integer idempleado) {
        this.idempleado = idempleado;
    }

    public String getReferencias() {
        return referencias;
    }

    public void setReferencias(String referencias) {
        this.referencias = referencias;
    }

    public String getDatosGarantia() {
        return datosGarantia;
    }

    public void setDatosGarantia(String datosGarantia) {
        this.datosGarantia = datosGarantia;
    }

    public String getNua() {
        return nua;
    }

    public void setNua(String nua) {
        this.nua = nua;
    }

    public String getAfpAporta() {
        return afpAporta;
    }

    public void setAfpAporta(String afpAporta) {
        this.afpAporta = afpAporta;
    }

    public String getSeguroSocial() {
        return seguroSocial;
    }

    public void setSeguroSocial(String seguroSocial) {
        this.seguroSocial = seguroSocial;
    }

    public String getEsJubilado() {
        return esJubilado;
    }

    public void setEsJubilado(String esJubilado) {
        this.esJubilado = esJubilado;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Date getFechaRetiro() {
        return fechaRetiro;
    }

    public void setFechaRetiro(Date fechaRetiro) {
        this.fechaRetiro = fechaRetiro;
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

    @XmlTransient
    public Collection<RrhCargosEmpleado> getRrhCargosEmpleadoCollection() {
        return rrhCargosEmpleadoCollection;
    }

    public void setRrhCargosEmpleadoCollection(Collection<RrhCargosEmpleado> rrhCargosEmpleadoCollection) {
        this.rrhCargosEmpleadoCollection = rrhCargosEmpleadoCollection;
    }

    @XmlTransient
    public Collection<PlaRetenciones> getPlaRetencionesCollection() {
        return plaRetencionesCollection;
    }

    public void setPlaRetencionesCollection(Collection<PlaRetenciones> plaRetencionesCollection) {
        this.plaRetencionesCollection = plaRetencionesCollection;
    }

    @XmlTransient
    public Collection<PlaPlanilla> getPlaPlanillaCollection() {
        return plaPlanillaCollection;
    }

    public void setPlaPlanillaCollection(Collection<PlaPlanilla> plaPlanillaCollection) {
        this.plaPlanillaCollection = plaPlanillaCollection;
    }

    public CliEmpresa getIdempresa() {
        return idempresa;
    }

    public void setIdempresa(CliEmpresa idempresa) {
        this.idempresa = idempresa;
    }

    public CliPersona getIdpersona() {
        return idpersona;
    }

    public void setIdpersona(CliPersona idpersona) {
        this.idpersona = idpersona;
    }

    public RrhContrato getIdcontrato() {
        return idcontrato;
    }

    public void setIdcontrato(RrhContrato idcontrato) {
        this.idcontrato = idcontrato;
    }

    @XmlTransient
    public Collection<PlaAnticipos> getPlaAnticiposCollection() {
        return plaAnticiposCollection;
    }

    public void setPlaAnticiposCollection(Collection<PlaAnticipos> plaAnticiposCollection) {
        this.plaAnticiposCollection = plaAnticiposCollection;
    }

    @XmlTransient
    public Collection<RrhEmpleadoHbasico> getRrhEmpleadoHbasicoCollection() {
        return rrhEmpleadoHbasicoCollection;
    }

    public void setRrhEmpleadoHbasicoCollection(Collection<RrhEmpleadoHbasico> rrhEmpleadoHbasicoCollection) {
        this.rrhEmpleadoHbasicoCollection = rrhEmpleadoHbasicoCollection;
    }

    @XmlTransient
    public Collection<PlaBonoEmpleado> getPlaBonoEmpleadoCollection() {
        return plaBonoEmpleadoCollection;
    }

    public void setPlaBonoEmpleadoCollection(Collection<PlaBonoEmpleado> plaBonoEmpleadoCollection) {
        this.plaBonoEmpleadoCollection = plaBonoEmpleadoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idempleado != null ? idempleado.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RrhEmpleado)) {
            return false;
        }
        RrhEmpleado other = (RrhEmpleado) object;
        if ((this.idempleado == null && other.idempleado != null) || (this.idempleado != null && !this.idempleado.equals(other.idempleado))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.gisul.optimo.rrhh.entity.RrhEmpleado[ idempleado=" + idempleado + " ]";
    }
    
}
