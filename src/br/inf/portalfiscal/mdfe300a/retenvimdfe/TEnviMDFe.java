//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementa��o de Refer�ncia (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modifica��es neste arquivo ser�o perdidas ap�s a recompila��o do esquema de origem. 
// Gerado em: 2021.08.11 �s 07:48:49 AM BRT 
//


package br.inf.portalfiscal.mdfe300a.retenvimdfe;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Tipo Pedido de Autoriza��o Ass�ncrona de MDF-e
 * 
 * <p>Classe Java de TEnviMDFe complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TEnviMDFe">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idLote" type="{http://www.portalfiscal.inf.br/mdfe}TIdLote"/>
 *         &lt;element name="MDFe" type="{http://www.portalfiscal.inf.br/mdfe}TMDFe"/>
 *       &lt;/sequence>
 *       &lt;attribute name="versao" use="required" type="{http://www.portalfiscal.inf.br/mdfe}TVerMDe" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TEnviMDFe", propOrder = {
    "idLote",
    "mdFe"
})
public class TEnviMDFe {

    @XmlElement(required = true)
    protected String idLote;
    @XmlElement(name = "MDFe", required = true)
    protected TMDFe mdFe;
    @XmlAttribute(name = "versao", required = true)
    protected String versao;

    /**
     * Obt�m o valor da propriedade idLote.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdLote() {
        return idLote;
    }

    /**
     * Define o valor da propriedade idLote.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdLote(String value) {
        this.idLote = value;
    }

    /**
     * Obt�m o valor da propriedade mdFe.
     * 
     * @return
     *     possible object is
     *     {@link TMDFe }
     *     
     */
    public TMDFe getMDFe() {
        return mdFe;
    }

    /**
     * Define o valor da propriedade mdFe.
     * 
     * @param value
     *     allowed object is
     *     {@link TMDFe }
     *     
     */
    public void setMDFe(TMDFe value) {
        this.mdFe = value;
    }

    /**
     * Obt�m o valor da propriedade versao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersao() {
        return versao;
    }

    /**
     * Define o valor da propriedade versao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersao(String value) {
        this.versao = value;
    }

}
