package com.Alura.ForoHub.domain.Topico;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DatosActualizarTopico( String titulo,
                                     String mensaje,
                                     Estado estado) {
}
