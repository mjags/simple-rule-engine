package com.thejavaguide.rules.result;

import java.util.ArrayList;
import java.util.List;

public class ValidationResult {
    private List<Error> errors = new ArrayList<>();

    public boolean isValid() {
        return errors.isEmpty();
    }

    public void setErrors(List<Error> errors) {
        this.errors = errors;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (Error error : errors) {
            builder.append(error.getField()).append(" : ").append(error.getMessage());
        }
        return builder.toString();
    }

    public List<Error> getErrors() {
        return this.errors;
    }
}
