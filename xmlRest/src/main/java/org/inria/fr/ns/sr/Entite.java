//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.12.20 at 09:36:36 PM CET 
//


package org.inria.fr.ns.sr;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for entite complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="entite"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sigle" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="personne" type="{http://ns.inria.fr/dsi/si/app/bastri}personne"/&gt;
 *         &lt;element name="adressegeographique" type="{http://ns.inria.fr/dsi/si/app/bastri}adressegeographique"/&gt;
 *         &lt;element name="hebergeur" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="typeentite" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="commentaire" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="lien_structure_exterieure" type="{http://ns.inria.fr/dsi/si/app/bastri}lien_structure_exterieure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="principal" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="codestructure" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="siid" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "entite", propOrder = {
    "sigle",
    "personne",
    "adressegeographique",
    "hebergeur",
    "typeentite",
    "commentaire",
    "lienStructureExterieure"
})
public class Entite {

    @XmlElement(required = true)
    protected String sigle;
    @XmlElement(required = true)
    protected Personne personne;
    @XmlElement(required = true)
    protected Adressegeographique adressegeographique;
    @XmlElement(required = true)
    protected String hebergeur;
    @XmlElement(required = true)
    protected String typeentite;
    @XmlElement(required = true)
    protected String commentaire;
    @XmlElement(name = "lien_structure_exterieure")
    protected List<LienStructureExterieure> lienStructureExterieure;
    @XmlAttribute(name = "principal")
    protected String principal;
    @XmlAttribute(name = "codestructure")
    protected String codestructure;
    @XmlAttribute(name = "siid")
    protected String siid;

    /**
     * Gets the value of the sigle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSigle() {
        return sigle;
    }

    /**
     * Sets the value of the sigle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSigle(String value) {
        this.sigle = value;
    }

    /**
     * Gets the value of the personne property.
     * 
     * @return
     *     possible object is
     *     {@link Personne }
     *     
     */
    public Personne getPersonne() {
        return personne;
    }

    /**
     * Sets the value of the personne property.
     * 
     * @param value
     *     allowed object is
     *     {@link Personne }
     *     
     */
    public void setPersonne(Personne value) {
        this.personne = value;
    }

    /**
     * Gets the value of the adressegeographique property.
     * 
     * @return
     *     possible object is
     *     {@link Adressegeographique }
     *     
     */
    public Adressegeographique getAdressegeographique() {
        return adressegeographique;
    }

    /**
     * Sets the value of the adressegeographique property.
     * 
     * @param value
     *     allowed object is
     *     {@link Adressegeographique }
     *     
     */
    public void setAdressegeographique(Adressegeographique value) {
        this.adressegeographique = value;
    }

    /**
     * Gets the value of the hebergeur property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHebergeur() {
        return hebergeur;
    }

    /**
     * Sets the value of the hebergeur property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHebergeur(String value) {
        this.hebergeur = value;
    }

    /**
     * Gets the value of the typeentite property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeentite() {
        return typeentite;
    }

    /**
     * Sets the value of the typeentite property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeentite(String value) {
        this.typeentite = value;
    }

    /**
     * Gets the value of the commentaire property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommentaire() {
        return commentaire;
    }

    /**
     * Sets the value of the commentaire property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommentaire(String value) {
        this.commentaire = value;
    }

    /**
     * Gets the value of the lienStructureExterieure property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lienStructureExterieure property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLienStructureExterieure().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LienStructureExterieure }
     * 
     * 
     */
    public List<LienStructureExterieure> getLienStructureExterieure() {
        if (lienStructureExterieure == null) {
            lienStructureExterieure = new ArrayList<LienStructureExterieure>();
        }
        return this.lienStructureExterieure;
    }

    /**
     * Gets the value of the principal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrincipal() {
        return principal;
    }

    /**
     * Sets the value of the principal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrincipal(String value) {
        this.principal = value;
    }

    /**
     * Gets the value of the codestructure property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodestructure() {
        return codestructure;
    }

    /**
     * Sets the value of the codestructure property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodestructure(String value) {
        this.codestructure = value;
    }

    /**
     * Gets the value of the siid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiid() {
        return siid;
    }

    /**
     * Sets the value of the siid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiid(String value) {
        this.siid = value;
    }

}