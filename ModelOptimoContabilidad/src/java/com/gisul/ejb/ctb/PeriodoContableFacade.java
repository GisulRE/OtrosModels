/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gisul.ejb.ctb;

import com.gisul.adm.model.cli.Empresa;
import com.gisul.model.ctb.PeriodoContable;
import java.util.ArrayList;
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
public class PeriodoContableFacade extends AbstractFacade<PeriodoContable> implements PeriodoContableFacadeLocal {

    @PersistenceContext(unitName = "ModelOptimoContabilidadPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PeriodoContableFacade() {
        super(PeriodoContable.class);
    }

    /**
     *
     * @param empresa
     * @return
     */
//    @Override
//    public UnidadCosto firstUnidadDeNegocio(Empresa empresa) {
//        try {
//            String jpql = "SELECT uc FROM Empresa e, UnidadCosto uc "
//                    + " WHERE uc.empresa = e "
//                    + " AND e  = ?1 "
//                    + " AND uc.idPadre = 0 "
//                    + " ORDER BY uc.nombre ";
//            Query query = em.createQuery(jpql);
//            query.setParameter(1, empresa);
//
//            return (UnidadCosto) query.setMaxResults(1).getSingleResult();
//
//        } catch (Exception e) {
//            throw e;
//        }
//    }
//
//    /**
//     *
//     * @param empresa
//     * @return
//     */
    @Override
    public List<PeriodoContable> periodosPorEmpresa(Empresa empresa) {

        List<PeriodoContable> salida = new ArrayList<>();
        try {
            String jpql = "SELECT pc FROM Empresa e, PeriodoContable pc "
                    + " WHERE pc.empresa = e "
                    + " AND e  = ?1 "
                    + " ORDER BY pc.anoCalendario, pc.mesCalendario ";
            Query query = em.createQuery(jpql);
            query.setParameter(1, empresa);
            
             
          if (query.getResultList().size() >0){
             salida = query.getResultList();
          }

        } catch (Exception e) {
            throw e;
        }

        return salida;
    }
    
      @Override
    public List<PeriodoContable> periodosPorGestion(Empresa empresa, Integer anoCalendario) {

        List<PeriodoContable> salida = new ArrayList<>();
        try {
            String jpql = "SELECT pc FROM Empresa e, PeriodoContable pc "
                    + " WHERE pc.empresa = e "
                    + " AND e  = ?1 "
                    + " ORDER BY pc.anoCalendario, pc.mesCalendario ";
            Query query = em.createQuery(jpql);
            query.setParameter(1, empresa);
            query.setParameter(2, anoCalendario);
            
             
          if (query.getResultList().size() >0){
             salida = query.getResultList();
          }

        } catch (Exception e) {
            throw e;
        }

        return salida;
    }
//
//    /**
//     *
//     * @param empresa
//     * @param unidadCosto
//     * @return
//     */
//    @Override
//    public List<CentrosDeCosto> centrosDeCosto(Empresa empresa, long unidadCosto) {
//        try {
//            String jpql = "SELECT new com.eveliz.utils.CentrosDeCosto(c.idUnidad, c.empresa, c.idPadre, c.codigo, c.nombre, c.tipo, c.estado, "
//                    + "                                               c.fechaAlta, c.usuarioAlta, c.fechaModificacion, c.usuarioModificacion, "
//                    + "                                               c.fechaBaja, c.usuarioBaja, (select uc.nombre from UnidadCosto uc  "
//                    + "          where uc.idUnidad = c.idPadre) ) from UnidadCosto c, Empresa e  "
//                    + " WHERE c.empresa = e "
//                    + " AND e  = ?1 "
//                    + " AND c.idPadre != 0 "
//                    + " AND c.idPadre = ?2 "
//                    + " ORDER BY c.idPadre, c.nombre ";
//
//            Query query = em.createQuery(jpql);
//            query.setParameter(1, empresa);
//            query.setParameter(2, unidadCosto);
//
//            return query.getResultList();
//
//        } catch (Exception e) {
//            throw e;
//        }
//    }

}
