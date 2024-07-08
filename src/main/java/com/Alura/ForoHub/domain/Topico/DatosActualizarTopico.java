package com.Alura.ForoHub.domain.Topico;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DatosActualizarTopico( String titulo,
                                     String mensaje,
                                     Estado estado) {
}
