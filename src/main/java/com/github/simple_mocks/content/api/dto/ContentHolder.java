package com.github.simple_mocks.content.api.dto;

import lombok.*;

import java.util.Map;

/**
 * @author sibmaks
 * @since 0.0.1
 */
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ContentHolder<T> {
    private String code;
    private Map<String, String> attributes;
    private T content;
}
