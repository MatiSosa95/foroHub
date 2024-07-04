package com.Alura.ForoHub.domain.Curso;

import com.Alura.ForoHub.domain.Topico.Topico;
import jakarta.persistence.*;
import lombok.*;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Curso {

    private String nombre;
    @Enumerated(EnumType.STRING)
    private Categoria categoria;

    public Curso(Curso curso) {
        this.nombre= curso.nombre;
        this.categoria= curso.categoria;
    }
}
