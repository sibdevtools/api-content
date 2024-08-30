package com.github.simple_mocks.content.api.condition;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author sibmaks
 * @since 0.0.1
 */
@Getter
@AllArgsConstructor
public sealed class Condition permits EqualsCondition, IsNullCondition, NotEqualsCondition, NotNullCondition {
    private final String attribute;
    private final ConditionType conditionType;
}
