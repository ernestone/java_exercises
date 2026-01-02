package arrays;

import java.util.Scanner;

/**
 * Ejercicio 7: Dado un array de 7 posiciones de enteros, escribe un programa que permita 
 * al usuario rellenarlo introduciendo valores uno a uno por scanner, solo valores pares. 
 * Si el número es impar el usuario tiene que introducir otro número que sea válido.
 */
public class Ejercicio07 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[7];
        
        System.out.println("Introduce 7 números enteros PARES:");
        
        for (int i = 0; i < numeros.length; i++) {
            boolean valorValido = false;
            while (!valorValido) {
                System.out.print("Número " + (i + 1) + " (debe ser par): ");
                int numero = scanner.nextInt();
                
                if (numero % 2 == 0) {
                    numeros[i] = numero;
                    valorValido = true;
                } else {
                    System.out.println("Error: El número debe ser par. Intenta de nuevo.");
                }
            }
        }
        
        System.out.println("\nArray completo:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Posición " + i + ": " + numeros[i]);
        }
        
        scanner.close();
    }
}
