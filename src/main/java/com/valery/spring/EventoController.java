package com.valery.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EventoController {

    @Autowired
    private EventoRepository repository;

    @RequestMapping("/eventos")
    public List<Evento> listaEventos() {

        List<Evento> listaEventos = repository.findAll();
        return listaEventos;
    }

    @RequestMapping("/eventosNombre")
    public List<Evento> listaEventosNombre(String nombre) {

        List<Evento> listaEventos = repository.findByNombre(nombre);
        return listaEventos;
    }

}
