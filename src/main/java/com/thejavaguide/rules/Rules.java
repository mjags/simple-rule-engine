package com.thejavaguide.rules;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Rules implements Iterable<Rule> {

    public final Set<Rule> ruleSet = new TreeSet<>();

    public void register(Rule rule) {
        this.ruleSet.add(rule);
    }

    public void add(Rule rule) {
        this.ruleSet.add(rule);
    }

    public void clear() {
        ruleSet.clear();
    }

    @Override
    public Iterator<Rule> iterator() {
        return ruleSet.iterator();
    }
}
