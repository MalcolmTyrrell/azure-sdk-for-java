// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.sql.fluent.models.ServiceObjectiveInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Represents the response to a get database service objectives request. */
@Fluent
public final class ServiceObjectiveListResult {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ServiceObjectiveListResult.class);

    /*
     * The list of database service objectives.
     */
    @JsonProperty(value = "value", required = true)
    private List<ServiceObjectiveInner> value;

    /**
     * Get the value property: The list of database service objectives.
     *
     * @return the value value.
     */
    public List<ServiceObjectiveInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of database service objectives.
     *
     * @param value the value value to set.
     * @return the ServiceObjectiveListResult object itself.
     */
    public ServiceObjectiveListResult withValue(List<ServiceObjectiveInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property value in model ServiceObjectiveListResult"));
        } else {
            value().forEach(e -> e.validate());
        }
    }
}
