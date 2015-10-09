package com.example.profesormanana.basededatos.modelo.entidades;

import java.util.Date;
import java.util.List;

/**
 * Created by profesormanana on 23/09/15.
 */
public class Noticia {
    private int id;
    private String titulo;
    private String contenido;
    private Date fecha;
    private Autor autor;

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Noticia() {
    }

    public Noticia(String titulo, String contenido, Date fecha, Autor autor) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.fecha = fecha;
        this.autor = autor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer();
        sb.append("titulo='").append(titulo).append('\'');
        return sb.toString();
    }
}
