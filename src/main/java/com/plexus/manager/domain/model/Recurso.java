package com.plexus.manager.domain.model;

import com.plexus.manager.domain.valueobject.RecursoAccion;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Recurso {

    private long id;
    private String nombre;
    private String tipo;
    private RecursoAccion estatus;

    public void asignar() {
        if (!this.estatus.esAsignable()) {
            throw new IllegalStateException(
                    "El recurso no puede asignarse en su estado actual.");
        }
        this.estatus = RecursoAccion.ASIGNADO;
    }

}
