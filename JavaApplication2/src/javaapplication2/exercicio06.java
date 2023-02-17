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
public class exercicio06 {
    public static void main(String[] args) {
        for (int i = 3; i > 0; ) {
            String login = JOptionPane.showInputDialog("insira o login");
            String senha = JOptionPane.showInputDialog("insira a senha");
            if(("java8".equals(login))  && ("java8".equals(senha))){
                JOptionPane.showMessageDialog(null, "login e senha correto"); 
            break;            
            }
            if((login != "java8") || (senha != "java8")){
                i--;
                JOptionPane.showMessageDialog(null, "falha, verifique login e senha \n voce tem mais "+i+" tentativas" );
            }
        }
       
    }
    
}
