package com.github.simplemocks.content.api.rs;

import com.github.simplemocks.common.api.dto.ErrorRsDto;
import com.github.simplemocks.common.api.rs.StandardBodyRs;
import com.github.simplemocks.content.api.dto.ContentHolder;
import jakarta.annotation.Nonnull;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * Get content response dto
 *
 * @param <T> type of content
 * @author sibmaks
 * @since 0.0.1
 */
public class GetContentRs<T> extends StandardBodyRs<HashMap<String, ContentHolder<T>>> {

    /**
     * Construct get content response
     *
     * @param contents map of found content, key is code in a group
     */
    public GetContentRs(Map<String, ContentHolder<T>> contents) {
        super(
                Optional.ofNullable(contents)
                        .map(HashMap::new)
                        .orElseGet(HashMap::new)
        );
    }

    /**
     * Construct get content response with error
     *
     * @param error happened error
     */
    public GetContentRs(@Nonnull ErrorRsDto error) {
        super(error);
    }

}
