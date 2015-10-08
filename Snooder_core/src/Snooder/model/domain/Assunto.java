/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Snooder.model.domain;

/**
 *
 * @author pernambucanas
 */
public class Assunto {
    private Long cod_assunto;
    private String nom_assunto;

    public Long getCod_assunto() {
        return cod_assunto;
    }

    public void setCod_assunto(Long cod_assunto) {
        this.cod_assunto = cod_assunto;
    }

    public String getNom_assunto() {
        return nom_assunto;
    }

    public void setNom_assunto(String nom_assunto) {
        this.nom_assunto = nom_assunto;
    }
    
    
    
}
