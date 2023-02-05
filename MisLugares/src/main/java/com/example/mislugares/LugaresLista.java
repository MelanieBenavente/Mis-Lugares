package com.example.mislugares;

import java.util.ArrayList;
import java.util.List;

public class LugaresLista implements RepositorioLugares {
    protected List<Lugar> listaLugares;

    public LugaresLista() {
        listaLugares = new ArrayList<Lugar>();
        añadeEjemplos();
    }

    public Lugar elemento(int id) {
        return  listaLugares.get(id);
    }

    public void añade(Lugar lugar) {
        listaLugares.add(lugar);
    }

    public int nuevo() {
        //Lugar lugar = new Lugar();
        //listaLugares.add(lugar);
        return listaLugares.size()-1;
    }

    public void borrar(int id) {
        listaLugares.remove(id);
    }

    public int tamaño() {
        return listaLugares.size();
    }

    public void actualiza(int id, Lugar lugar) {
        listaLugares.set(id, lugar);
    }

    public void añadeEjemplos() {
        añade(new Lugar("Escuela Politécnica Superior de Gandía", "C/ Paranimf, 1 46730 Gandia (SPAIN)", -0.166093, 38.995656, TipoLugar.EDUCACION,
                962849300, "https://www.epsg.upv.es", "Uno de los mejores lugares para formarse", 3));
        añade(new Lugar("Al de siempre", "P. Industrial junto moli nou - 46772, Benifla (Valencia", -0.190642, 38.925857, TipoLugar.BAR, 645342987, "", "" +
                "No te pierdas el arroz", 3));
        añade(new Lugar("androidcurso.com", "ciberespacio", 0.0, 0.0, TipoLugar.EDUCACION, 962849300,
                "https://androidcurso.com", "amplia tus conocimientos sobre andriod", 5));
        añade(new Lugar("Barranco de infierno", "Via verde del rio. Villalonga (Valencia", -0.295058, 38.867180, TipoLugar.NATURALEZA, 0, "http://sosegaos.blogspot.com.es" +
                "-verde-del-rio.html", "espectacular ruta para ir en bici", 4));
        añade(new Lugar("La Vital", "avda.de la Vital, 0 46701 Gandía Valencia", -0.1720092, 38.9705949, TipoLugar.COMPRAS,
                962886363, "https://lavital.es", "centro comercial", 2));
    }
}
