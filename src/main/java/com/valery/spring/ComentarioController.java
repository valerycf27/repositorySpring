package com.valery.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class ComentarioController {

    @Autowired
    private ComentarioRepository repository;

    @RequestMapping("/comentarios")
    public List<Comentario> listaComentarios() {

        List<Comentario> listaComentarios = repository.findAll();
        return listaComentarios;
    }

    /**
     * METODO PARA SELECCIONAR LOS COMENTARIOS POR EL NOMBRE DEL EVENTO
     */
    @RequestMapping("/comentariosNombre")
    public List<Comentario> listaOpinionesVideojuego(String nombreEvento) {

        List<Comentario> listaComentarios = repository.findByNombreEvento(nombreEvento);
        return listaComentarios;
    }

    /**
     * METODO PARA AÑADIR COMENTARIOS
     */
    @RequestMapping("/addComentario")
    public void addComentario( String nombreEvento, String contenido,
                               float valoracion) {

        Comentario comentario = new Comentario();
        comentario.setNombreEvento(nombreEvento);
        comentario.setContenido(contenido);
        comentario.setValoracion(valoracion);

        repository.save(comentario);
    }

}
