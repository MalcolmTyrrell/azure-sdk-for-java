// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** A copy activity Document Database Collection source. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("DocumentDbCollectionSource")
@Fluent
public final class DocumentDbCollectionSource extends CopySource {
    /*
     * Documents query. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "query")
    private Object query;

    /*
     * Nested properties separator. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "nestingSeparator")
    private Object nestingSeparator;

    /*
     * Query timeout. Type: string (or Expression with resultType string),
     * pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     */
    @JsonProperty(value = "queryTimeout")
    private Object queryTimeout;

    /**
     * Get the query property: Documents query. Type: string (or Expression with resultType string).
     *
     * @return the query value.
     */
    public Object getQuery() {
        return this.query;
    }

    /**
     * Set the query property: Documents query. Type: string (or Expression with resultType string).
     *
     * @param query the query value to set.
     * @return the DocumentDbCollectionSource object itself.
     */
    public DocumentDbCollectionSource setQuery(Object query) {
        this.query = query;
        return this;
    }

    /**
     * Get the nestingSeparator property: Nested properties separator. Type: string (or Expression with resultType
     * string).
     *
     * @return the nestingSeparator value.
     */
    public Object getNestingSeparator() {
        return this.nestingSeparator;
    }

    /**
     * Set the nestingSeparator property: Nested properties separator. Type: string (or Expression with resultType
     * string).
     *
     * @param nestingSeparator the nestingSeparator value to set.
     * @return the DocumentDbCollectionSource object itself.
     */
    public DocumentDbCollectionSource setNestingSeparator(Object nestingSeparator) {
        this.nestingSeparator = nestingSeparator;
        return this;
    }

    /**
     * Get the queryTimeout property: Query timeout. Type: string (or Expression with resultType string), pattern:
     * ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     *
     * @return the queryTimeout value.
     */
    public Object getQueryTimeout() {
        return this.queryTimeout;
    }

    /**
     * Set the queryTimeout property: Query timeout. Type: string (or Expression with resultType string), pattern:
     * ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     *
     * @param queryTimeout the queryTimeout value to set.
     * @return the DocumentDbCollectionSource object itself.
     */
    public DocumentDbCollectionSource setQueryTimeout(Object queryTimeout) {
        this.queryTimeout = queryTimeout;
        return this;
    }
}
