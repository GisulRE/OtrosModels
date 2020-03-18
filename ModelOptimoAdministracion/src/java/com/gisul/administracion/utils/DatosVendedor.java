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
package com.gisul.administracion.utils;

import com.gisul.adm.model.cli.Persona;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author desarrollo
 */
public class DatosVendedor implements Serializable {

    private Persona persona;
    private Date fechaIngreso;
    private double haberBasico;
    private String correoElectronico;
    private String telefonoFijo;
    private String telefonoCelular;
    private String login;
    private long idRol;
    private String nombreRol;
/*
    SELECT new com.eveliz.utils.DatosVendedor(e.persona, e.fechaIngreso, e.haberBasico, 
e.correoElectronico, e.telefonoFijo, e.telefonoCelular, u.login, ru.rol.idRol,
ru.rol.nombre)
FROM Persona p, Empleado e, Usuario u, RolUsuario ru
WHERE e.persona.idPersona = p.idPersona
   AND u.persona.idPersona = p.idPersona
    AND ru.usuario.persona.idPersona = p.idPersona 
AND p.empresa.idEmpresa = 1 
    */
    public DatosVendedor() {
    }

    public DatosVendedor(Persona persona, Date fechaIngreso, double haberBasico, String correoElectronico, String telefonoFijo, String telefonoCelular, String login, long idRol, String nombreRol) {
        this.persona = persona;
        this.fechaIngreso = fechaIngreso;
        this.haberBasico = haberBasico;
        this.correoElectronico = correoElectronico;
        this.telefonoFijo = telefonoFijo;
        this.telefonoCelular = telefonoCelular;
        this.login = login;
        this.idRol = idRol;
        this.nombreRol = nombreRol;
    }

    
    

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public double getHaberBasico() {
        return haberBasico;
    }

    public void setHaberBasico(double haberBasico) {
        this.haberBasico = haberBasico;
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

    public String getTelefonoCelular() {
        return telefonoCelular;
    }

    public void setTelefonoCelular(String telefonoCelular) {
        this.telefonoCelular = telefonoCelular;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public long getIdRol() {
        return idRol;
    }

    public void setIdRol(long idRol) {
        this.idRol = idRol;
    }

    public String getNombreRol() {
        return nombreRol;
    }

    public void setNombreRol(String nombreRol) {
        this.nombreRol = nombreRol;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.persona);
        hash = 53 * hash + Objects.hashCode(this.fechaIngreso);
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.haberBasico) ^ (Double.doubleToLongBits(this.haberBasico) >>> 32));
        hash = 53 * hash + Objects.hashCode(this.correoElectronico);
        hash = 53 * hash + Objects.hashCode(this.telefonoFijo);
        hash = 53 * hash + Objects.hashCode(this.telefonoCelular);
        hash = 53 * hash + Objects.hashCode(this.login);
        hash = 53 * hash + (int) (this.idRol ^ (this.idRol >>> 32));
        hash = 53 * hash + Objects.hashCode(this.nombreRol);
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
        final DatosVendedor other = (DatosVendedor) obj;
        if (!Objects.equals(this.persona, other.persona)) {
            return false;
        }
        if (!Objects.equals(this.fechaIngreso, other.fechaIngreso)) {
            return false;
        }
        if (Double.doubleToLongBits(this.haberBasico) != Double.doubleToLongBits(other.haberBasico)) {
            return false;
        }
        if (!Objects.equals(this.correoElectronico, other.correoElectronico)) {
            return false;
        }
        if (!Objects.equals(this.telefonoFijo, other.telefonoFijo)) {
            return false;
        }
        if (!Objects.equals(this.telefonoCelular, other.telefonoCelular)) {
            return false;
        }
        if (!Objects.equals(this.login, other.login)) {
            return false;
        }
        if (this.idRol != other.idRol) {
            return false;
        }
        if (!Objects.equals(this.nombreRol, other.nombreRol)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DatosVendedor{" + "persona=" + persona + ", fechaIngreso=" + fechaIngreso + ", haberBasico=" + haberBasico + ", correoElectronico=" + correoElectronico + ", telefonoFijo=" + telefonoFijo + ", telefonoCelular=" + telefonoCelular + ", login=" + login + ", idRol=" + idRol + ", nombreRol=" + nombreRol + '}';
    }

    
    
    
}

/* Comentarios de la Clase
 *
 *
 *
 */
