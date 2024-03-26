package org.example;

import org.example.DAO.UsuarioDAO;
import org.example.entity.Usuario;

public class App {
    public static void main(String[] args)  {

        Usuario u = new Usuario();
        u.setNome("Pedro");
        u.setIdade(24);

        new UsuarioDAO().cadastrarUsuario(u);
    }
}