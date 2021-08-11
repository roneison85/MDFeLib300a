//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2021.08.11 às 07:48:47 AM BRT 
//


package br.inf.portalfiscal.mdfe300a.retconsstatservmdfe;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Tipo Pedido de Consulta do Status do Serviço MDFe
 * 
 * <p>Classe Java de TConsStatServ complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TConsStatServ">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tpAmb" type="{http://www.portalfiscal.inf.br/mdfe}TAmb"/>
 *         &lt;element name="xServ" type="{http://www.portalfiscal.inf.br/mdfe}TServ"/>
 *       &lt;/sequence>
 *       &lt;attribute name="versao" use="required" type="{http://www.portalfiscal.inf.br/mdfe}TVerConsStat" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TConsStatServ", propOrder = {
    "tpAmb",
    "xServ"
})
public class TConsStatServ {

    @XmlElement(required = true)
    protected String tpAmb;
    @XmlElement(required = true)
    protected String xServ;
    @XmlAttribute(name = "versao", required = true)
    protected String versao;

    /**
     * Obtém o valor da propriedade tpAmb.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTpAmb() {
        return tpAmb;
    }

    /**
     * Define o valor da propriedade tpAmb.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTpAmb(String value) {
        this.tpAmb = value;
    }

    /**
     * Obtém o valor da propriedade xServ.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXServ() {
        return xServ;
    }

    /**
     * Define o valor da propriedade xServ.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXServ(String value) {
        this.xServ = value;
    }

    /**
     * Obtém o valor da propriedade versao.
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
