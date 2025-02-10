package com.plexus.manager.infraestructure.persistance.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plexus.manager.infraestructure.persistance.jpa.entity.ProyectoEntity;

@Repository
public interface IJPAProyectoRepository extends JpaRepository<ProyectoEntity, Long> {

}
