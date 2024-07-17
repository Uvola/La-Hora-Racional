package com.horaracional.La.Hora.Racional.repository;

import com.horaracional.La.Hora.Racional.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Usuario findByCorreoElectronico(String correoElectronico);
}
