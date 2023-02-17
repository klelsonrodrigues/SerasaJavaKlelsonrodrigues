/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author Klelson_Krieger
 */
public class exercicio05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("digite o numero que deseja a taboada  ");
        int valor = scan.nextInt();
        double resultado;
        for (int i = 0; i <= 10; i++) {
            resultado = valor*i;
            System.out.println("a multiplicacao de "+valor+ " por " +i+" é igual a" +resultado );
        }
    }
    
}
