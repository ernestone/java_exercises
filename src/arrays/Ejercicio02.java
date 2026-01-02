package arrays;

/**
 * Ejercicio 2: Dado un array de números reales, escribe un programa que imprima el primer 
 * número mayor que 8, si no existe se ha de imprimir "no hay".
 */
public class Ejercicio02 {
    
    public static void main(String[] args) {
        double[] numeros = {3.5, 7.2, 1.8, 9.4, 5.6, 2.1};
        
        encontrarPrimeroMayorQue8(numeros);
    }
    
    public static void encontrarPrimeroMayorQue8(double[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 8) {
                System.out.println("El primer número mayor que 8 es: " + array[i]);
                return;
            }
        }
        System.out.println("no hay");
    }
}
