/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gisul.ejb.ctb;

import com.gisul.adm.model.cli.Empresa;
import com.gisul.model.ctb.PeriodoContable;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Rolando Escobar <Bolitel>
 */
@Local
public interface PeriodoContableFacadeLocal {

   void create(PeriodoContable periodoContable);

   void edit(PeriodoContable periodoContable);

   void remove(PeriodoContable periodoContable);

   PeriodoContable find(Object id);

   List<PeriodoContable> findAll();

   List<PeriodoContable> findRange(int[] range);

   int count();

    public List<PeriodoContable> periodosPorEmpresa(Empresa empresa);

    public List<PeriodoContable> periodosPorGestion(Empresa empresa, Integer anoCalendario);

   
}
