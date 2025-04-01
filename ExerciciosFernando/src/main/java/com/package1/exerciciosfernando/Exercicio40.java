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
public class Exercicio40 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        int quoc, rest, val1, val2;
        System.out.println("\nentre com o dividendo: ");
        Scanner input = new Scanner(System.in);
        val1 = input.nextInt();
        System.out.println("\nentre com divisor: ");
        val2 = input.nextInt();
        quoc = val1 / val2;
        rest = val1 % val2;
        System.out.println("\n\n\n");
        System.out.println("\ndividendo : " + val1);
        System.out.println("\ndivisor   :" + val2);
        System.out.println("\nquociente : " + quoc);
        System.out.println("\nresto     : " + rest);
        System.out.println("n");
                
    }
}


