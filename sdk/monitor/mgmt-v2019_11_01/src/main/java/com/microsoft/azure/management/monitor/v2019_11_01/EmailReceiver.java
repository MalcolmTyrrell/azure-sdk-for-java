/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.monitor.v2019_11_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * An email receiver.
 */
public class EmailReceiver {
    /**
     * The name of the email receiver. Names must be unique across all
     * receivers within an action group.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * The email address of this receiver.
     */
    @JsonProperty(value = "emailAddress", required = true)
    private String emailAddress;

    /**
     * Indicates whether to use common alert schema.
     */
    @JsonProperty(value = "useCommonAlertSchema", required = true)
    private boolean useCommonAlertSchema;

    /**
     * The receiver status of the e-mail. Possible values include:
     * 'NotSpecified', 'Enabled', 'Disabled'.
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private ReceiverStatus status;

    /**
     * Get the name of the email receiver. Names must be unique across all receivers within an action group.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name of the email receiver. Names must be unique across all receivers within an action group.
     *
     * @param name the name value to set
     * @return the EmailReceiver object itself.
     */
    public EmailReceiver withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the email address of this receiver.
     *
     * @return the emailAddress value
     */
    public String emailAddress() {
        return this.emailAddress;
    }

    /**
     * Set the email address of this receiver.
     *
     * @param emailAddress the emailAddress value to set
     * @return the EmailReceiver object itself.
     */
    public EmailReceiver withEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
        return this;
    }

    /**
     * Get indicates whether to use common alert schema.
     *
     * @return the useCommonAlertSchema value
     */
    public boolean useCommonAlertSchema() {
        return this.useCommonAlertSchema;
    }

    /**
     * Set indicates whether to use common alert schema.
     *
     * @param useCommonAlertSchema the useCommonAlertSchema value to set
     * @return the EmailReceiver object itself.
     */
    public EmailReceiver withUseCommonAlertSchema(boolean useCommonAlertSchema) {
        this.useCommonAlertSchema = useCommonAlertSchema;
        return this;
    }

    /**
     * Get the receiver status of the e-mail. Possible values include: 'NotSpecified', 'Enabled', 'Disabled'.
     *
     * @return the status value
     */
    public ReceiverStatus status() {
        return this.status;
    }

}
