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
public class Promotion {
   private Long idPromotion;
   private Long annee;

    public Long getIdPromotion() {
        return idPromotion;
    }

    public void setIdPromotion(Long idPromotion) {
        this.idPromotion = idPromotion;
    }

    public Long getAnnee() {
        return annee;
    }

    public void setAnnee(Long annee) {
        this.annee = annee;
    }

    public Promotion() {
    }

    public Promotion(Long idPromotion) {
        this.idPromotion = idPromotion;
    }

    public Promotion(Long idPromotion, Long annee) {
        this.idPromotion = idPromotion;
        this.annee = annee;
    }
   
    
}
