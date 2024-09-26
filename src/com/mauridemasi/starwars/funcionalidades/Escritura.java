package com.mauridemasi.starwars.funcionalidades;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mauridemasi.starwars.modelos.Films;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Escritura {

    Gson gson = new GsonBuilder()
            .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
            .setPrettyPrinting()
            .create();

    public void escribir(List<Films> listaDeEpisodios) throws IOException {
        var escritura = new FileWriter("episodios.json");
        escritura.write(gson.toJson(listaDeEpisodios));
        escritura.close();
    }
}

