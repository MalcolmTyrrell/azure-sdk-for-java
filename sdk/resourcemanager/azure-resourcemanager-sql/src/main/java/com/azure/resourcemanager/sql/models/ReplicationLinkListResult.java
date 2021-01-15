// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.sql.fluent.models.ReplicationLinkInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Represents the response to a List database replication link request. */
@Fluent
public final class ReplicationLinkListResult {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ReplicationLinkListResult.class);

    /*
     * The list of database replication links housed in the database.
     */
    @JsonProperty(value = "value")
    private List<ReplicationLinkInner> value;

    /**
     * Get the value property: The list of database replication links housed in the database.
     *
     * @return the value value.
     */
    public List<ReplicationLinkInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of database replication links housed in the database.
     *
     * @param value the value value to set.
     * @return the ReplicationLinkListResult object itself.
     */
    public ReplicationLinkListResult withValue(List<ReplicationLinkInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
