/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cdn.implementation;

import com.microsoft.azure.management.cdn.Sku;
import com.microsoft.azure.management.cdn.ProfileResourceState;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * CDN profile represents the top level resource and the entry point into the
 * CDN API. This allows users to set up a logical grouping of endpoints in
 * addition to creating shared configuration settings and selecting pricing
 * tiers and providers.
 */
@JsonFlatten
public class ProfileInner extends Resource {
    /**
     * The SKU (pricing tier) of the CDN profile.
     */
    @JsonProperty(required = true)
    private Sku sku;

    /**
     * Resource status of the profile. Possible values include: 'Creating',
     * 'Active', 'Deleting', 'Disabled'.
     */
    @JsonProperty(value = "properties.resourceState", access = JsonProperty.Access.WRITE_ONLY)
    private ProfileResourceState resourceState;

    /**
     * Provisioning status of the profile.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /**
     * Get the sku value.
     *
     * @return the sku value
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Set the sku value.
     *
     * @param sku the sku value to set
     * @return the ProfileInner object itself.
     */
    public ProfileInner withSku(Sku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the resourceState value.
     *
     * @return the resourceState value
     */
    public ProfileResourceState resourceState() {
        return this.resourceState;
    }

    /**
     * Get the provisioningState value.
     *
     * @return the provisioningState value
     */
    public String provisioningState() {
        return this.provisioningState;
    }

}
