package com.valery.spring;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EventoRepository extends CrudRepository<Evento, Integer> {

    List<Evento> findAll();
    List<Evento> findByNombre(String nombre);
    List<Evento> findByLugar(String lugar);
    List<Evento> findByOrganizador(String organizador);
    List<Evento> findByGuardado(boolean guardado);
}
