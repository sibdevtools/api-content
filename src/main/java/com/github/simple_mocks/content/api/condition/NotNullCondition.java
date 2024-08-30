package com.github.simple_mocks.content.api.condition;

/**
 * @author sibmaks
 * @since 0.0.1
 */
public final class NotNullCondition extends Condition {

    public NotNullCondition(String attribute) {
        super(attribute, ConditionType.NOT_NULL);
    }

}
