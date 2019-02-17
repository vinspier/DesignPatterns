package com.fxb.patterns.visitor.example;

/**
 *
 * 自定义的异常
 * */
public class FileTreatmentException extends RuntimeException {

    public FileTreatmentException() {
    }

    public FileTreatmentException(String message) {
        super(message);
    }
}
