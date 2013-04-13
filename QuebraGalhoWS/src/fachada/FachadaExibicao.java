package fachada;


import java.util.List;

import repositorios.ProfissaoRepositorio;

import dominio.Profissao;


public class FachadaExibicao 
{
	static public List<Profissao> BuscaTodasProfissoes()
	{
		ProfissaoRepositorio pr = new ProfissaoRepositorio();
		return pr.BuscaTodasProfissoes();
	}

}
