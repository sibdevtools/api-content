package com.github.simplemocks.content.mutable.api.rq;

import lombok.Builder;

/**
 * Delete content request dto
 *
 * @param systemCode system groupCode
 * @param type       type of content
 * @param groupCode  code of content group
 * @param code       content code
 */
@Builder
public record DeleteContentRq(String systemCode,
                              String type,
                              String groupCode,
                              String code) {

}
