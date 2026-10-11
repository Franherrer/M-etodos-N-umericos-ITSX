package Ecuaciones_Lineales;

public class Lanzador_gaus {
    public static void main(String[] args) {
        // 1. Mandamos llamar a la función que nos entrega la matriz aumentada [A | b]
        double[][] matriz = defmatrizz.defmatriz();

        // 2. Resolver utilizando la nueva clase modular Gauss-Jordan
        double[] soluciones = Gauss_Jordan.resolver(matriz);

        // 3. Imprimir resultados finales en consola de manera limpia
        System.out.println("Soluciones del sistema (Gauss-Jordan Modular):");
        for (int i = 0; i < soluciones.length; i++) {
            System.out.println("x" + (i + 1) + " = " + soluciones[i]);
        }
    }
}