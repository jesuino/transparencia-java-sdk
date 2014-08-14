package com.sensedia.transparencia.client.ex;

public class RestException extends Exception {

    private final int code;
    private final String message;
    private final String httpMessage;

    public RestException(int code, String message, String httpMessage) {
        this.code = code;
        this.message = message;
        this.httpMessage = httpMessage;
    }

    public int getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return this.message;
    }

    public String getHttpMessage() {
        return httpMessage;
    }

}
