/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_07_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for FirewallPolicyNatRuleCollectionActionType.
 */
public final class FirewallPolicyNatRuleCollectionActionType extends ExpandableStringEnum<FirewallPolicyNatRuleCollectionActionType> {
    /** Static value DNAT for FirewallPolicyNatRuleCollectionActionType. */
    public static final FirewallPolicyNatRuleCollectionActionType DNAT = fromString("DNAT");

    /**
     * Creates or finds a FirewallPolicyNatRuleCollectionActionType from its string representation.
     * @param name a name to look for
     * @return the corresponding FirewallPolicyNatRuleCollectionActionType
     */
    @JsonCreator
    public static FirewallPolicyNatRuleCollectionActionType fromString(String name) {
        return fromString(name, FirewallPolicyNatRuleCollectionActionType.class);
    }

    /**
     * @return known FirewallPolicyNatRuleCollectionActionType values
     */
    public static Collection<FirewallPolicyNatRuleCollectionActionType> values() {
        return values(FirewallPolicyNatRuleCollectionActionType.class);
    }
}
