package com.github.simple_mocks.content.api.rq;

import com.github.simple_mocks.content.api.condition.Condition;
import lombok.Builder;

import java.util.List;

/**
 * Get content request dto
 *
 * @param systemCode system code
 * @param type       type of content
 * @param code       code of content group
 * @param conditions conditions for content lookup
 */
@Builder
public record GetContentRq(String systemCode,
                           String type,
                           String code,
                           List<Condition> conditions) {

}
