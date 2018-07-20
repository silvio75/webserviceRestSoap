package com.sid.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Produits implements Serializable {
    @Id @GeneratedValue
	private Long id;
	private float prix;



	public Produits() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Produits(float prix) {
		this.prix=prix;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public float getPrix() {
		return prix;
	}

	public void setPrix(float prix) {
		this.prix = prix;
	}


}
