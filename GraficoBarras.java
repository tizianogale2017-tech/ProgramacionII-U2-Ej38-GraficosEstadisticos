package Ejercicio38_graficosEstadisticos;

import java.util.List;

public class GraficoBarras extends GeneradorGrafico {
    public GraficoBarras(List<Double> datos) {
        super(datos);
    }

    @Override
    public void renderizarGrafico() {
        System.out.println("Gráfico de barras:");
        if (!hayDatos()) {
            return;
        }
        for (int i = 0; i < datos.size(); i++) {
            int largo = (int) Math.round(datos.get(i) / 10);
            System.out.println("  Dato " + (i + 1) + " | " + "#".repeat(largo) + " " + datos.get(i));
        }
    }
}
