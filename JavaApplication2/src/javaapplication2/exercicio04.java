/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

import javax.swing.JOptionPane;

/**
 *
 * @author Klelson_Krieger
 */
public class exercicio04 {
    public static void main(String[] args) {
         String nomeProduto = JOptionPane.showInputDialog("digite o nome do produto ");
         String valor = JOptionPane.showInputDialog(" digite o valor do produto: ");
         Double valorProduto = Double.valueOf(valor);
                 double desconto;    
                 if(valorProduto>=50 && valorProduto<200 ){
                  JOptionPane.showMessageDialog(null, "nome do produto: " + nomeProduto);
                   JOptionPane.showMessageDialog(null, "valor original do produto : " + valorProduto);
                   desconto= valorProduto-((valorProduto*5)/100);
                   JOptionPane.showMessageDialog(null, "valor original do produto : " + desconto);
                 }
                 if(valorProduto>=200 && valorProduto<200 ){
                   JOptionPane.showMessageDialog(null, "nome do produto: " + nomeProduto);
                   JOptionPane.showMessageDialog(null, "valor original do produto : " + valorProduto);
                   desconto= valorProduto-((valorProduto*6)/100);
                   JOptionPane.showMessageDialog(null, "valor original do produto : " + desconto);
                 }
                 if(valorProduto>=500 && valorProduto<1000 ){
                   JOptionPane.showMessageDialog(null, "nome do produto: " + nomeProduto);
                   JOptionPane.showMessageDialog(null, "valor original do produto : " + valorProduto);
                   desconto= valorProduto-((valorProduto*7)/100);
                   JOptionPane.showMessageDialog(null, "valor original do produto : " + desconto);
                 }
                 if( valorProduto<1000 ){
                   JOptionPane.showMessageDialog(null, "nome do produto: " + nomeProduto);
                   JOptionPane.showMessageDialog(null, "valor original do produto : " + valorProduto);
                   desconto= valorProduto-((valorProduto*8)/100);
                   JOptionPane.showMessageDialog(null, "valor original do produto : " + desconto);
                 }
                 
                 
                 }
}
