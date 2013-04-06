package quebragalhows;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.3
 * 2013-03-25T23:30:40.943-03:00
 * Generated source version: 2.7.3
 * 
 */
@WebService(targetNamespace = "http://quebraGalhoWS/", name = "QuebraGalhoWS")
@XmlSeeAlso({ObjectFactory.class})
public interface QuebraGalhoWS {

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "BuscaServidoresMaoDeObra", targetNamespace = "http://quebraGalhoWS/", className = "quebragalhows.BuscaServidoresMaoDeObra")
    @WebMethod(operationName = "BuscaServidoresMaoDeObra")
    @ResponseWrapper(localName = "BuscaServidoresMaoDeObraResponse", targetNamespace = "http://quebraGalhoWS/", className = "quebragalhows.BuscaServidoresMaoDeObraResponse")
    public java.util.List<quebragalhows.Servidor> buscaServidoresMaoDeObra();

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "BuscaTodasProfissoes", targetNamespace = "http://quebraGalhoWS/", className = "quebragalhows.BuscaTodasProfissoes")
    @WebMethod(operationName = "BuscaTodasProfissoes")
    @ResponseWrapper(localName = "BuscaTodasProfissoesResponse", targetNamespace = "http://quebraGalhoWS/", className = "quebragalhows.BuscaTodasProfissoesResponse")
    public java.util.List<quebragalhows.ProfissaoVO> buscaTodasProfissoes();
}