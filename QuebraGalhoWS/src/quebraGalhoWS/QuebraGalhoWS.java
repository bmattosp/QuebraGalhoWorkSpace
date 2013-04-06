package quebraGalhoWS;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import dominio.Profissao;
import dominio.Servico;
import fachada.FachadaExibicao;

@WebService(serviceName = "QuebraGalhoWS")
public class QuebraGalhoWS
{
	public QuebraGalhoWS()
	{
	
	}
	
	@WebMethod
	public Servico[] BuscaServidoresMaoDeObra()
	{
		return (Servico[]) new ArrayList<Servico>().toArray();
	}
	
	@WebMethod
	public Profissao[] BuscaTodasProfissoes()
	{
		List<Profissao> lista = FachadaExibicao.BuscaTodasProfissoes();
		Profissao[] a = new Profissao[lista.size()];
		lista.toArray(a);
		
		return a;
	}

}
