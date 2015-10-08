/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Snooder.model.domain;

import java.sql.Date;

/**
 *
 * @author pernambucanas
 */
public class Objeto {
    //pfk cod_usuario
    private Long cod_objeto;
    private Date dat_entrada;
    private String des_objeto;
    private String idt_status;

    public Long getCod_objeto() {
        return cod_objeto;
    }

    public void setCod_objeto(Long cod_objeto) {
        this.cod_objeto = cod_objeto;
    }

    public Date getDat_entrada() {
        return dat_entrada;
    }

    public void setDat_entrada(Date dat_entrada) {
        this.dat_entrada = dat_entrada;
    }

    public String getDes_objeto() {
        return des_objeto;
    }

    public void setDes_objeto(String des_objeto) {
        this.des_objeto = des_objeto;
    }

    public String getIdt_status() {
        return idt_status;
    }

    public void setIdt_status(String idt_status) {
        this.idt_status = idt_status;
    }
    
    
    
}
