package com.valery.spring;
import javax.persistence.*;

@Entity
@Table(name = "comentario")
public class Comentario {
    @Id
    @Column(name = "nombre_evento")
    private String nombreEvento;
    @Column
    private String contenido;
    @Column
    private float valoracion;

    // Constructor
    public Comentario(){}

    // Getters y Setters

    public String getNombreEvento() {
        return nombreEvento;
    }

    public void setNombreEvento(String nombreEvento) {
        this.nombreEvento = nombreEvento;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public float getValoracion() {
        return valoracion;
    }

    public void setValoracion(float valoracion) {
        this.valoracion = valoracion;
    }
}
