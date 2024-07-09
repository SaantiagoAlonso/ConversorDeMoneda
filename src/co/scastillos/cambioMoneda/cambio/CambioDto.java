package co.scastillos.cambioMoneda.cambio;

import com.google.gson.annotations.SerializedName;

public record CambioDto(
       @SerializedName("base_code") String monedaOrigen,
       @SerializedName("target_code") String monedaDestino,
       @SerializedName("conversion_result") double equivalencia) {
}
