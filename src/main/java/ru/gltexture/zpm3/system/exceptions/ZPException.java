package ru.gltexture.zpm3.system.exceptions;

public abstract class ZPException extends RuntimeException {
    public ZPException() {
    }

    public ZPException(String ex) {
        super(ex);
    }

    public ZPException(String ex, Exception e) {
        super(ex, e);
    }

    public ZPException(Exception ex) {
        super(ex);
    }
}
