//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.01.04 at 11:00:32 PM CET 
//


package jaxb.xquery;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the jaxb.xquery package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _MathMrowMsupMi_QNAME = new QName("http://www.w3.org/1998/Math/MathML", "mi");
    private final static QName _MathMrowMsupMn_QNAME = new QName("http://www.w3.org/1998/Math/MathML", "mn");
    private final static QName _MathMrowMrowMo_QNAME = new QName("http://www.w3.org/1998/Math/MathML", "mo");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: jaxb.xquery
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Math }
     * 
     */
    public Math createMath() {
        return new Math();
    }

    /**
     * Create an instance of {@link AllMembers }
     * 
     */
    public AllMembers createAllMembers() {
        return new AllMembers();
    }

    /**
     * Create an instance of {@link Math.Mrow }
     * 
     */
    public Math.Mrow createMathMrow() {
        return new Math.Mrow();
    }

    /**
     * Create an instance of {@link Math.Msub }
     * 
     */
    public Math.Msub createMathMsub() {
        return new Math.Msub();
    }

    /**
     * Create an instance of {@link Projets }
     * 
     */
    public Projets createProjets() {
        return new Projets();
    }

    /**
     * Create an instance of {@link AllMembers.Member }
     * 
     */
    public AllMembers.Member createAllMembersMember() {
        return new AllMembers.Member();
    }

    /**
     * Create an instance of {@link Math.Mrow.Mi }
     * 
     */
    public Math.Mrow.Mi createMathMrowMi() {
        return new Math.Mrow.Mi();
    }

    /**
     * Create an instance of {@link Math.Mrow.Msub }
     * 
     */
    public Math.Mrow.Msub createMathMrowMsub() {
        return new Math.Mrow.Msub();
    }

    /**
     * Create an instance of {@link Math.Mrow.Mrow }
     * 
     */
    public Math.Mrow.Mrow createMathMrowMrow() {
        return new Math.Mrow.Mrow();
    }

    /**
     * Create an instance of {@link Math.Mrow.Msup }
     * 
     */
    public Math.Mrow.Msup createMathMrowMsup() {
        return new Math.Mrow.Msup();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/1998/Math/MathML", name = "mi", scope = Math.Mrow.Msup.class)
    public JAXBElement<String> createMathMrowMsupMi(String value) {
        return new JAXBElement<String>(_MathMrowMsupMi_QNAME, String.class, Math.Mrow.Msup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/1998/Math/MathML", name = "mn", scope = Math.Mrow.Msup.class)
    public JAXBElement<Byte> createMathMrowMsupMn(Byte value) {
        return new JAXBElement<Byte>(_MathMrowMsupMn_QNAME, Byte.class, Math.Mrow.Msup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/1998/Math/MathML", name = "mo", scope = Math.Mrow.Mrow.class)
    public JAXBElement<String> createMathMrowMrowMo(String value) {
        return new JAXBElement<String>(_MathMrowMrowMo_QNAME, String.class, Math.Mrow.Mrow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/1998/Math/MathML", name = "mi", scope = Math.Mrow.Mrow.class)
    public JAXBElement<String> createMathMrowMrowMi(String value) {
        return new JAXBElement<String>(_MathMrowMsupMi_QNAME, String.class, Math.Mrow.Mrow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/1998/Math/MathML", name = "mo", scope = Math.Mrow.Msub.class)
    public JAXBElement<String> createMathMrowMsubMo(String value) {
        return new JAXBElement<String>(_MathMrowMrowMo_QNAME, String.class, Math.Mrow.Msub.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/1998/Math/MathML", name = "mi", scope = Math.Mrow.Msub.class)
    public JAXBElement<String> createMathMrowMsubMi(String value) {
        return new JAXBElement<String>(_MathMrowMsupMi_QNAME, String.class, Math.Mrow.Msub.class, value);
    }

}
