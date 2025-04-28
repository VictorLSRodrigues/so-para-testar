/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import javax.swing.JOptionPane;

/**
 *
 * @author Lorenzo
 */
public class Aluno extends Pessoa {

    String curso;
    public static final String OPCAO = "Sistema de Informação";

    public Aluno() {
    }

    public Aluno(String curso, String nome, int idade) {
        super(nome, idade);
        this.curso = curso;
    }

    public String getCurso() {
        return OPCAO;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void rleitura() {
        setCurso(JOptionPane.showInputDialog("Qual o seu curso: "));
    }

    @Override
    public void imprimir() {
        JOptionPane.showMessageDialog(null, paraString());
    }

    @Override
    public String paraString() {
        return super.paraString() + "\nCurso: " + getCurso();
    }

    @Override
    public String getNomeFormatado() {
        return getNome().toUpperCase();
    }
}
