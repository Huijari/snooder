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
    private Long cod_mensagem;
    private Timestamp dat_mensagem;
    private String des_conteudo;
    //*cod_usuario;
    //*cod_assunto

    public Long getCod_mensagem() {
        return cod_mensagem;
    }

    public void setCod_mensagem(Long cod_mensagem) {
        this.cod_mensagem = cod_mensagem;
    }

    public Timestamp getDat_mensagem() {
        return dat_mensagem;
    }

    public void setDat_mensagem(Timestamp dat_mensagem) {
        this.dat_mensagem = dat_mensagem;
    }

    public String getDes_conteudo() {
        return des_conteudo;
    }

    public void setDes_conteudo(String des_conteudo) {
        this.des_conteudo = des_conteudo;
    }
    
    
}
