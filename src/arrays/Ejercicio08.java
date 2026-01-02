package arrays;

/**
 * Ejercicio 8: Dado un array de reales calcula la media de los datos mayores o iguales que 0 
 * y el recuento de los datos menores que 0
 */
public class Ejercicio08 {
    
    public static void main(String[] args) {
        double[] numeros = {5.5, -3.2, 8.1, -1.5, 0.0, 12.3, -7.8, 4.2, -2.1};
        
        calcularEstadisticas(numeros);
    }
    
    public static void calcularEstadisticas(double[] array) {
        double suma = 0;
        int contadorPositivos = 0;
        int contadorNegativos = 0;
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 0) {
                suma += array[i];
                contadorPositivos++;
            } else {
                contadorNegativos++;
            }
        }
        
        if (contadorPositivos > 0) {
            double media = suma / contadorPositivos;
            System.out.println("Media de los números >= 0: " + media);
        } else {
            System.out.println("No hay números >= 0");
        }
        
        System.out.println("Recuento de números < 0: " + contadorNegativos);
    }
}
