/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gisul.ejb.ctb;

import com.gisul.adm.model.cli.Empresa;
import com.gisul.model.ctb.AuxiliarCuenta;
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
public class AuxiliarCuentaFacade extends AbstractFacade<AuxiliarCuenta> implements AuxiliarCuentaFacadeLocal {

   @PersistenceContext(unitName = "ModelOptimoContabilidadPU")
   private EntityManager em;

   @Override
   protected EntityManager getEntityManager() {
      return em;
   }

   public AuxiliarCuentaFacade() {
      super(AuxiliarCuenta.class);
   }

   /**
    *
    * @param idEmpresa
    * @return
    */
   @Override
   public List<AuxiliarCuenta> findAllByEmpresa(Empresa empresa) {
      try {
         String jpql = "SELECT aux FROM Empresa e, AuxiliarCuenta aux "
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

   @Override
   public void transaccionGrabaAuxiliarCuenta(AuxiliarCuenta ac, List<AuxiliarCuentaDetalle> lacd) {
      try {
         em.persist(ac);
         
         for (AuxiliarCuentaDetalle aux : lacd){
             aux.setUsuarioAlta(ac.getUsuarioAlta());
             aux.setFechaAlta(ac.getFechaAlta());
             aux.setAuxiliarCuenta(ac);
             aux.setEstado("A");
             em.persist(aux);
         }
      } catch (Exception e) {
         throw e;
      }
   }

}
