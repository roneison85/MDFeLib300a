//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementa��o de Refer�ncia (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modifica��es neste arquivo ser�o perdidas ap�s a recompila��o do esquema de origem. 
// Gerado em: 2021.08.11 �s 07:48:47 AM BRT 
//


package br.inf.portalfiscal.mdfe300a.retconsstatservmdfe;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Tipo Resultado da Consulta do Status do Servi�o MDFe
 * 
 * <p>Classe Java de TRetConsStatServ complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TRetConsStatServ">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tpAmb" type="{http://www.portalfiscal.inf.br/mdfe}TAmb"/>
 *         &lt;element name="verAplic">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.portalfiscal.inf.br/mdfe}TVerAplic">
 *               &lt;whiteSpace value="collapse"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="cStat" type="{http://www.portalfiscal.inf.br/mdfe}TStat"/>
 *         &lt;element name="xMotivo" type="{http://www.portalfiscal.inf.br/mdfe}TMotivo"/>
 *         &lt;element name="cUF" type="{http://www.portalfiscal.inf.br/mdfe}TCodUfIBGE"/>
 *         &lt;element name="dhRecbto" type="{http://www.portalfiscal.inf.br/mdfe}TDateTimeUTC"/>
 *         &lt;element name="tMed" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *               &lt;pattern value="[0-9]{1,4}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="dhRetorno" type="{http://www.portalfiscal.inf.br/mdfe}TDateTimeUTC" minOccurs="0"/>
 *         &lt;element name="xObs" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="255"/>
 *               &lt;whiteSpace value="collapse"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
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
@XmlType(name = "TRetConsStatServ", propOrder = {
    "tpAmb",
    "verAplic",
    "cStat",
    "xMotivo",
    "cuf",
    "dhRecbto",
    "tMed",
    "dhRetorno",
    "xObs"
})
public class TRetConsStatServ {

    @XmlElement(required = true)
    protected String tpAmb;
    @XmlElement(required = true)
    protected String verAplic;
    @XmlElement(required = true)
    protected String cStat;
    @XmlElement(required = true)
    protected String xMotivo;
    @XmlElement(name = "cUF", required = true)
    protected String cuf;
    @XmlElement(required = true)
    protected String dhRecbto;
    protected BigInteger tMed;
    protected String dhRetorno;
    protected String xObs;
    @XmlAttribute(name = "versao", required = true)
    protected String versao;

    /**
     * Obt�m o valor da propriedade tpAmb.
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
     * Obt�m o valor da propriedade verAplic.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerAplic() {
        return verAplic;
    }

    /**
     * Define o valor da propriedade verAplic.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerAplic(String value) {
        this.verAplic = value;
    }

    /**
     * Obt�m o valor da propriedade cStat.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCStat() {
        return cStat;
    }

    /**
     * Define o valor da propriedade cStat.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCStat(String value) {
        this.cStat = value;
    }

    /**
     * Obt�m o valor da propriedade xMotivo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXMotivo() {
        return xMotivo;
    }

    /**
     * Define o valor da propriedade xMotivo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXMotivo(String value) {
        this.xMotivo = value;
    }

    /**
     * Obt�m o valor da propriedade cuf.
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
     * Obt�m o valor da propriedade dhRecbto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDhRecbto() {
        return dhRecbto;
    }

    /**
     * Define o valor da propriedade dhRecbto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDhRecbto(String value) {
        this.dhRecbto = value;
    }

    /**
     * Obt�m o valor da propriedade tMed.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTMed() {
        return tMed;
    }

    /**
     * Define o valor da propriedade tMed.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTMed(BigInteger value) {
        this.tMed = value;
    }

    /**
     * Obt�m o valor da propriedade dhRetorno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDhRetorno() {
        return dhRetorno;
    }

    /**
     * Define o valor da propriedade dhRetorno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDhRetorno(String value) {
        this.dhRetorno = value;
    }

    /**
     * Obt�m o valor da propriedade xObs.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXObs() {
        return xObs;
    }

    /**
     * Define o valor da propriedade xObs.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXObs(String value) {
        this.xObs = value;
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
