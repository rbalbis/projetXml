package jaxb;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.namespace.QName;

import org.inria.fr.ns.sr.StructureInrias;

public class StructureInriasAdapter extends XmlAdapter<JAXBElement<? extends StructureInrias>, StructureInrias> {

	@SuppressWarnings("unchecked")
	@Override
	public JAXBElement<StructureInrias> marshal(StructureInrias v) throws Exception {
		QName name = new QName("xs:element");
		return new JAXBElement<StructureInrias>(name, (Class<StructureInrias>) v.getClass(), v);
	}

	@Override
	public StructureInrias unmarshal(JAXBElement<? extends StructureInrias> v) throws Exception {
		return v.getValue();
	}

}