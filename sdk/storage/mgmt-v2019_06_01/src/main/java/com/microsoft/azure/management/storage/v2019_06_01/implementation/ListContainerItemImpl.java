/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storage.v2019_06_01.implementation;

import com.microsoft.azure.management.storage.v2019_06_01.ListContainerItem;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import org.joda.time.DateTime;
import com.microsoft.azure.management.storage.v2019_06_01.ImmutabilityPolicyProperties;
import com.microsoft.azure.management.storage.v2019_06_01.LeaseDuration;
import com.microsoft.azure.management.storage.v2019_06_01.LeaseState;
import com.microsoft.azure.management.storage.v2019_06_01.LeaseStatus;
import com.microsoft.azure.management.storage.v2019_06_01.LegalHoldProperties;
import java.util.Map;
import com.microsoft.azure.management.storage.v2019_06_01.PublicAccess;

class ListContainerItemImpl extends WrapperImpl<ListContainerItemInner> implements ListContainerItem {
    private final StorageManager manager;
    ListContainerItemImpl(ListContainerItemInner inner, StorageManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public StorageManager manager() {
        return this.manager;
    }

    @Override
    public String defaultEncryptionScope() {
        return this.inner().defaultEncryptionScope();
    }

    @Override
    public Boolean deleted() {
        return this.inner().deleted();
    }

    @Override
    public DateTime deletedTime() {
        return this.inner().deletedTime();
    }

    @Override
    public Boolean denyEncryptionScopeOverride() {
        return this.inner().denyEncryptionScopeOverride();
    }

    @Override
    public String etag() {
        return this.inner().etag();
    }

    @Override
    public Boolean hasImmutabilityPolicy() {
        return this.inner().hasImmutabilityPolicy();
    }

    @Override
    public Boolean hasLegalHold() {
        return this.inner().hasLegalHold();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public ImmutabilityPolicyProperties immutabilityPolicy() {
        return this.inner().immutabilityPolicy();
    }

    @Override
    public DateTime lastModifiedTime() {
        return this.inner().lastModifiedTime();
    }

    @Override
    public LeaseDuration leaseDuration() {
        return this.inner().leaseDuration();
    }

    @Override
    public LeaseState leaseState() {
        return this.inner().leaseState();
    }

    @Override
    public LeaseStatus leaseStatus() {
        return this.inner().leaseStatus();
    }

    @Override
    public LegalHoldProperties legalHold() {
        return this.inner().legalHold();
    }

    @Override
    public Map<String, String> metadata() {
        return this.inner().metadata();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public PublicAccess publicAccess() {
        return this.inner().publicAccess();
    }

    @Override
    public Integer remainingRetentionDays() {
        return this.inner().remainingRetentionDays();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public String version() {
        return this.inner().version();
    }

}
