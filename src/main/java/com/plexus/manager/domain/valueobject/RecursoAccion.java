package com.plexus.manager.domain.valueobject;

public enum RecursoAccion {
    DISPONIBLE, // El recurso está disponible para ser asignado
    ASIGNADO, // El recurso está actualmente en uso
    MANTENIMIENTO, // El recurso está en mantenimiento
    RETIRADO; // El recurso ha sido retirado del sistema

    // Si está DISPONIBLE puede asignarse
    public boolean esAsignable() {
        return this == DISPONIBLE;
        // La instancia es Disponible?
    }
}
