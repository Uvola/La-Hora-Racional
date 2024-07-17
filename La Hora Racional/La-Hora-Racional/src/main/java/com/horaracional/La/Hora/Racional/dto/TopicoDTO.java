package com.horaracional.La.Hora.Racional.dto;

import com.horaracional.La.Hora.Racional.model.Topico;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

public record TopicoDTO(Long id, String titulo, String mensaje, LocalDateTime fechaCreacion, String status, String nombre, String nombre1) {
    }

