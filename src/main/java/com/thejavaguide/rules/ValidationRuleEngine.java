package com.thejavaguide.rules;

import com.thejavaguide.rules.result.ValidationResult;

public class ValidationRuleEngine<T> {

    public synchronized ValidationResult fire(Rules rules, T object) {
        ValidationAction action = new ValidationAction();
        if (rules != null && object != null) {
            for (Rule rule : rules) {
                evaluateRule(rule, object, action);
            }
        }
        return action.getValidationResult();
    }

    private void evaluateRule(Rule rule, T object, ValidationAction action) {
        try {
            if (!rule.evaluate(object)) {
                rule.execute(action);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
