/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Snooder.model.service.impl;

import Snooder.model.domain.Objeto;
import Snooder.model.service.IManterObjeto;
import java.util.List;
import util.db.exception.NegocioException;
import util.db.exception.PersistenciaException;

/**
 *
 * @author pernambucanas
 */
public class ManterObjeto implements IManterObjeto{

    @Override
    public Long cadastrar(Objeto objeto) throws PersistenciaException, NegocioException {
        
    }

    @Override
    public boolean alterar(Objeto objeto) throws PersistenciaException, NegocioException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean excluir(Objeto objeto) throws PersistenciaException, NegocioException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Objeto pesquisarPorId(Long id) throws PersistenciaException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Objeto> listarTodos() throws PersistenciaException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
