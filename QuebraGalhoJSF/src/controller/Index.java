package controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import quebragalhows.BuscaTodasProfissoes;
import quebragalhows.ProfissaoVO;
import quebragalhows.QuebraGalhoWS;
import quebragalhows.QuebraGalhoWS_Service;


public class Index implements Serializable
{
	private List<ProfissaoVO> profissoes = null;
	
	public  ProfissaoVO[] getFavYear3Value() 
	{
		
		List<ProfissaoVO> listProfissoes = new ArrayList<ProfissaoVO>();
		ProfissaoVO[] arrayProfissoes = null;
		
		if(profissoes == null || profissoes.size() <= 0)
		{
			QuebraGalhoWS_Service service = new QuebraGalhoWS_Service();
			QuebraGalhoWS ws = service.getQuebraGalhoWSPort();			
			listProfissoes = ws.buscaTodasProfissoes();
		}
		
		ProfissaoVO[] retorno = new ProfissaoVO[listProfissoes.size()];
		listProfissoes.toArray(retorno);
		
		return retorno;
	}
	
	public void setFavYear3Value( ProfissaoVO[] profissoes) 
	{
		if(profissoes == null)
			this.profissoes = new ArrayList<ProfissaoVO>();
		else
			this.profissoes = Arrays.asList(profissoes);
	}
	
	public String Buscar()
	{
		return "buscar";
	}
	

}
