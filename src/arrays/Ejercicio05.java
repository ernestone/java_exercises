package arrays;

/**
 * Ejercicio 5: Dado un array de booleanos, escribe un programa que calcule e imprima 
 * el sumatorio de "true" y el sumatorio de "false"
 */
public class Ejercicio05 {
    
    public static void main(String[] args) {
        boolean[] valores = {true, false, true, true, false, true, false, false, true};
        
        contarBooleanos(valores);
    }
    
    public static void contarBooleanos(boolean[] array) {
        int contadorTrue = 0;
        int contadorFalse = 0;
        
        for (int i = 0; i < array.length; i++) {
            if (array[i]) {
                contadorTrue++;
            } else {
                contadorFalse++;
            }
        }
        
        System.out.println("Sumatorio de true: " + contadorTrue);
        System.out.println("Sumatorio de false: " + contadorFalse);
    }
}
