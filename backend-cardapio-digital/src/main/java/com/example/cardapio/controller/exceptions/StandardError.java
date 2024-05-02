package com.example.cardapio.controller.exceptions;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.time.Instant;

public class StandardError implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:HH:mm:ss'Z'", timezone = "GMT")
    private Instant timeStamp;
    private Integer status;
    private String error;
    private String message;
    private String path;
    public StandardError() {
    }
    public StandardError(Instant timeStamp, Integer status, String error, String message, String path) {
        super();
        this.timeStamp = timeStamp;
        this.status = status;
        this.error = error;
        this.message = message;
        this.path = path;
    }
}