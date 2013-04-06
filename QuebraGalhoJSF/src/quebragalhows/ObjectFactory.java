
package quebragalhows;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the quebragalhows package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _BuscaTodasProfissoesResponse_QNAME = new QName("http://quebraGalhoWS/", "BuscaTodasProfissoesResponse");
    private final static QName _BuscaServidoresMaoDeObraResponse_QNAME = new QName("http://quebraGalhoWS/", "BuscaServidoresMaoDeObraResponse");
    private final static QName _BuscaServidoresMaoDeObra_QNAME = new QName("http://quebraGalhoWS/", "BuscaServidoresMaoDeObra");
    private final static QName _BuscaTodasProfissoes_QNAME = new QName("http://quebraGalhoWS/", "BuscaTodasProfissoes");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: quebragalhows
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BuscaTodasProfissoesResponse }
     * 
     */
    public BuscaTodasProfissoesResponse createBuscaTodasProfissoesResponse() {
        return new BuscaTodasProfissoesResponse();
    }

    /**
     * Create an instance of {@link BuscaServidoresMaoDeObraResponse }
     * 
     */
    public BuscaServidoresMaoDeObraResponse createBuscaServidoresMaoDeObraResponse() {
        return new BuscaServidoresMaoDeObraResponse();
    }

    /**
     * Create an instance of {@link BuscaTodasProfissoes }
     * 
     */
    public BuscaTodasProfissoes createBuscaTodasProfissoes() {
        return new BuscaTodasProfissoes();
    }

    /**
     * Create an instance of {@link BuscaServidoresMaoDeObra }
     * 
     */
    public BuscaServidoresMaoDeObra createBuscaServidoresMaoDeObra() {
        return new BuscaServidoresMaoDeObra();
    }

    /**
     * Create an instance of {@link Servidor }
     * 
     */
    public Servidor createServidor() {
        return new Servidor();
    }

    /**
     * Create an instance of {@link ProfissaoVO }
     * 
     */
    public ProfissaoVO createProfissaoVO() {
        return new ProfissaoVO();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscaTodasProfissoesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://quebraGalhoWS/", name = "BuscaTodasProfissoesResponse")
    public JAXBElement<BuscaTodasProfissoesResponse> createBuscaTodasProfissoesResponse(BuscaTodasProfissoesResponse value) {
        return new JAXBElement<BuscaTodasProfissoesResponse>(_BuscaTodasProfissoesResponse_QNAME, BuscaTodasProfissoesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscaServidoresMaoDeObraResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://quebraGalhoWS/", name = "BuscaServidoresMaoDeObraResponse")
    public JAXBElement<BuscaServidoresMaoDeObraResponse> createBuscaServidoresMaoDeObraResponse(BuscaServidoresMaoDeObraResponse value) {
        return new JAXBElement<BuscaServidoresMaoDeObraResponse>(_BuscaServidoresMaoDeObraResponse_QNAME, BuscaServidoresMaoDeObraResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscaServidoresMaoDeObra }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://quebraGalhoWS/", name = "BuscaServidoresMaoDeObra")
    public JAXBElement<BuscaServidoresMaoDeObra> createBuscaServidoresMaoDeObra(BuscaServidoresMaoDeObra value) {
        return new JAXBElement<BuscaServidoresMaoDeObra>(_BuscaServidoresMaoDeObra_QNAME, BuscaServidoresMaoDeObra.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscaTodasProfissoes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://quebraGalhoWS/", name = "BuscaTodasProfissoes")
    public JAXBElement<BuscaTodasProfissoes> createBuscaTodasProfissoes(BuscaTodasProfissoes value) {
        return new JAXBElement<BuscaTodasProfissoes>(_BuscaTodasProfissoes_QNAME, BuscaTodasProfissoes.class, null, value);
    }

}
