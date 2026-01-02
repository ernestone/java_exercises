package array_sin_funciones;

/**
 * Ejercicio 5: Dado un array de booleanos, escribe un programa que calcule e imprima 
 * el sumatorio de "true" y el sumatorio de "false"
 * VERSION SIN FUNCIONES - TODO EN MAIN
 */
public class Ejercicio05 {
    
    public static void main(String[] args) {
        // 1. Declaramos y creamos el array con valores booleanos
        boolean[] valores = {true, false, true, true, false, true, false, false, true};
        
        // 2. Creamos dos contadores, uno para true y otro para false
        int contadorTrue = 0;
        int contadorFalse = 0;
        
        // 3. Recorremos todo el array
        for (int i = 0; i < valores.length; i++) {
            // 4. Si el valor es true, sumamos 1 al contador de true
            if (valores[i]) {
                contadorTrue++;
            } else {
                // 5. Si el valor es false, sumamos 1 al contador de false
                contadorFalse++;
            }
        }
        
        // 6. Imprimimos los resultados
        System.out.println("Sumatorio de true: " + contadorTrue);
        System.out.println("Sumatorio de false: " + contadorFalse);
    }
}
