/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.avs.v2019_08_09_preview.implementation;

import com.microsoft.azure.management.avs.v2019_08_09_preview.OperationDisplay;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A REST API operation.
 */
public class OperationInner {
    /**
     * Name of the operation being performed on this object.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /**
     * Contains the localized display information for this operation.
     */
    @JsonProperty(value = "display", access = JsonProperty.Access.WRITE_ONLY)
    private OperationDisplay display;

    /**
     * Get name of the operation being performed on this object.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Get contains the localized display information for this operation.
     *
     * @return the display value
     */
    public OperationDisplay display() {
        return this.display;
    }

}