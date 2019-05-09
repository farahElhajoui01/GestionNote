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
public class Redoublement {
    private Matiere matiere;
    private Etudiant etudiant;
    private String remarque;
    private Double nouvelleNote;

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

    public String getRemarque() {
        return remarque;
    }

    public void setRemarque(String remarque) {
        this.remarque = remarque;
    }

    public Double getNouvelleNote() {
        return nouvelleNote;
    }

    public void setNouvelleNote(Double nouvelleNote) {
        this.nouvelleNote = nouvelleNote;
    }

    public Redoublement() {
    }

    public Redoublement(Matiere matiere) {
        this.matiere = matiere;
    }

    public Redoublement(String remarque, Double nouvelleNote) {
        this.remarque = remarque;
        this.nouvelleNote = nouvelleNote;
    }
    
    
}
