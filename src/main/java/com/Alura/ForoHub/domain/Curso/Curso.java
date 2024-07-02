package com.Alura.ForoHub.domain.Curso;

import com.Alura.ForoHub.domain.Topico.Topico;
import jakarta.persistence.*;
import lombok.*;

@Table(name = "curso")
@Entity(name = "Curso")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    @Enumerated(EnumType.STRING)
    private Categoria categoria;

    public Curso(Curso curso) {
        this.id= curso.id;
        this.nombre= curso.nombre;
        this.categoria= curso.categoria;
    }
}
