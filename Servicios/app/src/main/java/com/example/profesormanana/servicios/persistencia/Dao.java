package com.example.profesormanana.servicios.persistencia;

import java.util.List;

/**
 * Created by profesormanana on 23/09/15.
 */
public interface Dao<E> {
    void insert(E entidad);
    void update(E entidad);
    void delete(E entidad);
    void delete(int id);
    List<E> queryAll();
    E queryById(int id);
}
