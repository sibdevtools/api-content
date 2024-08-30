package com.github.simple_mocks.content.api.rs;

import com.github.simple_mocks.content.api.dto.ContentHolder;
import lombok.Builder;

import java.util.Map;

/**
 * @param contents map of found content, key is code in a group
 * @param <T>      type of content
 * @author sibmaks
 * @since 0.0.1
 */
@Builder
public record GetContentRs<T>(Map<String, ContentHolder<T>> contents) {

}
