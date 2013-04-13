package repositorios;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;


import dominio.Profissao;

public class ProfissaoRepositorio
{
	public List<Profissao> BuscaTodasProfissoes()
	{
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("quebragalhoPU");
		 
		EntityManager manager = factory.createEntityManager();
		CriteriaBuilder cb =  manager.getCriteriaBuilder();
		CriteriaQuery<Profissao> query = cb.createQuery(Profissao.class);
		 
		Root<Profissao> root = query.from(Profissao.class);
		query.select(root);
		
		TypedQuery<Profissao> tq = manager.createQuery(query);
		
		manager.close();
		factory.close();
		 
		return tq.getResultList();			
	
	}
	
	public Profissao BuscaProfissao(int id)
	{
		
		 EntityManagerFactory factory = Persistence.createEntityManagerFactory("quebragalhoPU");
		 
		 EntityManager manager = factory.createEntityManager();
		 CriteriaBuilder cb =  manager.getCriteriaBuilder();
		 CriteriaQuery<Profissao> query = cb.createQuery(Profissao.class);
		 
		 Root<Profissao> root = query.from(Profissao.class);
		 query.select(root);
		 
		 Predicate predicate = cb.equal(root.get("id"), id);
		 query.where(predicate);

		 TypedQuery<Profissao> tq = manager.createQuery(query);
		 
		 List<Profissao> lista = tq.getResultList();
		 
			manager.close();
			factory.close();
		 
		 return lista.get(0);	
	
	}


}
