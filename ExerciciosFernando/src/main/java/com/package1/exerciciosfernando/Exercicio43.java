/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.package1.exerciciosfernando;

import java.util.Scanner;
import java.lang.Math;

/**
 *
 * @author okmen
 */
public class Exercicio43 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        double num, logaritmo;
        System.out.println("\nenntre com logaritmo");
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        logaritmo = Math.log(num / Math.log(10));
        System.out.println("\nlogaritmo: " + logaritmo);
        System.out.println("\n");
    }
}

