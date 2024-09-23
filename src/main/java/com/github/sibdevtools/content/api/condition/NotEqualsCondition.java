package com.github.sibdevtools.content.api.condition;

import lombok.Getter;

/**
 * @author sibmaks
 * @since 0.0.1
 */
@Getter
public final class NotEqualsCondition extends Condition {
    private final String value;

    public NotEqualsCondition(String attribute, String value) {
        super(attribute, ConditionType.NOT_EQ);
        this.value = value;
    }
}
