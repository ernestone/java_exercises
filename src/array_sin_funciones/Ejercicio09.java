package array_sin_funciones;

/**
 * Ejercicio 9: Dado un array de reales, sobreescribe los valores del array por el acumulado 
 * de los anteriores, hasta llegar a un acumulado mayor que 10. En el momento en el que el valor 
 * de la posición anterior se ha sobreescrito con un acumulado mayor que 10 se conservan los 
 * valores originales sin modificar.
 * 
 * Si el array era: [1, 5, 2, 14, 6, 15]
 * Después del proceso debe quedar: [1, 6, 8, 22, 6, 15]
 * VERSION SIN FUNCIONES - TODO EN MAIN
 */
public class Ejercicio09 {
    
    public static void main(String[] args) {
        // 1. Declaramos y creamos el array original
        double[] numeros = {1, 5, 2, 14, 6, 15};
        
        // 2. Mostramos el array original
        System.out.println("Array original:");
        System.out.print("[");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]);
            if (i < numeros.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        
        // 3. Variable para guardar el acumulado (empieza con el primer valor)
        double acumulado = numeros[0];
        
        // 4. Recorremos el array desde la posición 1
        for (int i = 1; i < numeros.length; i++) {
            // 5. Si el acumulado aún no ha superado 10
            if (acumulado <= 10) {
                // 6. Sumamos el valor actual al acumulado
                acumulado = acumulado + numeros[i];
                // 7. Sobreescribimos la posición actual con el acumulado
                numeros[i] = acumulado;
            } else {
                // 8. Si ya superó 10, dejamos de modificar el array
                break;
            }
        }
        
        // 9. Mostramos el array después del proceso
        System.out.println("\nArray después del proceso:");
        System.out.print("[");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]);
            if (i < numeros.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
