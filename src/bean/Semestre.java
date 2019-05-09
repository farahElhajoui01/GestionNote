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
public class Semestre {
     private Long idSemestre;
     private Long anneeUniversitaire;
     private String etat;

    public Long getIdSemestre() {
        return idSemestre;
    }

    public void setIdSemestre(Long idSemestre) {
        this.idSemestre = idSemestre;
    }

    public Long getAnneeUniversitaire() {
        return anneeUniversitaire;
    }

    public void setAnneeUniversitaire(Long anneeUniversitaire) {
        this.anneeUniversitaire = anneeUniversitaire;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public Semestre() {
    }

    public Semestre(Long idSemestre) {
        this.idSemestre = idSemestre;
    }

    public Semestre(Long idSemestre, Long anneeUniversitaire, String etat) {
        this.idSemestre = idSemestre;
        this.anneeUniversitaire = anneeUniversitaire;
        this.etat = etat;
    }
     
    
}
