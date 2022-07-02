package com.thejavaguide.rules.result;

public class Error {
    private String message;
    private String field;

    public Error(String field, String message) {
        this.field = field;
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getField() {
        return this.field;
    }

    public void setField(String field) {
        this.field = field;
    }
}
