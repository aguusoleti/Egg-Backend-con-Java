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
public class Ejercicio_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero limite entero");
        int limite = leer.nextInt();
        double cont = 0, sum = 0;

        while (sum <= limite) {
            System.out.println("Ingrese un numero para acuular");
            int num = leer.nextInt();
            if (num <= limite && num <= limite-sum) {
                sum +=num;
                System.out.println(sum);
            }else{
                break;
            }
        }
        System.out.println("La suma total es de: "+ sum + " Y el numero limite era: " + limite);
    }

}
