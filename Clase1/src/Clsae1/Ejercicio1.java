/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clsae1;

import java.util.Scanner; // Este es el importe de la clase Scanner

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in); // Creamos el Scanner
        //  EJERCICIO 1
        // System.out.println("Ingrese una cadena");
        // String cadena = leer.nextLine();  //Leer una cadena
        // System.out.println(cadena);
        // System.out.println("Ingrese un numero entero");
        // int numEnteroA = leer.nextInt(); // Leer un entero
        // System.out.println("Ingrese otro numero entero");
        // int numEnteroB = leer.nextInt(); // Leer un entero
        // System.out.println("La suma de los numeros enteros es:" + (numEnteroA+numEnteroB));

        //  EJERCICIO 2
        // System.out.println("Ingrese una cadena nueva");
        // String cadMay = leer.nextLine();  //Leer una cadena
        // String cadMay2 = cadMay.toUpperCase();
        // String cadMin = cadMay.toLowerCase();

        // System.out.println(cadMay2);
        // System.out.println(cadMin3);

        //  EJERCICO 3
        
        // double temp = leer.nextByte();
        // double conversor =  32 + (9 * temp / 5);
        // System.out.println(conversor);
        
        // EJERCICIO 4
        System.out.println("Ingrese un numero entero");
        int numero = leer.nextInt();
        double multiplicacion = numero*2;  
        System.out.println(numero + " x 2 = "+ multiplicacion);
        multiplicacion = numero*3;  
        System.out.println(numero + " x 3 = "+ multiplicacion);
        multiplicacion = Math.sqrt(numero);  
        System.out.println("la raiz cuadrada de " +numero + " =  "+ multiplicacion);

        

        
        //System.out.println("Ingrese un numero real");
        //double numReal = leer.nextDouble(); // Leer un real. Se pone con punto el numero
        //System.out.println("Ingrese un booleano");
        //boolean logico = leer.nextBoolean(); // Leer un lógico 
        // System.out.println("Numero Entero " + numEntero); // Se imprime el entero
        //System.out.println("Numero Real " + numReal); // Se imprime el real
        //System.out.println("Cadena " + cadena);
        //System.out.println("Logico " + logico);
    }

}
