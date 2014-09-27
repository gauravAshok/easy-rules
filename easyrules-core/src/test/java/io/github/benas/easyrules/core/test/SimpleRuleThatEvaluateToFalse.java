package io.github.benas.easyrules.core.test;

/**
 * Simple priority rule class used for tests.
 * 
 * @author Mahmoud Ben Hassine (md.benhassine@gmail.com)
 */
public class SimpleRuleThatEvaluateToFalse extends SimpleRule {

    public SimpleRuleThatEvaluateToFalse(String name, String description) {
        super(name, description);
    }

    @Override
    public boolean evaluateConditions() {
        return false;
    }

}