package examples;

import com.thejavaguide.rules.Rule;
import com.thejavaguide.rules.RuleBuilder;
import com.thejavaguide.rules.Rules;
import com.thejavaguide.rules.ValidationRuleEngine;
import com.thejavaguide.rules.result.ValidationResult;

public class TestRule {
    public static void main(String[] arg) {
        TestRule testRule = new TestRule();
        testRule.triggerRules();
    }

    private void triggerRules() {
        ValidationRuleEngine validationRuleEngine = new ValidationRuleEngine();
        ValidationResult result1 = validationRuleEngine.fire(buildRules1(), "");
        System.out.println("RuleSet 1: " + result1.toString());
        ValidationResult result2 = validationRuleEngine.fire(buildRules2(), "Hello!!!");
        System.out.println("RuleSet 2: " + result2.toString());
        ValidationResult result3 = validationRuleEngine.fire(buildRules2(), "test");
        System.out.println("RuleSet 3: " + result3.toString());     //result should be blank
    }

    private Rules buildRules1() {
        TestCondition condition = new TestCondition();
        Rule rule = new RuleBuilder()
                .name("testRule")                       //given
                .when(condition)                        //when
                .message("Object should be null")       //message
                .build();
        Rules rules = new Rules();
        rules.add(rule);
        return rules;
    }

    private Rules buildRules2() {
        TestCondition2 condition = new TestCondition2();
        Rule rule = new RuleBuilder().name("testRule")            //given
                .when(condition)                                  //when
                .message("Expected string is `test`")             //message
                .build();
        Rules rules = new Rules();
        rules.add(rule);
        return rules;
    }
}
