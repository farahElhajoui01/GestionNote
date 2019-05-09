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
public class CategorieStage {
    private Long idCategorieStage;
    private String libelle;
    private Double pourcentage;

    public Long getIdCategorieStage() {
        return idCategorieStage;
    }

    public void setIdCategorieStage(Long idCategorieStage) {
        this.idCategorieStage = idCategorieStage;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public Double getPourcentage() {
        return pourcentage;
    }

    public void setPourcentage(Double pourcentage) {
        this.pourcentage = pourcentage;
    }

    public CategorieStage() {
    }

    public CategorieStage(Long idCategorieStage) {
        this.idCategorieStage = idCategorieStage;
    }

    public CategorieStage(Long idCategorieStage, String libelle, Double pourcentage) {
        this.idCategorieStage = idCategorieStage;
        this.libelle = libelle;
        this.pourcentage = pourcentage;
    }
    
}
