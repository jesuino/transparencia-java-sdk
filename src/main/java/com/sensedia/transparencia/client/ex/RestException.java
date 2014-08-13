package com.sensedia.transparencia.client.ex;

public class RestException extends Exception {

    private final int code;
    private final String message;

    public RestException(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return this.message;
    }

}
