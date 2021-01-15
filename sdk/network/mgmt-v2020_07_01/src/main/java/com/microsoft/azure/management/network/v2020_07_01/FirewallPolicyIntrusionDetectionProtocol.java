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
 * Defines values for FirewallPolicyIntrusionDetectionProtocol.
 */
public final class FirewallPolicyIntrusionDetectionProtocol extends ExpandableStringEnum<FirewallPolicyIntrusionDetectionProtocol> {
    /** Static value TCP for FirewallPolicyIntrusionDetectionProtocol. */
    public static final FirewallPolicyIntrusionDetectionProtocol TCP = fromString("TCP");

    /** Static value UDP for FirewallPolicyIntrusionDetectionProtocol. */
    public static final FirewallPolicyIntrusionDetectionProtocol UDP = fromString("UDP");

    /** Static value ICMP for FirewallPolicyIntrusionDetectionProtocol. */
    public static final FirewallPolicyIntrusionDetectionProtocol ICMP = fromString("ICMP");

    /** Static value ANY for FirewallPolicyIntrusionDetectionProtocol. */
    public static final FirewallPolicyIntrusionDetectionProtocol ANY = fromString("ANY");

    /**
     * Creates or finds a FirewallPolicyIntrusionDetectionProtocol from its string representation.
     * @param name a name to look for
     * @return the corresponding FirewallPolicyIntrusionDetectionProtocol
     */
    @JsonCreator
    public static FirewallPolicyIntrusionDetectionProtocol fromString(String name) {
        return fromString(name, FirewallPolicyIntrusionDetectionProtocol.class);
    }

    /**
     * @return known FirewallPolicyIntrusionDetectionProtocol values
     */
    public static Collection<FirewallPolicyIntrusionDetectionProtocol> values() {
        return values(FirewallPolicyIntrusionDetectionProtocol.class);
    }
}
