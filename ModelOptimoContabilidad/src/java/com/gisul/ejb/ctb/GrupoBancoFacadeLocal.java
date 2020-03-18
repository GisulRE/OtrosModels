/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gisul.ejb.ctb;

import com.gisul.adm.model.cli.Empresa;
import com.gisul.model.ctb.GrupoBanco;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Rolando Escobar <Bolitel>
 */
@Local
public interface GrupoBancoFacadeLocal {

   void create(GrupoBanco grupoBanco);

   void edit(GrupoBanco grupoBanco);

   void remove(GrupoBanco grupoBanco);

   GrupoBanco find(Object id);

   List<GrupoBanco> findAll();

   List<GrupoBanco> findRange(int[] range);

   int count();

    public List<GrupoBanco> listaGrupoBancos(Empresa empresa);


   
}
