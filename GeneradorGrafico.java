package Ejercicio38_graficosEstadisticos;

import java.util.List;

public abstract class GeneradorGrafico {
    protected List<Double> datos;

    public GeneradorGrafico(List<Double> datos) {
        this.datos = datos;
    }

    public abstract void renderizarGrafico();

    protected boolean hayDatos() {
        if (datos == null || datos.isEmpty()) {
            System.out.println("No hay datos para graficar.");
            return false;
        }
        return true;
    }
}
