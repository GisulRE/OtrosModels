/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gisul.ejb.ctb;

import com.gisul.adm.model.cli.Empresa;
import com.gisul.model.ctb.ParametroContable;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Rolando Escobar <Bolitel>
 */
@Local
public interface ParametroContableFacadeLocal {

   void create(ParametroContable parametroContable);

   void edit(ParametroContable parametroContable);

   void remove(ParametroContable parametroContable);

   ParametroContable find(Object id);

   List<ParametroContable> findAll();

   List<ParametroContable> findRange(int[] range);

   int count();

    public List<ParametroContable> parametrosContables(Empresa empresa);

    public ParametroContable parametroContablePorCodigo(Empresa empresa, String codigoGlobal);


}
