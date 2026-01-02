# Package array_sin_funciones - Ejercicios Simplificados para Principiantes

Este package contiene los **mismos 14 ejercicios** del package `arrays`, pero implementados de forma más simple y didáctica para desarrolladores principiantes.

## 🎯 Diferencias con el Package Original

### Package `arrays` (original):
- Usa **funciones auxiliares** (métodos estáticos)
- Código más modular y reutilizable
- Mejor para aprender buenas prácticas de programación

### Package `array_sin_funciones` (este):
- **TODO el código está en el método `main()`**
- Sin funciones auxiliares
- **Comentarios paso a paso** para cada línea de código
- Más fácil de entender para principiantes
- Código más largo pero más explícito

## 📚 Lista de Ejercicios

Los 14 ejercicios son exactamente los mismos que en el package original:

1. **Ejercicio01** - Encontrar el número mayor
2. **Ejercicio02** - Primer número mayor que 8
3. **Ejercicio03** - Posición del número mayor
4. **Ejercicio04** - Posición del primer mayor que 8
5. **Ejercicio05** - Contador de booleanos (true/false)
6. **Ejercicio06** - Rellenar array con Scanner
7. **Ejercicio07** - Rellenar array solo con pares
8. **Ejercicio08** - Media de positivos y cuenta de negativos
9. **Ejercicio09** - Acumulado hasta superar 10
10. **Ejercicio10** - Invertir array de Strings
11. **Ejercicio11** - Determinar orden (creciente/decreciente/desordenado)
12. **Ejercicio12** - Verificar patrón zigzag
13. **Ejercicio13** - Encontrar segundo mayor
14. **Ejercicio14** - Introducir 10 números únicos (sin repetidos)

## 💡 Características para Principiantes

### 1. **Comentarios Numerados**
Cada paso del algoritmo está numerado y explicado:
```java
// 1. Declaramos y creamos el array con los números
double[] numeros = {3.5, 7.2, 1.8, 9.4, 5.6, 2.1};

// 2. Suponemos que el primer número es el mayor
double mayor = numeros[0];

// 3. Recorremos el array desde la posición 1 hasta el final
for (int i = 1; i < numeros.length; i++) {
    // 4. Si encontramos un número mayor, lo guardamos
    if (numeros[i] > mayor) {
        mayor = numeros[i];
    }
}
```

### 2. **Sin Abstracciones**
Todo el código está visible en un solo lugar (el método `main`), sin necesidad de saltar a otras funciones.

### 3. **Variables con Nombres Descriptivos**
- `contadorPositivos` en lugar de `count`
- `esCreciente` en lugar de `isAsc`
- `primeraMenor` en lugar de `first`

### 4. **Explicaciones Detalladas**
Cada decisión del algoritmo está explicada con comentarios.

## 🚀 Cómo Usar Este Package

### Para Aprender:
1. Abre cualquier ejercicio (`Ejercicio01.java`, etc.)
2. Lee los comentarios numerados paso a paso
3. Ejecuta el código y observa el resultado
4. Modifica los valores del array para experimentar

### Para Ejecutar:
```bash
# Compilar
javac src/array_sin_funciones/Ejercicio01.java

# Ejecutar
java -cp src array_sin_funciones.Ejercicio01
```

O desde VS Code: clic derecho en el archivo → "Run Java"

## 🎓 Progresión Recomendada

### Nivel Básico (Empezar aquí):
- Ejercicio 1: Concepto de "mayor"
- Ejercicio 5: Contar valores
- Ejercicio 3: Guardar posiciones

### Nivel Intermedio:
- Ejercicio 2 y 4: Búsqueda condicional
- Ejercicio 6 y 7: Interacción con Scanner
- Ejercicio 8: Cálculos estadísticos

### Nivel Avanzado:
- Ejercicio 9: Modificar arrays dinámicamente
- Ejercicio 10: Algoritmo de inversión
- Ejercicio 11 y 12: Análisis de patrones
- Ejercicio 13 y 14: Algoritmos complejos

## 📖 Conceptos que Aprenderás

- ✅ Recorrer arrays con bucles `for`
- ✅ Usar bucles `while` para validación
- ✅ Comparar elementos consecutivos
- ✅ Modificar arrays (mutabilidad)
- ✅ Intercambiar valores
- ✅ Buscar y validar datos
- ✅ Usar `Scanner` para entrada de usuario
- ✅ Acumuladores y contadores
- ✅ Variables booleanas de control

## 🆚 Comparación de Código

**Versión con funciones (package `arrays`):**
```java
public static void main(String[] args) {
    double[] numeros = {3.5, 7.2, 1.8, 9.4, 5.6, 2.1};
    double mayor = encontrarMayor(numeros);
    System.out.println("El número mayor es: " + mayor);
}

public static double encontrarMayor(double[] array) {
    // ... lógica aquí
}
```

**Versión sin funciones (este package):**
```java
public static void main(String[] args) {
    // 1. Declaramos y creamos el array con los números
    double[] numeros = {3.5, 7.2, 1.8, 9.4, 5.6, 2.1};
    
    // 2. Suponemos que el primer número es el mayor
    double mayor = numeros[0];
    
    // 3. Recorremos el array desde la posición 1 hasta el final
    for (int i = 1; i < numeros.length; i++) {
        // 4. Si encontramos un número mayor, lo guardamos
        if (numeros[i] > mayor) {
            mayor = numeros[i];
        }
    }
    
    // 5. Imprimimos el resultado
    System.out.println("El número mayor es: " + mayor);
}
```

## 💪 Siguiente Paso

Una vez que domines estos ejercicios, te recomiendo pasar al package `arrays` para aprender:
- Cómo dividir código en funciones
- Cómo reutilizar código
- Mejores prácticas de programación

---

**¡Feliz aprendizaje!** 🎉
