package com.valery.spring;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ComentarioRepository extends CrudRepository<Comentario, Integer> {

    List<Comentario> findAll();
    List<Comentario> findByNombreEvento(String nombreEvento);
}
