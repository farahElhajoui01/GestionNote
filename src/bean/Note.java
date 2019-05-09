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
public class Note {
     private Matiere matiere;
     private Etudiant etudiant;
     private Date dateNote;
     private String categorieNote;
     private Double pourcentage;
     private Double valeur;

    public Matiere getMatiere() {
        return matiere;
    }

    public void setMatiere(Matiere matiere) {
        this.matiere = matiere;
    }

    public Etudiant getEtudiant() {
        return etudiant;
    }

    public void setEtudiant(Etudiant etudiant) {
        this.etudiant = etudiant;
    }

    public Date getDateNote() {
        return dateNote;
    }

    public void setDateNote(Date dateNote) {
        this.dateNote = dateNote;
    }

    public String getCategorieNote() {
        return categorieNote;
    }

    public void setCategorieNote(String categorieNote) {
        this.categorieNote = categorieNote;
    }

    public Double getPourcentage() {
        return pourcentage;
    }

    public void setPourcentage(Double pourcentage) {
        this.pourcentage = pourcentage;
    }

    public Double getValeur() {
        return valeur;
    }

    public void setValeur(Double valeur) {
        this.valeur = valeur;
    }

    public Note() {
    }

    

    public Note(Date dateNote, String categorieNote, Double pourcentage, Double valeur) {
        this.dateNote = dateNote;
        this.categorieNote = categorieNote;
        this.pourcentage = pourcentage;
        this.valeur = valeur;
    }


     
}
