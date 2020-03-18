/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gisul.adm.ejb.par;

import com.gisul.adm.model.par.Dominio;
import com.gisul.adm.model.cli.Empresa;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Edgar
 */
@Stateless
public class DominioFacade extends AbstractFacade<Dominio> implements DominioFacadeLocal {

    @PersistenceContext(unitName = "ModelOptimoAdministracionPU")
    private EntityManager em;

    /**
     *
     * @return
     */
    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    /**
     *
     */
    public DominioFacade() {
        super(Dominio.class);
    }

    /**
     *
     * @param empresa
     * @param Dominio
     * @param SubDominio
     * @return
     */
    @Override
    public List<Dominio> listarDominio(Empresa empresa, String Dominio, String SubDominio) {
        String consulta;
        try {
            consulta = "SELECT d FROM Dominio d, Empresa e "
                    + "  WHERE d.empresa = e "
                    + "    amd e = ?1 "
                    + "    and d.dominio = ?2 "
                    + "    and d.subDominio = ?3 ";
            Query query = em.createQuery(consulta);
            query.setParameter(1, empresa);
            query.setParameter(2, Dominio);
            query.setParameter(3, SubDominio);
            return query.getResultList();
        } catch (Exception e) {
            throw e;
        }
    }

    /**
     *
     * @param empresa
     * @param Dominio
     * @param SubDominio
     * @return List<Dominio>
     */
    @Override
    public List<Dominio> listarDominioAlfabetico(Empresa empresa, String Dominio, String SubDominio) {
        String consulta;
        try {
            consulta = "SELECT d FROM Dominio d, Empresa e "
                    + "  WHERE d.empresa =  e"
                    + "    and e = ?1 "
                    + "    and d.dominio = ?2 "
                    + "    and d.subDominio = ?3 "
                    + " ORDER BY d.descripcion asc ";
            Query query = em.createQuery(consulta);
            query.setParameter(1, empresa);
            query.setParameter(2, Dominio);
            query.setParameter(3, SubDominio);
            return query.getResultList();
        } catch (Exception e) {
            throw e;
        }
    }

    /**
     *
     * @param empresa
     * @param Dominio
     * @param SubDominio
     * @param tipoValor
     * @return
     */
    @Override
    public List<Dominio> listarDominioOwner(Empresa empresa, String Dominio, String SubDominio, String tipoValor) {
        String consulta;
        try {
            consulta = "SELECT d FROM Dominio d, Empresa e "
                    + "  WHERE d.empresa = e "
                    + "    and e = ?1 "
                    + "    and d.dominio = ?2 "
                    + "    and d.subDominio = ?3 "
                    + "    and d.TipoValor = ?4 "
                    + "  ORDER BY d.descripcion asc ";
            Query query = em.createQuery(consulta);
            query.setParameter(1, empresa);
            query.setParameter(2, Dominio);
            query.setParameter(3, SubDominio);
            query.setParameter(4, tipoValor);

            return query.getResultList();
        } catch (Exception e) {
            throw e;
        }
    }

    /**
     *
     * @param empresa
     * @param dom
     * @param subdom
     * @param valor
     * @return Dominio
     */
    @Override
    public Dominio consultaParDominio(Empresa empresa, String dom, String subdom, String valor) {
        String consulta;
        Dominio dominio = null;
        try {
            consulta = "SELECT d FROM Dominio d, Empresa e "
                    + "  WHERE d.empresa = e"
                    + "    AND e = ?1 "
                    + "    AND d.dominio = ?2 "
                    + "    AND d.subDominio = ?3 "
                    + "    AND d.valor = ?4 ";
            Query query = em.createQuery(consulta);
            query.setParameter(1, empresa);
            query.setParameter(2, dom);
            query.setParameter(3, subdom);
            query.setParameter(4, valor);
            List<Dominio> lista = query.getResultList();
            if (!lista.isEmpty()) {
                dominio = lista.get(0);
            }

        } catch (Exception e) {
            throw e;
        }
        return dominio;
    }

}
