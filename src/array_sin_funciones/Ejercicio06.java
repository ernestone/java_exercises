package array_sin_funciones;

import java.util.Scanner;

/**
 * Ejercicio 6: Dado un array de 7 posiciones de enteros, escribe un programa que permita 
 * al usuario rellenarlo introduciendo valores uno a uno por scanner, cualquier valor.
 * VERSION SIN FUNCIONES - TODO EN MAIN
 */
public class Ejercicio06 {
    
    public static void main(String[] args) {
        // 1. Creamos el Scanner para leer datos del teclado
        Scanner scanner = new Scanner(System.in);
        
        // 2. Creamos un array vacío de 7 posiciones
        int[] numeros = new int[7];
        
        // 3. Mostramos mensaje al usuario
        System.out.println("Introduce 7 números enteros:");
        
        // 4. Recorremos el array posición por posición
        for (int i = 0; i < numeros.length; i++) {
            // 5. Pedimos un número al usuario
            System.out.print("Número " + (i + 1) + ": ");
            // 6. Leemos el número y lo guardamos en la posición i
            numeros[i] = scanner.nextInt();
        }
        
        // 7. Mostramos todos los números introducidos
        System.out.println("\nArray completo:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Posición " + i + ": " + numeros[i]);
        }
        
        // 8. Cerramos el scanner
        scanner.close();
    }
}
