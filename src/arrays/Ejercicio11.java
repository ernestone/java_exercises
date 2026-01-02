package arrays;

/**
 * Ejercicio 11: Dado un array de enteros, escribe un programa que determine:
 * - Si el array está estrictamente creciente
 * - Si está estrictamente decreciente
 * - Si no está ordenado
 */
public class Ejercicio11 {
    
    public static void main(String[] args) {
        int[] creciente = {1, 3, 5, 7, 9};
        int[] decreciente = {10, 8, 6, 4, 2};
        int[] desordenado = {3, 5, 2, 8, 1};
        
        System.out.println("Array 1:");
        analizarOrden(creciente);
        
        System.out.println("\nArray 2:");
        analizarOrden(decreciente);
        
        System.out.println("\nArray 3:");
        analizarOrden(desordenado);
    }
    
    public static void analizarOrden(int[] array) {
        if (array.length <= 1) {
            System.out.println("El array es demasiado pequeño para determinar el orden");
            return;
        }
        
        boolean esCreciente = true;
        boolean esDecreciente = true;
        
        for (int i = 1; i < array.length; i++) {
            if (array[i] <= array[i - 1]) {
                esCreciente = false;
            }
            if (array[i] >= array[i - 1]) {
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
