// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for TriggerReferenceType. */
public final class TriggerReferenceType extends ExpandableStringEnum<TriggerReferenceType> {
    /** Static value TriggerReference for TriggerReferenceType. */
    public static final TriggerReferenceType TRIGGER_REFERENCE = fromString("TriggerReference");

    /**
     * Creates or finds a TriggerReferenceType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding TriggerReferenceType.
     */
    @JsonCreator
    public static TriggerReferenceType fromString(String name) {
        return fromString(name, TriggerReferenceType.class);
    }

    /** @return known TriggerReferenceType values. */
    public static Collection<TriggerReferenceType> values() {
        return values(TriggerReferenceType.class);
    }
}
