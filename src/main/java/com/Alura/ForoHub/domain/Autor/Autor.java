package com.Alura.ForoHub.domain.Autor;

import com.Alura.ForoHub.domain.Topico.Topico;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;
@Entity(name = "Autor")
@Table(name = "autores")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Autor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    @Column(unique = true)
    private String email;
    private String contrasenia;
    @Enumerated(EnumType.STRING)
    private Perfil perfil;
    @OneToMany(mappedBy = "autor", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Topico> topicos;

    public Autor(Autor autor) {
        this.id= autor.id;
        this.nombre= autor.nombre;
        this.email=autor.email;
        this.perfil= autor.perfil;

    }
}
