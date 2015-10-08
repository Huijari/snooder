/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Snooder.model.dao;

import Snooder.model.domain.Objeto;
import java.util.ArrayList;
import util.db.exception.PersistenciaException;

/**
 *
 * @author pernambucanas
 */
public interface IObjetoDAO {
    Long inserir(Objeto objeto) throws PersistenciaException;
    boolean atualizar(Objeto objeto) throws PersistenciaException;
    boolean delete(Objeto objeto) throws PersistenciaException;
    ArrayList<Objeto> listarTodos() throws PersistenciaException;
    Objeto consultarPorId(Long id) throws PersistenciaException;
}
