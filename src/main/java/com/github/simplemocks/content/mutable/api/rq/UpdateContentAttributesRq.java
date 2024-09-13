package com.github.simplemocks.content.mutable.api.rq;

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
 *
 * @since 0.0.4
 * @author sibmaks
 */
@Builder
public record UpdateContentAttributesRq(String systemCode,
                                        String type,
                                        String groupCode,
                                        String code,
                                        Map<String, String> attributes) {

}
