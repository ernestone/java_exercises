package arrays;

/**
 * Ejercicio 9: Dado un array de reales, sobreescribe los valores del array por el acumulado 
 * de los anteriores, hasta llegar a un acumulado mayor que 10. En el momento en el que el valor 
 * de la posición anterior se ha sobreescrito con un acumulado mayor que 10 se conservan los 
 * valores originales sin modificar.
 * 
 * Si el array era: [1, 5, 2, 14, 6, 15]
 * Después del proceso debe quedar: [1, 6, 8, 22, 6, 15]
 */
public class Ejercicio09 {
    
    public static void main(String[] args) {
        double[] numeros = {1, 5, 2, 14, 6, 15};
        
        System.out.println("Array original:");
        imprimirArray(numeros);
        
        procesarAcumulado(numeros);
        
        System.out.println("\nArray después del proceso:");
        imprimirArray(numeros);
    }
    
    public static void procesarAcumulado(double[] array) {
        if (array.length == 0) return;
        
        double acumulado = array[0];
        
        for (int i = 1; i < array.length; i++) {
            if (acumulado <= 10) {
                acumulado += array[i];
                array[i] = acumulado;
            } else {
                // Una vez que el acumulado supera 10, se detiene la modificación
                break;
            }
        }
    }
    
    public static void imprimirArray(double[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
