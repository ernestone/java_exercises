package arrays;

/**
 * Ejercicio 3: Dado un array de números reales, escribe un programa que imprima 
 * LA POSICIÓN (ÍNDICE) del número mayor.
 */
public class Ejercicio03 {
    
    public static void main(String[] args) {
        double[] numeros = {3.5, 7.2, 1.8, 9.4, 5.6, 2.1};
        
        int posicionMayor = encontrarPosicionMayor(numeros);
        System.out.println("La posición del número mayor es: " + posicionMayor);
        System.out.println("El número mayor es: " + numeros[posicionMayor]);
    }
    
    public static int encontrarPosicionMayor(double[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("El array no puede estar vacío");
        }
        
        int posicionMayor = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[posicionMayor]) {
                posicionMayor = i;
            }
        }
        return posicionMayor;
    }
}
