package com.ejemplo.construccion.repositories;

import com.ejemplo.construccion.modelo.*;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class ConstruccionRepository {

    private List<InterfaceGeneral> listaObjetos = new ArrayList<>();

    public ConstruccionRepository() {
        List<Construccion> lista0 = Arrays.asList();
        List<Construccion> lista1 = Arrays.asList(
                new Construccion("Casa Campestre", 120, 150000.0)
        );
        List<Construccion> lista2 = Arrays.asList(
                new Construccion("Edificio Residencial", 300, 500000.0),
                new Construccion("Puente Peatonal", 90, 80000.0)
        );
        List<Construccion> lista3 = Arrays.asList(
                new Construccion("Panal Silvestre", 5, 20.0),
                new Construccion("Colmena Urbana", 10, 50.0),
                new Construccion("Nido de Cera", 3, 10.0)
        );
        List<Construccion> lista4 = Arrays.asList(
                new Construccion("Torre de Oficinas", 450, 1200000.0),
                new Construccion("Centro Comercial", 600, 2000000.0),
                new Construccion("Bodega Industrial", 180, 250000.0),
                new Construccion("Parqueadero Subterráneo", 210, 400000.0)
        );
        List<Construccion> lista5 = Arrays.asList(
                new Construccion("Carretera Principal", 360, 900000.0),
                new Construccion("Hospital Municipal", 500, 1800000.0),
                new Construccion("Escuela Pública", 150, 300000.0),
                new Construccion("Cancha Sintética", 40, 60000.0),
                new Construccion("Biblioteca", 200, 450000.0)
        );

        listaObjetos.add(new Arquitecto("Melanny Moreno", lista2));
        listaObjetos.add(new Arquitecto("Carlos Gómez", lista1));
        listaObjetos.add(new Arquitecto("Valeria Ríos", lista4));
        listaObjetos.add(new Arquitecto("Andrés Pérez", lista0));

        listaObjetos.add(new Constructor("Pedro Martínez", lista5));
        listaObjetos.add(new Constructor("Juan Delgado", lista3));
        listaObjetos.add(new Constructor("Luis Fernández", lista1));
        listaObjetos.add(new Constructor("Santiago Ruiz", lista0));

        listaObjetos.add(new Abeja("Maya", lista3));
        listaObjetos.add(new Abeja("Reina Z", lista5));
        listaObjetos.add(new Abeja("Obrera 1", lista2));
        listaObjetos.add(new Abeja("Obrera 2", lista4));
    }

    public List<InterfaceGeneral> getListaObjetos() {
        return listaObjetos;
    }
}
