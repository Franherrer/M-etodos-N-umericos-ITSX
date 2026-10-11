package Ecuaciones_Lineales;

public class Gauss_Jordan {

    /**
     * Resuelve el sistema de ecuaciones aplicando el método de Gauss-Jordan
     * de forma modular, reutilizando la triangulación de la clase Gauss.
     * @param matriz Matriz aumentada [A | b]
     * @return Arreglo con las soluciones del sistema.
     */
    public static double[] resolver(double[][] matriz) {
        int n = matriz.length;

        // 1. Reutilizamos el módulo existente para la eliminación gaussiana (triangulación superior)
        Gauss.eliminacionGaussiana(matriz);

        // 2. Fase de Jordan: Normalizar pivotes y hacer ceros en los elementos ARRIBA de la diagonal
        for (int i = n - 1; i >= 0; i--) {
            // Normalizar el renglón para que el pivote sea 1
            double pivote = matriz[i][i];
            for (int k = i; k <= n; k++) {
                matriz[i][k] /= pivote;
            }

            // Hacer ceros en las filas superiores
            for (int j = i - 1; j >= 0; j--) {
                double factor = matriz[j][i];
                for (int k = i; k <= n; k++) {
                    matriz[j][k] -= factor * matriz[i][k];
                }
            }
        }

        // 3. Extraer las soluciones directamente de la última columna (matriz identidad lograda)
        double[] soluciones = new double[n];
        for (int i = 0; i < n; i++) {
            soluciones[i] = matriz[i][n];
        }

        return soluciones;
    }
}