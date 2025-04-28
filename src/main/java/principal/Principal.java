/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

import javax.swing.JOptionPane;
import model.Aluno;
import model.Professor;

/**
 *
 * @author Lorenzo
 */
public class Principal {

    public static void main(String[] args) {
        Professor professor = new Professor();
        Aluno aluno = new Aluno();

        aluno.leitura();
        aluno.imprimir();
        JOptionPane.showMessageDialog(null, "Nome formatado do Aluno: " + aluno.getNomeFormatado());

        professor.leitura();
        professor.imprimir();
        JOptionPane.showMessageDialog(null, "Nome formatado do Professor: " + professor.getNomeFormatado());
    }
}
