package com.mauridemasi.starwars.menu;

import com.mauridemasi.starwars.funcionalidades.Busqueda;
import com.mauridemasi.starwars.funcionalidades.Escritura;
import com.mauridemasi.starwars.modelos.Films;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<Films> listaDeEpisodios = new ArrayList<>();
    public void exibirMenu(){


        System.out.println("****************************************************");
        System.out.println("Bienvenido a Cli-Wars");
        System.out.println("****************************************************");
        System.out.println("Escoja un episidios para ver la información");
        System.out.println("1. Episode I");
        System.out.println("2. Episode II");
        System.out.println("3. Episode III");
        System.out.println("4. Episode IV");
        System.out.println("5. Episode V");
        System.out.println("6. Episode VI");
        System.out.println("****************************************************");
        System.out.println("Presione 0 para salir");
        System.out.println("****************************************************");
        System.out.print("Opción: ");
        int opcion = Integer.parseInt(System.console().readLine());
        System.out.println("****************************************************");
        Busqueda busqueda = new Busqueda();

        switch (opcion) {
            case 1:
                try {
                    System.out.println(busqueda.buscar(1));
                    listaDeEpisodios.add(busqueda.buscar(1));
                    exibirMenu();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case 2:
                try {
                    System.out.println(busqueda.buscar(2));
                    listaDeEpisodios.add(busqueda.buscar(2));
                    exibirMenu();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case 3:
                try {
                    System.out.println(busqueda.buscar(3));
                    listaDeEpisodios.add(busqueda.buscar(3));
                    exibirMenu();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case 4:
                try {
                    System.out.println(busqueda.buscar(4));
                    listaDeEpisodios.add(busqueda.buscar(4));
                    exibirMenu();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case 5:
                try {
                    System.out.println(busqueda.buscar(5));
                    listaDeEpisodios.add(busqueda.buscar(5));
                    exibirMenu();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case 6:
                try {
                    System.out.println(busqueda.buscar(6));
                    listaDeEpisodios.add(busqueda.buscar(6));
                    exibirMenu();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case 0:
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("Opción inválida");
                exibirMenu();
                break;
        }

    }

    public void grabarListaDeEpisodios(){
        System.out.println("Desea grabar estos episodios en un archivo?");
        System.out.println("1. Si");
        System.out.println("2. No");
        int opcion = Integer.parseInt(System.console().readLine());
        if (opcion == 1) {
            try {
                Escritura escritura = new Escritura();
                escritura.escribir(listaDeEpisodios);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Episodio no grabado");
        }
    }
}
