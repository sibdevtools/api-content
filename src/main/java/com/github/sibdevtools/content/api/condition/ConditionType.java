package com.github.sibdevtools.content.api.condition;

/**
 * Set of all supported condition types.
 * <p>
 * Used in {@link Condition} as marker.
 * </p>
 *
 * @author sibmaks
 * @since 0.0.1
 */
public enum ConditionType {
    /**
     * Attribute are equal to passed value.
     */
    EQ,
    /**
     * Attribute are not equal to passed value.
     */
    NOT_EQ,
    /**
     * Attribute is null.
     */
    IS_NULL,
    /**
     * Attribute is not null.
     */
    NOT_NULL
}
