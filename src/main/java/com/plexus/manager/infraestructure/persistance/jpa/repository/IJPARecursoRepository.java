package com.plexus.manager.infraestructure.persistance.jpa.repository;

import com.plexus.manager.infraestructure.persistance.jpa.entity.RecursoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IJPARecursoRepository extends JpaRepository<RecursoEntity, Long> {
}
