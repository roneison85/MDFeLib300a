//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2021.08.11 às 07:48:32 AM BRT 
//


package br.inf.portalfiscal.mdfe300a.evinccondutormdfe;

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
 *               &lt;enumeration value="Inclusao Condutor"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="condutor">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="xNome">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.portalfiscal.inf.br/mdfe}TString">
 *                         &lt;maxLength value="60"/>
 *                         &lt;minLength value="2"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="CPF" type="{http://www.portalfiscal.inf.br/mdfe}TCpf"/>
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
    "condutor"
})
@XmlRootElement(name = "evIncCondutorMDFe", namespace = "http://www.portalfiscal.inf.br/mdfe")
public class EvIncCondutorMDFe {

    @XmlElement(namespace = "http://www.portalfiscal.inf.br/mdfe", required = true)
    protected String descEvento;
    @XmlElement(namespace = "http://www.portalfiscal.inf.br/mdfe", required = true)
    protected EvIncCondutorMDFe.Condutor condutor;

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
     * Obtém o valor da propriedade condutor.
     * 
     * @return
     *     possible object is
     *     {@link EvIncCondutorMDFe.Condutor }
     *     
     */
    public EvIncCondutorMDFe.Condutor getCondutor() {
        return condutor;
    }

    /**
     * Define o valor da propriedade condutor.
     * 
     * @param value
     *     allowed object is
     *     {@link EvIncCondutorMDFe.Condutor }
     *     
     */
    public void setCondutor(EvIncCondutorMDFe.Condutor value) {
        this.condutor = value;
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
     *         &lt;element name="xNome">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.portalfiscal.inf.br/mdfe}TString">
     *               &lt;maxLength value="60"/>
     *               &lt;minLength value="2"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="CPF" type="{http://www.portalfiscal.inf.br/mdfe}TCpf"/>
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
        "xNome",
        "cpf"
    })
    public static class Condutor {

        @XmlElement(namespace = "http://www.portalfiscal.inf.br/mdfe", required = true)
        protected String xNome;
        @XmlElement(name = "CPF", namespace = "http://www.portalfiscal.inf.br/mdfe", required = true)
        protected String cpf;

        /**
         * Obtém o valor da propriedade xNome.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getXNome() {
            return xNome;
        }

        /**
         * Define o valor da propriedade xNome.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setXNome(String value) {
            this.xNome = value;
        }

        /**
         * Obtém o valor da propriedade cpf.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCPF() {
            return cpf;
        }

        /**
         * Define o valor da propriedade cpf.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCPF(String value) {
            this.cpf = value;
        }

    }

}
