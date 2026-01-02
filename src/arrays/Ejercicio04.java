package arrays;

/**
 * Ejercicio 4: Dado un array de números reales, escribe un programa que imprima 
 * LA POSICIÓN (ÍNDICE) del primer número mayor que 8, si no existe se ha de imprimir "no hay".
 */
public class Ejercicio04 {
    
    public static void main(String[] args) {
        double[] numeros = {3.5, 7.2, 1.8, 9.4, 5.6, 2.1};
        
        encontrarPosicionPrimeroMayorQue8(numeros);
    }
    
    public static void encontrarPosicionPrimeroMayorQue8(double[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 8) {
                System.out.println("La posición del primer número mayor que 8 es: " + i);
                System.out.println("El número es: " + array[i]);
                return;
            }
        }
        System.out.println("no hay");
    }
}
