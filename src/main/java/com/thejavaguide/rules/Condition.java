package com.thejavaguide.rules;

public interface Condition<T> {
    boolean evaluate(final T object);

    default String[] values() {
        return new String[0];
    }
}
