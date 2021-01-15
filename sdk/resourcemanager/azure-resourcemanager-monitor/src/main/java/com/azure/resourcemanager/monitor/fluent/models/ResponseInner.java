// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.Duration;
import java.util.List;

/** The response to a metrics query. */
@Fluent
public final class ResponseInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ResponseInner.class);

    /*
     * The integer value representing the cost of the query, for data case.
     */
    @JsonProperty(value = "cost")
    private Integer cost;

    /*
     * The timespan for which the data was retrieved. Its value consists of two
     * datetimes concatenated, separated by '/'.  This may be adjusted in the
     * future and returned back from what was originally requested.
     */
    @JsonProperty(value = "timespan", required = true)
    private String timespan;

    /*
     * The interval (window size) for which the metric data was returned in.
     * This may be adjusted in the future and returned back from what was
     * originally requested.  This is not present if a metadata request was
     * made.
     */
    @JsonProperty(value = "interval")
    private Duration interval;

    /*
     * The namespace of the metrics been queried
     */
    @JsonProperty(value = "namespace")
    private String namespace;

    /*
     * The region of the resource been queried for metrics.
     */
    @JsonProperty(value = "resourceregion")
    private String resourceRegion;

    /*
     * the value of the collection.
     */
    @JsonProperty(value = "value", required = true)
    private List<MetricInner> value;

    /**
     * Get the cost property: The integer value representing the cost of the query, for data case.
     *
     * @return the cost value.
     */
    public Integer cost() {
        return this.cost;
    }

    /**
     * Set the cost property: The integer value representing the cost of the query, for data case.
     *
     * @param cost the cost value to set.
     * @return the ResponseInner object itself.
     */
    public ResponseInner withCost(Integer cost) {
        this.cost = cost;
        return this;
    }

    /**
     * Get the timespan property: The timespan for which the data was retrieved. Its value consists of two datetimes
     * concatenated, separated by '/'. This may be adjusted in the future and returned back from what was originally
     * requested.
     *
     * @return the timespan value.
     */
    public String timespan() {
        return this.timespan;
    }

    /**
     * Set the timespan property: The timespan for which the data was retrieved. Its value consists of two datetimes
     * concatenated, separated by '/'. This may be adjusted in the future and returned back from what was originally
     * requested.
     *
     * @param timespan the timespan value to set.
     * @return the ResponseInner object itself.
     */
    public ResponseInner withTimespan(String timespan) {
        this.timespan = timespan;
        return this;
    }

    /**
     * Get the interval property: The interval (window size) for which the metric data was returned in. This may be
     * adjusted in the future and returned back from what was originally requested. This is not present if a metadata
     * request was made.
     *
     * @return the interval value.
     */
    public Duration interval() {
        return this.interval;
    }

    /**
     * Set the interval property: The interval (window size) for which the metric data was returned in. This may be
     * adjusted in the future and returned back from what was originally requested. This is not present if a metadata
     * request was made.
     *
     * @param interval the interval value to set.
     * @return the ResponseInner object itself.
     */
    public ResponseInner withInterval(Duration interval) {
        this.interval = interval;
        return this;
    }

    /**
     * Get the namespace property: The namespace of the metrics been queried.
     *
     * @return the namespace value.
     */
    public String namespace() {
        return this.namespace;
    }

    /**
     * Set the namespace property: The namespace of the metrics been queried.
     *
     * @param namespace the namespace value to set.
     * @return the ResponseInner object itself.
     */
    public ResponseInner withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * Get the resourceRegion property: The region of the resource been queried for metrics.
     *
     * @return the resourceRegion value.
     */
    public String resourceRegion() {
        return this.resourceRegion;
    }

    /**
     * Set the resourceRegion property: The region of the resource been queried for metrics.
     *
     * @param resourceRegion the resourceRegion value to set.
     * @return the ResponseInner object itself.
     */
    public ResponseInner withResourceRegion(String resourceRegion) {
        this.resourceRegion = resourceRegion;
        return this;
    }

    /**
     * Get the value property: the value of the collection.
     *
     * @return the value value.
     */
    public List<MetricInner> value() {
        return this.value;
    }

    /**
     * Set the value property: the value of the collection.
     *
     * @param value the value value to set.
     * @return the ResponseInner object itself.
     */
    public ResponseInner withValue(List<MetricInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (timespan() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property timespan in model ResponseInner"));
        }
        if (value() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property value in model ResponseInner"));
        } else {
            value().forEach(e -> e.validate());
        }
    }
}
