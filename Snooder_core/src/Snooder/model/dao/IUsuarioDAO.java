/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Snooder.model.dao;

import Snooder.model.domain.Usuario;
import java.util.ArrayList;
import util.db.exception.PersistenciaException;

/**
 *
 * @author pernambucanas
 */
public interface IUsuarioDAO {
    Long inserir(Usuario usuario) throws PersistenciaException;
    boolean atualizar(Usuario usuario) throws PersistenciaException;
    boolean deletar(Usuario usuario) throws PersistenciaException;
    ArrayList<Usuario> listarTodos() throws PersistenciaException;
    Usuario consultarPorId(Long id) throws PersistenciaException;
    Usuario consultarPorEmailSenha(String nome, String senha) throws PersistenciaException;
}
