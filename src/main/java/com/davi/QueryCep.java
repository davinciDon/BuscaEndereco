package com.davi;


import com.google.gson.Gson;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class QueryCep {
    public Address getAddress(String cep) {
        try {
        URI uri = URI.create("https://viacep.com.br/ws/" + cep + "/json");
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(uri)
                .build();
        HttpResponse<String> response = client.send(request,
                HttpResponse.BodyHandlers.ofString());
            String json = response.body();

            return new Gson().fromJson(json, Address.class);

        } catch (IOException | InterruptedException e) {
            System.out.println("Cep invalid");
            throw new RuntimeException(e);
        }


    }

}
