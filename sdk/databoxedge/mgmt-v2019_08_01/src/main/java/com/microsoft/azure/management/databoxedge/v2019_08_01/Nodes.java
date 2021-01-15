/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.databoxedge.v2019_08_01;

import rx.Observable;
import com.microsoft.azure.management.databoxedge.v2019_08_01.implementation.NodesInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing Nodes.
 */
public interface Nodes extends HasInner<NodesInner> {
    /**
     * Gets all the nodes currently configured under this Data Box Edge device.
     *
     * @param deviceName The device name.
     * @param resourceGroupName The resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Node> listByDataBoxEdgeDeviceAsync(String deviceName, String resourceGroupName);

}
