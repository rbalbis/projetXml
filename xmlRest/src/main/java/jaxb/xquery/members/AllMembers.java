//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.11 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2018.01.08 à 11:41:48 PM CET 
//


package jaxb.xquery.members;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="member" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="firstname" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="lastname" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="categoryPro" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="research-centre" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "member"
})
@XmlRootElement(name = "AllMembers")
public class AllMembers {

    protected List<AllMembers.Member> member;

    /**
     * Gets the value of the member property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the member property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMember().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AllMembers.Member }
     * 
     * 
     */
    public List<AllMembers.Member> getMember() {
        if (member == null) {
            member = new ArrayList<AllMembers.Member>();
        }
        return this.member;
    }


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="firstname" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="lastname" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="categoryPro" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="research-centre" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "firstname",
        "lastname",
        "categoryPro",
        "researchCentre"
    })
    public static class Member {

        @XmlElement(required = true)
        protected String firstname;
        @XmlElement(required = true)
        protected String lastname;
        @XmlElement(required = true)
        protected String categoryPro;
        @XmlElement(name = "research-centre", required = true)
        protected String researchCentre;

        /**
         * Obtient la valeur de la propriété firstname.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFirstname() {
            return firstname;
        }

        /**
         * Définit la valeur de la propriété firstname.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFirstname(String value) {
            this.firstname = value;
        }

        /**
         * Obtient la valeur de la propriété lastname.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLastname() {
            return lastname;
        }

        /**
         * Définit la valeur de la propriété lastname.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLastname(String value) {
            this.lastname = value;
        }

        /**
         * Obtient la valeur de la propriété categoryPro.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCategoryPro() {
            return categoryPro;
        }

        /**
         * Définit la valeur de la propriété categoryPro.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCategoryPro(String value) {
            this.categoryPro = value;
        }

        /**
         * Obtient la valeur de la propriété researchCentre.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getResearchCentre() {
            return researchCentre;
        }

        /**
         * Définit la valeur de la propriété researchCentre.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setResearchCentre(String value) {
            this.researchCentre = value;
        }

    }

}
