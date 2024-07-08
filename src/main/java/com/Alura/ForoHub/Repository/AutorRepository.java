package com.Alura.ForoHub.Repository;

import com.Alura.ForoHub.domain.Autor.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface AutorRepository extends JpaRepository<Autor, Long> {

    UserDetails findByEmail(String email);
}
