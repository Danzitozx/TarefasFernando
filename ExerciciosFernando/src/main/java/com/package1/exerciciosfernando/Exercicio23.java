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
public class Exercicio23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        int a, d;
        System.out.println("\nDigite numero de tres casas: ");
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        d = a % 100 / 10;
        System.out.println("\nalgarismo da casa das dezenas: " + d);
        System.out.println("\n");
        
    }
}
