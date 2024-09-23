package com.github.sibdevtools.content.mutable.api.rq;

import lombok.Builder;

/**
 * Delete content group request dto
 *
 * @param systemCode system code
 * @param type       type of content
 * @param groupCode  code of content group
 */
@Builder
public record DeleteContentGroupRq(String systemCode,
                                   String type,
                                   String groupCode) {

}
