package co.scastillos.cambioMoneda.cambio;

public class Cambio {

    double cantidad;
    String monedaOrigen;
    String monedaDestino;
    double equivalencia;

    public Cambio(double cantidad,CambioDto cambioDto) {

        this.cantidad = cantidad;
        this.monedaOrigen = cambioDto.monedaOrigen();
        this.monedaDestino = cambioDto.monedaDestino();
        this.equivalencia = cambioDto.equivalencia();
    }

    @Override
    public String toString() {
        return  cantidad + " " +  monedaOrigen + " equivalen a " + equivalencia + " " + monedaDestino;

    }
}
