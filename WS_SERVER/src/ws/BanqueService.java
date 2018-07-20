package ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(serviceName="BanqueWS")
public class BanqueService {
	@WebMethod(operationName="soldeBanque") // methode appelée côté soap
	public float solde(@WebParam(name="mt")float montant) {
		float somme = montant* 100;
		return somme;

	}

	public String test() {
		return "test";
	}

}
