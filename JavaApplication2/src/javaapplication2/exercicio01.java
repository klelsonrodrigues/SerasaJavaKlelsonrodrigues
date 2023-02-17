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
public class exercicio01 {
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
        System.out.println("digite o valor do produto  ");
        double produto = scan.nextDouble();
        System.out.println("digite a porcentagem ");
        int porcentagem = scan.nextInt();
        double desconto;
        desconto= produto* porcentagem/100;
     
        System.out.println("o valor do desconto "+desconto);
    }
}
