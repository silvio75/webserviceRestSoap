package service;

import ws.BanqueService;
import ws.BanqueWS;

public class ClientWS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// proxy cr�e ou stub pour utiliser les methodes du webservices g�n�rer�s  
		BanqueService  stub=new BanqueWS().getBanqueServicePort();
		
		float solde=stub.soldeBanque(3);
		System.out.println("valeur du solde modifi� "+solde);

	}

}
