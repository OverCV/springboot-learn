package com.plexus.manager.infraestructure.persistance.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plexus.manager.infraestructure.persistance.jpa.entity.UsuarioEntity;

@Repository
public interface IJPAUsuarioRepository extends JpaRepository<UsuarioEntity, String> {
}
