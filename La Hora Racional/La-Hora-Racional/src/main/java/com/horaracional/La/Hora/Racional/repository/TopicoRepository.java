package com.horaracional.La.Hora.Racional.repository;

import com.horaracional.La.Hora.Racional.model.Topico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicoRepository extends JpaRepository<Topico, Long> {
    boolean existsByTituloAndMensaje(String titulo, String mensaje);
}