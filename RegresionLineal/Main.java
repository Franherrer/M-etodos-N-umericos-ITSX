package RegresionLineal;

/**
 * Programa principal: prueba la regresion lineal con datos de ejemplo.
 * X = horas de estudio a la semana, Y = calificacion del examen.
 */
public class Main{

    public static void main(String[] args) {
        // Datos de prueba
        double[] x = {2, 3, 4, 5, 6, 7, 8, 9};
        double[] y = {58, 62, 65, 71, 74, 78, 85, 88};

        // Mostrar los datos
        System.out.println("--- DATOS DE PRUEBA ---");
        System.out.println("Horas de estudio (X) | Calificacion (Y)");
        for (int i = 0; i < x.length; i++) {
            System.out.printf("%20.1f | %16.1f%n", x[i], y[i]);
        }
        System.out.println();

        // Calcular la regresion (esta clase tambien imprime los resultados)
        double[] resultado = RegresionLineal.calcularMinimosCuadrados(x, y);
        double beta0 = resultado[0];
        double beta1 = resultado[1];

        // Prediccion con el modelo
        double xNuevo = 6.5;
        double yEstimado = RegresionLineal.predecir(beta0, beta1, xNuevo);
        System.out.println();
        System.out.println("--- PREDICCION ---");
        System.out.printf("Con X = %.1f horas, la calificacion estimada es Y = %.4f%n", xNuevo, yEstimado);
    }
}
