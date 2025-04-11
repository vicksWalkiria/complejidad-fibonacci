# 📊 Comparativa de Algoritmos de Fibonacci en Java

Este proyecto compara el rendimiento de **tres formas diferentes** de calcular números de Fibonacci en Java:

1. ✅ Recursiva simple  
2. ⚙️ Recursiva con programación dinámica (memorización)  
3. 🔁 Iterativa

---

## 🧠 ¿Qué representa este código?

Este programa calcula el valor de Fibonacci para una serie de números (`n`) y mide cuánto tarda cada enfoque. Así, puedes observar cómo cambia el rendimiento a medida que `n` crece.

La salida tendrá este formato:

n | Recursivo (ms) | Dinámico (ms) | Iterativo (ms)

10 | 0.013 ms | 0.004 ms | 0.002 ms ...


---

## 🛠️ Cómo funciona

### 1. Recursiva simple
```java
public static int fibonacci(int x)

🔁 Llama a sí misma dos veces por cada número, sin guardar resultados previos.

    ❗ Muy ineficiente en valores grandes

    ⏱ Complejidad: O(2ⁿ)

2. Recursiva dinámica (memorización)

public static int fibonacciDinamico(int x)

💾 Guarda los resultados anteriores en una lista (ArrayList) para no repetir cálculos.

    Mucho más rápida que la versión recursiva simple

    ⏱ Complejidad: O(n)

3. Iterativa

public static int fibonacciIterativo(int x)

🔁 Usa un simple bucle for para calcular el número de Fibonacci.

    La más eficiente en todos los sentidos

    ⏱ Complejidad: O(n)

🧪 Añadir nuevos valores a probar

En el main, encontrarás esta línea:

int[] valores = {10, 20, 30, 35, 40, 45, 50};

Puedes agregar más números para probar otras entradas, por ejemplo:

int[] valores = {10, 20, 30, 35, 40, 45, 50, 55, 60};

⚠️ Nota: A partir de n = 45 notarás que el algoritmo recursivo simple se vuelve extremadamente lento. Esto demuestra lo costoso que puede ser un algoritmo con complejidad exponencial.
🎯 ¿Qué deberías aprender con esto?

    Cómo medir el tiempo de ejecución de un algoritmo.

    La diferencia entre recursividad simple, programación dinámica e iteración.

    El impacto de la complejidad algorítmica en el rendimiento.

    Cómo tomar decisiones informadas al elegir un enfoque para resolver un problema.

▶️ Cómo ejecutar

Este proyecto usa Java. Puedes compilarlo y ejecutarlo desde terminal:

javac Fibonacci.java
java Fibonacci

También puedes usar cualquier entorno que soporte Java (Eclipse, IntelliJ, NetBeans, VS Code, etc.).
📚 Recursos adicionales

    Complejidad algorítmica – Big O Notation

    Secuencia de Fibonacci

    Programación dinámica explicada

📁 Estructura del proyecto

/src
 └── com/mycompany/fibonacci/Fibonacci.java
README.md

¡Explora, modifica y experimenta! 🧪✨

