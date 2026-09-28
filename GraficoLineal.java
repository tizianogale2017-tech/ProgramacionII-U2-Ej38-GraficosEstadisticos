package Ejercicio38_graficosEstadisticos;

import java.util.List;

public class GraficoLineal extends GeneradorGrafico {
    public GraficoLineal(List<Double> datos) {
        super(datos);
    }

    @Override
    public void renderizarGrafico() {
        System.out.println("Gráfico lineal:");
        if (!hayDatos()) {
            return;
        }
        StringBuilder linea = new StringBuilder();
        for (int i = 0; i < datos.size(); i++) {
            linea.append(datos.get(i));
            if (i < datos.size() - 1) {
                linea.append(datos.get(i + 1) >= datos.get(i) ? " --/ " : " --\\ ");
            }
        }
        System.out.println("  " + linea);
    }
}
