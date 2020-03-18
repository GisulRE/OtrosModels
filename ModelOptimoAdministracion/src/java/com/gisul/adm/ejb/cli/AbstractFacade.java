/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gisul.adm.ejb.cli;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author Edgar
 * @param <T>
 */
public abstract class AbstractFacade<T> {

   private Class<T> entityClass;

   /**
    *
    * @param entityClass
    */
   public AbstractFacade(Class<T> entityClass) {
      this.entityClass = entityClass;
   }

   /**
    *
    * @return
    */
   protected abstract EntityManager getEntityManager();

   /**
    *
    * @param entity
    */
   public void create(T entity) {
      getEntityManager().persist(entity);
   }

   /**
    *
    * @param entity
    */
   public void edit(T entity) {
      getEntityManager().merge(entity);
   }

   /**
    *
    * @param entity
    */
   public void remove(T entity) {
      getEntityManager().remove(getEntityManager().merge(entity));
   }

   /**
    *
    * @param id
    * @return
    */
   public T find(Object id) {
      return getEntityManager().find(entityClass, id);
   }

   /**
    *
    * @return
    */
   public List<T> findAll() {
      javax.persistence.criteria.CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
      cq.select(cq.from(entityClass));
      return getEntityManager().createQuery(cq).getResultList();
   }

   /**
    *
    * @param range
    * @return
    */
   public List<T> findRange(int[] range) {
      javax.persistence.criteria.CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
      cq.select(cq.from(entityClass));
      javax.persistence.Query q = getEntityManager().createQuery(cq);
      q.setMaxResults(range[1] - range[0] + 1);
      q.setFirstResult(range[0]);
      return q.getResultList();
   }

   /**
    *
    * @return
    */
   public int count() {
      javax.persistence.criteria.CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
      javax.persistence.criteria.Root<T> rt = cq.from(entityClass);
      cq.select(getEntityManager().getCriteriaBuilder().count(rt));
      javax.persistence.Query q = getEntityManager().createQuery(cq);
      return ((Long) q.getSingleResult()).intValue();
   }

}
