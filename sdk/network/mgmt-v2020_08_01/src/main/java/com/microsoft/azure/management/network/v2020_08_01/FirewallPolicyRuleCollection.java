/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_08_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * Properties of the rule collection.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "ruleCollectionType", defaultImpl = FirewallPolicyRuleCollection.class)
@JsonTypeName("FirewallPolicyRuleCollection")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "FirewallPolicyNatRuleCollection", value = FirewallPolicyNatRuleCollection.class),
    @JsonSubTypes.Type(name = "FirewallPolicyFilterRuleCollection", value = FirewallPolicyFilterRuleCollection.class)
})
public class FirewallPolicyRuleCollection {
    /**
     * The name of the rule collection.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Priority of the Firewall Policy Rule Collection resource.
     */
    @JsonProperty(value = "priority")
    private Integer priority;

    /**
     * Get the name of the rule collection.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name of the rule collection.
     *
     * @param name the name value to set
     * @return the FirewallPolicyRuleCollection object itself.
     */
    public FirewallPolicyRuleCollection withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get priority of the Firewall Policy Rule Collection resource.
     *
     * @return the priority value
     */
    public Integer priority() {
        return this.priority;
    }

    /**
     * Set priority of the Firewall Policy Rule Collection resource.
     *
     * @param priority the priority value to set
     * @return the FirewallPolicyRuleCollection object itself.
     */
    public FirewallPolicyRuleCollection withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

}
