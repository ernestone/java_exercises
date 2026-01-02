package array_sin_funciones;

import java.util.Scanner;

/**
 * Ejercicio 14: Permite al usuario introducir 10 enteros, uno a uno, pero no aceptes valores repetidos. 
 * Si el usuario escribe un número ya existente en el array, pides otro hasta que dé uno distinto.
 * VERSION SIN FUNCIONES - TODO EN MAIN
 */
public class Ejercicio14 {
    
    public static void main(String[] args) {
        // 1. Creamos el Scanner para leer datos del teclado
        Scanner scanner = new Scanner(System.in);
        
        // 2. Creamos un array vacío de 10 posiciones
        int[] numeros = new int[10];
        
        // 3. Variable para controlar cuántos números hemos guardado
        int posicion = 0;
        
        // 4. Mostramos mensaje al usuario
        System.out.println("Introduce 10 números enteros únicos (sin repetir):");
        
        // 5. Repetimos hasta llenar el array completo
        while (posicion < numeros.length) {
            // 6. Pedimos un número al usuario
            System.out.print("Número " + (posicion + 1) + ": ");
            int numero = scanner.nextInt();
            
            // 7. Verificamos si el número ya existe en el array
            boolean existe = false;
            for (int i = 0; i < posicion; i++) {
                if (numeros[i] == numero) {
                    existe = true;
                    break; // Salimos del for porque ya lo encontramos
                }
            }
            
            // 8. Si el número ya existe, mostramos error
            if (existe) {
                System.out.println("Error: El número " + numero + " ya existe. Introduce otro número.");
            } else {
                // 9. Si el número NO existe, lo guardamos
                numeros[posicion] = numero;
                posicion++; // Avanzamos a la siguiente posición
            }
        }
        
        // 10. Mostramos todos los números introducidos
        System.out.println("\nArray completo (sin repetidos):");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Posición " + i + ": " + numeros[i]);
        }
        
        // 11. Cerramos el scanner
        scanner.close();
    }
}
