package com.Alura.ForoHub.domain.Topico;

import com.Alura.ForoHub.domain.Autor.Autor;
import com.Alura.ForoHub.domain.Curso.Curso;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Table(name = "topico")
@Entity(name = "Topico")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Topico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String mensaje;
    private LocalDateTime fechaCreacion;
    @Enumerated(EnumType.STRING)
    private Estado estado;
    @ManyToOne
    private Autor autor;
    @Embedded
    private Curso curso;

    public Topico(DatosRegistroTopico datos) {
        this.titulo= datos.titulo();
        this.mensaje= datos.mensaje();
        this.fechaCreacion= datos.fechaCreacion();
        this.estado= datos.estado();
        this.autor= new Autor(datos.autor());
        this.curso= new Curso(datos.curso());
    }


    public void actualizarDatos(DatosActualizarTopico datos) {
        if (datos.titulo()!=null){
            this.titulo=datos.titulo();
        }

        if (datos.mensaje()!=null){
            this.mensaje=datos.mensaje();
        }

        if (datos.estado()!=null){
            this.estado=datos.estado();
        }
    }
}
