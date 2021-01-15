// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.Duration;
import java.util.List;

/** Describes the properties for producing a series of JPEG images from the input video. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@odata\\.type")
@JsonTypeName("#Microsoft.Media.JpgImage")
@JsonFlatten
@Fluent
public class JpgImage extends Image {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(JpgImage.class);

    /*
     * A collection of output JPEG image layers to be produced by the encoder.
     */
    @JsonProperty(value = "layers")
    private List<JpgLayer> layers;

    /*
     * Sets the number of columns used in thumbnail sprite image.  The number
     * of rows are automatically calculated and a VTT file is generated with
     * the coordinate mappings for each thumbnail in the sprite. Note: this
     * value should be a positive integer and a proper value is recommended so
     * that the output image resolution will not go beyond JPEG maximum pixel
     * resolution limit 65535x65535.
     */
    @JsonProperty(value = "spriteColumn")
    private Integer spriteColumn;

    /**
     * Get the layers property: A collection of output JPEG image layers to be produced by the encoder.
     *
     * @return the layers value.
     */
    public List<JpgLayer> layers() {
        return this.layers;
    }

    /**
     * Set the layers property: A collection of output JPEG image layers to be produced by the encoder.
     *
     * @param layers the layers value to set.
     * @return the JpgImage object itself.
     */
    public JpgImage withLayers(List<JpgLayer> layers) {
        this.layers = layers;
        return this;
    }

    /**
     * Get the spriteColumn property: Sets the number of columns used in thumbnail sprite image. The number of rows are
     * automatically calculated and a VTT file is generated with the coordinate mappings for each thumbnail in the
     * sprite. Note: this value should be a positive integer and a proper value is recommended so that the output image
     * resolution will not go beyond JPEG maximum pixel resolution limit 65535x65535.
     *
     * @return the spriteColumn value.
     */
    public Integer spriteColumn() {
        return this.spriteColumn;
    }

    /**
     * Set the spriteColumn property: Sets the number of columns used in thumbnail sprite image. The number of rows are
     * automatically calculated and a VTT file is generated with the coordinate mappings for each thumbnail in the
     * sprite. Note: this value should be a positive integer and a proper value is recommended so that the output image
     * resolution will not go beyond JPEG maximum pixel resolution limit 65535x65535.
     *
     * @param spriteColumn the spriteColumn value to set.
     * @return the JpgImage object itself.
     */
    public JpgImage withSpriteColumn(Integer spriteColumn) {
        this.spriteColumn = spriteColumn;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public JpgImage withStart(String start) {
        super.withStart(start);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public JpgImage withStep(String step) {
        super.withStep(step);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public JpgImage withRange(String range) {
        super.withRange(range);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public JpgImage withKeyFrameInterval(Duration keyFrameInterval) {
        super.withKeyFrameInterval(keyFrameInterval);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public JpgImage withStretchMode(StretchMode stretchMode) {
        super.withStretchMode(stretchMode);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public JpgImage withSyncMode(VideoSyncMode syncMode) {
        super.withSyncMode(syncMode);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public JpgImage withLabel(String label) {
        super.withLabel(label);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (layers() != null) {
            layers().forEach(e -> e.validate());
        }
    }
}
