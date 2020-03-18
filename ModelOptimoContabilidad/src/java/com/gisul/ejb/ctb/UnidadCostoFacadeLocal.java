/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gisul.ejb.ctb;

import com.gisul.adm.model.cli.Empresa;
import com.gisul.model.ctb.UnidadCosto;
import com.gisul.administracion.utils.CentrosDeCosto;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Rolando Escobar <Bolitel>
 */
@Local
public interface UnidadCostoFacadeLocal {

   void create(UnidadCosto unidadCosto);

   void edit(UnidadCosto unidadCosto);

   void remove(UnidadCosto unidadCosto);

   UnidadCosto find(Object id);

   List<UnidadCosto> findAll();

   List<UnidadCosto> findRange(int[] range);

   int count();

   public List<UnidadCosto> unidadesDeNegocio(Empresa empresa);

   public List<CentrosDeCosto> centrosDeCosto(Empresa empresa, long unidadCosto);

   public UnidadCosto firstUnidadDeNegocio(Empresa empresa);

    public List<UnidadCosto> MostrarUnidadesNegocio(Empresa empresa, String estado);
   
}
