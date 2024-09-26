package com.mauridemasi.starwars.funcionalidades;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mauridemasi.starwars.modelos.Films;
import com.mauridemasi.starwars.modelos.FilmsRecord;

import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Busqueda {

    Gson gson = new GsonBuilder()
            .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
            .setPrettyPrinting()
            .create();


    public Films buscar(int busqueda ) throws IOException {

        String encodedMovieName = URLEncoder.encode(String.valueOf(busqueda), "UTF-8");
        String direccion = "https://swapi.dev/api/films/" + encodedMovieName;

        Films episodio = null;
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(direccion))
                    .build();
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            String json = response.body();

            FilmsRecord miFilmsRecord = gson.fromJson(json, FilmsRecord.class);
            episodio = new Films(miFilmsRecord);

        } catch (NumberFormatException e) {
            System.out.println("Ocurrió un error: ");
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Error en la URI, favor verificar la dirección ");
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Ocurrió un error: ");
            e.printStackTrace();
        }
        return episodio;
    };

}