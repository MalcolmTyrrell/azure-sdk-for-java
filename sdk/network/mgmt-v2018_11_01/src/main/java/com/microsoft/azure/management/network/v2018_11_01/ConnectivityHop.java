/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_11_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Information about a hop between the source and the destination.
 */
public class ConnectivityHop {
    /**
     * The type of the hop.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /**
     * The ID of the hop.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /**
     * The IP address of the hop.
     */
    @JsonProperty(value = "address", access = JsonProperty.Access.WRITE_ONLY)
    private String address;

    /**
     * The ID of the resource corresponding to this hop.
     */
    @JsonProperty(value = "resourceId", access = JsonProperty.Access.WRITE_ONLY)
    private String resourceId;

    /**
     * List of next hop identifiers.
     */
    @JsonProperty(value = "nextHopIds", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> nextHopIds;

    /**
     * List of issues.
     */
    @JsonProperty(value = "issues", access = JsonProperty.Access.WRITE_ONLY)
    private List<ConnectivityIssue> issues;

    /**
     * Get the type of the hop.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Get the ID of the hop.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the IP address of the hop.
     *
     * @return the address value
     */
    public String address() {
        return this.address;
    }

    /**
     * Get the ID of the resource corresponding to this hop.
     *
     * @return the resourceId value
     */
    public String resourceId() {
        return this.resourceId;
    }

    /**
     * Get list of next hop identifiers.
     *
     * @return the nextHopIds value
     */
    public List<String> nextHopIds() {
        return this.nextHopIds;
    }

    /**
     * Get list of issues.
     *
     * @return the issues value
     */
    public List<ConnectivityIssue> issues() {
        return this.issues;
    }

}
