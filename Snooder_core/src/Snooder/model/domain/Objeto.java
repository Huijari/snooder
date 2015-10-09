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
    
    //cod cat obj, cod_local, cod_usuarioentregue
    private Long id;
    private String nome;
    private Date data_entrada;
    private Date data_saida;
    private String descricao;
    private String status;
    
    private Usuario usuario;
    private Usuario usuarioentregue;
    private Categoria_Objeto catobj;
    private Localidade localidade;

    public Localidade getLocalidade() {
        return localidade;
    }

    public void setLocalidade(Localidade localidade) {
        this.localidade = localidade;
    }
    
    public Date getData_saida() {
        return data_saida;
    }

    public void setData_saida(Date data_saida) {
        this.data_saida = data_saida;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Usuario getUsuarioentregue() {
        return usuarioentregue;
    }

    public void setUsuarioentregue(Usuario usuarioentregue) {
        this.usuarioentregue = usuarioentregue;
    }

    public Categoria_Objeto getCatobj() {
        return catobj;
    }

    public void setCatobj(Categoria_Objeto catobj) {
        this.catobj = catobj;
    }
    
    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getData_entrada() {
        return data_entrada;
    }

    public void setData_entrada(Date data_entrada) {
        this.data_entrada = data_entrada;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
    
}
