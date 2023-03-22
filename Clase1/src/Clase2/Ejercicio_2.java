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
public class Ejercicio_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una cadena");
        String cadena = leer.nextLine(); 
        
        if(cadena.equals("eureka")){
            System.out.println("Las cadenas son iguales");
        }else{
            System.out.println("Las cadenas son distintas");
        }
    }

}
