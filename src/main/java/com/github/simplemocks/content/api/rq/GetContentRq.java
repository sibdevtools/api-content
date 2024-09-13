package com.github.simplemocks.content.api.rq;

import com.github.simplemocks.content.api.condition.Condition;
import lombok.Builder;

import java.util.List;

/**
 * Get content request dto
 *
 * @param systemCode system code
 * @param type       type of content
 * @param groupCode  code of content group
 * @param conditions conditions for content lookup
 */
@Builder
public record GetContentRq<T>(String systemCode,
                              String type,
                              String groupCode,
                              List<Condition> conditions,
                              Class<T> contentType) {

}
