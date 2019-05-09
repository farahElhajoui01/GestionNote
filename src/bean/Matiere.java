/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author fatima
 */
public class Matiere {
    private Long idMatiere;
    private String libelle;
    private Long nbrHeure;
    private Professeur professeur;
    private Semestre semestre;

    public Long getIdMatiere() {
        return idMatiere;
    }

    public void setIdMatiere(Long idMatiere) {
        this.idMatiere = idMatiere;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public Long getNbrHeure() {
        return nbrHeure;
    }

    public void setNbrHeure(Long nbrHeure) {
        this.nbrHeure = nbrHeure;
    }

    public Professeur getProfesseur() {
        return professeur;
    }

    public void setProfesseur(Professeur professeur) {
        this.professeur = professeur;
    }

    public Semestre getSemestre() {
        return semestre;
    }

    public void setSemestre(Semestre semestre) {
        this.semestre = semestre;
    }

    public Matiere() {
    }

    public Matiere(Long idMatiere) {
        this.idMatiere = idMatiere;
    }

    public Matiere(Long idMatiere, String libelle, Long nbrHeure) {
        this.idMatiere = idMatiere;
        this.libelle = libelle;
        this.nbrHeure = nbrHeure;
    }
    
    
}
