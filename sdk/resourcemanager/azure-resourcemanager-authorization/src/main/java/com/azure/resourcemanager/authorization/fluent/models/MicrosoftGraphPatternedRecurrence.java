// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.Map;

/** patternedRecurrence. */
@Fluent
public final class MicrosoftGraphPatternedRecurrence {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MicrosoftGraphPatternedRecurrence.class);

    /*
     * recurrencePattern
     */
    @JsonProperty(value = "pattern")
    private MicrosoftGraphRecurrencePattern pattern;

    /*
     * recurrenceRange
     */
    @JsonProperty(value = "range")
    private MicrosoftGraphRecurrenceRange range;

    /*
     * patternedRecurrence
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the pattern property: recurrencePattern.
     *
     * @return the pattern value.
     */
    public MicrosoftGraphRecurrencePattern pattern() {
        return this.pattern;
    }

    /**
     * Set the pattern property: recurrencePattern.
     *
     * @param pattern the pattern value to set.
     * @return the MicrosoftGraphPatternedRecurrence object itself.
     */
    public MicrosoftGraphPatternedRecurrence withPattern(MicrosoftGraphRecurrencePattern pattern) {
        this.pattern = pattern;
        return this;
    }

    /**
     * Get the range property: recurrenceRange.
     *
     * @return the range value.
     */
    public MicrosoftGraphRecurrenceRange range() {
        return this.range;
    }

    /**
     * Set the range property: recurrenceRange.
     *
     * @param range the range value to set.
     * @return the MicrosoftGraphPatternedRecurrence object itself.
     */
    public MicrosoftGraphPatternedRecurrence withRange(MicrosoftGraphRecurrenceRange range) {
        this.range = range;
        return this;
    }

    /**
     * Get the additionalProperties property: patternedRecurrence.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: patternedRecurrence.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphPatternedRecurrence object itself.
     */
    public MicrosoftGraphPatternedRecurrence withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void withAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (pattern() != null) {
            pattern().validate();
        }
        if (range() != null) {
            range().validate();
        }
    }
}
