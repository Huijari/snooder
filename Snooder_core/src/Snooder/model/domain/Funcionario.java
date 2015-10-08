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
public class Funcionario {
    private Long cod_usuario;
    private Cargo_Funcionario cod_cargo;
    
    public Long getCod_usuario() {
        return cod_usuario;
    }

    public void setCod_usuario(Long cod_usuario) {
        this.cod_usuario = cod_usuario;
    }
    
    public void setCargo (Cargo_Funcionario cargo){
       
    }
}
