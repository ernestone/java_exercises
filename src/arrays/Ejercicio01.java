package arrays;

/**
 * Ejercicio 1: Dado un array de números reales, escribe un programa que imprima el número mayor.
 */
public class Ejercicio01 {
    
    public static void main(String[] args) {
        double[] numeros = {3.5, 7.2, 1.8, 9.4, 5.6, 2.1};
        
        double mayor = encontrarMayor(numeros);
        System.out.println("El número mayor es: " + mayor);
    }
    
    public static double encontrarMayor(double[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("El array no puede estar vacío");
        }
        
        double mayor = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > mayor) {
                mayor = array[i];
            }
        }
        return mayor;
    }
}
