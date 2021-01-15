/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2020_05_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * A video analyzer preset that extracts insights (rich metadata) from both
 * audio and video, and outputs a JSON format file.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@odata\\.type", defaultImpl = VideoAnalyzerPreset.class)
@JsonTypeName("#Microsoft.Media.VideoAnalyzerPreset")
public class VideoAnalyzerPreset extends AudioAnalyzerPreset {
    /**
     * Defines the type of insights that you want the service to generate. The
     * allowed values are 'AudioInsightsOnly', 'VideoInsightsOnly', and
     * 'AllInsights'. The default is AllInsights. If you set this to
     * AllInsights and the input is audio only, then only audio insights are
     * generated. Similarly if the input is video only, then only video
     * insights are generated. It is recommended that you not use
     * AudioInsightsOnly if you expect some of your inputs to be video only; or
     * use VideoInsightsOnly if you expect some of your inputs to be audio
     * only. Your Jobs in such conditions would error out. Possible values
     * include: 'AudioInsightsOnly', 'VideoInsightsOnly', 'AllInsights'.
     */
    @JsonProperty(value = "insightsToExtract")
    private InsightsType insightsToExtract;

    /**
     * Get defines the type of insights that you want the service to generate. The allowed values are 'AudioInsightsOnly', 'VideoInsightsOnly', and 'AllInsights'. The default is AllInsights. If you set this to AllInsights and the input is audio only, then only audio insights are generated. Similarly if the input is video only, then only video insights are generated. It is recommended that you not use AudioInsightsOnly if you expect some of your inputs to be video only; or use VideoInsightsOnly if you expect some of your inputs to be audio only. Your Jobs in such conditions would error out. Possible values include: 'AudioInsightsOnly', 'VideoInsightsOnly', 'AllInsights'.
     *
     * @return the insightsToExtract value
     */
    public InsightsType insightsToExtract() {
        return this.insightsToExtract;
    }

    /**
     * Set defines the type of insights that you want the service to generate. The allowed values are 'AudioInsightsOnly', 'VideoInsightsOnly', and 'AllInsights'. The default is AllInsights. If you set this to AllInsights and the input is audio only, then only audio insights are generated. Similarly if the input is video only, then only video insights are generated. It is recommended that you not use AudioInsightsOnly if you expect some of your inputs to be video only; or use VideoInsightsOnly if you expect some of your inputs to be audio only. Your Jobs in such conditions would error out. Possible values include: 'AudioInsightsOnly', 'VideoInsightsOnly', 'AllInsights'.
     *
     * @param insightsToExtract the insightsToExtract value to set
     * @return the VideoAnalyzerPreset object itself.
     */
    public VideoAnalyzerPreset withInsightsToExtract(InsightsType insightsToExtract) {
        this.insightsToExtract = insightsToExtract;
        return this;
    }

}
