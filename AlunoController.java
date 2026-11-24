/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arquivo_auxiliar_actionlistening;
package com.mycompany.exemplocrud.controller;

import com.mycompany.exemplocrud.dao.AlunoDAO;
import com.mycompany.exemplocrud.model.Aluno;

public class AlunoController {

    private AlunoDAO dao = new AlunoDAO();

    public String salvarAluno(String nome, String curso) {
        if (nome == null || nome.trim().isEmpty() || curso == null || curso.trim().isEmpty()) {
            return "Preencha todos os campos.";
        }

        Aluno aluno = new Aluno(nome.trim(), curso.trim());
        boolean sucesso = dao.cadastrar(aluno);

        return sucesso ? "Aluno cadastrado com sucesso!" : "Erro ao salvar no banco.";
    }
}
