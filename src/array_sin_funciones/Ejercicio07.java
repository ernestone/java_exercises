package array_sin_funciones;

import java.util.Scanner;

/**
 * Ejercicio 7: Dado un array de 7 posiciones de enteros, escribe un programa que permita 
 * al usuario rellenarlo introduciendo valores uno a uno por scanner, solo valores pares. 
 * Si el número es impar el usuario tiene que introducir otro número que sea válido.
 * VERSION SIN FUNCIONES - TODO EN MAIN
 */
public class Ejercicio07 {
    
    public static void main(String[] args) {
        // 1. Creamos el Scanner para leer datos del teclado
        Scanner scanner = new Scanner(System.in);
        
        // 2. Creamos un array vacío de 7 posiciones
        int[] numeros = new int[7];
        
        // 3. Mostramos mensaje al usuario
        System.out.println("Introduce 7 números enteros PARES:");
        
        // 4. Recorremos el array posición por posición
        for (int i = 0; i < numeros.length; i++) {
            // 5. Variable para controlar si el número es válido
            boolean valorValido = false;
            
            // 6. Repetimos hasta que el usuario introduzca un número par
            while (!valorValido) {
                // 7. Pedimos un número al usuario
                System.out.print("Número " + (i + 1) + " (debe ser par): ");
                int numero = scanner.nextInt();
                
                // 8. Comprobamos si el número es par (resto de dividir entre 2 es 0)
                if (numero % 2 == 0) {
                    // 9. Si es par, lo guardamos y marcamos como válido
                    numeros[i] = numero;
                    valorValido = true;
                } else {
                    // 10. Si es impar, mostramos error y pedimos otro
                    System.out.println("Error: El número debe ser par. Intenta de nuevo.");
                }
            }
        }
        
        // 11. Mostramos todos los números introducidos
        System.out.println("\nArray completo:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Posición " + i + ": " + numeros[i]);
        }
        
        // 12. Cerramos el scanner
        scanner.close();
    }
}
