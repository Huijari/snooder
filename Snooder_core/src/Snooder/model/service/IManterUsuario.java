/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Snooder.model.service;

/**
 *
 * @author LucasCésar
 */
import util.db.exception.NegocioException;
import util.db.exception.PersistenciaException;
import java.util.List;
import Snooder.model.domain.Usuario;

public interface IManterUsuario {
    public Long cadastrar(Usuario usuario) throws PersistenciaException, NegocioException;
    public boolean alterar(Usuario usuario) throws PersistenciaException, NegocioException;
    public boolean excluir(Usuario usuario) throws PersistenciaException, NegocioException;
    public Usuario pesquisarPorId(Long id) throws PersistenciaException;
    public Usuario getUserLogin(String email, String senha) throws PersistenciaException, NegocioException;
    public List<Usuario> listarTodos() throws PersistenciaException;
}
