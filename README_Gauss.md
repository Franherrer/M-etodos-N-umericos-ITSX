# M-etodos-N-umericos-ITSX
Repositorio de proyectos para la materia de metodos numericos
# Método de Eliminación Gaussiana (Gauss simple) en Java

Práctica de Métodos Numéricos (SCC-1017) – Unidad 3, Ecuaciones lineales.
Resuelve un sistema de ecuaciones lineales `A·x = b` mediante **eliminación gaussiana simple** (sin pivoteo) y **sustitución regresiva**.

## Lenguaje

Java (JDK 11 o superior).

## Estructura del proyecto

```
Ecuaciones_lineales/
├── defmatrizz.java     # Define la matriz aumentada [A | b]
├── Gauss.java          # Lógica del método (triangulación y sustitución regresiva)
└── Lanzador_gaus.java  # Clase principal (main): une todo e imprime resultados
```



## Fundamento del método

1. **Triangulación (eliminación hacia adelante):** para cada pivote `a_ii` se calcula `factor = a_ji / a_ii` y se aplica `R_j = R_j - factor · R_i` a las filas inferiores, dejando ceros debajo de la diagonal.
2. **Sustitución regresiva:** desde la última fila, `x_i = (b_i - Σ a_ij · x_j) / a_ii`, usando las incógnitas ya conocidas.

## Cómo compilar y ejecutar

Desde la carpeta que **contiene** a `Ecuaciones_lineales/` (por el `package Ecuaciones_lineales;`):

```bash
javac Ecuaciones_lineales/*.java
java Ecuaciones_lineales.Lanzador_gaus
```




La solución exacta es `x1 = 3`, `x2 = -2.5`, `x3 = 7`; la diferencia en `x3` se debe al error de redondeo de punto flotante (`double`).

## Para cambiar el sistema

Edita la matriz en `defmatriz()` dentro de `defmatrizz.java`. Debe ser una matriz aumentada de `n` filas y `n + 1` columnas.
``

##Compilacion en terminal de Vs Code
<img width="952" height="167" alt="image" src="https://github.com/user-attachments/assets/0cb5f055-d419-4038-bfd4-a469f8c82b29" />
