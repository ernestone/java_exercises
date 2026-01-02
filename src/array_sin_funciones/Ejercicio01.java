package array_sin_funciones;

/**
 * Ejercicio 1: Dado un array de números reales, escribe un programa que imprima el número mayor.
 * VERSION SIN FUNCIONES - TODO EN MAIN
 */
public class Ejercicio01 {
    
    public static void main(String[] args) {
        // 1. Declaramos y creamos el array con los números
        double[] numeros = {3.5, 7.2, 1.8, 9.4, 5.6, 2.1};
        
        // 2. Suponemos que el primer número es el mayor
        double mayor = numeros[0];
        
        // 3. Recorremos el array desde la posición 1 hasta el final
        for (int i = 1; i < numeros.length; i++) {
            // 4. Si encontramos un número mayor, lo guardamos
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
        }
        
        // 5. Imprimimos el resultado
        System.out.println("El número mayor es: " + mayor);
    }
}
