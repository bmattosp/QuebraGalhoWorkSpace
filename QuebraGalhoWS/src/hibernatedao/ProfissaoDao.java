package hibernatedao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import conexao.ConexaoHibert;

import dominio.Profissao;

public class ProfissaoDao 
{
	 private Session session;
	
	 public void Salvar(Profissao p)
	 {
		  //obtem uma sessao
		  session = ConexaoHibert.getInstance();
		  Transaction tx = null; //permite transacao com o BD 
		
		  try
		  {
		   tx = session.beginTransaction();
		   session.save(p);
		   tx.commit();//faz a transacao
		  }
		  catch (Exception e) 
		  {
		   e.printStackTrace();
		   //cancela a transcao em caso de falha
		   tx.rollback();
		  }
		  finally
		  {
		   session.close();
		  }
	 }
}

