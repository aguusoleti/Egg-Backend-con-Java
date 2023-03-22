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
public class Ejercicio_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero entero");
        int num1 = leer.nextInt();
        System.out.println("Ingrese un otro numero entero");
        int num2 = leer.nextInt();
        int resultado = 0;

        boolean ejecutar = true;

        do {
            System.out.println("MENU");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            int menu = leer.nextInt();
            switch (menu) {
                case 1:
                    resultado = num1 + num2;
                    System.out.println(resultado);
                    break;
                case 2:
                    resultado = num1 - num2;
                    System.out.println(resultado);
                    break;
                case 3:
                    resultado = num1 * num2;
                    System.out.println(resultado);
                    break;
                case 4:
                    resultado = num1 / num2;
                    System.out.println(resultado);
                    break;
                case 5:
                    System.out.println("¿Esta seguro que desea salir del programa (S/N)");
                    String confirmacion = leer.nextLine();
                    if ("S".equals(confirmacion.toUpperCase())) {
                        break;
                    }
                    break;
            }
        } while (ejecutar);

    }
}
