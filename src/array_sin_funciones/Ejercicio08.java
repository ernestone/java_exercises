package array_sin_funciones;

/**
 * Ejercicio 8: Dado un array de reales calcula la media de los datos mayores o iguales que 0 
 * y el recuento de los datos menores que 0
 * VERSION SIN FUNCIONES - TODO EN MAIN
 */
public class Ejercicio08 {
    
    public static void main(String[] args) {
        // 1. Declaramos y creamos el array con números positivos y negativos
        double[] numeros = {5.5, -3.2, 8.1, -1.5, 0.0, 12.3, -7.8, 4.2, -2.1};
        
        // 2. Variables para calcular la media de los positivos
        double suma = 0;
        int contadorPositivos = 0;
        
        // 3. Variable para contar los negativos
        int contadorNegativos = 0;
        
        // 4. Recorremos todo el array
        for (int i = 0; i < numeros.length; i++) {
            // 5. Si el número es mayor o igual a 0
            if (numeros[i] >= 0) {
                // 6. Lo sumamos y aumentamos el contador de positivos
                suma = suma + numeros[i];
                contadorPositivos++;
            } else {
                // 7. Si el número es menor que 0, aumentamos el contador de negativos
                contadorNegativos++;
            }
        }
        
        // 8. Calculamos e imprimimos la media de los positivos
        if (contadorPositivos > 0) {
            double media = suma / contadorPositivos;
            System.out.println("Media de los números >= 0: " + media);
        } else {
            System.out.println("No hay números >= 0");
        }
        
        // 9. Imprimimos el recuento de negativos
        System.out.println("Recuento de números < 0: " + contadorNegativos);
    }
}
