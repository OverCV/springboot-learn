package com.plexus.manager.domain.model;

import java.util.List;

import com.plexus.manager.domain.valueobject.Dinero;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Proyecto {
    private long id;
    private String nombre;
    private Dinero presupuesto;
    private List<Recurso> recursos;
}
