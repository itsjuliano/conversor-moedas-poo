package br.com.codewithjuliano.servicos;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaCambio {

    private static final String URL_BASE = "https://v6.exchangerate-api.com/v6/";
    private static final String API_KEY = System.getenv("API_KEY");

    public String buscarDados () {
        if (API_KEY == null || API_KEY.isEmpty()) {
            throw new RuntimeException("API_KEY não definida. Configure a variável de ambiente API_KEY.");
        }

        String endereco = URL_BASE + API_KEY + "/latest/BRL";

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(endereco))
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return response.body();

        } catch (IOException | InterruptedException e) {
            System.out.println("Erro ao consultar a API: " + e.getMessage());
            throw new RuntimeException(e);
        }


    }
}
