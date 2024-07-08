package com.Alura.ForoHub.domain.Topico;

import com.Alura.ForoHub.domain.Autor.Autor;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;


public record DatosRegistroTopico(@NotBlank(message = "Titulo Obligatorio") String titulo,
                                  String mensaje,
                                  @NotNull Estado estado,
                                  @NotNull @Valid Autor autor,
                                  @NotBlank String curso) {
}
