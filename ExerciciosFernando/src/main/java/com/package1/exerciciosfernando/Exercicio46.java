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
public class Exercicio46 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        double saldo, nsaldo;
        System.out.println("\ndigite saldo: ");
        Scanner input = new Scanner(System.in);
        saldo = input.nextInt();
        nsaldo = saldo * 1.01;
        System.out.println("\nnovo saldo: " + nsaldo);
        System.out.println("\n");
        
                
    }
}

