package examples;

import com.thejavaguide.rules.Condition;

public class TestCondition implements Condition<Object> {
    @Override
    public boolean evaluate(Object object) {
        return (object == null);
    }
}
