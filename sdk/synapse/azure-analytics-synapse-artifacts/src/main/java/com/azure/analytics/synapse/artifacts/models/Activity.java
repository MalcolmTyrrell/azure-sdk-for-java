// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** A pipeline activity. */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "type",
        defaultImpl = Activity.class)
@JsonTypeName("Activity")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "Container", value = ControlActivity.class),
    @JsonSubTypes.Type(name = "Execution", value = ExecutionActivity.class),
    @JsonSubTypes.Type(name = "ExecutePipeline", value = ExecutePipelineActivity.class),
    @JsonSubTypes.Type(name = "IfCondition", value = IfConditionActivity.class),
    @JsonSubTypes.Type(name = "Switch", value = SwitchActivity.class),
    @JsonSubTypes.Type(name = "ForEach", value = ForEachActivity.class),
    @JsonSubTypes.Type(name = "Wait", value = WaitActivity.class),
    @JsonSubTypes.Type(name = "Until", value = UntilActivity.class),
    @JsonSubTypes.Type(name = "Validation", value = ValidationActivity.class),
    @JsonSubTypes.Type(name = "Filter", value = FilterActivity.class),
    @JsonSubTypes.Type(name = "SetVariable", value = SetVariableActivity.class),
    @JsonSubTypes.Type(name = "AppendVariable", value = AppendVariableActivity.class),
    @JsonSubTypes.Type(name = "WebHook", value = WebHookActivity.class),
    @JsonSubTypes.Type(name = "SqlPoolStoredProcedure", value = SqlPoolStoredProcedureActivity.class)
})
@Fluent
public class Activity {
    /*
     * Activity name.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * Activity description.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * Activity depends on condition.
     */
    @JsonProperty(value = "dependsOn")
    private List<ActivityDependency> dependsOn;

    /*
     * Activity user properties.
     */
    @JsonProperty(value = "userProperties")
    private List<UserProperty> userProperties;

    /*
     * A pipeline activity.
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the name property: Activity name.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: Activity name.
     *
     * @param name the name value to set.
     * @return the Activity object itself.
     */
    public Activity setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the description property: Activity description.
     *
     * @return the description value.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Set the description property: Activity description.
     *
     * @param description the description value to set.
     * @return the Activity object itself.
     */
    public Activity setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the dependsOn property: Activity depends on condition.
     *
     * @return the dependsOn value.
     */
    public List<ActivityDependency> getDependsOn() {
        return this.dependsOn;
    }

    /**
     * Set the dependsOn property: Activity depends on condition.
     *
     * @param dependsOn the dependsOn value to set.
     * @return the Activity object itself.
     */
    public Activity setDependsOn(List<ActivityDependency> dependsOn) {
        this.dependsOn = dependsOn;
        return this;
    }

    /**
     * Get the userProperties property: Activity user properties.
     *
     * @return the userProperties value.
     */
    public List<UserProperty> getUserProperties() {
        return this.userProperties;
    }

    /**
     * Set the userProperties property: Activity user properties.
     *
     * @param userProperties the userProperties value to set.
     * @return the Activity object itself.
     */
    public Activity setUserProperties(List<UserProperty> userProperties) {
        this.userProperties = userProperties;
        return this;
    }

    /**
     * Get the additionalProperties property: A pipeline activity.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: A pipeline activity.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the Activity object itself.
     */
    public Activity setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void setAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }
}
