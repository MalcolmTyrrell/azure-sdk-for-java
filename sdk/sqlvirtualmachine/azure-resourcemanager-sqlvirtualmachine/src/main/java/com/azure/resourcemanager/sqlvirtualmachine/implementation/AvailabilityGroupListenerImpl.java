// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sqlvirtualmachine.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.sqlvirtualmachine.SqlVirtualMachineManager;
import com.azure.resourcemanager.sqlvirtualmachine.fluent.models.AvailabilityGroupListenerInner;
import com.azure.resourcemanager.sqlvirtualmachine.models.AvailabilityGroupListener;
import com.azure.resourcemanager.sqlvirtualmachine.models.LoadBalancerConfiguration;
import java.util.Collections;
import java.util.List;

public final class AvailabilityGroupListenerImpl
    implements AvailabilityGroupListener, AvailabilityGroupListener.Definition, AvailabilityGroupListener.Update {
    private AvailabilityGroupListenerInner innerObject;

    private final SqlVirtualMachineManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String provisioningState() {
        return this.innerModel().provisioningState();
    }

    public String availabilityGroupName() {
        return this.innerModel().availabilityGroupName();
    }

    public List<LoadBalancerConfiguration> loadBalancerConfigurations() {
        List<LoadBalancerConfiguration> inner = this.innerModel().loadBalancerConfigurations();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public Boolean createDefaultAvailabilityGroupIfNotExist() {
        return this.innerModel().createDefaultAvailabilityGroupIfNotExist();
    }

    public Integer port() {
        return this.innerModel().port();
    }

    public AvailabilityGroupListenerInner innerModel() {
        return this.innerObject;
    }

    private SqlVirtualMachineManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String sqlVirtualMachineGroupName;

    private String availabilityGroupListenerName;

    public AvailabilityGroupListenerImpl withExistingSqlVirtualMachineGroup(
        String resourceGroupName, String sqlVirtualMachineGroupName) {
        this.resourceGroupName = resourceGroupName;
        this.sqlVirtualMachineGroupName = sqlVirtualMachineGroupName;
        return this;
    }

    public AvailabilityGroupListener create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAvailabilityGroupListeners()
                .createOrUpdate(
                    resourceGroupName,
                    sqlVirtualMachineGroupName,
                    availabilityGroupListenerName,
                    this.innerModel(),
                    Context.NONE);
        return this;
    }

    public AvailabilityGroupListener create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAvailabilityGroupListeners()
                .createOrUpdate(
                    resourceGroupName,
                    sqlVirtualMachineGroupName,
                    availabilityGroupListenerName,
                    this.innerModel(),
                    context);
        return this;
    }

    AvailabilityGroupListenerImpl(String name, SqlVirtualMachineManager serviceManager) {
        this.innerObject = new AvailabilityGroupListenerInner();
        this.serviceManager = serviceManager;
        this.availabilityGroupListenerName = name;
    }

    public AvailabilityGroupListenerImpl update() {
        return this;
    }

    public AvailabilityGroupListener apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAvailabilityGroupListeners()
                .createOrUpdate(
                    resourceGroupName,
                    sqlVirtualMachineGroupName,
                    availabilityGroupListenerName,
                    this.innerModel(),
                    Context.NONE);
        return this;
    }

    public AvailabilityGroupListener apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAvailabilityGroupListeners()
                .createOrUpdate(
                    resourceGroupName,
                    sqlVirtualMachineGroupName,
                    availabilityGroupListenerName,
                    this.innerModel(),
                    context);
        return this;
    }

    AvailabilityGroupListenerImpl(AvailabilityGroupListenerInner innerObject, SqlVirtualMachineManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.sqlVirtualMachineGroupName = Utils.getValueFromIdByName(innerObject.id(), "sqlVirtualMachineGroups");
        this.availabilityGroupListenerName = Utils.getValueFromIdByName(innerObject.id(), "availabilityGroupListeners");
    }

    public AvailabilityGroupListener refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAvailabilityGroupListeners()
                .getWithResponse(
                    resourceGroupName, sqlVirtualMachineGroupName, availabilityGroupListenerName, Context.NONE)
                .getValue();
        return this;
    }

    public AvailabilityGroupListener refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAvailabilityGroupListeners()
                .getWithResponse(resourceGroupName, sqlVirtualMachineGroupName, availabilityGroupListenerName, context)
                .getValue();
        return this;
    }

    public AvailabilityGroupListenerImpl withAvailabilityGroupName(String availabilityGroupName) {
        this.innerModel().withAvailabilityGroupName(availabilityGroupName);
        return this;
    }

    public AvailabilityGroupListenerImpl withLoadBalancerConfigurations(
        List<LoadBalancerConfiguration> loadBalancerConfigurations) {
        this.innerModel().withLoadBalancerConfigurations(loadBalancerConfigurations);
        return this;
    }

    public AvailabilityGroupListenerImpl withCreateDefaultAvailabilityGroupIfNotExist(
        Boolean createDefaultAvailabilityGroupIfNotExist) {
        this.innerModel().withCreateDefaultAvailabilityGroupIfNotExist(createDefaultAvailabilityGroupIfNotExist);
        return this;
    }

    public AvailabilityGroupListenerImpl withPort(Integer port) {
        this.innerModel().withPort(port);
        return this;
    }
}
