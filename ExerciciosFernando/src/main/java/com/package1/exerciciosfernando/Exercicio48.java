/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.package1.exerciciosfernando;

import java.util.Scanner;

/**
 *
 * @author okmen
 */
public class Exercicio48 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        double sm, qtdade, preco, vp, vd;
        System.out.println("\nentre com o salario minimo: ");
        Scanner input = new Scanner(System.in);
        sm = input.nextInt();
        System.out.println("\nentre com a quantidade em quilowatt: ");
        qtdade = input.nextInt();
        preco = sm / 700;
        vp = preco * qtdade;
        vd = vp * 0.9;
        System.out.println("\npreco do quilowatt: " + preco + "\n vlor a ser pago: " + vp + "\n valor com desconto: " + vd);
        System.out.println("\n");
    }
}



