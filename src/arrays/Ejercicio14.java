package arrays;

import java.util.Scanner;

/**
 * Ejercicio 14: Permite al usuario introducir 10 enteros, uno a uno, pero no aceptes valores repetidos. 
 * Si el usuario escribe un número ya existente en el array, pides otro hasta que dé uno distinto.
 */
public class Ejercicio14 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int posicion = 0;
        
        System.out.println("Introduce 10 números enteros únicos (sin repetir):");
        
        while (posicion < numeros.length) {
            System.out.print("Número " + (posicion + 1) + ": ");
            int numero = scanner.nextInt();
            
            if (yaExiste(numeros, posicion, numero)) {
                System.out.println("Error: El número " + numero + " ya existe. Introduce otro número.");
            } else {
                numeros[posicion] = numero;
                posicion++;
            }
        }
        
        System.out.println("\nArray completo (sin repetidos):");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Posición " + i + ": " + numeros[i]);
        }
        
        scanner.close();
    }
    
    /**
     * Verifica si un número ya existe en el array hasta la posición indicada
     */
    public static boolean yaExiste(int[] array, int hasta, int numero) {
        for (int i = 0; i < hasta; i++) {
            if (array[i] == numero) {
                return true;
            }
        }
        return false;
    }
}
