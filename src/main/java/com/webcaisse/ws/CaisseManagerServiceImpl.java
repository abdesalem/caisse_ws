package com.webcaisse.ws;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.webcaisse.ws.pojo.Famille;


@WebService
public class CaisseManagerServiceImpl {

	
	@WebMethod
	public List<Famille> getFamillesActivees() {
		return null;
	}
}
