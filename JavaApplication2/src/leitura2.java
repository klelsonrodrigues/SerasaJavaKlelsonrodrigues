
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Klelson_Krieger
 */
public class leitura2 {
    public static void main(String[] args) {
        int idade;
        String aux = JOptionPane.showInputDialog("insira a idade");
        
        idade = Integer.parseInt(aux);

        JOptionPane.showMessageDialog(null, "Idade digitada: " + idade);
    }
}
