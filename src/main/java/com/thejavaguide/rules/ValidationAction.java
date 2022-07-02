package com.thejavaguide.rules;

import com.thejavaguide.rules.result.Error;
import com.thejavaguide.rules.result.ValidationResult;

import java.text.MessageFormat;
import java.util.List;

public class ValidationAction {
    private final ValidationResult validationResult;

    public ValidationAction() {
        this.validationResult = new ValidationResult();
    }

    public void execute(String columnName, String message, Object[] messageArgs) {
        List<Error> errors = this.validationResult.getErrors();
        if (messageArgs != null && messageArgs.length > 0) {
            errors.add(new Error(columnName, MessageFormat.format(message, messageArgs)));
        } else {
            errors.add(new Error(columnName, message));
        }
    }

    public ValidationResult getValidationResult() {
        return this.validationResult;
    }
}
