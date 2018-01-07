package jaxb;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import org.inria.fr.ns.sr.Entite;

public class EntitePrincipalAdapter extends XmlAdapter<Entite, Boolean>{
	Entite ent;

	@Override
	public Boolean unmarshal(Entite v) throws Exception {
		if(v.getPrincipal()=="1"){
			return true;
		}else{
			return false;
		}
	}

	@Override
	public Entite marshal(Boolean v) throws Exception {
		if(v.booleanValue()){
			ent.setPrincipal("1");
		}else{
			ent.setPrincipal("0");
		}
		return ent;
	}

}
