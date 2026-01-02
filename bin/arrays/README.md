# Package Arrays - Ejercicios de Arrays en Java

Este package contiene 14 ejercicios prácticos sobre manipulación de arrays en Java.

## Estructura del Package

Cada ejercicio está implementado en una clase independiente con su propio método `main()` para facilitar la ejecución y prueba.

## Lista de Ejercicios

### Ejercicio 1: Número Mayor
**Clase:** `Ejercicio01.java`  
**Descripción:** Encuentra e imprime el número mayor de un array de números reales.

### Ejercicio 2: Primer Número Mayor que 8
**Clase:** `Ejercicio02.java`  
**Descripción:** Busca el primer número mayor que 8 en el array. Imprime "no hay" si no existe.

### Ejercicio 3: Posición del Número Mayor
**Clase:** `Ejercicio03.java`  
**Descripción:** Encuentra e imprime el índice del número mayor del array.

### Ejercicio 4: Posición del Primer Mayor que 8
**Clase:** `Ejercicio04.java`  
**Descripción:** Encuentra e imprime el índice del primer número mayor que 8. Imprime "no hay" si no existe.

### Ejercicio 5: Contador de Booleanos
**Clase:** `Ejercicio05.java`  
**Descripción:** Cuenta y muestra cuántos valores `true` y `false` hay en un array de booleanos.

### Ejercicio 6: Rellenar Array con Scanner
**Clase:** `Ejercicio06.java`  
**Descripción:** Permite al usuario introducir 7 números enteros por consola usando Scanner.

### Ejercicio 7: Rellenar Array con Números Pares
**Clase:** `Ejercicio07.java`  
**Descripción:** Permite al usuario introducir 7 números enteros PARES. Si introduce un número impar, solicita otro.

### Ejercicio 8: Media de Positivos y Recuento de Negativos
**Clase:** `Ejercicio08.java`  
**Descripción:** Calcula la media de los números >= 0 y cuenta los números < 0.

### Ejercicio 9: Acumulado hasta Superar 10
**Clase:** `Ejercicio09.java`  
**Descripción:** Sobreescribe el array con el acumulado de valores hasta que el acumulado supera 10.  
**Ejemplo:**  
- Entrada: `[1, 5, 2, 14, 6, 15]`
- Salida: `[1, 6, 8, 22, 6, 15]`

### Ejercicio 10: Invertir Array de Strings
**Clase:** `Ejercicio10.java`  
**Descripción:** Invierte el orden de los elementos de un array de Strings.  
**Ejemplo:**  
- Entrada: `["Hola", "Adiós", "Casa", "Perro", "Gato"]`
- Salida: `["Gato", "Perro", "Casa", "Adiós", "Hola"]`

### Ejercicio 11: Determinar Orden del Array
**Clase:** `Ejercicio11.java`  
**Descripción:** Determina si un array está estrictamente creciente, estrictamente decreciente, o no está ordenado.

### Ejercicio 12: Verificar Array ZigZag
**Clase:** `Ejercicio12.java`  
**Descripción:** Verifica si un array tiene patrón zigzag (alterna mayor/menor).  
**Ejemplos de zigzag:**
- `[3, 7, 4, 9, 1, 8, 5]` → < > < > < >
- `[9, 4, 7, 2, 8, 1]` → > < > < >

### Ejercicio 13: Segundo Mayor
**Clase:** `Ejercicio13.java`  
**Descripción:** Encuentra el segundo número mayor del array e imprime su posición (índice).

### Ejercicio 14: Array sin Repetidos
**Clase:** `Ejercicio14.java`  
**Descripción:** Permite al usuario introducir 10 números únicos. Si introduce un número repetido, solicita otro.

## Cómo Ejecutar los Ejercicios

### Opción 1: Ejecutar un ejercicio específico
```bash
# Compilar
javac src/arrays/Ejercicio01.java

# Ejecutar
java -cp src arrays.Ejercicio01
```

### Opción 2: Desde VS Code
1. Abre cualquier archivo `EjercicioXX.java`
2. Haz clic derecho en el editor
3. Selecciona "Run Java"

### Opción 3: Ejecutar desde App.java
Abre `App.java` y verás un ejemplo de cómo ejecutar los ejercicios programáticamente.

## Notas Técnicas

- **Ejercicios 6, 7 y 14** requieren interacción del usuario (Scanner)
- **Ejercicio 9** modifica el array original
- **Ejercicio 10** también modifica el array original (inversión in-place)
- Todos los ejercicios incluyen validaciones básicas de arrays vacíos o nulos
- Los métodos están diseñados para ser reutilizables y fáciles de probar

## Autor
Ejercicios de práctica para aprendizaje de manipulación de arrays en Java.
