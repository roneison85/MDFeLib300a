//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2021.08.11 às 07:48:33 AM BRT 
//


package br.inf.portalfiscal.mdfe300a.evinclusaodfemdfe;

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
 *               &lt;enumeration value="Inclusão DF-e"/>
 *               &lt;enumeration value="Inclusao DF-e"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="nProt" type="{http://www.portalfiscal.inf.br/mdfe}TProt"/>
 *         &lt;element name="cMunCarrega" type="{http://www.portalfiscal.inf.br/mdfe}TCodMunIBGE"/>
 *         &lt;element name="xMunCarrega">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.portalfiscal.inf.br/mdfe}TString">
 *               &lt;minLength value="2"/>
 *               &lt;maxLength value="60"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="infDoc" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="cMunDescarga" type="{http://www.portalfiscal.inf.br/mdfe}TCodMunIBGE"/>
 *                   &lt;element name="xMunDescarga">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.portalfiscal.inf.br/mdfe}TString">
 *                         &lt;minLength value="2"/>
 *                         &lt;maxLength value="60"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="chNFe" type="{http://www.portalfiscal.inf.br/mdfe}TChNFe"/>
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
    "descEvento",
    "nProt",
    "cMunCarrega",
    "xMunCarrega",
    "infDoc"
})
@XmlRootElement(name = "evIncDFeMDFe", namespace = "http://www.portalfiscal.inf.br/mdfe")
public class EvIncDFeMDFe {

    @XmlElement(namespace = "http://www.portalfiscal.inf.br/mdfe", required = true)
    protected String descEvento;
    @XmlElement(namespace = "http://www.portalfiscal.inf.br/mdfe", required = true)
    protected String nProt;
    @XmlElement(namespace = "http://www.portalfiscal.inf.br/mdfe", required = true)
    protected String cMunCarrega;
    @XmlElement(namespace = "http://www.portalfiscal.inf.br/mdfe", required = true)
    protected String xMunCarrega;
    @XmlElement(namespace = "http://www.portalfiscal.inf.br/mdfe", required = true)
    protected List<EvIncDFeMDFe.InfDoc> infDoc;

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
     * Obtém o valor da propriedade cMunCarrega.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCMunCarrega() {
        return cMunCarrega;
    }

    /**
     * Define o valor da propriedade cMunCarrega.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCMunCarrega(String value) {
        this.cMunCarrega = value;
    }

    /**
     * Obtém o valor da propriedade xMunCarrega.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXMunCarrega() {
        return xMunCarrega;
    }

    /**
     * Define o valor da propriedade xMunCarrega.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXMunCarrega(String value) {
        this.xMunCarrega = value;
    }

    /**
     * Gets the value of the infDoc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the infDoc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInfDoc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EvIncDFeMDFe.InfDoc }
     * 
     * 
     */
    public List<EvIncDFeMDFe.InfDoc> getInfDoc() {
        if (infDoc == null) {
            infDoc = new ArrayList<EvIncDFeMDFe.InfDoc>();
        }
        return this.infDoc;
    }


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
     *         &lt;element name="cMunDescarga" type="{http://www.portalfiscal.inf.br/mdfe}TCodMunIBGE"/>
     *         &lt;element name="xMunDescarga">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.portalfiscal.inf.br/mdfe}TString">
     *               &lt;minLength value="2"/>
     *               &lt;maxLength value="60"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="chNFe" type="{http://www.portalfiscal.inf.br/mdfe}TChNFe"/>
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
        "cMunDescarga",
        "xMunDescarga",
        "chNFe"
    })
    public static class InfDoc {

        @XmlElement(namespace = "http://www.portalfiscal.inf.br/mdfe", required = true)
        protected String cMunDescarga;
        @XmlElement(namespace = "http://www.portalfiscal.inf.br/mdfe", required = true)
        protected String xMunDescarga;
        @XmlElement(namespace = "http://www.portalfiscal.inf.br/mdfe", required = true)
        protected String chNFe;

        /**
         * Obtém o valor da propriedade cMunDescarga.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCMunDescarga() {
            return cMunDescarga;
        }

        /**
         * Define o valor da propriedade cMunDescarga.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCMunDescarga(String value) {
            this.cMunDescarga = value;
        }

        /**
         * Obtém o valor da propriedade xMunDescarga.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getXMunDescarga() {
            return xMunDescarga;
        }

        /**
         * Define o valor da propriedade xMunDescarga.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setXMunDescarga(String value) {
            this.xMunDescarga = value;
        }

        /**
         * Obtém o valor da propriedade chNFe.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getChNFe() {
            return chNFe;
        }

        /**
         * Define o valor da propriedade chNFe.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setChNFe(String value) {
            this.chNFe = value;
        }

    }

}
