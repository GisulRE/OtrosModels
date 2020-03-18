/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gisul.administracion.utils;

import com.gisul.adm.model.cli.Empresa;
import java.io.Serializable;

/**
 *
 * @author admin
 */
public class CDocumentosRequeridosPorSolicitud implements Serializable {

    private int idsolicitudtipo;
    private int idsolicitud;
    private Integer idtipo;
    private String tipoDocumento;
    private Empresa empresa;
    private String documentoRequiere;
    private String descripcion;
    private Boolean requerido;
    private Boolean pideTipoDocumento;

    public CDocumentosRequeridosPorSolicitud() {
    }

    public CDocumentosRequeridosPorSolicitud(int idsolicitudtipo, int idsolicitud, Integer idtipo, String tipoDocumento, Empresa empresa, String documentoRequiere, String descripcion, Boolean requerido, Boolean pideTipoDocumento) {
        this.idsolicitudtipo = idsolicitudtipo;
        this.idsolicitud = idsolicitud;
        this.idtipo = idtipo;
        this.tipoDocumento = tipoDocumento;
        this.empresa = empresa;
        this.documentoRequiere = documentoRequiere;
        this.descripcion = descripcion;
        this.requerido = requerido;
        this.pideTipoDocumento = pideTipoDocumento;
    }

    public int getIdsolicitudtipo() {
        return idsolicitudtipo;
    }

    public void setIdsolicitudtipo(int idsolicitudtipo) {
        this.idsolicitudtipo = idsolicitudtipo;
    }

    public int getIdsolicitud() {
        return idsolicitud;
    }

    public void setIdsolicitud(int idsolicitud) {
        this.idsolicitud = idsolicitud;
    }

    
    
    

    public Integer getIdtipo() {
        return idtipo;
    }

    public void setIdtipo(Integer idtipo) {
        this.idtipo = idtipo;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public String getDocumentoRequiere() {
        return documentoRequiere;
    }

    public void setDocumentoRequiere(String documentoRequiere) {
        this.documentoRequiere = documentoRequiere;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Boolean getRequerido() {
        return requerido;
    }

    public void setRequerido(Boolean requerido) {
        this.requerido = requerido;
    }

    public Boolean getPideTipoDocumento() {
        return pideTipoDocumento;
    }

    public void setPideTipoDocumento(Boolean pideTipoDocumento) {
        this.pideTipoDocumento = pideTipoDocumento;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

}
