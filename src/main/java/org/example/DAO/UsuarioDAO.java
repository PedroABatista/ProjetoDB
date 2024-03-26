package org.example.DAO;

import org.example.conexao.Conexao;
import org.example.entity.Usuario;


import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UsuarioDAO {
    public void cadastrarUsuario(Usuario usuario) {

        String sql = "INSERT INTO USUARIO (NOME, IDADE) VALUES (?,?)";
        try {
            PreparedStatement ps = null;
            ps = Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, usuario.getNome());
            ps.setInt(2, usuario.getIdade());

            ps.execute();
            ps.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
