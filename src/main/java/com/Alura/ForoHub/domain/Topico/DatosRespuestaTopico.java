package com.Alura.ForoHub.domain.Topico;

import com.Alura.ForoHub.domain.Autor.Autor;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record DatosRespuestaTopico( String titulo,
                                   String mensaje,
                                    LocalDateTime fechaCreacion,
                                    Estado estado,
                                    Autor autor,
                                    String curso) {
}
