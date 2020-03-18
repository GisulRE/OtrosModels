/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gisul.ejb.ctb;

import com.gisul.adm.model.cli.Empresa;
import com.gisul.model.ctb.AuxiliarCuentaDetalle;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Rolando Escobar <Bolitel>
 */
@Stateless
public class AuxiliarCuentaDetalleFacade extends AbstractFacade<AuxiliarCuentaDetalle> implements AuxiliarCuentaDetalleFacadeLocal {
   @PersistenceContext(unitName = "ModelOptimoContabilidadPU")
   private EntityManager em;

   @Override
   protected EntityManager getEntityManager() {
      return em;
   }

   public AuxiliarCuentaDetalleFacade() {
      super(AuxiliarCuentaDetalle.class);
   }
   
   
   /**
    *
    * @param idEmpresa
    * @return
    */
   @Override
   public List<AuxiliarCuentaDetalle> findAllByEmpresa(Empresa empresa) {
      try {
         String jpql = "SELECT aux FROM Empresa e, AuxiliarCuentaDetalle aux "
                 + " WHERE aux.empresa = e "
                 + "   AND e = ?1 "
                 + " ORDER BY aux.fechaAlta desc ";
         Query query = em.createQuery(jpql);
         query.setParameter(1, empresa);

         return query.getResultList();

      } catch (Exception e) {
         throw e;
      }
   }
   
}
