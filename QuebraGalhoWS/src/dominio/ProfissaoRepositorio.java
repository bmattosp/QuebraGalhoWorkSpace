package dominio;

import java.util.ArrayList;
import java.util.List;

public class ProfissaoRepositorio
{
	static public List<Profissao> BuscaTodasProfissoes()
	{
		
		ArrayList<Profissao> profissoes = new ArrayList<Profissao>();
		
		Profissao aProfissao = new Profissao();
		aProfissao.setId(1);
		aProfissao.setDescricao("lalalala");
		aProfissao.setNome("Cabelereiro");
		profissoes.add(aProfissao );
		
		Profissao bProfissao = new Profissao();
		bProfissao.setId(2);
		bProfissao.setDescricao("lalalala");
		bProfissao.setNome("Pedreiro");
		profissoes.add(bProfissao);
		
		Profissao cProfissao = new Profissao();
		cProfissao.setId(3);
		cProfissao.setDescricao("lalalala");
		cProfissao.setNome("Eletricista");
		profissoes.add(cProfissao );
		
		Profissao dProfissao = new Profissao();
		dProfissao.setId(4);
		dProfissao.setDescricao("lalalala");
		dProfissao.setNome("Letreiro");
		profissoes.add(dProfissao );
		
		return profissoes;
		
	
	}

}
