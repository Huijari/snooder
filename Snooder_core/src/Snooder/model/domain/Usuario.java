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
public class Usuario {
    private Long cod_usuario;
    private String nom_usuario;
    private int num_telefone;
    private String des_email;
    private String cod_senha;

    public Long getCod_usuario() {
        return cod_usuario;
    }

    public void setCod_usuario(Long cod_usuario) {
        this.cod_usuario = cod_usuario;
    }

    public String getNom_usuario() {
        return nom_usuario;
    }

    public void setNom_usuario(String nom_usuario) {
        this.nom_usuario = nom_usuario;
    }

    public int getNum_telefone() {
        return num_telefone;
    }

    public void setNum_telefone(int num_telefone) {
        this.num_telefone = num_telefone;
    }

    public String getDes_email() {
        return des_email;
    }

    public void setDes_email(String des_email) {
        this.des_email = des_email;
    }

    public String getCod_senha() {
        return cod_senha;
    }

    public void setCod_senha(String cod_senha) {
        this.cod_senha = cod_senha;
    }
}
