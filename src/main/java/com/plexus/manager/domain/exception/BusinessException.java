package com.plexus.manager.domain.exception;

public class BusinessException extends RuntimeException {

    protected BusinessException(String mensaje) {
        super(mensaje);
    }

}