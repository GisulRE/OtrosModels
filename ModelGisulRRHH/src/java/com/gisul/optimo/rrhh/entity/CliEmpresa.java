/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gisul.optimo.rrhh.entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "opt.cli_empresa")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CliEmpresa.findAll", query = "SELECT c FROM CliEmpresa c"),
    @NamedQuery(name = "CliEmpresa.findByIdempresa", query = "SELECT c FROM CliEmpresa c WHERE c.idempresa = :idempresa"),
    @NamedQuery(name = "CliEmpresa.findByNit", query = "SELECT c FROM CliEmpresa c WHERE c.nit = :nit"),
    @NamedQuery(name = "CliEmpresa.findByNombre", query = "SELECT c FROM CliEmpresa c WHERE c.nombre = :nombre"),
    @NamedQuery(name = "CliEmpresa.findByRazonSocial", query = "SELECT c FROM CliEmpresa c WHERE c.razonSocial = :razonSocial"),
    @NamedQuery(name = "CliEmpresa.findByRubro", query = "SELECT c FROM CliEmpresa c WHERE c.rubro = :rubro"),
    @NamedQuery(name = "CliEmpresa.findByEstado", query = "SELECT c FROM CliEmpresa c WHERE c.estado = :estado"),
    @NamedQuery(name = "CliEmpresa.findByTelefonoFijo", query = "SELECT c FROM CliEmpresa c WHERE c.telefonoFijo = :telefonoFijo"),
    @NamedQuery(name = "CliEmpresa.findByTelefonoMovil", query = "SELECT c FROM CliEmpresa c WHERE c.telefonoMovil = :telefonoMovil"),
    @NamedQuery(name = "CliEmpresa.findByDireccion", query = "SELECT c FROM CliEmpresa c WHERE c.direccion = :direccion"),
    @NamedQuery(name = "CliEmpresa.findByUrlPortal", query = "SELECT c FROM CliEmpresa c WHERE c.urlPortal = :urlPortal"),
    @NamedQuery(name = "CliEmpresa.findByFechaAlta", query = "SELECT c FROM CliEmpresa c WHERE c.fechaAlta = :fechaAlta"),
    @NamedQuery(name = "CliEmpresa.findByUsuarioAlta", query = "SELECT c FROM CliEmpresa c WHERE c.usuarioAlta = :usuarioAlta"),
    @NamedQuery(name = "CliEmpresa.findByFechaModificaicon", query = "SELECT c FROM CliEmpresa c WHERE c.fechaModificacion = :fechaModificacion"),
    @NamedQuery(name = "CliEmpresa.findByUsuarioModificacion", query = "SELECT c FROM CliEmpresa c WHERE c.usuarioModificacion = :usuarioModificacion"),
    @NamedQuery(name = "CliEmpresa.findByFechaBaja", query = "SELECT c FROM CliEmpresa c WHERE c.fechaBaja = :fechaBaja"),
    @NamedQuery(name = "CliEmpresa.findByUsuarioBaja", query = "SELECT c FROM CliEmpresa c WHERE c.usuarioBaja = :usuarioBaja")})
public class CliEmpresa implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idempresa")
    private Integer idempresa;
    @Size(max = 255)
    @Column(name = "nit")
    private String nit;
    @Size(max = 255)
    @Column(name = "nombre")
    private String nombre;

    @Size(max = 60)
    @Column(name = "tipoentidad")
    private String tipoEntidad;
   

    @Size(max = 255)
    @Column(name = "razon_social")
    private String razonSocial;
    @Size(max = 255)
    @Column(name = "rubro")
    private String rubro;
    @Size(max = 10)
    @Column(name = "estado")
    private String estado;
    @Size(max = 200)
    @Column(name = "telefono_fijo")
    private String telefonoFijo;
    @Size(max = 200)
    @Column(name = "telefono_movil")
    private String telefonoMovil;
    @Size(max = 250)
    @Column(name = "direccion")
    private String direccion;
    @Size(max = 200)
    @Column(name = "url_portal")
    private String urlPortal;
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
//    @OneToMany(mappedBy = "idempresa")
//    private List<CliCliente> cliClienteCollection;
//    @OneToMany(mappedBy = "idempresa")
//    private Collection<PlaRetenciones> plaRetencionesCollection;
//    @OneToMany(mappedBy = "idempresa")
//    private Collection<RrhArea> rrhAreaCollection;
//    @OneToMany(mappedBy = "idempresa")
//    private Collection<PlaPlanilla> plaPlanillaCollection;
//    @OneToMany(mappedBy = "idempresa")
//    private Collection<RrhEmpleado> rrhEmpleadoCollection;
//    @OneToMany(mappedBy = "idempresa")
//    private Collection<RrhContrato> rrhContratoCollection;
//    @OneToMany(mappedBy = "idempresa")
//    private Collection<PlaAnticipos> plaAnticiposCollection;
//    @OneToMany(mappedBy = "idempresa")
//    private Collection<PlaAporte> plaAporteCollection;
//    @OneToMany(mappedBy = "idempresa")
//    private Collection<PlaBono> plaBonoCollection;
//    @OneToMany(mappedBy = "idempresa")
//    private Collection<CliRepresentanteEmpresa> cliRepresentanteEmpresaCollection;

    public CliEmpresa() {
    }

    public String getTipoEntidad() {
        return tipoEntidad;
    }

    public void setTipoEntidad(String tipoEntidad) {
        this.tipoEntidad = tipoEntidad;
    }

    public CliEmpresa(Integer idempresa) {
        this.idempresa = idempresa;
    }

    public CliEmpresa(Integer idempresa, Date fechaAlta) {
        this.idempresa = idempresa;
        this.fechaAlta = fechaAlta;
    }

    public Integer getIdempresa() {
        return idempresa;
    }

    public void setIdempresa(Integer idempresa) {
        this.idempresa = idempresa;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getRubro() {
        return rubro;
    }

    public void setRubro(String rubro) {
        this.rubro = rubro;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTelefonoFijo() {
        return telefonoFijo;
    }

    public void setTelefonoFijo(String telefonoFijo) {
        this.telefonoFijo = telefonoFijo;
    }

    public String getTelefonoMovil() {
        return telefonoMovil;
    }

    public void setTelefonoMovil(String telefonoMovil) {
        this.telefonoMovil = telefonoMovil;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getUrlPortal() {
        return urlPortal;
    }

    public void setUrlPortal(String urlPortal) {
        this.urlPortal = urlPortal;
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

    public Date getFechaModificaicon() {
        return fechaModificacion;
    }

    public void setFechaModificaicon(Date fechaModificacion) {
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

//    public List<CliCliente> getCliClienteCollection() {
//        return cliClienteCollection;
//    }
//
//    public void setCliClienteCollection(List<CliCliente> cliClienteCollection) {
//        this.cliClienteCollection = cliClienteCollection;
//    }
//
//    @XmlTransient
//    public Collection<PlaRetenciones> getPlaRetencionesCollection() {
//        return plaRetencionesCollection;
//    }
//
//    public void setPlaRetencionesCollection(Collection<PlaRetenciones> plaRetencionesCollection) {
//        this.plaRetencionesCollection = plaRetencionesCollection;
//    }
//
//    @XmlTransient
//    public Collection<RrhArea> getRrhAreaCollection() {
//        return rrhAreaCollection;
//    }
//
//    public void setRrhAreaCollection(Collection<RrhArea> rrhAreaCollection) {
//        this.rrhAreaCollection = rrhAreaCollection;
//    }
//
//    @XmlTransient
//    public Collection<PlaPlanilla> getPlaPlanillaCollection() {
//        return plaPlanillaCollection;
//    }
//
//    public void setPlaPlanillaCollection(Collection<PlaPlanilla> plaPlanillaCollection) {
//        this.plaPlanillaCollection = plaPlanillaCollection;
//    }
//
//    @XmlTransient
//    public Collection<RrhEmpleado> getRrhEmpleadoCollection() {
//        return rrhEmpleadoCollection;
//    }
//
//    public void setRrhEmpleadoCollection(Collection<RrhEmpleado> rrhEmpleadoCollection) {
//        this.rrhEmpleadoCollection = rrhEmpleadoCollection;
//    }
//
//    @XmlTransient
//    public Collection<RrhContrato> getRrhContratoCollection() {
//        return rrhContratoCollection;
//    }
//
//    public void setRrhContratoCollection(Collection<RrhContrato> rrhContratoCollection) {
//        this.rrhContratoCollection = rrhContratoCollection;
//    }
//
//    @XmlTransient
//    public Collection<PlaAnticipos> getPlaAnticiposCollection() {
//        return plaAnticiposCollection;
//    }
//
//    public void setPlaAnticiposCollection(Collection<PlaAnticipos> plaAnticiposCollection) {
//        this.plaAnticiposCollection = plaAnticiposCollection;
//    }
//
//    @XmlTransient
//    public Collection<PlaAporte> getPlaAporteCollection() {
//        return plaAporteCollection;
//    }
//
//    public void setPlaAporteCollection(Collection<PlaAporte> plaAporteCollection) {
//        this.plaAporteCollection = plaAporteCollection;
//    }
//
//    @XmlTransient
//    public Collection<PlaBono> getPlaBonoCollection() {
//        return plaBonoCollection;
//    }
//
//    public void setPlaBonoCollection(Collection<PlaBono> plaBonoCollection) {
//        this.plaBonoCollection = plaBonoCollection;
//    }
//
//    @XmlTransient
//    public Collection<CliRepresentanteEmpresa> getCliRepresentanteEmpresaCollection() {
//        return cliRepresentanteEmpresaCollection;
//    }
//
//    public void setCliRepresentanteEmpresaCollection(Collection<CliRepresentanteEmpresa> cliRepresentanteEmpresaCollection) {
//        this.cliRepresentanteEmpresaCollection = cliRepresentanteEmpresaCollection;
//    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idempresa != null ? idempresa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CliEmpresa)) {
            return false;
        }
        CliEmpresa other = (CliEmpresa) object;
        if ((this.idempresa == null && other.idempresa != null) || (this.idempresa != null && !this.idempresa.equals(other.idempresa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.gisul.optimo.rrhh.entity.CliEmpresa[ idempresa=" + idempresa + " ]";
    }
    
}
