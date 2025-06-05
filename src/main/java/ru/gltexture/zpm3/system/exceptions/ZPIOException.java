package ru.gltexture.zpm3.system.exceptions;

public class ZPIOException extends ZPException {
    public ZPIOException() {
    }

    public ZPIOException(String ex) {
        super(ex);
    }

    public ZPIOException(String ex, Exception e) {
        super(ex, e);
    }

    public ZPIOException(Exception ex) {
        super(ex);
    }
}
