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
public class Exercicio25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        int data, dia, mes, ano;
        System.out.println("\nDigite data no formato ddmmaa: ");
        Scanner input = new Scanner(System.in);
        data = input.nextInt();
        dia = data / 10000;
        mes = data % 10000 / 100;
        ano = data % 100;
        System.out.println("\nDIA: " + dia);
        System.out.println("\nMES: " + mes);
        System.out.println("\nANO: " + ano);
        System.out.println("\n");
    }
}
