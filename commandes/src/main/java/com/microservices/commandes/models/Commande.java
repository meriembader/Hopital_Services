package com.microservices.commandes.models;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Commande implements Serializable {
	private static final long serialVersionUID = 6;
	
	
	@Id
	@GeneratedValue
	private int id;
	private int idM;
	private int totalQty;
	private float totalprice;
	private String name;
	
	public Commande(int idM, int totalQty, float totalprice, String name) {
		super();
		this.idM = idM;
		this.totalQty = totalQty;
		this.totalprice = totalprice;
		this.name = name;
	}

	public Commande() {
		super();
		
	}

	public Commande(String name, int idM) {
		super();
		this.name = name;
		this.idM = idM;
	}

	public int getId() {
		return id;
	}

	public void setId(int idC) {
		this.id = idC;
	}

	public int getIdM() {
		return idM;
	}

	public void setIdM(int idM) {
		this.idM = idM;
	}

	public int getTotalQty() {
		return totalQty;
	}

	public void setTotalQty(int totalQty) {
		this.totalQty = totalQty;
	}

	public float getTotalprice() {
		return totalprice;
	}

	public void setTotalprice(float totalprice) {
		this.totalprice = totalprice;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
