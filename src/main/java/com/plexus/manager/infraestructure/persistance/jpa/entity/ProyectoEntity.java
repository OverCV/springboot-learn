package com.plexus.manager.infraestructure.persistance.jpa.entity;

import jakarta.persistence.CascadeType;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "projects")
@Data
@NoArgsConstructor
public class ProyectoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    // Para representar el budget, extraemos el valor y la moneda del value object
    // Money.
    private BigDecimal budget;

    private String currency;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "project_id")
    private List<RecursoEntity> resources;
}