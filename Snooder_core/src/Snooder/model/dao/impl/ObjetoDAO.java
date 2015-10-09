/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Snooder.model.dao.impl;

import Snooder.model.dao.IObjetoDAO;
import Snooder.model.domain.Categoria_Objeto;
import Snooder.model.domain.Localidade;
import Snooder.model.domain.Objeto;
import Snooder.model.domain.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import util.db.ConnectionManager;
import util.db.exception.PersistenciaException;

/**
 *
 * @author pernambucanas
 */
public class ObjetoDAO implements IObjetoDAO{

    @Override
    public Long inserir(Objeto objeto) throws PersistenciaException {
        try {
            Connection connection = ConnectionManager.getInstance().getConnection();

            String sql = "INSERT INTO objeto (nome, data_entrada, data_saida, descricao, status, usuario, usuarioentregue, catobj, localidade) VALUES(?,?,?,?,?,?,?,?,?) RETURNING id";
            
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, objeto.getNome());
            statement.setDate(2, objeto.getData_entrada());
            statement.setDate(3,objeto.getData_saida());
            statement.setString(4, objeto.getDescricao());
            statement.setString(5, objeto.getStatus());
            statement.setLong(6, objeto.getUsuario().getId());
            statement.setLong(7, objeto.getUsuarioentregue().getId());
            statement.setLong(8, objeto.getCatobj().getId());
            statement.setLong(9, objeto.getLocalidade().getId());
            
            ResultSet result = statement.executeQuery();

            Long id = null;
            if (result.next()) {
                id = new Long(result.getLong("id"));
                objeto.setId(id);
            }

            result.close();
            statement.close();
            connection.close();

            return id;
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistenciaException(e.getMessage(), e);
        }
    }

    @Override
    public boolean atualizar(Objeto objeto) throws PersistenciaException {
        try {

            Connection connection = ConnectionManager.getInstance().getConnection();

            String sql = "UPDATE objeto "
                    + "   SET nome = ?, "
                    + "       data_entrada = ?, "
                    + "       data_saida = ?, "
                    + "       descricao = ?, "
                    + "       status = ?, "
                    + "       usuario = ?, "
                    + "       usuarioentregue = ?, "
                    + "       catobj = ?, "
                    + "       localidade = ?, "
                    + " WHERE id = ?;";

            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, objeto.getNome());
            statement.setDate(2, objeto.getData_entrada());
            statement.setDate(3,objeto.getData_saida());
            statement.setString(4, objeto.getDescricao());
            statement.setString(5, objeto.getStatus());
            statement.setLong(6, objeto.getUsuario().getId());
            statement.setLong(7, objeto.getUsuarioentregue().getId());
            statement.setLong(8, objeto.getCatobj().getId());
            statement.setLong(9, objeto.getLocalidade().getId());
            
            statement.executeUpdate();
            statement.close();
            connection.close();

            return true;
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistenciaException(e.getMessage(), e);
        }
    }

    @Override
    public boolean delete(Objeto objeto) throws PersistenciaException {
        try {
            Connection connection = ConnectionManager.getInstance().getConnection();

            String sql = "DELETE FROM objeto WHERE id = ?";

            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setLong(1, objeto.getId());
            statement.executeUpdate();

            statement.close();
            connection.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistenciaException(e.getMessage(), e);
        }
    }

    @Override
    public ArrayList<Objeto> listarTodos() throws PersistenciaException {
        try {
            Connection connection = ConnectionManager.getInstance().getConnection();

            String sql = "SELECT * FROM objeto ORDER BY nome";

            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet result = statement.executeQuery();
            //nome, data_entrada, data_saida, descricao, status, usuario, usuarioentregue, catobj, localidade
            ArrayList<Objeto> listAll = null;
            if (result.next()) {
                listAll = new ArrayList<>();
                do {
                    Objeto objeto = new Objeto();
                    objeto.setId(result.getLong("id"));
                    objeto.setNome(result.getString("nome"));
                    objeto.setData_entrada(result.getDate("data_entrada"));
                    objeto.setData_saida(result.getDate("data_saida"));
                    objeto.setDescricao(result.getString("descricao"));
                    objeto.setStatus(result.getString("status"));
                    objeto.setUsuario((Usuario) result.getObject("usuario"));
                    objeto.setUsuarioentregue((Usuario)result.getObject("usuarioentregue"));
                    objeto.setCatobj((Categoria_Objeto)result.getObject("catobj"));
                    objeto.setLocalidade((Localidade)result.getObject("localidade"));
                    
                    
                    listAll.add(objeto);
                } while (result.next());
            }

            result.close();
            statement.close();
            connection.close();

            return listAll;
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistenciaException(e.getMessage(), e);
        }
    }

    @Override
    public Objeto consultarPorId(Long id) throws PersistenciaException {
        try {
            Connection connection = ConnectionManager.getInstance().getConnection();

            String sql = "SELECT * FROM objeto WHERE id = ?";

            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setLong(1, id);
            ResultSet result = statement.executeQuery();

            Objeto objeto = null;
            if (result.next()) {
                objeto = new Objeto();
                objeto.setId(result.getLong("id"));
                    objeto.setNome(result.getString("nome"));
                    objeto.setData_entrada(result.getDate("data_entrada"));
                    objeto.setData_saida(result.getDate("data_saida"));
                    objeto.setDescricao(result.getString("descricao"));
                    objeto.setStatus(result.getString("status"));
                    objeto.setUsuario((Usuario) result.getObject("usuario"));
                    objeto.setUsuarioentregue((Usuario)result.getObject("usuarioentregue"));
                    objeto.setCatobj((Categoria_Objeto)result.getObject("catobj"));
                    objeto.setLocalidade((Localidade)result.getObject("localidade"));
            }

            result.close();
            statement.close();
            connection.close();

            return objeto;
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistenciaException(e.getMessage(), e);
        }
    }
    
}
