package array_sin_funciones;

/**
 * Ejercicio 12: Dado un array de enteros, escribe un programa que determine si un array es "zigzag". 
 * Un array se considera en forma de zigzag si sus elementos alternan entre mayor y menor, por ejemplo:
 * a[0] < a[1] > a[2] < a[3] > a[4] ... o
 * a[0] > a[1] < a[2] > a[3] ...
 * VERSION SIN FUNCIONES - TODO EN MAIN
 */
public class Ejercicio12 {
    
    public static void main(String[] args) {
        // 1. Declaramos tres arrays de ejemplo
        int[] zigzag1 = {3, 7, 4, 9, 1, 8, 5}; // < > < > < >
        int[] zigzag2 = {9, 4, 7, 2, 8, 1}; // > < > < >
        int[] noZigzag = {1, 2, 3, 4, 5};
        
        // ANALIZAR PRIMER ARRAY
        System.out.println("Array 1:");
        
        // 2. Variable para saber si es zigzag
        boolean esZigZag = true;
        
        // 3. Determinamos si empieza con menor < mayor o mayor > menor
        boolean primeraMenor = zigzag1[0] < zigzag1[1];
        
        // 4. Recorremos el array comparando elementos consecutivos
        for (int i = 0; i < zigzag1.length - 1; i++) {
            // 5. Si estamos en una posición par (0, 2, 4, ...)
            if (i % 2 == 0) {
                // 6. Debe seguir el patrón inicial
                if (primeraMenor) {
                    // Si empezó con <, debe ser <
                    if (zigzag1[i] >= zigzag1[i + 1]) {
                        esZigZag = false;
                        break;
                    }
                } else {
                    // Si empezó con >, debe ser >
                    if (zigzag1[i] <= zigzag1[i + 1]) {
                        esZigZag = false;
                        break;
                    }
                }
            } else {
                // 7. Si estamos en posición impar (1, 3, 5, ...), debe ser al revés
                if (primeraMenor) {
                    // Si empezó con <, ahora debe ser >
                    if (zigzag1[i] <= zigzag1[i + 1]) {
                        esZigZag = false;
                        break;
                    }
                } else {
                    // Si empezó con >, ahora debe ser <
                    if (zigzag1[i] >= zigzag1[i + 1]) {
                        esZigZag = false;
                        break;
                    }
                }
            }
        }
        
        // 8. Mostramos el resultado
        if (esZigZag) {
            System.out.println("El array es zigzag");
        } else {
            System.out.println("El array NO es zigzag");
        }
        
        // ANALIZAR SEGUNDO ARRAY
        System.out.println("\nArray 2:");
        
        esZigZag = true;
        primeraMenor = zigzag2[0] < zigzag2[1];
        
        for (int i = 0; i < zigzag2.length - 1; i++) {
            if (i % 2 == 0) {
                if (primeraMenor) {
                    if (zigzag2[i] >= zigzag2[i + 1]) {
                        esZigZag = false;
                        break;
                    }
                } else {
                    if (zigzag2[i] <= zigzag2[i + 1]) {
                        esZigZag = false;
                        break;
                    }
                }
            } else {
                if (primeraMenor) {
                    if (zigzag2[i] <= zigzag2[i + 1]) {
                        esZigZag = false;
                        break;
                    }
                } else {
                    if (zigzag2[i] >= zigzag2[i + 1]) {
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
        
        // ANALIZAR TERCER ARRAY
        System.out.println("\nArray 3:");
        
        esZigZag = true;
        primeraMenor = noZigzag[0] < noZigzag[1];
        
        for (int i = 0; i < noZigzag.length - 1; i++) {
            if (i % 2 == 0) {
                if (primeraMenor) {
                    if (noZigzag[i] >= noZigzag[i + 1]) {
                        esZigZag = false;
                        break;
                    }
                } else {
                    if (noZigzag[i] <= noZigzag[i + 1]) {
                        esZigZag = false;
                        break;
                    }
                }
            } else {
                if (primeraMenor) {
                    if (noZigzag[i] <= noZigzag[i + 1]) {
                        esZigZag = false;
                        break;
                    }
                } else {
                    if (noZigzag[i] >= noZigzag[i + 1]) {
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
