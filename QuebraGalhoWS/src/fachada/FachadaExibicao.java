package fachada;


import java.util.List;

import dominio.Profissao;
import dominio.ProfissaoRepositorio;


public class FachadaExibicao 
{
	static public List<Profissao> BuscaTodasProfissoes()
	{
		return ProfissaoRepositorio.BuscaTodasProfissoes();
	}

}
