// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Optional. Allows users to provide customer managed keys for encrypting the OS and data disks in the gallery artifact.
 */
@Fluent
public final class EncryptionImages {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(EncryptionImages.class);

    /*
     * This is the disk image encryption base class.
     */
    @JsonProperty(value = "osDiskImage")
    private DiskImageEncryption osDiskImage;

    /*
     * A list of encryption specifications for data disk images.
     */
    @JsonProperty(value = "dataDiskImages")
    private List<DataDiskImageEncryption> dataDiskImages;

    /**
     * Get the osDiskImage property: This is the disk image encryption base class.
     *
     * @return the osDiskImage value.
     */
    public DiskImageEncryption osDiskImage() {
        return this.osDiskImage;
    }

    /**
     * Set the osDiskImage property: This is the disk image encryption base class.
     *
     * @param osDiskImage the osDiskImage value to set.
     * @return the EncryptionImages object itself.
     */
    public EncryptionImages withOsDiskImage(DiskImageEncryption osDiskImage) {
        this.osDiskImage = osDiskImage;
        return this;
    }

    /**
     * Get the dataDiskImages property: A list of encryption specifications for data disk images.
     *
     * @return the dataDiskImages value.
     */
    public List<DataDiskImageEncryption> dataDiskImages() {
        return this.dataDiskImages;
    }

    /**
     * Set the dataDiskImages property: A list of encryption specifications for data disk images.
     *
     * @param dataDiskImages the dataDiskImages value to set.
     * @return the EncryptionImages object itself.
     */
    public EncryptionImages withDataDiskImages(List<DataDiskImageEncryption> dataDiskImages) {
        this.dataDiskImages = dataDiskImages;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (osDiskImage() != null) {
            osDiskImage().validate();
        }
        if (dataDiskImages() != null) {
            dataDiskImages().forEach(e -> e.validate());
        }
    }
}
