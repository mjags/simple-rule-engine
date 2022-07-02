package com.thejavaguide.rules;

public class Rule<T> implements Comparable<Rule<T>> {
    private Condition<T> condition;

    private String name;
    private String message;
    private String[] messageArgs; // for any placeholders, like {0}

    public Rule() {
    }

    public Rule(final String name, final Condition<T> condition, final String message) {
        this.name = name;
        this.condition = condition;
        this.message = message;
    }

    boolean evaluate(T object) {
        boolean result = condition.evaluate(object);
        setMessageArgs(condition.values());
        return result;
    }

    public void execute(ValidationAction validationAction) {
        validationAction.execute(this.name, this.message, this.messageArgs);
    }

    @Override
    public int compareTo(Rule rule) {
        return getName().compareTo(rule.getName());
    }

    public Condition<T> getCondition() {
        return condition;
    }

    public void setCondition(Condition<T> condition) {
        this.condition = condition;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String[] getMessageArgs() {
        return messageArgs;
    }

    public void setMessageArgs(String[] messageArgs) {
        this.messageArgs = messageArgs;
    }
}
