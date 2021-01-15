/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2020_05_01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.mediaservices.v2020_05_01.implementation.LiveOutputsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing LiveOutputs.
 */
public interface LiveOutputs extends SupportsCreating<LiveOutput.DefinitionStages.Blank>, HasInner<LiveOutputsInner> {
    /**
     * Get Live Output.
     * Gets a live output.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param liveEventName The name of the live event, maximum length is 32.
     * @param liveOutputName The name of the live output.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<LiveOutput> getAsync(String resourceGroupName, String accountName, String liveEventName, String liveOutputName);

    /**
     * List Live Outputs.
     * Lists the live outputs of a live event.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param liveEventName The name of the live event, maximum length is 32.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<LiveOutput> listAsync(final String resourceGroupName, final String accountName, final String liveEventName);

    /**
     * Delete Live Output.
     * Deletes a live output. Deleting a live output does not delete the asset the live output is writing to.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param liveEventName The name of the live event, maximum length is 32.
     * @param liveOutputName The name of the live output.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String accountName, String liveEventName, String liveOutputName);

}
