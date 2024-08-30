package com.github.simple_mocks.content.api.rq;

import com.github.simple_mocks.content.api.condition.Condition;
import lombok.Builder;

import java.util.List;

/**
 * @author sibmaks
 * @since 0.0.1
 */
@Builder
public record GetContentRq(String systemCode,
                           String type,
                           String code,
                           List<Condition> conditions) {

}
