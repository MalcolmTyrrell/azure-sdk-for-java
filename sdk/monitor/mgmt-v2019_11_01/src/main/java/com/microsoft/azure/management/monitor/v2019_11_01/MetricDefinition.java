/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.monitor.v2019_11_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.monitor.v2019_11_01.implementation.MonitorManager;
import com.microsoft.azure.management.monitor.v2019_11_01.implementation.MetricDefinitionInner;
import com.microsoft.azure.management.monitor.v2019_11_01.implementation.LocalizableStringInner;
import java.util.List;

/**
 * Type representing MetricDefinition.
 */
public interface MetricDefinition extends HasInner<MetricDefinitionInner>, HasManager<MonitorManager> {
    /**
     * @return the dimensions value.
     */
    List<LocalizableStringInner> dimensions();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the isDimensionRequired value.
     */
    Boolean isDimensionRequired();

    /**
     * @return the metricAvailabilities value.
     */
    List<MetricAvailability> metricAvailabilities();

    /**
     * @return the name value.
     */
    LocalizableStringInner name();

    /**
     * @return the namespace value.
     */
    String namespace();

    /**
     * @return the primaryAggregationType value.
     */
    AggregationType primaryAggregationType();

    /**
     * @return the resourceId value.
     */
    String resourceId();

    /**
     * @return the supportedAggregationTypes value.
     */
    List<AggregationType> supportedAggregationTypes();

    /**
     * @return the unit value.
     */
    Unit unit();

}
