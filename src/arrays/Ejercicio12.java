package arrays;

/**
 * Ejercicio 12: Dado un array de enteros, escribe un programa que determine si un array es "zigzag". 
 * Un array se considera en forma de zigzag si sus elementos alternan entre mayor y menor, por ejemplo:
 * a[0] < a[1] > a[2] < a[3] > a[4] ... o
 * a[0] > a[1] < a[2] > a[3] ...
 */
public class Ejercicio12 {
    
    public static void main(String[] args) {
        int[] zigzag1 = {3, 7, 4, 9, 1, 8, 5}; // < > < > < >
        int[] zigzag2 = {9, 4, 7, 2, 8, 1}; // > < > < >
        int[] noZigzag = {1, 2, 3, 4, 5};
        
        System.out.println("Array 1:");
        verificarZigZag(zigzag1);
        
        System.out.println("\nArray 2:");
        verificarZigZag(zigzag2);
        
        System.out.println("\nArray 3:");
        verificarZigZag(noZigzag);
    }
    
    public static void verificarZigZag(int[] array) {
        if (array.length < 3) {
            System.out.println("El array es demasiado pequeño para ser zigzag");
            return;
        }
        
        boolean esZigZag = true;
        boolean primeraMenor = array[0] < array[1]; // Determina el patrón inicial
        
        for (int i = 0; i < array.length - 1; i++) {
            if (i % 2 == 0) {
                // Posiciones pares: debe seguir el patrón inicial
                if (primeraMenor) {
                    if (array[i] >= array[i + 1]) {
                        esZigZag = false;
                        break;
                    }
                } else {
                    if (array[i] <= array[i + 1]) {
                        esZigZag = false;
                        break;
                    }
                }
            } else {
                // Posiciones impares: debe ser el patrón contrario
                if (primeraMenor) {
                    if (array[i] <= array[i + 1]) {
                        esZigZag = false;
                        break;
                    }
                } else {
                    if (array[i] >= array[i + 1]) {
                        esZigZag = false;
                        break;
                    }
                }
            }
        }
        
        if (esZigZag) {
            System.out.println("El array es zigzag");
        } else {
            System.out.println("El array NO es zigzag");
        }
    }
}
