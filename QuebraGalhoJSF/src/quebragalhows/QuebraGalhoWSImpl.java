
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package quebragalhows;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.3
 * 2013-03-25T23:30:40.929-03:00
 * Generated source version: 2.7.3
 * 
 */

@javax.jws.WebService(
                      serviceName = "QuebraGalhoWS",
                      portName = "QuebraGalhoWSPort",
                      targetNamespace = "http://quebraGalhoWS/",
                      wsdlLocation = "http://localhost:8080/QuebraGalhoWS/services/QuebraGalhoWSPort?wsdl",
                      endpointInterface = "quebragalhows.QuebraGalhoWS")
                      
public class QuebraGalhoWSImpl implements QuebraGalhoWS {

    private static final Logger LOG = Logger.getLogger(QuebraGalhoWSImpl.class.getName());

    /* (non-Javadoc)
     * @see quebragalhows.QuebraGalhoWS#buscaServidoresMaoDeObra(*
     */
    public java.util.List<quebragalhows.Servidor> buscaServidoresMaoDeObra() { 
        LOG.info("Executing operation buscaServidoresMaoDeObra");
        try {
            java.util.List<quebragalhows.Servidor> _return = new java.util.ArrayList<quebragalhows.Servidor>();
            quebragalhows.Servidor _returnVal1 = new quebragalhows.Servidor();
            _return.add(_returnVal1);
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see quebragalhows.QuebraGalhoWS#buscaTodasProfissoes(*
     */
    public java.util.List<quebragalhows.ProfissaoVO> buscaTodasProfissoes() { 
        LOG.info("Executing operation buscaTodasProfissoes");
        try {
            java.util.List<quebragalhows.ProfissaoVO> _return = new java.util.ArrayList<quebragalhows.ProfissaoVO>();
            quebragalhows.ProfissaoVO _returnVal1 = new quebragalhows.ProfissaoVO();
            _returnVal1.setId(-1340497859);
            _returnVal1.setNome("Nome1019519164");
            _returnVal1.setDescricao("Descricao-1800374808");
            _return.add(_returnVal1);
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}