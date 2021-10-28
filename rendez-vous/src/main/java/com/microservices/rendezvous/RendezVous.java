package com.microservices.rendezvous;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class RendezVous {

    @Id
    public String id;
    public String idMedcin;
    public String emailMedcin;
    public String idPatient;
    public Date dateRendezVous;


    public RendezVous() {
    }


    public RendezVous(String emailMedcin) {
        this.emailMedcin = emailMedcin;
    }

    


    public RendezVous(String idMedcin, String emailMedcin, String idPatient, Date dateRendezVous) {
        this.idMedcin = idMedcin;
        this.emailMedcin = emailMedcin;
        this.idPatient = idPatient;
        this.dateRendezVous = dateRendezVous;
    }


    public RendezVous(String id, String idMedcin, String emailMedcin, String idPatient, Date dateRendezVous) {
        this.id = id;
        this.idMedcin = idMedcin;
        this.emailMedcin = emailMedcin;
        this.idPatient = idPatient;
        this.dateRendezVous = dateRendezVous;
    }


    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdMedcin() {
        return this.idMedcin;
    }

    public void setIdMedcin(String idMedcin) {
        this.idMedcin = idMedcin;
    }

    public String getEmailMedcin() {
        return this.emailMedcin;
    }

    public void setEmailMedcin(String emailMedcin) {
        this.emailMedcin = emailMedcin;
    }

    public String getIdPatient() {
        return this.idPatient;
    }

    public void setIdPatient(String idPatient) {
        this.idPatient = idPatient;
    }

    public Date getDateRendezVous() {
        return this.dateRendezVous;
    }

    public void setDateRendezVous(Date dateRendezVous) {
        this.dateRendezVous = dateRendezVous;
    }



    
}
