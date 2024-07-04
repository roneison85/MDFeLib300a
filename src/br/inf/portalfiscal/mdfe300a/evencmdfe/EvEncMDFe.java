
package br.inf.portalfiscal.mdfe300a.evencmdfe;

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
 *         &lt;element name="descEvento">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;whiteSpace value="preserve"/>
 *               &lt;enumeration value="Encerramento"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="nProt" type="{http://www.portalfiscal.inf.br/mdfe}TProt"/>
 *         &lt;element name="dtEnc" type="{http://www.portalfiscal.inf.br/mdfe}TData"/>
 *         &lt;element name="cUF" type="{http://www.portalfiscal.inf.br/mdfe}TCodUfIBGE_EX"/>
 *         &lt;element name="cMun" type="{http://www.portalfiscal.inf.br/mdfe}TCodMunIBGE"/>
 *         &lt;element name="indEncPorTerceiro" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
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
    "descEvento",
    "nProt",
    "dtEnc",
    "cuf",
    "cMun",
    "indEncPorTerceiro"
})
@XmlRootElement(name = "evEncMDFe", namespace = "http://www.portalfiscal.inf.br/mdfe")
public class EvEncMDFe {

    @XmlElement(namespace = "http://www.portalfiscal.inf.br/mdfe", required = true)
    protected String descEvento;
    @XmlElement(namespace = "http://www.portalfiscal.inf.br/mdfe", required = true)
    protected String nProt;
    @XmlElement(namespace = "http://www.portalfiscal.inf.br/mdfe", required = true)
    protected String dtEnc;
    @XmlElement(name = "cUF", namespace = "http://www.portalfiscal.inf.br/mdfe", required = true)
    protected String cuf;
    @XmlElement(namespace = "http://www.portalfiscal.inf.br/mdfe", required = true)
    protected String cMun;
    @XmlElement(namespace = "http://www.portalfiscal.inf.br/mdfe")
    protected String indEncPorTerceiro;

    /**
     * Obtém o valor da propriedade descEvento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescEvento() {
        return descEvento;
    }

    /**
     * Define o valor da propriedade descEvento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescEvento(String value) {
        this.descEvento = value;
    }

    /**
     * Obtém o valor da propriedade nProt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNProt() {
        return nProt;
    }

    /**
     * Define o valor da propriedade nProt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNProt(String value) {
        this.nProt = value;
    }

    /**
     * Obtém o valor da propriedade dtEnc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtEnc() {
        return dtEnc;
    }

    /**
     * Define o valor da propriedade dtEnc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtEnc(String value) {
        this.dtEnc = value;
    }

    /**
     * Obtém o valor da propriedade cuf.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUF() {
        return cuf;
    }

    /**
     * Define o valor da propriedade cuf.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUF(String value) {
        this.cuf = value;
    }

    /**
     * Obtém o valor da propriedade cMun.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCMun() {
        return cMun;
    }

    /**
     * Define o valor da propriedade cMun.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCMun(String value) {
        this.cMun = value;
    }

    /**
     * Obtém o valor da propriedade indEncPorTerceiro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndEncPorTerceiro() {
        return indEncPorTerceiro;
    }

    /**
     * Define o valor da propriedade indEncPorTerceiro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndEncPorTerceiro(String value) {
        this.indEncPorTerceiro = value;
    }

}
