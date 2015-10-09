/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Snooder.model.domain;

import java.sql.Date;
import java.sql.Timestamp;

/**
 *
 * @author pernambucanas
 */
public class Mensagem {
    private Long id;
    private Timestamp data;
    private String conteudo;
    //*cod_usuario;
    //*cod_assunto

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Timestamp getData() {
        return data;
    }

    public void setData(Timestamp data) {
        this.data = data;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }
    
    
}
