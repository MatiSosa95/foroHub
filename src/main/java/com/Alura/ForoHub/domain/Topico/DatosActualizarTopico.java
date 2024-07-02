package com.Alura.ForoHub.domain.Topico;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DatosActualizarTopico(@NotBlank String titulo,
                                    @NotBlank String mensaje,
                                    @NotNull Estado estado) {
}
