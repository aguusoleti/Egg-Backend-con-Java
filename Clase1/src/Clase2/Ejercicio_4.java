/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una cadena");
        String cadena = leer.nextLine();
        if (cadena.substring(0, 1).toUpperCase().equals("A")) {
            if (cadena.substring(0, 1).equals("A")) {
                System.out.println("La frase comienza con A");
            } else {
                System.out.println("La frase comienza con A pero no es mayuscula");
            }
        } else {
            System.out.println("La frase no comienza con A, comienza con : "+  cadena.substring(0, 1) );
        }
    }

}
