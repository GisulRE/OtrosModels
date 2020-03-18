/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gisul.administracion.utils;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author admin
 */
public class CuentaExcel implements Serializable {

    private String moneda;
    private String nombre;
    private long cuenta;
    private int id;
    private int nivel;
    private boolean error;
    private String observaciones;
    private String usuarioAlta;

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getCuenta() {
        return cuenta;
    }

    public void setCuenta(long cuenta) {
        this.cuenta = cuenta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getUsuarioAlta() {
        return usuarioAlta;
    }

    public void setUsuarioAlta(String usuarioAlta) {
        this.usuarioAlta = usuarioAlta;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + Objects.hashCode(this.moneda);
        hash = 13 * hash + Objects.hashCode(this.nombre);
        hash = 13 * hash + this.id;
        hash = 13 * hash + this.nivel;
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
        final CuentaExcel other = (CuentaExcel) obj;
        if (!Objects.equals(this.moneda, other.moneda)) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (this.cuenta != other.cuenta) {
            return false;
        }
        if (this.id != other.id) {
            return false;
        }
        if (this.nivel != other.nivel) {
            return false;
        }
        return true;
    }

}
