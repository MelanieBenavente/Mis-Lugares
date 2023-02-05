package com.example.mislugares;

public interface RepositorioLugares {
    Lugar elemento(int id); //Devuelve el elemento dado su Id
    void añade(Lugar lugar); // Añade el elemento indicado
    int nuevo(); //Añade un elemento con el id indicado
    void borrar(int id); //Elimina el elemento con el id indicado
    int tamaño(); //Devuelve el numero de elementos
    void actualiza(int id, Lugar lugar); //Reemplaza un elemento
}
