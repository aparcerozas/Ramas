/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin6_1;

import java.util.Scanner;

/**
 *
 * @author aparcerozas
 * 
 */
public class Boletin6_1 {

    /**
     * @param args the command line arguments
     * 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca un número:");
        double num = teclado.nextDouble();
        if(num > 0){
            System.out.println(num + " es un número positivo");
        }
        else if(num < 0){
            System.out.println(num + " es un número negativo");
        }
    }
    
}
