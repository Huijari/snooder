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
    private Long id;
    private Cargo_Funcionario id_cargo;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    public void setCargo (Cargo_Funcionario cargo){
       
    }
}
