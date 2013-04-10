package Testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Profissao;


public class Persistencias
{
	/**
	  * @param args
	  */
	 public static void main(String[] args) 
	 {
		 EntityManagerFactory factory = Persistence.createEntityManagerFactory("quebragalhoPU");
		 
		 EntityManager manager = factory.createEntityManager();
		 
		 Profissao profissao = new Profissao();
		 profissao.setNome("teste");
		 
		 manager.getTransaction().begin();

		 manager.persist( profissao);
		 
		 manager.getTransaction().commit();


	 }

}
