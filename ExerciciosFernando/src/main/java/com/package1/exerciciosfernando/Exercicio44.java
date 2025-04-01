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
public class Exercicio44 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        double num, base, logaritmo;
        System.out.println("\nentre com logaritmo: ");
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        System.out.println("\nentre com a base: ");
        base = input.nextInt();;
        logaritmo = Math.log(num) / Math.log(base);
        System.out.println("\no logaritmo de " + num + "na base: " + base + "e: " + logaritmo);
        System.out.println("\n");
    }
}
