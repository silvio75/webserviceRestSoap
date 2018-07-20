import javax.xml.ws.Endpoint;

import ws.BanqueService;

public class ServeurJaxWS {

	public static void main(String[] args) {
		// adresse de publication du web service
		String url="http://172.25.150.117:8686/BanqueWS";
		System.out.println(url);
		Endpoint.publish(url, new BanqueService());

	}

}
