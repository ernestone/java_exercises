package array_sin_funciones;

/**
 * Ejercicio 3: Dado un array de números reales, escribe un programa que imprima 
 * LA POSICIÓN (ÍNDICE) del número mayor.
 * VERSION SIN FUNCIONES - TODO EN MAIN
 */
public class Ejercicio03 {
    
    public static void main(String[] args) {
        // 1. Declaramos y creamos el array con los números
        double[] numeros = {3.5, 7.2, 1.8, 9.4, 5.6, 2.1};
        
        // 2. Suponemos que el mayor está en la posición 0
        int posicionMayor = 0;
        
        // 3. Recorremos el array desde la posición 1 hasta el final
        for (int i = 1; i < numeros.length; i++) {
            // 4. Si encontramos un número mayor que el actual mayor
            if (numeros[i] > numeros[posicionMayor]) {
                // 5. Guardamos la nueva posición del mayor
                posicionMayor = i;
            }
        }
        
        // 6. Imprimimos la posición y el valor del mayor
        System.out.println("La posición del número mayor es: " + posicionMayor);
        System.out.println("El número mayor es: " + numeros[posicionMayor]);
    }
}
