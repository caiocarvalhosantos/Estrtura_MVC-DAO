/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arquivo_auxiliar_actionlistening;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AlunoDAO_ {

    public boolean cadastrar(Aluno aluno) {
        String sql = "INSERT INTO aluno (nome, curso) VALUES (?, ?)";

        try (Connection conn = ConexaoMySQL.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, aluno.getNome());
            stmt.setString(2, aluno.getCurso());
            stmt.executeUpdate();
            return true;

        } catch (SQLException e) {
            System.out.println("Erro no DAO: " + e.getMessage());
            return false;
        }
    }
}
