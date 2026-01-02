package array_sin_funciones;

/**
 * Ejercicio 2: Dado un array de números reales, escribe un programa que imprima el primer 
 * número mayor que 8, si no existe se ha de imprimir "no hay".
 * VERSION SIN FUNCIONES - TODO EN MAIN
 */
public class Ejercicio02 {
    
    public static void main(String[] args) {
        // 1. Declaramos y creamos el array con los números
        double[] numeros = {3.5, 7.2, 1.8, 9.4, 5.6, 2.1};
        
        // 2. Variable para saber si encontramos el número
        boolean encontrado = false;
        
        // 3. Recorremos el array desde el inicio
        for (int i = 0; i < numeros.length; i++) {
            // 4. Si encontramos un número mayor que 8
            if (numeros[i] > 8) {
                // 5. Lo imprimimos
                System.out.println("El primer número mayor que 8 es: " + numeros[i]);
                encontrado = true;
                // 6. Salimos del bucle porque ya encontramos el primero
                break;
            }
        }
        
        // 7. Si no encontramos ninguno, imprimimos "no hay"
        if (!encontrado) {
            System.out.println("no hay");
        }
    }
}
