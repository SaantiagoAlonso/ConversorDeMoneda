package co.scastillos.cambioMoneda.conversor;

import co.scastillos.cambioMoneda.cambio.Cambio;
import co.scastillos.cambioMoneda.cambio.CambioDto;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Conversor {

    public static Cambio convertir(String de, String a, double cantidad) throws IOException, InterruptedException {


        String apiKey = System.getenv("API_KEY");
        //String apiKey = "/5cc6b29df85ee7952d9f050e/";

        String valor = String.valueOf(cantidad);

        String direccion = "https://v6.exchangerate-api.com/v6" + apiKey + "pair/" + de + "/" + a + "/" + valor;

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(direccion))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        Gson gson = new Gson();

        CambioDto cambioDto = gson.fromJson(response.body(), CambioDto.class);

        return new Cambio(cantidad,cambioDto);

    }

}
