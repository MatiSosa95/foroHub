package com.Alura.ForoHub.Controller;

import com.Alura.ForoHub.Repository.TopicoRepository;
import com.Alura.ForoHub.domain.Topico.*;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/topicos")
public class TopicoController {

    @Autowired
    private TopicoRepository repository;

    //REGISTRO DE TOPICO EN BASE DE DATOS
    @PostMapping
    public ResponseEntity<DatosRespuestaTopico> registrarTopico(@RequestBody @Valid DatosRegistroTopico datos ){
        Topico topico= repository.save(new Topico(datos));

        DatosRespuestaTopico respuestaTopico= new DatosRespuestaTopico(topico.getId(), topico.getTitulo(), topico.getMensaje(),
                topico.getFechaCreacion(),topico.getEstado(),topico.getAutor(), topico.getCurso());
        URI url= UriComponentsBuilder.fromPath("/topicos/{id}").buildAndExpand(topico.getId()).toUri();
        return ResponseEntity.created(url).body(respuestaTopico);
    }

    @GetMapping
    public ResponseEntity<Page<DatosListadoTopico>> listarTopicos(@PageableDefault(size = 10)Pageable page){
        return ResponseEntity.ok(repository.findAll(page).map(DatosListadoTopico::new));

    }

    //BORRADO DE LA BASE DE DATOS
    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity borrarTopico(@PathVariable Long id){
        Topico topico= repository.getReferenceById(id);
        repository.delete(topico);
        return ResponseEntity.noContent().build();
    }

    //TRAE INFORMACION DE UN TOPICO SEGUN ID
    @GetMapping("/{id}")
    public ResponseEntity<DatosRespuestaTopico> datosTopico(@PathVariable Long id){
        Topico topico= repository.getReferenceById(id);

        var datosTopico= new DatosRespuestaTopico(topico.getId(), topico.getTitulo(), topico.getMensaje(),
                topico.getFechaCreacion(), topico.getEstado(), topico.getAutor(), topico.getCurso());
        return ResponseEntity.ok(datosTopico);
    }

    //ACTUALIZAR UN TOPICO
    @PutMapping("/{id}")
    @Transactional
    public ResponseEntity actualizarTopico(@PathVariable Long id, @RequestBody @Valid DatosActualizarTopico datos){
        Topico topico= repository.getReferenceById(id);
        topico.actualizarDatos(datos);

        return ResponseEntity.ok(new DatosRespuestaTopico(topico.getId(), topico.getTitulo(), topico.getMensaje(),
                topico.getFechaCreacion(), topico.getEstado(), topico.getAutor(), topico.getCurso()));

    }




}
