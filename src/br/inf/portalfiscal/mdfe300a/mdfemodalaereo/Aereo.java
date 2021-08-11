//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2021.08.11 às 07:48:37 AM BRT 
//


package br.inf.portalfiscal.mdfe300a.mdfemodalaereo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nac">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;whiteSpace value="preserve"/>
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="4"/>
 *               &lt;pattern value="[!-ÿ]{1}[ -ÿ]{0,}[!-ÿ]{1}|[!-ÿ]{1}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="matr">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;whiteSpace value="preserve"/>
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="6"/>
 *               &lt;pattern value="[!-ÿ]{1}[ -ÿ]{0,}[!-ÿ]{1}|[!-ÿ]{1}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="nVoo">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.portalfiscal.inf.br/mdfe}TString">
 *               &lt;minLength value="5"/>
 *               &lt;maxLength value="9"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="cAerEmb">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.portalfiscal.inf.br/mdfe}TString">
 *               &lt;minLength value="3"/>
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="cAerDes">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.portalfiscal.inf.br/mdfe}TString">
 *               &lt;minLength value="3"/>
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="dVoo" type="{http://www.portalfiscal.inf.br/mdfe}TData"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "nac",
    "matr",
    "nVoo",
    "cAerEmb",
    "cAerDes",
    "dVoo"
})
@XmlRootElement(name = "aereo")
public class Aereo {

    @XmlElement(required = true)
    protected String nac;
    @XmlElement(required = true)
    protected String matr;
    @XmlElement(required = true)
    protected String nVoo;
    @XmlElement(required = true)
    protected String cAerEmb;
    @XmlElement(required = true)
    protected String cAerDes;
    @XmlElement(required = true)
    protected String dVoo;

    /**
     * Obtém o valor da propriedade nac.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNac() {
        return nac;
    }

    /**
     * Define o valor da propriedade nac.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNac(String value) {
        this.nac = value;
    }

    /**
     * Obtém o valor da propriedade matr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatr() {
        return matr;
    }

    /**
     * Define o valor da propriedade matr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatr(String value) {
        this.matr = value;
    }

    /**
     * Obtém o valor da propriedade nVoo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNVoo() {
        return nVoo;
    }

    /**
     * Define o valor da propriedade nVoo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNVoo(String value) {
        this.nVoo = value;
    }

    /**
     * Obtém o valor da propriedade cAerEmb.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCAerEmb() {
        return cAerEmb;
    }

    /**
     * Define o valor da propriedade cAerEmb.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCAerEmb(String value) {
        this.cAerEmb = value;
    }

    /**
     * Obtém o valor da propriedade cAerDes.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCAerDes() {
        return cAerDes;
    }

    /**
     * Define o valor da propriedade cAerDes.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCAerDes(String value) {
        this.cAerDes = value;
    }

    /**
     * Obtém o valor da propriedade dVoo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDVoo() {
        return dVoo;
    }

    /**
     * Define o valor da propriedade dVoo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDVoo(String value) {
        this.dVoo = value;
    }

}
