package com.github.simple_mocks.content.api.condition;

/**
 * @author sibmaks
 * @since 0.0.1
 */
public final class IsNullCondition extends Condition {

    public IsNullCondition(String attribute) {
        super(attribute, ConditionType.IS_NULL);
    }

}
