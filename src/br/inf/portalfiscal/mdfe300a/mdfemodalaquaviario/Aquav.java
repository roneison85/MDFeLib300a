//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementa��o de Refer�ncia (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modifica��es neste arquivo ser�o perdidas ap�s a recompila��o do esquema de origem. 
// Gerado em: 2021.08.11 �s 07:48:38 AM BRT 
//


package br.inf.portalfiscal.mdfe300a.mdfemodalaquaviario;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="irin">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;whiteSpace value="preserve"/>
 *               &lt;maxLength value="10"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="tpEmb">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;whiteSpace value="preserve"/>
 *               &lt;pattern value="[0-9]{2}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="cEmbar">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.portalfiscal.inf.br/mdfe}TString">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="xEmbar">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.portalfiscal.inf.br/mdfe}TString">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="60"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="nViag">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;whiteSpace value="preserve"/>
 *               &lt;pattern value="[1-9]{1}[0-9]{0,9}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="cPrtEmb">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.portalfiscal.inf.br/mdfe}TString">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="cPrtDest">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.portalfiscal.inf.br/mdfe}TString">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="prtTrans" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.portalfiscal.inf.br/mdfe}TString">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="60"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="tpNav" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;whiteSpace value="preserve"/>
 *               &lt;enumeration value="0"/>
 *               &lt;enumeration value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="infTermCarreg" maxOccurs="5" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="cTermCarreg">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.portalfiscal.inf.br/mdfe}TString">
 *                         &lt;minLength value="1"/>
 *                         &lt;maxLength value="8"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="xTermCarreg">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.portalfiscal.inf.br/mdfe}TString">
 *                         &lt;minLength value="1"/>
 *                         &lt;maxLength value="60"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="infTermDescarreg" maxOccurs="5" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="cTermDescarreg">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.portalfiscal.inf.br/mdfe}TString">
 *                         &lt;minLength value="1"/>
 *                         &lt;maxLength value="8"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="xTermDescarreg">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.portalfiscal.inf.br/mdfe}TString">
 *                         &lt;minLength value="1"/>
 *                         &lt;maxLength value="60"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="infEmbComb" maxOccurs="30" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="cEmbComb">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.portalfiscal.inf.br/mdfe}TString">
 *                         &lt;minLength value="1"/>
 *                         &lt;maxLength value="10"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="xBalsa">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.portalfiscal.inf.br/mdfe}TString">
 *                         &lt;minLength value="1"/>
 *                         &lt;maxLength value="60"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="infUnidCargaVazia" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="idUnidCargaVazia" type="{http://www.portalfiscal.inf.br/mdfe}TContainer"/>
 *                   &lt;element name="tpUnidCargaVazia">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.portalfiscal.inf.br/mdfe}TString">
 *                         &lt;enumeration value="1"/>
 *                         &lt;enumeration value="2"/>
 *                         &lt;enumeration value="3"/>
 *                         &lt;enumeration value="4"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="infUnidTranspVazia" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="idUnidTranspVazia" type="{http://www.portalfiscal.inf.br/mdfe}TContainer"/>
 *                   &lt;element name="tpUnidTranspVazia">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.portalfiscal.inf.br/mdfe}TString">
 *                         &lt;enumeration value="1"/>
 *                         &lt;enumeration value="2"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
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
    "irin",
    "tpEmb",
    "cEmbar",
    "xEmbar",
    "nViag",
    "cPrtEmb",
    "cPrtDest",
    "prtTrans",
    "tpNav",
    "infTermCarreg",
    "infTermDescarreg",
    "infEmbComb",
    "infUnidCargaVazia",
    "infUnidTranspVazia"
})
@XmlRootElement(name = "aquav")
public class Aquav {

    @XmlElement(required = true)
    protected String irin;
    @XmlElement(required = true)
    protected String tpEmb;
    @XmlElement(required = true)
    protected String cEmbar;
    @XmlElement(required = true)
    protected String xEmbar;
    @XmlElement(required = true)
    protected String nViag;
    @XmlElement(required = true)
    protected String cPrtEmb;
    @XmlElement(required = true)
    protected String cPrtDest;
    protected String prtTrans;
    protected String tpNav;
    protected List<Aquav.InfTermCarreg> infTermCarreg;
    protected List<Aquav.InfTermDescarreg> infTermDescarreg;
    protected List<Aquav.InfEmbComb> infEmbComb;
    protected List<Aquav.InfUnidCargaVazia> infUnidCargaVazia;
    protected List<Aquav.InfUnidTranspVazia> infUnidTranspVazia;

    /**
     * Obt�m o valor da propriedade irin.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIrin() {
        return irin;
    }

    /**
     * Define o valor da propriedade irin.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIrin(String value) {
        this.irin = value;
    }

    /**
     * Obt�m o valor da propriedade tpEmb.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTpEmb() {
        return tpEmb;
    }

    /**
     * Define o valor da propriedade tpEmb.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTpEmb(String value) {
        this.tpEmb = value;
    }

    /**
     * Obt�m o valor da propriedade cEmbar.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCEmbar() {
        return cEmbar;
    }

    /**
     * Define o valor da propriedade cEmbar.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCEmbar(String value) {
        this.cEmbar = value;
    }

    /**
     * Obt�m o valor da propriedade xEmbar.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXEmbar() {
        return xEmbar;
    }

    /**
     * Define o valor da propriedade xEmbar.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXEmbar(String value) {
        this.xEmbar = value;
    }

    /**
     * Obt�m o valor da propriedade nViag.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNViag() {
        return nViag;
    }

    /**
     * Define o valor da propriedade nViag.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNViag(String value) {
        this.nViag = value;
    }

    /**
     * Obt�m o valor da propriedade cPrtEmb.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCPrtEmb() {
        return cPrtEmb;
    }

    /**
     * Define o valor da propriedade cPrtEmb.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCPrtEmb(String value) {
        this.cPrtEmb = value;
    }

    /**
     * Obt�m o valor da propriedade cPrtDest.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCPrtDest() {
        return cPrtDest;
    }

    /**
     * Define o valor da propriedade cPrtDest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCPrtDest(String value) {
        this.cPrtDest = value;
    }

    /**
     * Obt�m o valor da propriedade prtTrans.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrtTrans() {
        return prtTrans;
    }

    /**
     * Define o valor da propriedade prtTrans.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrtTrans(String value) {
        this.prtTrans = value;
    }

    /**
     * Obt�m o valor da propriedade tpNav.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTpNav() {
        return tpNav;
    }

    /**
     * Define o valor da propriedade tpNav.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTpNav(String value) {
        this.tpNav = value;
    }

    /**
     * Gets the value of the infTermCarreg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the infTermCarreg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInfTermCarreg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Aquav.InfTermCarreg }
     * 
     * 
     */
    public List<Aquav.InfTermCarreg> getInfTermCarreg() {
        if (infTermCarreg == null) {
            infTermCarreg = new ArrayList<Aquav.InfTermCarreg>();
        }
        return this.infTermCarreg;
    }

    /**
     * Gets the value of the infTermDescarreg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the infTermDescarreg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInfTermDescarreg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Aquav.InfTermDescarreg }
     * 
     * 
     */
    public List<Aquav.InfTermDescarreg> getInfTermDescarreg() {
        if (infTermDescarreg == null) {
            infTermDescarreg = new ArrayList<Aquav.InfTermDescarreg>();
        }
        return this.infTermDescarreg;
    }

    /**
     * Gets the value of the infEmbComb property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the infEmbComb property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInfEmbComb().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Aquav.InfEmbComb }
     * 
     * 
     */
    public List<Aquav.InfEmbComb> getInfEmbComb() {
        if (infEmbComb == null) {
            infEmbComb = new ArrayList<Aquav.InfEmbComb>();
        }
        return this.infEmbComb;
    }

    /**
     * Gets the value of the infUnidCargaVazia property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the infUnidCargaVazia property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInfUnidCargaVazia().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Aquav.InfUnidCargaVazia }
     * 
     * 
     */
    public List<Aquav.InfUnidCargaVazia> getInfUnidCargaVazia() {
        if (infUnidCargaVazia == null) {
            infUnidCargaVazia = new ArrayList<Aquav.InfUnidCargaVazia>();
        }
        return this.infUnidCargaVazia;
    }

    /**
     * Gets the value of the infUnidTranspVazia property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the infUnidTranspVazia property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInfUnidTranspVazia().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Aquav.InfUnidTranspVazia }
     * 
     * 
     */
    public List<Aquav.InfUnidTranspVazia> getInfUnidTranspVazia() {
        if (infUnidTranspVazia == null) {
            infUnidTranspVazia = new ArrayList<Aquav.InfUnidTranspVazia>();
        }
        return this.infUnidTranspVazia;
    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="cEmbComb">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.portalfiscal.inf.br/mdfe}TString">
     *               &lt;minLength value="1"/>
     *               &lt;maxLength value="10"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="xBalsa">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.portalfiscal.inf.br/mdfe}TString">
     *               &lt;minLength value="1"/>
     *               &lt;maxLength value="60"/>
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
        "cEmbComb",
        "xBalsa"
    })
    public static class InfEmbComb {

        @XmlElement(required = true)
        protected String cEmbComb;
        @XmlElement(required = true)
        protected String xBalsa;

        /**
         * Obt�m o valor da propriedade cEmbComb.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCEmbComb() {
            return cEmbComb;
        }

        /**
         * Define o valor da propriedade cEmbComb.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCEmbComb(String value) {
            this.cEmbComb = value;
        }

        /**
         * Obt�m o valor da propriedade xBalsa.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getXBalsa() {
            return xBalsa;
        }

        /**
         * Define o valor da propriedade xBalsa.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setXBalsa(String value) {
            this.xBalsa = value;
        }

    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="cTermCarreg">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.portalfiscal.inf.br/mdfe}TString">
     *               &lt;minLength value="1"/>
     *               &lt;maxLength value="8"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="xTermCarreg">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.portalfiscal.inf.br/mdfe}TString">
     *               &lt;minLength value="1"/>
     *               &lt;maxLength value="60"/>
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
        "cTermCarreg",
        "xTermCarreg"
    })
    public static class InfTermCarreg {

        @XmlElement(required = true)
        protected String cTermCarreg;
        @XmlElement(required = true)
        protected String xTermCarreg;

        /**
         * Obt�m o valor da propriedade cTermCarreg.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCTermCarreg() {
            return cTermCarreg;
        }

        /**
         * Define o valor da propriedade cTermCarreg.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCTermCarreg(String value) {
            this.cTermCarreg = value;
        }

        /**
         * Obt�m o valor da propriedade xTermCarreg.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getXTermCarreg() {
            return xTermCarreg;
        }

        /**
         * Define o valor da propriedade xTermCarreg.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setXTermCarreg(String value) {
            this.xTermCarreg = value;
        }

    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="cTermDescarreg">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.portalfiscal.inf.br/mdfe}TString">
     *               &lt;minLength value="1"/>
     *               &lt;maxLength value="8"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="xTermDescarreg">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.portalfiscal.inf.br/mdfe}TString">
     *               &lt;minLength value="1"/>
     *               &lt;maxLength value="60"/>
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
        "cTermDescarreg",
        "xTermDescarreg"
    })
    public static class InfTermDescarreg {

        @XmlElement(required = true)
        protected String cTermDescarreg;
        @XmlElement(required = true)
        protected String xTermDescarreg;

        /**
         * Obt�m o valor da propriedade cTermDescarreg.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCTermDescarreg() {
            return cTermDescarreg;
        }

        /**
         * Define o valor da propriedade cTermDescarreg.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCTermDescarreg(String value) {
            this.cTermDescarreg = value;
        }

        /**
         * Obt�m o valor da propriedade xTermDescarreg.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getXTermDescarreg() {
            return xTermDescarreg;
        }

        /**
         * Define o valor da propriedade xTermDescarreg.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setXTermDescarreg(String value) {
            this.xTermDescarreg = value;
        }

    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="idUnidCargaVazia" type="{http://www.portalfiscal.inf.br/mdfe}TContainer"/>
     *         &lt;element name="tpUnidCargaVazia">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.portalfiscal.inf.br/mdfe}TString">
     *               &lt;enumeration value="1"/>
     *               &lt;enumeration value="2"/>
     *               &lt;enumeration value="3"/>
     *               &lt;enumeration value="4"/>
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
        "idUnidCargaVazia",
        "tpUnidCargaVazia"
    })
    public static class InfUnidCargaVazia {

        @XmlElement(required = true)
        protected String idUnidCargaVazia;
        @XmlElement(required = true)
        protected String tpUnidCargaVazia;

        /**
         * Obt�m o valor da propriedade idUnidCargaVazia.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIdUnidCargaVazia() {
            return idUnidCargaVazia;
        }

        /**
         * Define o valor da propriedade idUnidCargaVazia.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIdUnidCargaVazia(String value) {
            this.idUnidCargaVazia = value;
        }

        /**
         * Obt�m o valor da propriedade tpUnidCargaVazia.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTpUnidCargaVazia() {
            return tpUnidCargaVazia;
        }

        /**
         * Define o valor da propriedade tpUnidCargaVazia.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTpUnidCargaVazia(String value) {
            this.tpUnidCargaVazia = value;
        }

    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="idUnidTranspVazia" type="{http://www.portalfiscal.inf.br/mdfe}TContainer"/>
     *         &lt;element name="tpUnidTranspVazia">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.portalfiscal.inf.br/mdfe}TString">
     *               &lt;enumeration value="1"/>
     *               &lt;enumeration value="2"/>
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
        "idUnidTranspVazia",
        "tpUnidTranspVazia"
    })
    public static class InfUnidTranspVazia {

        @XmlElement(required = true)
        protected String idUnidTranspVazia;
        @XmlElement(required = true)
        protected String tpUnidTranspVazia;

        /**
         * Obt�m o valor da propriedade idUnidTranspVazia.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIdUnidTranspVazia() {
            return idUnidTranspVazia;
        }

        /**
         * Define o valor da propriedade idUnidTranspVazia.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIdUnidTranspVazia(String value) {
            this.idUnidTranspVazia = value;
        }

        /**
         * Obt�m o valor da propriedade tpUnidTranspVazia.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTpUnidTranspVazia() {
            return tpUnidTranspVazia;
        }

        /**
         * Define o valor da propriedade tpUnidTranspVazia.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTpUnidTranspVazia(String value) {
            this.tpUnidTranspVazia = value;
        }

    }

}
