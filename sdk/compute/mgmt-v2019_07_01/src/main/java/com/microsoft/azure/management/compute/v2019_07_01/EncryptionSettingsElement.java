/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2019_07_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Encryption settings for one disk volume.
 */
public class EncryptionSettingsElement {
    /**
     * Key Vault Secret Url and vault id of the disk encryption key.
     */
    @JsonProperty(value = "diskEncryptionKey")
    private KeyVaultAndSecretReference diskEncryptionKey;

    /**
     * Key Vault Key Url and vault id of the key encryption key.
     * KeyEncryptionKey is optional and when provided is used to unwrap the
     * disk encryption key.
     */
    @JsonProperty(value = "keyEncryptionKey")
    private KeyVaultAndKeyReference keyEncryptionKey;

    /**
     * Get key Vault Secret Url and vault id of the disk encryption key.
     *
     * @return the diskEncryptionKey value
     */
    public KeyVaultAndSecretReference diskEncryptionKey() {
        return this.diskEncryptionKey;
    }

    /**
     * Set key Vault Secret Url and vault id of the disk encryption key.
     *
     * @param diskEncryptionKey the diskEncryptionKey value to set
     * @return the EncryptionSettingsElement object itself.
     */
    public EncryptionSettingsElement withDiskEncryptionKey(KeyVaultAndSecretReference diskEncryptionKey) {
        this.diskEncryptionKey = diskEncryptionKey;
        return this;
    }

    /**
     * Get key Vault Key Url and vault id of the key encryption key. KeyEncryptionKey is optional and when provided is used to unwrap the disk encryption key.
     *
     * @return the keyEncryptionKey value
     */
    public KeyVaultAndKeyReference keyEncryptionKey() {
        return this.keyEncryptionKey;
    }

    /**
     * Set key Vault Key Url and vault id of the key encryption key. KeyEncryptionKey is optional and when provided is used to unwrap the disk encryption key.
     *
     * @param keyEncryptionKey the keyEncryptionKey value to set
     * @return the EncryptionSettingsElement object itself.
     */
    public EncryptionSettingsElement withKeyEncryptionKey(KeyVaultAndKeyReference keyEncryptionKey) {
        this.keyEncryptionKey = keyEncryptionKey;
        return this;
    }

}
