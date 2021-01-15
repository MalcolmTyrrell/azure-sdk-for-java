// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservices.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Raw certificate data. */
@Fluent
public final class RawCertificateData {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RawCertificateData.class);

    /*
     * Specifies the authentication type.
     */
    @JsonProperty(value = "authType")
    private AuthType authType;

    /*
     * The base64 encoded certificate raw data string
     */
    @JsonProperty(value = "certificate")
    private byte[] certificate;

    /**
     * Get the authType property: Specifies the authentication type.
     *
     * @return the authType value.
     */
    public AuthType authType() {
        return this.authType;
    }

    /**
     * Set the authType property: Specifies the authentication type.
     *
     * @param authType the authType value to set.
     * @return the RawCertificateData object itself.
     */
    public RawCertificateData withAuthType(AuthType authType) {
        this.authType = authType;
        return this;
    }

    /**
     * Get the certificate property: The base64 encoded certificate raw data string.
     *
     * @return the certificate value.
     */
    public byte[] certificate() {
        return CoreUtils.clone(this.certificate);
    }

    /**
     * Set the certificate property: The base64 encoded certificate raw data string.
     *
     * @param certificate the certificate value to set.
     * @return the RawCertificateData object itself.
     */
    public RawCertificateData withCertificate(byte[] certificate) {
        this.certificate = CoreUtils.clone(certificate);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
