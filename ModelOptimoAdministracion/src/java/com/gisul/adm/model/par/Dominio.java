/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gisul.adm.model.par;

//import com.gisul.model.cli.Empresa;
import com.gisul.adm.model.cli.Empresa;
import java.io.Serializable;
import java.util.Date;
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

/**
 *
 * @author Edgar
 */
@Entity
@Table(name = "opt.par_dominio")
public class Dominio implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "iddominio")
    private long idDominio;

    @Column(name = "dominio")
    private String dominio;
    
      @ManyToOne
   @JoinColumn(name = "idempresa")
   private Empresa empresa;


    @Column(name = "sub_dominio")
    private String subDominio;

    @Column(name = "tipo_valor")
    private String TipoValor;

    @Column(name = "valor")
    private String valor;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "estado")
    private String estado;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fecha_alta")
    private Date fechaAlta;

    @Column(name = "usuario_alta")
    private String usuarioAlta;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fecha_baja")
    private Date fechaBaja;

    @Column(name = "usuario_baja")
    private String usuarioBaja;

   /**
    *
    * @return
    */
   public long getIdDominio() {
        return idDominio;
    }

   /**
    *
    * @param idDominio
    */
   public void setIdDominio(long idDominio) {
        this.idDominio = idDominio;
    }

   /**
    *
    * @return
    */
   public String getDominio() {
        return dominio;
    }

   /**
    *
    * @param dominio
    */
   public void setDominio(String dominio) {
        this.dominio = dominio;
    }

   /**
    *
    * @return
    */
   public String getSubDominio() {
        return subDominio;
    }

   /**
    *
    * @param subDominio
    */
   public void setSubDominio(String subDominio) {
        this.subDominio = subDominio;
    }

   /**
    *
    * @return
    */
   public String getTipoValor() {
        return TipoValor;
    }

   /**
    *
    * @param TipoValor
    */
   public void setTipoValor(String TipoValor) {
        this.TipoValor = TipoValor;
    }

   /**
    *
    * @return
    */
   public String getValor() {
        return valor;
    }

   /**
    *
    * @param valor
    */
   public void setValor(String valor) {
        this.valor = valor;
    }

   /**
    *
    * @return
    */
   public String getDescripcion() {
        return descripcion;
    }

   /**
    *
    * @param descripcion
    */
   public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

   /**
    *
    * @return
    */
   public String getEstado() {
        return estado;
    }

   /**
    *
    * @param estado
    */
   public void setEstado(String estado) {
        this.estado = estado;
    }

   /**
    *
    * @return
    */
   public Date getFechaAlta() {
        return fechaAlta;
    }

   /**
    *
    * @param fechaAlta
    */
   public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

   /**
    *
    * @return
    */
   public String getUsuarioAlta() {
        return usuarioAlta;
    }

   /**
    *
    * @param usuarioAlta
    */
   public void setUsuarioAlta(String usuarioAlta) {
        this.usuarioAlta = usuarioAlta;
    }

   /**
    *
    * @return
    */
   public Date getFechaBaja() {
        return fechaBaja;
    }

   /**
    *
    * @param fechaBaja
    */
   public void setFechaBaja(Date fechaBaja) {
        this.fechaBaja = fechaBaja;
    }

   /**
    *
    * @return
    */
   public String getUsuarioBaja() {
        return usuarioBaja;
    }

   /**
    *
    * @param usuarioBaja
    */
   public void setUsuarioBaja(String usuarioBaja) {
        this.usuarioBaja = usuarioBaja;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

   
   
   @Override
   public String toString() {
      return  this.valor;
   }

//   @Override
//   public String toString() {
//            //return "Classe [id=" + this.valor + ", nome=" + this.descripcion + "]";
//   }

   @Override
   public boolean equals(Object obj) {
   if (this == obj) {
         return true;
      }
      if (obj == null) {
         return false;
      }
      if (getClass() != obj.getClass()) {
         return false;
      }
      Dominio other = (Dominio) obj;
      if (idDominio == 0) {
         if (other.idDominio != 0) {
            return false;
         }
      } else if (idDominio != other.idDominio) {
         return false;
      }
      return true;
   }

   @Override
   public int hashCode() {
         final int prime = 31;
      int result = 1;
      result = prime * result + (idDominio == 0 ? 0 : new Long(idDominio).hashCode());
      return result;
   }

    
}
