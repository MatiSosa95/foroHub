package com.Alura.ForoHub.Repository;

import com.Alura.ForoHub.domain.Topico.Topico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TopicoRepository extends JpaRepository<Long, Topico> {
}
