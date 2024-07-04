package com.Alura.ForoHub.domain.Topico;

import com.Alura.ForoHub.domain.Autor.Autor;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDateTime;

public record DatosListadoTopico(@NotNull Long id,
                                 @NotBlank String titulo,
                                 String mensaje,
                                 @NotNull LocalDateTime fechaCreacion,
                                 @NotNull Estado estado,
                                 @NotBlank String autor,
                                 @NotNull String curso) {

    public DatosListadoTopico(Topico topico){
        this(topico.getId(), topico.getTitulo(), topico.getMensaje(), topico.getFechaCreacion(),topico.getEstado(),
                topico.getAutor().getNombre(), topico.getCurso());
    }
}
