//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2021.08.11 às 07:48:48 AM BRT 
//


package br.inf.portalfiscal.mdfe300a.retdistmdfe;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.inf.portalfiscal.mdfe300a.retdistmdfe package. 
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

    private final static QName _RetDistMDFe_QNAME = new QName("http://www.portalfiscal.inf.br/mdfe", "retDistMDFe");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.inf.portalfiscal.mdfe300a.retdistmdfe
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TLoteDistDFe }
     * 
     */
    public TLoteDistDFe createTLoteDistDFe() {
        return new TLoteDistDFe();
    }

    /**
     * Create an instance of {@link TRetDistDFe }
     * 
     */
    public TRetDistDFe createTRetDistDFe() {
        return new TRetDistDFe();
    }

    /**
     * Create an instance of {@link TDistDFe }
     * 
     */
    public TDistDFe createTDistDFe() {
        return new TDistDFe();
    }

    /**
     * Create an instance of {@link TLoteDistDFe.Proc }
     * 
     */
    public TLoteDistDFe.Proc createTLoteDistDFeProc() {
        return new TLoteDistDFe.Proc();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TRetDistDFe }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.portalfiscal.inf.br/mdfe", name = "retDistMDFe")
    public JAXBElement<TRetDistDFe> createRetDistMDFe(TRetDistDFe value) {
        return new JAXBElement<TRetDistDFe>(_RetDistMDFe_QNAME, TRetDistDFe.class, null, value);
    }

}
