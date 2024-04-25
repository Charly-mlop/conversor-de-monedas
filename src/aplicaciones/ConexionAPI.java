package aplicaciones;

import DTO.ResponseDTO;
import Modelo.Moneda;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConexionAPI {

    public Moneda conexion(String monedaInicial) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://v6.exchangerate-api.com/v6/1bc544c4c68ea14d8f367750/latest/"+monedaInicial))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();

        Gson gson = new GsonBuilder().create();
        ResponseDTO responseDTO = gson.fromJson(json, ResponseDTO.class);


        return new Moneda(responseDTO.conversion_rates());
    }
}