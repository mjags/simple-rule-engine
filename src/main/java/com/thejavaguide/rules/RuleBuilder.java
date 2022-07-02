package com.thejavaguide.rules;

public class RuleBuilder {
    private String columnName;
    private String message;

    private Condition<? extends Object> condition = null;

    public RuleBuilder name(String columnName) {
        this.columnName = columnName;
        return this;
    }

    public RuleBuilder when(Condition<? extends Object> condition) {
        this.condition = condition;
        return this;
    }

    public RuleBuilder message(String message) {
        this.message = message;
        return this;
    }

    public Rule<Object> build() {
        return new Rule(columnName, condition, message);
    }
}
