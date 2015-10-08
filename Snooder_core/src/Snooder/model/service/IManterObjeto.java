/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Snooder.model.service;

import Snooder.model.domain.Objeto;
import java.util.List;
import util.db.exception.NegocioException;
import util.db.exception.PersistenciaException;

/**
 *
 * @author pernambucanas
 */
public interface IManterObjeto {
    public Long cadastrar(Objeto objeto) throws PersistenciaException, NegocioException;
    public boolean alterar(Objeto objeto) throws PersistenciaException, NegocioException;
    public boolean excluir(Objeto objeto) throws PersistenciaException, NegocioException;
    public Objeto pesquisarPorId(Long id) throws PersistenciaException;
    public List<Objeto> listarTodos() throws PersistenciaException;
}
