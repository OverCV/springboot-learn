package com.plexus.manager.infraestructure.persistance.jpa.entity;

import jakarta.persistence.*;
import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
public class UsuarioEntity {

    @Id
    private String id; // Según tu dominio, el id de usuario es un String

    private String nombre;

    // Almacena como String aunque se use un value object
    private String correo;

    // Almacenar el hash de la contraseña
    private String password;

    @ElementCollection(fetch = FetchType.EAGER)
    private List<String> roles;
}