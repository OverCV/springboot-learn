package com.plexus.manager.application.mapper;

import com.plexus.manager.domain.model.Recurso;
import com.plexus.manager.infraestructure.persistance.jpa.entity.RecursoEntity;

public class RecursoMapper {

    public static RecursoEntity toEntity(Recurso resource) {
        if (resource == null) {
            return null;
        }
        RecursoEntity entity = new RecursoEntity();
        entity.setId(resource.getId());
        entity.setNombre(resource.getNombre());
        entity.setTipo(resource.getTipo());
        entity.setEstatus(resource.getEstatus());
        return entity;
    }

    public static Recurso toDomain(RecursoEntity entity) {
        if (entity == null) {
            return null;
        }
        Recurso resource = new Recurso();
        resource.setId(entity.getId());
        resource.setNombre(entity.getNombre());
        resource.setTipo(entity.getTipo());
        resource.setEstatus(entity.getEstatus());
        return resource;
    }
}
