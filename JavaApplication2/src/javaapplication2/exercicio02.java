/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);
        System.out.println("digite quantidade de pontos do líder do campeonato brasileiro de futebol  ");
        double pontosLider = scan.nextDouble();
        System.out.println("digite à quantidade de pontos do time lanterna ");
        double pontosLanterna = scan.nextDouble();
        double pontos;
        pontos=(pontosLider-pontosLanterna)/3;
        
        System.out.println("Quantidade de vitoria necessaria é : "+pontos);
    }
    
}
