package service;

import ws.BanqueService;
import ws.BanqueWS;

public class ClientWS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// proxy crée ou stub pour utiliser les methodes du webservices générerés  
		BanqueService  stub=new BanqueWS().getBanqueServicePort();
		
		float solde=stub.soldeBanque(3);
		System.out.println("valeur du solde modifié "+solde);

	}

}
