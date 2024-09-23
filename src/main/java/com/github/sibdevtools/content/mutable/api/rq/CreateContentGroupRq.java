package com.github.sibdevtools.content.mutable.api.rq;

import lombok.Builder;

/**
 * Create content group request dto
 *
 * @param systemCode system code
 * @param type       type of content
 * @param code       code of content group
 */
@Builder
public record CreateContentGroupRq(String systemCode,
                                   String type,
                                   String code) {

}
