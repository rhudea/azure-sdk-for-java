package com.microsoft.azure.management.resources.fluentcore.model;


import com.microsoft.azure.management.resources.fluentcore.arm.models.HasId;

import java.util.List;

/**
 * Represents result of batch of create operations.
 * <p>
 * (Note: this interface is not intended to be implemented by user code)
 * @param <ResourceT> the type of the resource in this batch.
 */
public interface CreatedResources<ResourceT extends HasId> extends List<ResourceT> {
    /**
     * Gets a created resource with the given key.
     *
     * @param key the key of the resource
     * @return the created resource
     */
    HasId createdRelatedResource(String key);
}
