package com.github.simplemocks.content.api.service;

import com.github.simplemocks.content.api.rq.GetContentRq;
import com.github.simplemocks.content.api.rs.GetContentRs;
import jakarta.annotation.Nonnull;

/**
 * Readonly content service
 *
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
