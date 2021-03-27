
package br.com.mca.util;

import javax.swing.JOptionPane;


public class TesteJOptionP {
    public static void main(String[] args){
       /*
        String nome = JOptionPane.showInputDialog("Digite o nome: ");
        String sobrenome = JOptionPane.showInputDialog("Digite o sobrenome:");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
        
        
        
        String nomeCompleto = nome + " " + sobrenome;
        
        JOptionPane.showMessageDialog(null, "Nome completo: " + nomeCompleto + "\nIdade: " + idade + " anos", 
                              "Informação", JOptionPane.INFORMATION_MESSAGE);
                              
        */
       
       ConnectionFactory.getConexao();
    }
} 
