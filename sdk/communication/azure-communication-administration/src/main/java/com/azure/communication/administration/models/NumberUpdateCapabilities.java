// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.administration.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The NumberUpdateCapabilities model. */
@Fluent
public final class NumberUpdateCapabilities {
    /*
     * Capabilities to be added to a phone number
     */
    @JsonProperty(value = "add")
    private List<Capability> add;

    /*
     * Capabilities to be removed from a phone number
     */
    @JsonProperty(value = "remove")
    private List<Capability> remove;

    /**
     * Get the add property: Capabilities to be added to a phone number.
     *
     * @return the add value.
     */
    public List<Capability> getAdd() {
        return this.add;
    }

    /**
     * Set the add property: Capabilities to be added to a phone number.
     *
     * @param add the add value to set.
     * @return the NumberUpdateCapabilities object itself.
     */
    public NumberUpdateCapabilities setAdd(List<Capability> add) {
        this.add = add;
        return this;
    }

    /**
     * Get the remove property: Capabilities to be removed from a phone number.
     *
     * @return the remove value.
     */
    public List<Capability> getRemove() {
        return this.remove;
    }

    /**
     * Set the remove property: Capabilities to be removed from a phone number.
     *
     * @param remove the remove value to set.
     * @return the NumberUpdateCapabilities object itself.
     */
    public NumberUpdateCapabilities setRemove(List<Capability> remove) {
        this.remove = remove;
        return this;
    }
}
