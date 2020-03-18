/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gisul.ejb.ctb;

import com.gisul.adm.model.cli.Empresa;
import com.gisul.model.ctb.CapituloContable;
import com.gisul.model.ctb.CuentaContable;
import com.gisul.administracion.utils.CuentaExcel;
import java.util.List;
import java.util.Map;
import javax.ejb.Local;

/**
 *
 * @author Rolando Escobar <Bolitel>
 */
@Local
public interface CuentaContableFacadeLocal {

   void create(CuentaContable cuentaContable);

   void edit(CuentaContable cuentaContable);

   void remove(CuentaContable cuentaContable);

   CuentaContable find(Object id);

   List<CuentaContable> findAll();

   List<CuentaContable> findRange(int[] range);

   int count();

    public List<CuentaContable> cuentasContables(Empresa empresa);


    public CapituloContable obtieneCapituloContable(Empresa empresa, int capitulo);

    public CuentaContable ConsultaCuenta(Empresa empresa, String cuenta);

    public Map<String, Object> CargaCuentasExcel(Empresa empresa, List<CuentaExcel> datos);

    public List<CuentaContable> cuentasContablesPorCriterio(Empresa empresa, String busqueda, Integer nivel, String estadoInicial, String estadoFinal, boolean verNivel6);

    public Long verificaNroCuenta(CuentaContable padre, Long nroCuenta);
   
}
