package com.plexus.manager.domain.valueobject;

import java.math.BigDecimal;
import java.util.Currency;

import lombok.Getter;

@Getter
public class Dinero {

    private final BigDecimal valor;
    private final Currency moneda;

    public Dinero(BigDecimal valor, Currency moneda) {
        if (valor == null || valor.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("El valor del dinero no puede ser nulo ni negativo.");
        }
        if (moneda == null) {
            throw new IllegalArgumentException("La moneda no puede ser nula.");
        }
        this.valor = valor;
        this.moneda = moneda;
    }

    public Dinero sumar(Dinero otro) {
        if (!this.moneda.equals(otro.moneda)) {
            throw new IllegalArgumentException("No se pueden sumar valores con diferentes monedas.");
        }
        return new Dinero(this.valor.add(otro.valor), this.moneda);
    }

    public Dinero restar(Dinero otro) {
        if (!this.moneda.equals(otro.moneda)) {
            throw new IllegalArgumentException("No se pueden restar valores con diferentes monedas.");
        }
        return new Dinero(this.valor.subtract(otro.valor), this.moneda);
    }

    @Override
    public String toString() {
        return moneda.getSymbol() + " " + valor;
    }

}
