package arrays;

import java.util.Scanner;

/**
 * Ejercicio 6: Dado un array de 7 posiciones de enteros, escribe un programa que permita 
 * al usuario rellenarlo introduciendo valores uno a uno por scanner, cualquier valor.
 */
public class Ejercicio06 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[7];
        
        System.out.println("Introduce 7 números enteros:");
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }
        
        System.out.println("\nArray completo:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Posición " + i + ": " + numeros[i]);
        }
        
        scanner.close();
    }
}
