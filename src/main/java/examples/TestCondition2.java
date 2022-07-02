package examples;

import com.thejavaguide.rules.Condition;

public class TestCondition2 implements Condition<String> {
    @Override
    public boolean evaluate(String object) {
        return object.equalsIgnoreCase("test");
    }
}
