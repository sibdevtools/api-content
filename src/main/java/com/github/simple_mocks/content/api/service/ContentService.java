package com.github.simple_mocks.content.api.service;

import com.github.simple_mocks.content.api.rq.GetContentRq;
import com.github.simple_mocks.content.api.rs.GetContentRs;
import jakarta.annotation.Nonnull;

/**
 * @author sibmaks
 * @since 0.0.1
 */
public interface ContentService {

    /**
     * Get content from storage
     *
     * @param rq  request for content
     * @param <T> type of content
     * @return list of found content
     */
    <T> GetContentRs<T> getContent(@Nonnull GetContentRq<T> rq);

}
