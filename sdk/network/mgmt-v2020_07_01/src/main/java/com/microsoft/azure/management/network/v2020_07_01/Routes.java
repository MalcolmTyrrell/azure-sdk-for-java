/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_07_01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.network.v2020_07_01.implementation.RoutesInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing Routes.
 */
public interface Routes extends SupportsCreating<Route.DefinitionStages.Blank>, HasInner<RoutesInner> {
    /**
     * Gets the specified route from a route table.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeTableName The name of the route table.
     * @param routeName The name of the route.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Route> getAsync(String resourceGroupName, String routeTableName, String routeName);

    /**
     * Gets all routes in a route table.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeTableName The name of the route table.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Route> listAsync(final String resourceGroupName, final String routeTableName);

    /**
     * Deletes the specified route from a route table.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeTableName The name of the route table.
     * @param routeName The name of the route.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String routeTableName, String routeName);

}
