package Ejercicio38_graficosEstadisticos;

import java.util.List;

public class GraficoCircular extends GeneradorGrafico {
    public GraficoCircular(List<Double> datos) {
        super(datos);
    }

    @Override
    public void renderizarGrafico() {
        System.out.println("Gráfico circular:");
        if (!hayDatos()) {
            return;
        }
        double total = 0;
        for (double d : datos) {
            total += d;
        }
        for (int i = 0; i < datos.size(); i++) {
            System.out.printf("  Sector %d: %.1f%% del círculo%n", i + 1, datos.get(i) / total * 100);
        }
    }
}
