//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.11 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2018.01.04 à 07:35:36 PM CET 
//


package jaxb.xquery;

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
 *         &lt;element name="member"&gt;
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

    @XmlElement(required = true)
    protected AllMembers.Member member;

    /**
     * Obtient la valeur de la propriété member.
     * 
     * @return
     *     possible object is
     *     {@link AllMembers.Member }
     *     
     */
    public AllMembers.Member getMember() {
        return member;
    }

    /**
     * Définit la valeur de la propriété member.
     * 
     * @param value
     *     allowed object is
     *     {@link AllMembers.Member }
     *     
     */
    public void setMember(AllMembers.Member value) {
        this.member = value;
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
