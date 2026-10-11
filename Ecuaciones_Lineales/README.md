# Cambios respecto a la práctica del Método de Gauss

Este documento registra las modificaciones hechas al código de la práctica
anterior (Método de Gauss) para implementar la práctica de **Gauss-Jordan**.




## Detalle de los cambios


### 1. `Gauss.java`

Sin cambios en la lógica. Los métodos `eliminacionGaussiana` y
`sustitucionRegresiva` siguen igual. El primero es reutilizado por
`Gauss_Jordan`.

### 2. `Gauss_Jordan.java` (nuevo)

Contiene el método `resolver(double[][] matriz)`, que:

1. Reutiliza `Gauss.eliminacionGaussiana(matriz)` para obtener la matriz
   triangular superior (la matriz se modifica por referencia en memoria).
2. Recorre las filas de abajo hacia arriba. En cada fila normaliza el pivote
   para que valga 1 y elimina los coeficientes que están arriba de la diagonal.
3. Lee las soluciones directamente de la última columna (`matriz[i][n]`), sin
   necesidad de sustitución regresiva.

### 3. `Lanzador_gaus.java`

- Antes: llamaba a `Gauss.eliminacionGaussiana` y luego a
  `Gauss.sustitucionRegresiva`.
- Ahora: llama a `Gauss_Jordan.resolver(matriz)` e imprime las soluciones.

## Cómo ejecutar el método de Gauss original

La clase `Gauss` sigue funcionando. Para ejecutar Gauss con sustitución
regresiva, reemplaza en `main` de `Lanzador_gaus.java` la línea:

```java
double[] soluciones = Gauss_Jordan.resolver(matriz);
```

por:

```java
Gauss.eliminacionGaussiana(matriz);
double[] soluciones = Gauss.sustitucionRegresiva(matriz);
```

## Compilar y ejecutar

Desde la carpeta que contiene a `Ecuaciones_Lineales/`:

```bash
javac Ecuaciones_Lineales/*.java
java Ecuaciones_Lineales.Lanzador_gaus
```
 ## Ejecucion en InteliJIDEA

Soluciones del sistema (Gauss-Jordan Modular):
x1 = 3.0
x2 = -2.5
x3 = 7.000000000000002

Process finished with exit code 0

El método de Gauss original produce los mismos valores. La pequeña diferencia en
`x3` respecto a 7 se debe al error de redondeo de la aritmética de punto
flotante (`double`).
