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
    public static void main(String[] args) throws IOException, InterruptedException {
        ConexionAPI conexionAPI = new ConexionAPI();
        Moneda moneda = conexionAPI.conexion("MXN");
        System.out.println(moneda);
    }

    public Moneda conexion(String monedaInicial) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://v6.exchangerate-api.com/v6/1bc544c4c68ea14d8f367750/latest/"+monedaInicial))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();
        System.out.println(json);

        Gson gson = new GsonBuilder().create();
        ResponseDTO responseDTO = gson.fromJson(json, ResponseDTO.class);
        //Se envian los datos del Json

        return new Moneda(
                responseDTO.conversion_rates().MXN(),
                responseDTO.conversion_rates().USD(),
                responseDTO.conversion_rates().BWP(),
                responseDTO.conversion_rates().DOP(),
                responseDTO.conversion_rates().IQD(),
                responseDTO.conversion_rates().UZS(),
                responseDTO.conversion_rates().SOS(),
                responseDTO.conversion_rates().RWF(),
                responseDTO.conversion_rates().JPY(),
                responseDTO.conversion_rates().BHD()
        );
    }
}