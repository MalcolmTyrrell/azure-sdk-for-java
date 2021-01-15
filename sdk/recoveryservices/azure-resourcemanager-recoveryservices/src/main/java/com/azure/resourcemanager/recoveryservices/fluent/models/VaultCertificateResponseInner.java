// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservices.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.recoveryservices.models.ResourceCertificateDetails;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Certificate corresponding to a vault that can be used by clients to register themselves with the vault. */
@Fluent
public final class VaultCertificateResponseInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VaultCertificateResponseInner.class);

    /*
     * Certificate details representing the Vault credentials.
     */
    @JsonProperty(value = "properties")
    private ResourceCertificateDetails properties;

    /**
     * Get the properties property: Certificate details representing the Vault credentials.
     *
     * @return the properties value.
     */
    public ResourceCertificateDetails properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Certificate details representing the Vault credentials.
     *
     * @param properties the properties value to set.
     * @return the VaultCertificateResponseInner object itself.
     */
    public VaultCertificateResponseInner withProperties(ResourceCertificateDetails properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
    }
}
