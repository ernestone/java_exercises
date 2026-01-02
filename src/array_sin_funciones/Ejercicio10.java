package array_sin_funciones;

/**
 * Ejercicio 10: Dado un array de Strings, escribe un programa que intercambie todos los 
 * elementos del array de manera que quede invertido. Es decir, el primer elemento pasa al 
 * final, el segundo pasa al penúltimo, etc.
 * 
 * Si el array es: ["Hola", "Adiós", "Casa", "Perro", "Gato"]
 * Después del proceso debe quedar: ["Gato", "Perro", "Casa", "Adiós", "Hola"]
 * VERSION SIN FUNCIONES - TODO EN MAIN
 */
public class Ejercicio10 {
    
    public static void main(String[] args) {
        // 1. Declaramos y creamos el array de palabras
        String[] palabras = {"Hola", "Adiós", "Casa", "Perro", "Gato"};
        
        // 2. Mostramos el array original
        System.out.println("Array original:");
        System.out.print("[");
        for (int i = 0; i < palabras.length; i++) {
            System.out.print("\"" + palabras[i] + "\"");
            if (i < palabras.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        
        // 3. Variables para controlar el inicio y el final del array
        int inicio = 0;
        int fin = palabras.length - 1;
        
        // 4. Intercambiamos elementos mientras inicio sea menor que fin
        while (inicio < fin) {
            // 5. Guardamos temporalmente el elemento del inicio
            String temporal = palabras[inicio];
            
            // 6. Movemos el elemento del final al inicio
            palabras[inicio] = palabras[fin];
            
            // 7. Movemos el elemento temporal (que era del inicio) al final
            palabras[fin] = temporal;
            
            // 8. Avanzamos hacia el centro del array
            inicio++;
            fin--;
        }
        
        // 9. Mostramos el array invertido
        System.out.println("\nArray invertido:");
        System.out.print("[");
        for (int i = 0; i < palabras.length; i++) {
            System.out.print("\"" + palabras[i] + "\"");
            if (i < palabras.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
