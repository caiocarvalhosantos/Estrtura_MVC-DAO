/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arquivo_auxiliar_actionlistening;

import com.mycompany.exemplocrud.controller.AlunoController;
import java.awt.FlowLayout;
import javax.swing.*;

public class TelaAluno extends JFrame {

    private JTextField txtNome = new JTextField(15);
    private JTextField txtCurso = new JTextField(15);
    private JButton btnSalvar = new JButton("Salvar");
    private AlunoController controller = new AlunoController();

    public TelaAluno() {
        setTitle("Cadastro de Aluno - MVC");
        setSize(320, 180);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());

        add(new JLabel("Nome:"));
        add(txtNome);
        add(new JLabel("Curso:"));
        add(txtCurso);
        add(btnSalvar);

        btnSalvar.addActionListener(e -> {
            String resposta = controller.salvarAluno(txtNome.getText(), txtCurso.getText());
            JOptionPane.showMessageDialog(this, resposta);
        });
    }

    public static void main(String[] args) {
        new TelaAluno().setVisible(true);
    }
}
