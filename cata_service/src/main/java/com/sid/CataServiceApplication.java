package com.sid;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.sid.dao.ProduitRepository;
import com.sid.entities.Produits;


@SpringBootApplication
public class CataServiceApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(CataServiceApplication.class, args);
		//demande à spring de me donner un bean parmis les objets entité qu'il a crée
		ProduitRepository produitRepository=ctx.getBean(ProduitRepository.class);
		produitRepository.save(new Produits(2));
		produitRepository.save(new Produits(4));
		
		List<Produits> prods= produitRepository.findAll();
		for(Produits  p : prods){
			System.out.println("prix du produit :"+p.getPrix());
		}
		

	}
}
