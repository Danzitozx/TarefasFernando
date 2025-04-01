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
public class Exercicio41 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        double a, b, c, d, mp;
        System.out.println("\nentre com 1 numero: ");
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        System.out.println("\nentre com 2 numero: ");
        b = input.nextInt();
        System.out.println("\nentre com 3 numero: ");
        c = input.nextInt();
        System.out.println("\nentre com 4 numero: ");
        d = input.nextInt();
        mp = (a*1 + b*2 + c*3 + d*4) / 10;
        System.out.println("\nmedia ponderada: " + mp);
        System.out.println("\n");
    }
}


