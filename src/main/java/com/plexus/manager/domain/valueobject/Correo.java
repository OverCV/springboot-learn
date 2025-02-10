package com.plexus.manager.domain.valueobject;

import java.util.Objects;
import java.util.regex.Pattern;

public class Correo {

    private final String cuenta;
    private static final Pattern PATRON_CORREO = Pattern.compile(
            "^[\\w-.]+@[\\w-]+\\.[a-z]{2,}$");

    public Correo(String dato) {
        if (dato == null || !PATRON_CORREO.matcher(dato).matches()) {
            throw new IllegalArgumentException("Correo inválido: " + dato);
        }
        this.cuenta = dato;

    }

    public String getCuenta() {
        return cuenta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Correo))
            return false;
        Correo email = (Correo) o;
        return cuenta.equals(email.cuenta);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cuenta);
    }

}