package com.sid.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sid.entities.Produits;

@RestController
public class ProduitRestService {

	@Autowired
	ProduitRepository produitRepository;
	// consulter la liste des produits   : http://localhost:8080/produits
	@RequestMapping(value="/produits", method=RequestMethod.GET)
	public List<Produits> listProduit(){
		return produitRepository.findAll();
	}

	//retourner un produit  avec la clé primaire
	@RequestMapping(value="/produits/{id}", method=RequestMethod.GET)
	public Optional<Produits> getProduit(@PathVariable("id")Long id){
		return produitRepository.findById(id);
	}
    
	//enregistrer un produit
	@RequestMapping(value="/produits", method=RequestMethod.POST)
	public void saveProduit(@RequestBody Produits p){ //données envoyés au format json dans le corps de la requete
		    produitRepository.save(p);
	}
	
	//mettre à jour un produit
	@RequestMapping(value="/produits/{id}", method=RequestMethod.PUT)
	public void updateProduit(@RequestBody Produits p, @PathVariable("id")Long id){ 
		    p.setId(id);
		    produitRepository.saveAndFlush(p);
	}
	
	//supprimer un produit
		@RequestMapping(value="/produits/{id}", method=RequestMethod.DELETE)
		public void delateProduit(Produits p,@PathVariable("id")Long id){
			    produitRepository.delete(p);
		}

}
