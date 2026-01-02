package arrays;

/**
 * Ejercicio 13: Encuentra el segundo dato mayor en un array de enteros. 
 * Imprime su posición (índice)
 */
public class Ejercicio13 {
    
    public static void main(String[] args) {
        int[] numeros = {7, 3, 9, 5, 12, 8, 4};
        
        encontrarSegundoMayor(numeros);
    }
    
    public static void encontrarSegundoMayor(int[] array) {
        if (array.length < 2) {
            System.out.println("El array debe tener al menos 2 elementos");
            return;
        }
        
        int mayor = Integer.MIN_VALUE;
        int segundoMayor = Integer.MIN_VALUE;
        int posicionSegundoMayor = -1;
        
        // Primera pasada: encontrar el mayor
        for (int i = 0; i < array.length; i++) {
            if (array[i] > mayor) {
                mayor = array[i];
            }
        }
        
        // Segunda pasada: encontrar el segundo mayor
        for (int i = 0; i < array.length; i++) {
            if (array[i] < mayor && array[i] > segundoMayor) {
                segundoMayor = array[i];
                posicionSegundoMayor = i;
            }
        }
        
        if (posicionSegundoMayor == -1) {
            System.out.println("No existe un segundo mayor (todos los valores son iguales)");
        } else {
            System.out.println("El segundo mayor es: " + segundoMayor);
            System.out.println("Su posición (índice) es: " + posicionSegundoMayor);
        }
    }
}
