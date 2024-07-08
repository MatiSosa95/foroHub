package com.Alura.ForoHub.Controller;

import com.Alura.ForoHub.Infra.Seguridad.DatosJWTToken;
import com.Alura.ForoHub.Infra.Seguridad.TokenService;
import com.Alura.ForoHub.domain.Autor.Autor;
import com.Alura.ForoHub.domain.Autor.DatosAutentificadorAutor;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class AutenticationController {
    @Autowired
    private AuthenticationManager authenticationManager;

     @Autowired
     private TokenService tokenService;

    @PostMapping
    public ResponseEntity autenticarAutor(@RequestBody @Valid DatosAutentificadorAutor datos){
        Authentication authenticationToken= new UsernamePasswordAuthenticationToken(datos.email(), datos.clave());
        var autorAutentificado= authenticationManager.authenticate(authenticationToken);
        var JWTtoken= tokenService.generarToken((Autor) autorAutentificado.getPrincipal());

        return ResponseEntity.ok(new DatosJWTToken(JWTtoken));
    }


}
