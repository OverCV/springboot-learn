package com.plexus.manager.domain.model;

import java.util.List;

import com.plexus.manager.domain.valueobject.Correo;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Usuario {

    private String id;
    private String nombre;
    private Correo correo;
    private String clave;
    private List<String> roles;

}
