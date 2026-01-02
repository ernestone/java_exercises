package arrays;

/**
 * Ejercicio 3: Dado un array de números reales, escribe un programa que imprima 
 * LA POSICIÓN (ÍNDICE) del número mayor.
 */
public class Ejercicio03_sin_funciones {
    
    public static void main(String[] args) {
        double[] numeros = {3.5, 7.2, 1.8, 9.4, 5.6, 2.1};
        
        int posicionMayor = 0;
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > numeros[posicionMayor]) {
                posicionMayor = i;
            }
        }

        System.out.println("La posición del número mayor es: " + posicionMayor);
        System.out.println("El número mayor es: " + numeros[posicionMayor]);
    }
}