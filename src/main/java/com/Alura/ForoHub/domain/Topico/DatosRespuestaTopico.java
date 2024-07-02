package com.Alura.ForoHub.domain.Topico;

import com.Alura.ForoHub.domain.Autor.Autor;
import com.Alura.ForoHub.domain.Curso.Curso;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record DatosRespuestaTopico(@NotNull Long id,
                                   @NotBlank String titulo,
                                   String mensaje,
                                   @NotNull LocalDateTime fechaCreacion,
                                   @NotNull Estado estado,
                                   @NotNull Autor autor,
                                   @NotNull Curso curso) {
}
