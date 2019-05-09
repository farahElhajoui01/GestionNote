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
public class Stage {
    private CategorieStage categorieStage;
    private Etudiant etudiant;
    private Date dateDebut;
    private Date dateFin;
    private Double note;
    private String etablissement;

    public CategorieStage getCategorieStage() {
        return categorieStage;
    }

    public void setCategorieStage(CategorieStage categorieStage) {
        this.categorieStage = categorieStage;
    }

    public Etudiant getEtudiant() {
        return etudiant;
    }

    public void setEtudiant(Etudiant etudiant) {
        this.etudiant = etudiant;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public Double getNote() {
        return note;
    }

    public void setNote(Double note) {
        this.note = note;
    }

    public String getEtablissement() {
        return etablissement;
    }

    public void setEtablissement(String etablissement) {
        this.etablissement = etablissement;
    }

    public Stage() {
    }

    public Stage(Date dateDebut, Date dateFin, Double note, String etablissement) {
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.note = note;
        this.etablissement = etablissement;
    }
    
}
