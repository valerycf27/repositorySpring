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

    @RequestMapping("/eventosLugar")
    public List<Evento> listaEventosLugar(String lugar) {

        List<Evento> listaEventos = repository.findByLugar(lugar);
        return listaEventos;
    }

    @RequestMapping("/eventosOrganizador")
    public List<Evento> listaEventosOrganizador(String organizador) {

        List<Evento> listaEventos = repository.findByOrganizador(organizador);
        return listaEventos;
    }

    @RequestMapping("/eventosGuardados")
    public List<Evento> listaEventosGuardados(boolean guardado) {

        List<Evento> listaEventos = repository.findByGuardado(guardado);
        return listaEventos;
    }

    @RequestMapping("/anadirEvento")
    public void addVideojuego( String nombre,
                               String lugar,
                               String fecha,
                               String hora,
                               long aforo,
                               String organizador,
                               String artistasInvitados,
                               String descripcion,
                               float precio,
                               float estrellas,
                               boolean guardado,
                               float latitud,
                               float longitud) {

        Evento evento = new Evento();
        evento.setNombre(nombre);
        evento.setLugar(lugar);
        evento.setFecha(fecha);
        evento.setHora(hora);
        evento.setAforo(aforo);
        evento.setOrganizador(organizador);
        evento.setArtistasInvitados(artistasInvitados);
        evento.setDescripcion(descripcion);
        evento.setPrecio(precio);
        evento.setEstrellas(estrellas);
        evento.setGuardado(guardado);
        evento.setLatitud(latitud);
        evento.setLongitud(longitud);

        repository.save(evento);
    }

    @RequestMapping("/guardarEvento")
    public void updateEvento(int id){

        Evento evento = repository.findById(id).get();
        evento.setGuardado(true);
        repository.save(evento);
    }

}
