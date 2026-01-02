package arrays;

/**
 * Ejercicio 10: Dado un array de Strings, escribe un programa que intercambie todos los 
 * elementos del array de manera que quede invertido. Es decir, el primer elemento pasa al 
 * final, el segundo pasa al penúltimo, etc.
 * 
 * Si el array es: ["Hola", "Adiós", "Casa", "Perro", "Gato"]
 * Después del proceso debe quedar: ["Gato", "Perro", "Casa", "Adiós", "Hola"]
 */
public class Ejercicio10 {
    
    public static void main(String[] args) {
        String[] palabras = {"Hola", "Adiós", "Casa", "Perro", "Gato"};
        
        System.out.println("Array original:");
        imprimirArray(palabras);
        
        invertirArray(palabras);
        
        System.out.println("\nArray invertido:");
        imprimirArray(palabras);
    }
    
    public static void invertirArray(String[] array) {
        int inicio = 0;
        int fin = array.length - 1;
        
        while (inicio < fin) {
            // Intercambiar elementos
            String temp = array[inicio];
            array[inicio] = array[fin];
            array[fin] = temp;
            
            inicio++;
            fin--;
        }
    }
    
    public static void imprimirArray(String[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print("\"" + array[i] + "\"");
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
