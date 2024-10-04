import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaMoneda {

        public Moneda  buscaMoneda(String primeraMoneda, String segundaMoneda, double monto){
            String clave = "9a1d338dcec739de29cf39da";
            URI urlCompleta = URI.create("https://v6.exchangerate-api.com/v6/"+clave+"pair/"+primeraMoneda+"/"+segundaMoneda+"/"+monto);
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder().uri(urlCompleta).build();

            try {
                HttpResponse<String> response = client
                        .send(request,HttpResponse.BodyHandlers.ofString());
                return new Gson().fromJson(response.body(), Moneda.class);

            } catch (Exception e) {
                throw new RuntimeException("No encontre la Moneda");
            }



        }

}
