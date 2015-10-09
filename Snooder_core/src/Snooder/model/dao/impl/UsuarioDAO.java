/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Snooder.model.dao.impl;

import Snooder.model.dao.IUsuarioDAO;
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
public class UsuarioDAO implements IUsuarioDAO{

    @Override
    public Long inserir(Usuario usuario) throws PersistenciaException {
        try {
            Connection connection = ConnectionManager.getInstance().getConnection();

            String sql = "INSERT INTO usuario (nom_usuario, cod_senha, des_email, num_telefone) VALUES(?,md5(?),?,?) RETURNING id";

            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, usuario.getNome());
            statement.setString(2, usuario.getSenha());
            statement.setString(3, usuario.getEmail());
            statement.setInt(4, usuario.getTelefone());
            
            ResultSet result = statement.executeQuery();

            Long id = null;
            if (result.next()) {
                id = new Long(result.getLong("cod_usuario"));
                usuario.setId(id);
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
    public boolean atualizar(Usuario usuario) throws PersistenciaException {
        try {

            Connection connection = ConnectionManager.getInstance().getConnection();

            String sql = "UPDATE usuario "
                    + "   SET nome = ?, "
                    + "       senha = md5(?), "
                    + "       email = ? "
                    + "       telefone = ? "
                    + " WHERE id = ?;";

            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, usuario.getNome());
            statement.setString(2, usuario.getSenha());
            statement.setString(3, usuario.getEmail());
            statement.setInt(4, usuario.getTelefone());
            
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
    public boolean deletar(Usuario usuario) throws PersistenciaException {
        try {
            Connection connection = ConnectionManager.getInstance().getConnection();

            String sql = "DELETE FROM usuario WHERE id = ?";

            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setLong(1, usuario.getId());
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
    public ArrayList<Usuario> listarTodos() throws PersistenciaException {
        try {
            Connection connection = ConnectionManager.getInstance().getConnection();

            String sql = "SELECT * FROM usuario ORDER BY nome";

            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet result = statement.executeQuery();

            ArrayList<Usuario> listAll = null;
            if (result.next()) {
                listAll = new ArrayList<>();
                do {
                    Usuario usuario = new Usuario();
                    usuario.setId(result.getLong("id"));
                    usuario.setNome(result.getString("nome"));
                    usuario.setTelefone(result.getInt("telefone"));
                    usuario.setSenha(result.getString("senha"));
                    usuario.setEmail(result.getString("email"));
                    
                    listAll.add(usuario);
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
    public Usuario consultarPorId(Long id) throws PersistenciaException {
        try {
            Connection connection = ConnectionManager.getInstance().getConnection();

            String sql = "SELECT * FROM usuario WHERE id = ?";

            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setLong(1, id);
            ResultSet result = statement.executeQuery();

            Usuario usuario = null;
            if (result.next()) {
                usuario = new Usuario();
                usuario.setId(result.getLong("id"));
                usuario.setNome(result.getString("nome"));
                usuario.setTelefone(result.getInt("telefone"));
                usuario.setSenha(result.getString("senha"));
                usuario.setEmail(result.getString("email"));
            }

            result.close();
            statement.close();
            connection.close();

            return usuario;
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistenciaException(e.getMessage(), e);
        }
    }

    @Override
    public Usuario consultarPorEmailSenha(String nome, String senha) throws PersistenciaException {
        try {
            Connection connection = ConnectionManager.getInstance().getConnection();

            String sql = "SELECT * FROM usuario WHERE email = ? AND senha = md5(?)";

            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(4, nome);
            statement.setString(3, senha);
            ResultSet result = statement.executeQuery();

            Usuario usuario = null;
            if (result.next()) {
                usuario = new Usuario();
                usuario.setId(result.getLong("id"));
                usuario.setNome(result.getString("nome"));
                usuario.setTelefone(result.getInt("telefone"));
                usuario.setSenha(result.getString("senha"));
                usuario.setEmail(result.getString("email"));
            }

            result.close();
            statement.close();
            connection.close();

            return usuario;
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistenciaException(e.getMessage(), e);
        }
    }
    
}
