package array_sin_funciones;

/**
 * Ejercicio 11: Dado un array de enteros, escribe un programa que determine:
 * - Si el array está estrictamente creciente
 * - Si está estrictamente decreciente
 * - Si no está ordenado
 * VERSION SIN FUNCIONES - TODO EN MAIN
 */
public class Ejercicio11 {
    
    public static void main(String[] args) {
        // 1. Declaramos tres arrays de ejemplo
        int[] creciente = {1, 3, 5, 7, 9};
        int[] decreciente = {10, 8, 6, 4, 2};
        int[] desordenado = {3, 5, 2, 8, 1};
        
        // ANALIZAR PRIMER ARRAY (creciente)
        System.out.println("Array 1:");
        
        // 2. Variables para saber si el array es creciente o decreciente
        boolean esCreciente = true;
        boolean esDecreciente = true;
        
        // 3. Recorremos el array comparando cada elemento con el anterior
        for (int i = 1; i < creciente.length; i++) {
            // 4. Si un número es menor o igual que el anterior, NO es creciente
            if (creciente[i] <= creciente[i - 1]) {
                esCreciente = false;
            }
            // 5. Si un número es mayor o igual que el anterior, NO es decreciente
            if (creciente[i] >= creciente[i - 1]) {
                esDecreciente = false;
            }
        }
        
        // 6. Mostramos el resultado según lo que encontramos
        if (esCreciente) {
            System.out.println("El array está estrictamente creciente");
        } else if (esDecreciente) {
            System.out.println("El array está estrictamente decreciente");
        } else {
            System.out.println("El array no está ordenado");
        }
        
        // ANALIZAR SEGUNDO ARRAY (decreciente)
        System.out.println("\nArray 2:");
        
        // Reiniciamos las variables
        esCreciente = true;
        esDecreciente = true;
        
        for (int i = 1; i < decreciente.length; i++) {
            if (decreciente[i] <= decreciente[i - 1]) {
                esCreciente = false;
            }
            if (decreciente[i] >= decreciente[i - 1]) {
                esDecreciente = false;
            }
        }
        
        if (esCreciente) {
            System.out.println("El array está estrictamente creciente");
        } else if (esDecreciente) {
            System.out.println("El array está estrictamente decreciente");
        } else {
            System.out.println("El array no está ordenado");
        }
        
        // ANALIZAR TERCER ARRAY (desordenado)
        System.out.println("\nArray 3:");
        
        // Reiniciamos las variables
        esCreciente = true;
        esDecreciente = true;
        
        for (int i = 1; i < desordenado.length; i++) {
            if (desordenado[i] <= desordenado[i - 1]) {
                esCreciente = false;
            }
            if (desordenado[i] >= desordenado[i - 1]) {
                esDecreciente = false;
            }
        }
        
        if (esCreciente) {
            System.out.println("El array está estrictamente creciente");
        } else if (esDecreciente) {
            System.out.println("El array está estrictamente decreciente");
        } else {
            System.out.println("El array no está ordenado");
        }
    }
}
