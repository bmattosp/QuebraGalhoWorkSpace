
package quebraGalhoWS.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 2.7.3
 * Mon Mar 11 22:26:45 BRT 2013
 * Generated source version: 2.7.3
 */

@XmlRootElement(name = "BuscaServidoresMaoDeObraResponse", namespace = "http://quebraGalhoWS/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BuscaServidoresMaoDeObraResponse", namespace = "http://quebraGalhoWS/")

public class BuscaServidoresMaoDeObraResponse {

    @XmlElement(name = "return")
    private dominio.Servico[] _return;

    public dominio.Servico[] getReturn() {
        return this._return;
    }

    public void setReturn(dominio.Servico[] new_return)  {
        this._return = new_return;
    }

}
