/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gisul.adm.ejb.cli;
   
import com.gisul.adm.model.cli.Cliente;
import com.gisul.adm.model.cli.Empresa;
import com.gisul.administracion.utils.ParBusCliente;  
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.ParameterExpression;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.persistence.metamodel.EntityType;
import javax.persistence.metamodel.Metamodel;

/**
 *
 * @author Rolando Escobar <Bolitel>
 */
@Stateless
public class ClienteFacade extends AbstractFacade<Cliente> implements ClienteFacadeLocal {

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
   public ClienteFacade() {
      super(Cliente.class);
   }

   /**
    *
    * @param idEmpresa
    * @return List<Cliente>
    */
   @Override
   public List<Cliente> findAllByEmpresa(Long idEmpresa) {
      try {
         String jpql = "SELECT c FROM Empresa e, Cliente c, Persona p "
                 + " WHERE c.empresa = e "
                 + "   AND c.persona = p "
                 + " AND e.idEmpresa = ?1 "
                 + " ORDER BY c.fechaAlta desc ";
         Query query = em.createQuery(jpql);
         query.setParameter(1, idEmpresa);

         return query.getResultList();

      } catch (Exception e) {
         throw e;
      }
   }

   /**
    *
    * @param idEmpresa
    * @param attr atributo
    * @param value valor
    * @return List<Cliente>
    */
   @Override
   public List<Cliente> findAllByCriteria(Long idEmpresa, String attr, Object value) {
      String jpql = "";
      try {
         if (attr.equals("nombreCliente")) {
            jpql = "SELECT c FROM Empresa e, Cliente c, Persona p "
                    + " WHERE c.empresa = e "
                    + "   AND c.persona = p "
                    + "   AND e.idEmpresa = ?1 "
                    + "   AND upper(c.nombreCliente) like     CONCAT('%', ?2, '%') "
                    + " ORDER BY c.fechaAlta desc ";
         }
         if (attr.equals("nit")) {
            jpql = "SELECT c FROM Empresa e, Cliente c, Persona p "
                    + " WHERE c.empresa = e "
                    + "   AND c.persona = p "
                    + "   AND e.idEmpresa = ?1 "
                    + "   AND (c.nit like  CONCAT('%', ?2, '%') or c.persona.valorDocumento like CONCAT('%', ?3, '%')) "
                    + " ORDER BY c.fechaAlta desc ";
         }

         if (attr.equals("razonSocial")) {
            jpql = "SELECT c FROM Empresa e, Cliente c, Persona p "
                    + " WHERE c.empresa = e "
                    + "   AND c.persona = p "
                    + "   AND e.idEmpresa = ?1 "
                    + "   AND upper(c.razonSocial) like     CONCAT('%', ?2, '%') "
                    + " ORDER BY c.fechaAlta desc ";
         }
         if (attr.equals("telefono")) {
            jpql = "SELECT c FROM Empresa e, Cliente c, Persona p "
                    + " WHERE c.empresa = e "
                    + "   AND c.persona = p "
                    + "   AND e.idEmpresa = ?1 "
                    + "   AND (c.telefonoFijo like CONCAT('%', ?2, '%') or c.telefonoCelular like CONCAT('%', ?3, '%')) "
                    + " ORDER BY c.fechaAlta desc ";
         }
         if (attr.equals("email")) {
            jpql = "SELECT c FROM Empresa e, Cliente c, Persona p  "
                    + " WHERE c.empresa = e "
                    + "   AND c.persona = p "
                    + "   AND e.idEmpresa = ?1 "
                    + "   AND upper(c.correoElectronico) like  CONCAT('%', ?2, '%') "
                    + " ORDER BY c.fechaAlta desc ";
         }
         Query query = em.createQuery(jpql);
         query.setParameter(1, idEmpresa);
         query.setParameter(2, value.toString().toUpperCase());
         if (attr.equals("telefono") || attr.equals("nit") ) {
            query.setParameter(3, value.toString().toUpperCase());
         }
         return query.getResultList();
      } catch (Exception e) {
         throw e;
      }
   }

   /**
    *
    * @param attr
    * @param value
    * @return List<Cliente>
    */
   @Override
   public List<Cliente> findByAttr(String attr, Object value) {
      try {
         CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
         CriteriaQuery<Cliente> criteriaQuery = criteriaBuilder.createQuery(Cliente.class);
         Root<Cliente> from = criteriaQuery.from(Cliente.class);
         CriteriaQuery<Cliente> select = criteriaQuery.select(from).where(criteriaBuilder.equal(from.get(attr), value));
         List<Cliente> allitems = em.createQuery(select).getResultList();
         return allitems;
      } catch (NoResultException e) {
         return null;
      }
   }
   
    @Override
    public Cliente findByPersona(Empresa empresa, Long idPersona){
    String jpql = "";
    Cliente cliente = new Cliente();
    try{
    jpql = "SELECT c FROM Empresa e, Cliente c, Persona p "
                    + " WHERE c.empresa = e "
                    + "   AND c.persona = p "
                    + "   AND e = ?1 "
                    + "   AND c.persona.idPersona = ?2 "
                    + " ORDER BY c.fechaAlta desc ";
     Query query = em.createQuery(jpql);
         query.setParameter(1, empresa);
         query.setParameter(2, idPersona);

      List<Cliente> resultado = query.getResultList();
      
       for (Cliente cli : resultado) {
          cliente = cli;
       }
         
         return cliente;
      } catch (Exception e) {
         throw e;
      }
    
    }
   
   @Override
   public int cantidadFiltrados(ParBusCliente filtros){
       // Crea clase criterio
      CriteriaBuilder cb = getEntityManager().getCriteriaBuilder();

      // Crea Clase Criterio Consulta para resultado de contador
      CriteriaQuery<Long> countQuery = cb.createQuery(Long.class);
      Root<Cliente> from = countQuery.from(Cliente.class);
      countQuery.select(cb.count(from));

      List<Predicate> predicates = new ArrayList<Predicate>();
      ParameterExpression<Empresa> fromEmpresa = cb.parameter(Empresa.class);
      ParameterExpression<String> fromNombre = cb.parameter(String.class);
      ParameterExpression<String> fromRazonSocial = cb.parameter(String.class);
      ParameterExpression<String> fromTelefono = cb.parameter(String.class);
      ParameterExpression<String> fromTelefonoCelular = cb.parameter(String.class);
      ParameterExpression<String> fromTelefonoContacto = cb.parameter(String.class);
      ParameterExpression<String> fromEmail = cb.parameter(String.class);
      ParameterExpression<String> fromNit = cb.parameter(String.class);

      Predicate andFinal = generaPredicates(cb, from, filtros, fromEmpresa, fromNombre, fromRazonSocial,
              fromTelefono, fromTelefonoCelular, fromTelefonoContacto, fromEmail, fromNit);

      predicates.add(andFinal);

      countQuery.where(predicates.toArray(new Predicate[predicates.size()]));
      Query q = getEntityManager().createQuery(countQuery);
      q.setParameter(fromEmpresa, filtros.getEmpresa());

      this.generaQuery(q, filtros, fromNombre, fromRazonSocial, fromTelefono, fromTelefonoCelular, fromTelefonoContacto, fromEmail, fromNit);
      Long retorna = (Long) q.getSingleResult();
      return retorna.intValue();
      
   }

     /**
    *
    * @param filtros
    * @return  
    */
   @Override
   public List<Cliente> findByEmpresaLazy(ParBusCliente filtros) {
//       Metamodel m = em.getMetamodel();
//       EntityType<Cliente> Cliente_ = m.entity(Cliente.class);
      CriteriaBuilder cb = getEntityManager().getCriteriaBuilder();
      CriteriaQuery<Cliente> criteriaQuery = cb.createQuery(Cliente.class);
      Root<Cliente> from = criteriaQuery.from(Cliente.class);
      criteriaQuery.select(from);
      criteriaQuery.orderBy(cb.desc(from.get("fechaAlta")));

      List<Predicate> predicates = new ArrayList<Predicate>();
      ParameterExpression<Empresa> fromEmpresa = cb.parameter(Empresa.class);
      ParameterExpression<String> fromNombre = cb.parameter(String.class);
      ParameterExpression<String> fromRazonSocial = cb.parameter(String.class);
      ParameterExpression<String> fromTelefono = cb.parameter(String.class);
      ParameterExpression<String> fromTelefonoCelular = cb.parameter(String.class);
      ParameterExpression<String> fromTelefonoContacto = cb.parameter(String.class);
      ParameterExpression<String> fromEmail = cb.parameter(String.class);
      ParameterExpression<String> fromNit = cb.parameter(String.class);

      Predicate andFinal = generaPredicates(cb, from, filtros, fromEmpresa, fromNombre, fromRazonSocial,
              fromTelefono, fromTelefonoCelular, fromTelefonoContacto, fromEmail, fromNit);

      predicates.add(andFinal);

      criteriaQuery.where(predicates.toArray(new Predicate[predicates.size()]));
      javax.persistence.Query q = getEntityManager().createQuery(criteriaQuery);
      q.setFirstResult(filtros.getPrimerRegistro());
      q.setMaxResults(filtros.getCantidadRegistros());
      q.setParameter(fromEmpresa, filtros.getEmpresa());

      this.generaQuery(q, filtros, fromNombre, fromRazonSocial, fromTelefono, fromTelefonoCelular, fromTelefonoContacto, fromEmail, fromNit);
      return q.getResultList();
   }
   
   private Predicate generaPredicates(CriteriaBuilder cb, Root<Cliente> from,
           ParBusCliente filtros, ParameterExpression<Empresa> fromEmpresa, ParameterExpression<String> fromNombre,
           ParameterExpression<String> fromRazonSocial, ParameterExpression<String> fromTelefono,
           ParameterExpression<String> fromTelefonoCelular, ParameterExpression<String> fromTelefonoContacto, ParameterExpression<String> fromEmail,
           ParameterExpression<String> fromNit) {
      Predicate pEmpresa = cb.equal(from.get("empresa"), fromEmpresa);
      Predicate pNombre = cb.like(cb.upper(from.get("nombreCliente").as(String.class)), cb.upper(fromNombre));
      Predicate pRazonSocial = cb.like(cb.upper(from.get("razonSocial").as(String.class)), cb.upper(fromRazonSocial));
      Predicate pTelefono = cb.like(cb.upper(from.get("telefonoFijo").as(String.class)), cb.upper(fromTelefono));
      Predicate pTelefonoCelular = cb.like(cb.upper(from.get("telefonoCelular").as(String.class)), cb.upper(fromTelefonoCelular));
      Predicate pTelefonoContacto = cb.like(cb.upper(from.get("telefonoContacto").as(String.class)), cb.upper(fromTelefonoContacto));
      Predicate pEmail = cb.like(cb.upper(from.get("correoElectronico").as(String.class)), cb.upper(fromEmail));
      Predicate pNit = cb.like(cb.upper(from.get("nit").as(String.class)), cb.upper(fromNit));

      Predicate orNombre = null;
      Predicate orTelefono = null;
      Predicate andFinal = null;

      if (filtros.getNombreCliente()!= null && !filtros.getNombreCliente().isEmpty()) {
         orNombre = cb.or(pNombre, pRazonSocial);
         andFinal = cb.and(pEmpresa, orNombre);
      }

      if (filtros.getTelefono() != null && !filtros.getTelefono().isEmpty()) {
         orTelefono = cb.or(pTelefono, pTelefonoCelular, pTelefonoContacto);
         andFinal = cb.and(pEmpresa, orTelefono);
      }

      if (filtros.getEmail() != null && !filtros.getEmail().isEmpty()) {
         andFinal = cb.and(pEmpresa, pEmail);
      }
      if (filtros.getNit() != null && !filtros.getNit().isEmpty()) {
         andFinal = cb.and(pEmpresa, pNit);
      }

      if (andFinal == null) {
         andFinal = pEmpresa;
      }
      return andFinal;
   }
   
    private void generaQuery(Query q, ParBusCliente filtros,
           ParameterExpression<String> fromNombre,
           ParameterExpression<String> fromRazonSocial, ParameterExpression<String> fromTelefono,
           ParameterExpression<String> fromTelefonoCelular, ParameterExpression<String> fromTelefonoContacto, ParameterExpression<String> fromEmail,
           ParameterExpression<String> fromNit) {

      if (filtros.getNombreCliente()!= null && !filtros.getNombreCliente().isEmpty()) {
         q.setParameter(fromNombre, "%" + filtros.getNombreCliente().toUpperCase() + "%");
         q.setParameter(fromRazonSocial, "%" + filtros.getNombreCliente().toUpperCase() + "%");
      } else if (filtros.getNombreCliente()== null && filtros.getNombreCliente().isEmpty()) {
         q.setParameter(fromNombre, "%");
         q.setParameter(fromRazonSocial, "%");
      }

      if (filtros.getTelefono() != null && !filtros.getTelefono().isEmpty()) {
         q.setParameter(fromTelefono, "%" + filtros.getTelefono().toUpperCase() + "%");
         q.setParameter(fromTelefonoCelular, "%" + filtros.getTelefono().toUpperCase() + "%");
         q.setParameter(fromTelefonoContacto, "%" + filtros.getTelefono().toUpperCase() + "%");
      } else if (filtros.getTelefono() == null && filtros.getTelefono().isEmpty()) {
         q.setParameter(fromTelefono, "%");
         q.setParameter(fromTelefonoCelular, "%");
         q.setParameter(fromTelefonoContacto, "%");
      }

      if (filtros.getEmail() != null && !filtros.getEmail().isEmpty()) {
         q.setParameter(fromEmail, "%" + filtros.getEmail().toUpperCase() + "%");
      } else if (filtros.getEmail() == null && filtros.getEmail().isEmpty()) {
         q.setParameter(fromEmail, "%");
      }

      if (filtros.getNit() != null && !filtros.getNit().isEmpty()) {
         q.setParameter(fromNit, "%" + filtros.getNit().toUpperCase() + "%");
      } else if (filtros.getNit() == null && filtros.getNit().isEmpty()) {
         q.setParameter(fromNit, "%");
      }
   }

  

}
