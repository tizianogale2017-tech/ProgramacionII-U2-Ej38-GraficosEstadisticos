package Ejercicio38_graficosEstadisticos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Double> ventas = Arrays.asList(40.0, 65.0, 30.0, 80.0);

        GeneradorGrafico[] graficos = {new GraficoBarras(ventas), new GraficoCircular(ventas), new GraficoLineal(ventas)};
        for (GeneradorGrafico g : graficos) {
            g.renderizarGrafico();
        }

        System.out.println("--- Con lista vacía ---");
        new GraficoBarras(new ArrayList<>()).renderizarGrafico();
    }
}
