package com.github.simple_mocks.content.mutable.api.rq;

import lombok.Builder;

import java.util.Map;

/**
 * Update content request dto
 *
 * @param systemCode system groupCode
 * @param type       type of content
 * @param groupCode  code of content group
 * @param code       code of content
 * @param attributes attributes
 * @param content    new content value
 */
@Builder
public record UpdateContentRq<T>(String systemCode,
                                 String type,
                                 String groupCode,
                                 String code,
                                 Map<String, String> attributes,
                                 T content) {

}
