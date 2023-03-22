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
public class Ejercicio_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una cadena");
        String cadena = leer.nextLine(); 
        int largo=cadena.length();
        if(largo==8){
            System.out.println("La palabra/frase tiene longitud de 8");
        }else{
            System.out.println("La palabra/frase no tiene longitud de 8");
        }
    }

}
