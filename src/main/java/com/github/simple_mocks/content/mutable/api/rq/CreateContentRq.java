package com.github.simple_mocks.content.mutable.api.rq;

import lombok.Builder;

import java.util.Map;

/**
 * Create content request dto
 *
 * @param systemCode system code
 * @param type       type of content
 * @param groupCode  code of content group
 * @param code       code of content
 * @param attributes attributes
 * @param content    content value
 * @param <T>        Java content type
 */
@Builder
public record CreateContentRq<T>(String systemCode,
                                 String type,
                                 String groupCode,
                                 String code,
                                 Map<String, String> attributes,
                                 T content) {

}
