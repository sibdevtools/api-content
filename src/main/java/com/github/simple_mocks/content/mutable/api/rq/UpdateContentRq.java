package com.github.simple_mocks.content.mutable.api.rq;

import lombok.Builder;

/**
 * Update content request dto
 *
 * @param systemCode system groupCode
 * @param type       type of content
 * @param groupCode  code of content group
 * @param code       code of content
 * @param content    new content value
 * @param <T>        java type of content
 */
@Builder
public record UpdateContentRq<T>(String systemCode,
                                 String type,
                                 String groupCode,
                                 String code,
                                 T content) {

}
