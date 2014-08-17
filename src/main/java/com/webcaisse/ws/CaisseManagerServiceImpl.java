package com.webcaisse.ws;

import java.util.ArrayList;
import java.util.List;

import com.webcaisse.ws.pojo.Famille;


public class CaisseManagerServiceImpl implements CaisseManagerService{

	
	public List<Famille> getFamillesActivees() {
		List<Famille> familles = new ArrayList<Famille>();
		
		familles.add(new Famille("Pizza","001"));
		familles.add(new Famille("Boissons","002"));
		familles.add(new Famille("Sandwitch","003"));
		familles.add(new Famille("Paninis","004"));
		familles.add(new Famille("Plats","005"));
		familles.add(new Famille("Menus","006"));
		familles.add(new Famille("Formules","006"));
		
		return familles;
	}
}
