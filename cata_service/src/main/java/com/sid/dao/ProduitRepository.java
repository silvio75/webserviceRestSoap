package com.sid.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sid.entities.Produits;

public interface ProduitRepository  extends JpaRepository<Produits,Long> {
	
	//ajouter un produit : post
	//supprimer un produit : delete
	//rechercher un produit : get
	//modifier un produit : put

}
