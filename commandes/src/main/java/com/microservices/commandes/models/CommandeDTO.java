package com.microservices.commandes.models;

public class CommandeDTO {
    private int id;
    private String name;
    private Medicament medicamentInfo;
	private int totalQty;
	private float totalprice;


    public CommandeDTO() {
    }


    public CommandeDTO(int id, String name, Medicament medicamentInfo, int totalQty, float totalprice) {
        this.id = id;
        this.name = name;
        this.medicamentInfo = medicamentInfo;
        this.totalQty = totalQty;
        this.totalprice = totalprice;
    }


    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Medicament getMedicamentInfo() {
        return this.medicamentInfo;
    }

    public void setMedicamentInfo(Medicament medicamentInfo) {
        this.medicamentInfo = medicamentInfo;
    }

    public int getTotalQty() {
        return this.totalQty;
    }

    public void setTotalQty(int totalQty) {
        this.totalQty = totalQty;
    }

    public float getTotalprice() {
        return this.totalprice;
    }

    public void setTotalprice(float totalprice) {
        this.totalprice = totalprice;
    }



    
}
