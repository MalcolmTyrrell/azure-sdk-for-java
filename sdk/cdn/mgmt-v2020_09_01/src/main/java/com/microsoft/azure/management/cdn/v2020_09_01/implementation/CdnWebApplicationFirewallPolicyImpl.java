/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cdn.v2020_09_01.implementation;

import com.microsoft.azure.arm.resources.models.implementation.GroupableResourceCoreImpl;
import com.microsoft.azure.management.cdn.v2020_09_01.CdnWebApplicationFirewallPolicy;
import rx.Observable;
import com.microsoft.azure.management.cdn.v2020_09_01.SystemData;
import com.microsoft.azure.management.cdn.v2020_09_01.PolicySettings;
import com.microsoft.azure.management.cdn.v2020_09_01.RateLimitRuleList;
import com.microsoft.azure.management.cdn.v2020_09_01.CustomRuleList;
import com.microsoft.azure.management.cdn.v2020_09_01.ManagedRuleSetList;
import java.util.List;
import com.microsoft.azure.management.cdn.v2020_09_01.CdnEndpoint;
import com.microsoft.azure.management.cdn.v2020_09_01.ProvisioningState;
import com.microsoft.azure.management.cdn.v2020_09_01.PolicyResourceState;
import com.microsoft.azure.management.cdn.v2020_09_01.Sku;

class CdnWebApplicationFirewallPolicyImpl extends GroupableResourceCoreImpl<CdnWebApplicationFirewallPolicy, CdnWebApplicationFirewallPolicyInner, CdnWebApplicationFirewallPolicyImpl, CdnManager> implements CdnWebApplicationFirewallPolicy, CdnWebApplicationFirewallPolicy.Definition, CdnWebApplicationFirewallPolicy.Update {
    CdnWebApplicationFirewallPolicyImpl(String name, CdnWebApplicationFirewallPolicyInner inner, CdnManager manager) {
        super(name, inner, manager);
    }

    @Override
    public Observable<CdnWebApplicationFirewallPolicy> createResourceAsync() {
        PoliciesInner client = this.manager().inner().policies();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<CdnWebApplicationFirewallPolicy> updateResourceAsync() {
        PoliciesInner client = this.manager().inner().policies();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<CdnWebApplicationFirewallPolicyInner> getInnerAsync() {
        PoliciesInner client = this.manager().inner().policies();
        return client.getByResourceGroupAsync(this.resourceGroupName(), this.name());
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public CustomRuleList customRules() {
        return this.inner().customRules();
    }

    @Override
    public List<CdnEndpoint> endpointLinks() {
        return this.inner().endpointLinks();
    }

    @Override
    public String etag() {
        return this.inner().etag();
    }

    @Override
    public ManagedRuleSetList managedRules() {
        return this.inner().managedRules();
    }

    @Override
    public PolicySettings policySettings() {
        return this.inner().policySettings();
    }

    @Override
    public ProvisioningState provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public RateLimitRuleList rateLimitRules() {
        return this.inner().rateLimitRules();
    }

    @Override
    public PolicyResourceState resourceState() {
        return this.inner().resourceState();
    }

    @Override
    public Sku sku() {
        return this.inner().sku();
    }

    @Override
    public SystemData systemData() {
        return this.inner().systemData();
    }

    @Override
    public CdnWebApplicationFirewallPolicyImpl withSku(Sku sku) {
        this.inner().withSku(sku);
        return this;
    }

    @Override
    public CdnWebApplicationFirewallPolicyImpl withCustomRules(CustomRuleList customRules) {
        this.inner().withCustomRules(customRules);
        return this;
    }

    @Override
    public CdnWebApplicationFirewallPolicyImpl withEtag(String etag) {
        this.inner().withEtag(etag);
        return this;
    }

    @Override
    public CdnWebApplicationFirewallPolicyImpl withManagedRules(ManagedRuleSetList managedRules) {
        this.inner().withManagedRules(managedRules);
        return this;
    }

    @Override
    public CdnWebApplicationFirewallPolicyImpl withPolicySettings(PolicySettings policySettings) {
        this.inner().withPolicySettings(policySettings);
        return this;
    }

    @Override
    public CdnWebApplicationFirewallPolicyImpl withRateLimitRules(RateLimitRuleList rateLimitRules) {
        this.inner().withRateLimitRules(rateLimitRules);
        return this;
    }

}
