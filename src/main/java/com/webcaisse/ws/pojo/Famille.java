package com.webcaisse.ws.pojo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="famille")
public class Famille {

	private String libelle ;
	
	private String reference ;

	public String getLibelle() {
		return libelle;
	}

	@XmlElement(name="libelle")
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public String getReference() {
		return reference;
	}
	
	@XmlElement(name="reference")
	public void setReference(String reference) {
		this.reference = reference;
	}
	
	
}
