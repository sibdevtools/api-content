package com.github.simple_mocks.content.mutable.api.service;

import com.github.simple_mocks.content.mutable.api.rq.*;

/**
 * @author sibmaks
 * @since 0.0.1
 */
public interface MutableContentService {

    /**
     * Create a system in content service.
     * Do nothing in case if the system is already created.
     *
     * @param rq creation request
     */
    void createSystem(CreateSystemRq rq);

    /**
     * Delete a system in content service.
     * Do nothing in case if the system already deleted.
     *
     * @param rq deletion request
     */
    void deleteSystem(DeleteSystemRq rq);

    /**
     * Create a content group in content service.
     * Do nothing in case if the group already exists.
     *
     * @param rq creation request
     */
    void createContentGroup(CreateContentGroupRq rq);

    /**
     * Delete a content group in content service.
     * In case if some content exists in the group, throw an exception.
     * Do nothing in case if the group already deleted.
     *
     * @param rq delete request
     */
    void deleteContentGroup(DeleteContentGroupRq rq);

    /**
     * Create a content in content service.
     * In case if the content already exists, throw an exception.
     *
     * @param rq  creation request
     * @param <T> content type
     */
    <T> void createContent(CreateContentRq<T> rq);

    /**
     * Update a content in content service.
     * In case if the content doesn't exist, throw an exception.
     *
     * @param rq  update request
     * @param <T> content type
     */
    <T> void updateContent(UpdateContentRq<T> rq);

    /**
     * Update content's attributes in content service.
     * In case if the content doesn't exist, throw an exception.
     *
     * @param rq update request
     */
    void updateContentAttributes(UpdateContentAttributesRq rq);

    /**
     * Delete a content in content service.
     * Do nothing in case if the content is already deleted.
     *
     * @param rq delete request
     */
    void deleteContent(DeleteContentRq rq);
}
