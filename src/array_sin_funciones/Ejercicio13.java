package array_sin_funciones;

/**
 * Ejercicio 13: Encuentra el segundo dato mayor en un array de enteros. 
 * Imprime su posición (índice)
 * VERSION SIN FUNCIONES - TODO EN MAIN
 */
public class Ejercicio13 {
    
    public static void main(String[] args) {
        // 1. Declaramos y creamos el array con números
        int[] numeros = {7, 3, 9, 5, 12, 8, 4};
        
        // 2. Variables para guardar el mayor y el segundo mayor
        int mayor = Integer.MIN_VALUE; // El número más pequeño posible
        int segundoMayor = Integer.MIN_VALUE;
        int posicionSegundoMayor = -1; // -1 significa que no lo hemos encontrado
        
        // 3. PRIMERA PASADA: Encontrar el número mayor
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
        }
        
        // 4. SEGUNDA PASADA: Encontrar el segundo mayor
        //    (debe ser menor que el mayor, pero el más grande de los demás)
        for (int i = 0; i < numeros.length; i++) {
            // 5. Si el número es menor que el mayor Y mayor que el segundo mayor actual
            if (numeros[i] < mayor && numeros[i] > segundoMayor) {
                segundoMayor = numeros[i];
                posicionSegundoMayor = i; // Guardamos su posición
            }
        }
        
        // 6. Mostramos el resultado
        if (posicionSegundoMayor == -1) {
            System.out.println("No existe un segundo mayor (todos los valores son iguales)");
        } else {
            System.out.println("El segundo mayor es: " + segundoMayor);
            System.out.println("Su posición (índice) es: " + posicionSegundoMayor);
        }
    }
}
