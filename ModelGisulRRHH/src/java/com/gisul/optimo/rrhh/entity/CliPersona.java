/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gisul.optimo.rrhh.entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author eveliz
 */
@Entity
@Table(name = "opt.cli_persona")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CliPersona.findAll", query = "SELECT c FROM CliPersona c"),
    @NamedQuery(name = "CliPersona.findByIdpersona", query = "SELECT c FROM CliPersona c WHERE c.idpersona = :idpersona"),
    @NamedQuery(name = "CliPersona.findByNombre", query = "SELECT c FROM CliPersona c WHERE c.nombre = :nombre"),
    @NamedQuery(name = "CliPersona.findByApellidoPaterno", query = "SELECT c FROM CliPersona c WHERE c.apellidoPaterno = :apellidoPaterno"),
    @NamedQuery(name = "CliPersona.findByApellidoMaterno", query = "SELECT c FROM CliPersona c WHERE c.apellidoMaterno = :apellidoMaterno"),
    @NamedQuery(name = "CliPersona.findByApellidoCasado", query = "SELECT c FROM CliPersona c WHERE c.apellidoCasado = :apellidoCasado"),
    @NamedQuery(name = "CliPersona.findByTipoDocumento", query = "SELECT c FROM CliPersona c WHERE c.tipoDocumento = :tipoDocumento"),
    @NamedQuery(name = "CliPersona.findByValorDocumento", query = "SELECT c FROM CliPersona c WHERE c.valorDocumento = :valorDocumento"),
    @NamedQuery(name = "CliPersona.findByEmisionDocumento", query = "SELECT c FROM CliPersona c WHERE c.emisionDocumento = :emisionDocumento"),
    @NamedQuery(name = "CliPersona.findByComplementoDocumento", query = "SELECT c FROM CliPersona c WHERE c.complementoDocumento = :complementoDocumento"),
    @NamedQuery(name = "CliPersona.findByEstadoCivil", query = "SELECT c FROM CliPersona c WHERE c.estadoCivil = :estadoCivil"),
    @NamedQuery(name = "CliPersona.findByNacionalidad", query = "SELECT c FROM CliPersona c WHERE c.nacionalidad = :nacionalidad"),
    @NamedQuery(name = "CliPersona.findByFechaNacimiento", query = "SELECT c FROM CliPersona c WHERE c.fechaNacimiento = :fechaNacimiento"),
    @NamedQuery(name = "CliPersona.findByLugarNacimiento", query = "SELECT c FROM CliPersona c WHERE c.lugarNacimiento = :lugarNacimiento"),
    @NamedQuery(name = "CliPersona.findBySexo", query = "SELECT c FROM CliPersona c WHERE c.sexo = :sexo"),
    @NamedQuery(name = "CliPersona.findByProfesion", query = "SELECT c FROM CliPersona c WHERE c.profesion = :profesion"),
    @NamedQuery(name = "CliPersona.findByCorreoElectronico", query = "SELECT c FROM CliPersona c WHERE c.correoElectronico = :correoElectronico"),
    @NamedQuery(name = "CliPersona.findByTelefonoFijo", query = "SELECT c FROM CliPersona c WHERE c.telefonoFijo = :telefonoFijo"),
    @NamedQuery(name = "CliPersona.findByTelefonoMovil", query = "SELECT c FROM CliPersona c WHERE c.telefonoMovil = :telefonoMovil"),
    @NamedQuery(name = "CliPersona.findByEstado", query = "SELECT c FROM CliPersona c WHERE c.estado = :estado"),
    @NamedQuery(name = "CliPersona.findByDireccion", query = "SELECT c FROM CliPersona c WHERE c.direccion = :direccion"),
    @NamedQuery(name = "CliPersona.findByFechaAlta", query = "SELECT c FROM CliPersona c WHERE c.fechaAlta = :fechaAlta"),
    @NamedQuery(name = "CliPersona.findByUsuarioAlta", query = "SELECT c FROM CliPersona c WHERE c.usuarioAlta = :usuarioAlta"),
    @NamedQuery(name = "CliPersona.findByFechaBaja", query = "SELECT c FROM CliPersona c WHERE c.fechaBaja = :fechaBaja"),
    @NamedQuery(name = "CliPersona.findByUsuarioBaja", query = "SELECT c FROM CliPersona c WHERE c.usuarioBaja = :usuarioBaja")})
public class CliPersona implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idpersona")
    private Integer idpersona;
    @Size(max = 255)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 255)
    @Column(name = "apellido_paterno")
    private String apellidoPaterno;
    @Size(max = 255)
    @Column(name = "apellido_materno")
    private String apellidoMaterno;
    @Size(max = 255)
    @Column(name = "apellido_casado")
    private String apellidoCasado;
    @Size(max = 255)
    @Column(name = "tipo_documento")
    private String tipoDocumento;
    @Size(max = 255)
    @Column(name = "valor_documento")
    private String valorDocumento;
    @Size(max = 255)
    @Column(name = "emision_documento")
    private String emisionDocumento;
    @Size(max = 5)
    @Column(name = "complemento_documento")
    private String complementoDocumento;
    @Size(max = 255)
    @Column(name = "estado_civil")
    private String estadoCivil;
    @Size(max = 255)
    @Column(name = "nacionalidad")
    private String nacionalidad;
    @Column(name = "fecha_nacimiento")
    @Temporal(TemporalType.DATE)
    private Date fechaNacimiento;
    @Size(max = 20)
    @Column(name = "lugar_nacimiento")
    private String lugarNacimiento;
    @Size(max = 255)
    @Column(name = "sexo")
    private String sexo;
    @Size(max = 250)
    @Column(name = "profesion")
    private String profesion;
    @Size(max = 200)
    @Column(name = "correo_electronico")
    private String correoElectronico;
    @Size(max = 200)
    @Column(name = "telefono_fijo")
    private String telefonoFijo;
    @Size(max = 2147483647)
    @Column(name = "telefono_movil")
    private String telefonoMovil;
    @Size(max = 5)
    @Column(name = "estado")
    private String estado;
    @Size(max = 250)
    @Column(name = "direccion")
    private String direccion;
    @Column(name = "fecha_alta")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaAlta;
    @Size(max = 255)
    @Column(name = "usuario_alta")
    private String usuarioAlta;
    @Column(name = "fecha_baja")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaBaja;
    @Size(max = 255)
    @Column(name = "usuario_baja")
    private String usuarioBaja;
//    @OneToMany(mappedBy = "idpersona")
//    private Collection<CliCliente> cliClienteCollection;
//    @OneToMany(mappedBy = "idpersona")
//    private Collection<RrhEmpleado> rrhEmpleadoCollection;
//    @OneToMany(mappedBy = "idpersona")
//    private Collection<CliRepresentanteEmpresa> cliRepresentanteEmpresaCollection;

    public CliPersona() {
    }

    public CliPersona(Integer idpersona) {
        this.idpersona = idpersona;
    }

    public Integer getIdpersona() {
        return idpersona;
    }

    public void setIdpersona(Integer idpersona) {
        this.idpersona = idpersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getApellidoCasado() {
        return apellidoCasado;
    }

    public void setApellidoCasado(String apellidoCasado) {
        this.apellidoCasado = apellidoCasado;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getValorDocumento() {
        return valorDocumento;
    }

    public void setValorDocumento(String valorDocumento) {
        this.valorDocumento = valorDocumento;
    }

    public String getEmisionDocumento() {
        return emisionDocumento;
    }

    public void setEmisionDocumento(String emisionDocumento) {
        this.emisionDocumento = emisionDocumento;
    }

    public String getComplementoDocumento() {
        return complementoDocumento;
    }

    public void setComplementoDocumento(String complementoDocumento) {
        this.complementoDocumento = complementoDocumento;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getLugarNacimiento() {
        return lugarNacimiento;
    }

    public void setLugarNacimiento(String lugarNacimiento) {
        this.lugarNacimiento = lugarNacimiento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
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

//    @XmlTransient
//    public Collection<CliCliente> getCliClienteCollection() {
//        return cliClienteCollection;
//    }
//
//    public void setCliClienteCollection(Collection<CliCliente> cliClienteCollection) {
//        this.cliClienteCollection = cliClienteCollection;
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
        hash += (idpersona != null ? idpersona.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CliPersona)) {
            return false;
        }
        CliPersona other = (CliPersona) object;
        if ((this.idpersona == null && other.idpersona != null) || (this.idpersona != null && !this.idpersona.equals(other.idpersona))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.gisul.optimo.rrhh.entity.CliPersona[ idpersona=" + idpersona + " ]";
    }
    
}
