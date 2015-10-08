/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Snooder.model.service;

import Snooder.model.domain.Funcionario;
import java.util.List;
import util.db.exception.NegocioException;
import util.db.exception.PersistenciaException;

/**
 *
 * @author pernambucanas
 */
public interface IManterFuncionario {
    public Long cadastrar(Funcionario funcionario) throws PersistenciaException, NegocioException;
    public boolean alterar(Funcionario funcionario) throws PersistenciaException, NegocioException;
    public boolean excluir(Funcionario funcionario) throws PersistenciaException, NegocioException;
    public Funcionario pesquisarPorId(Long id) throws PersistenciaException;
    public Funcionario getUserLogin(String email, String senha) throws PersistenciaException, NegocioException;
    public List<Funcionario> listarTodos() throws PersistenciaException;
}
