/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.package1.exerciciosfernando;
import java.util.Scanner;
import java.math.BigInteger;
/**
 *
 * @author okmen
 */
public class Exercicio42 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        
        double angulo, rang;
        System.out.println("\ndigite um angulo emm graus: ");
        Scanner input = new Scanner(System.in);
        angulo = input.nextInt();
        rang = angulo*Math.PI / 180;
        System.out.println("\nseno: " + Math.sin(rang));
        System.out.println("\nco-seno: " + Math.cos(rang));
        System.out.println("\ntangente: " + Math.tan(rang));
        System.out.println("\nco-secante: " + 1/ Math.sin(rang));
        System.out.println("\nsecante: " + 1/ Math.cos(rang));
        System.out.println("\ncotangente: " + 1 / Math.tan(rang));
        System.out.println("\n");
        
        
    }
}


