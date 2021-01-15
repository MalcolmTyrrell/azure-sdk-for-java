// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** A copy activity Binary sink. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("BinarySink")
@Fluent
public final class BinarySink extends CopySink {
    /*
     * Binary store settings.
     */
    @JsonProperty(value = "storeSettings")
    private StoreWriteSettings storeSettings;

    /**
     * Get the storeSettings property: Binary store settings.
     *
     * @return the storeSettings value.
     */
    public StoreWriteSettings getStoreSettings() {
        return this.storeSettings;
    }

    /**
     * Set the storeSettings property: Binary store settings.
     *
     * @param storeSettings the storeSettings value to set.
     * @return the BinarySink object itself.
     */
    public BinarySink setStoreSettings(StoreWriteSettings storeSettings) {
        this.storeSettings = storeSettings;
        return this;
    }
}
