/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.sql.Date;

/**
 *
 * @author fatima
 */
public class Professeur {
     private String matricule;
     private String nom;
     private String prenom;
     private Date dateNaissance;
     private Date dateAumbauche;
     private String adresse;
     private String email;
     private String sexe;
     private String tel;
     private Utilisateur utilisateur;

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }
     

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public Date getDateAumbauche() {
        return dateAumbauche;
    }

    public void setDateAumbauche(Date dateAumbauche) {
        this.dateAumbauche = dateAumbauche;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Professeur() {
    }

    public Professeur(String matricule) {
        this.matricule = matricule;
    }

    public Professeur(String matricule, String nom, String prenom, Date dateNaissance, Date dateAumbauche, String adresse, String email, String sexe, String tel) {
        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.dateAumbauche = dateAumbauche;
        this.adresse = adresse;
        this.email = email;
        this.sexe = sexe;
        this.tel = tel;
    }
     
    
     
    
}
