// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for TransformType. */
public final class TransformType extends ExpandableStringEnum<TransformType> {
    /** Static value Lowercase for TransformType. */
    public static final TransformType LOWERCASE = fromString("Lowercase");

    /** Static value Uppercase for TransformType. */
    public static final TransformType UPPERCASE = fromString("Uppercase");

    /** Static value Trim for TransformType. */
    public static final TransformType TRIM = fromString("Trim");

    /** Static value UrlDecode for TransformType. */
    public static final TransformType URL_DECODE = fromString("UrlDecode");

    /** Static value UrlEncode for TransformType. */
    public static final TransformType URL_ENCODE = fromString("UrlEncode");

    /** Static value RemoveNulls for TransformType. */
    public static final TransformType REMOVE_NULLS = fromString("RemoveNulls");

    /**
     * Creates or finds a TransformType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding TransformType.
     */
    @JsonCreator
    public static TransformType fromString(String name) {
        return fromString(name, TransformType.class);
    }

    /** @return known TransformType values. */
    public static Collection<TransformType> values() {
        return values(TransformType.class);
    }
}
