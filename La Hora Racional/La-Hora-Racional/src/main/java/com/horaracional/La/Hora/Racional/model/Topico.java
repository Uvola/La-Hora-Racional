package com.horaracional.La.Hora.Racional.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Topico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String mensaje;
    private LocalDateTime fechaCreacion = LocalDateTime.now();
    private String status;

    @ManyToOne
    private Usuario autor;

    @ManyToOne
    private Curso curso;

    public void setFechaCreacion(LocalDateTime now) {
    }
}

