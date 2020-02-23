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

/*
    @RequestMapping("/opinionesVideojuego")
    public List<Comentario> listaOpinionesVideojuego(String videojuego) {

        List<Comentario> listaOpiniones = repository.findByVideojuego(videojuego);
        return listaOpiniones;
    }

 */
/*
    @RequestMapping("/add_opinion")
    public void addOpinion( String autor, String videojuego,
                            float valoracion,
                            String comentario) {

        Opinion opinion = new Opinion();
        opinion.setAutor(autor);
        opinion.setVideojuego(videojuego);
        opinion.setValoracion(valoracion);
        opinion.setComentario(comentario);

        repository.save(opinion);
    }

 */
}
