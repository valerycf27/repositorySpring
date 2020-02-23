package com.valery.spring;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EventoRepository extends CrudRepository<Evento, Integer> {

    List<Evento> findAll();
    List<Evento> findByNombre(String nombre);
}
