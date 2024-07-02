package com.Alura.ForoHub.domain.Topico;

import com.Alura.ForoHub.domain.Autor.Autor;
import com.Alura.ForoHub.domain.Curso.Curso;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record DatosRegistroTopico(@NotBlank(message = "Titulo Obligatorio") String titulo,
                                  String mensaje,
                                  @NotNull LocalDateTime fechaCreacion,
                                  @NotNull Estado estado,
                                  @NotNull @Valid Autor autor,
                                  @NotNull @Valid Curso curso) {
}
