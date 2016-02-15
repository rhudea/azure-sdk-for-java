/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 0.15.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.management.network.models;

import java.util.List;

/**
 * The Error model.
 */
public class Error {
    /**
     * The code property.
     */
    private String code;

    /**
     * The message property.
     */
    private String message;

    /**
     * The target property.
     */
    private String target;

    /**
     * The details property.
     */
    private List<ErrorDetails> details;

    /**
     * The innerError property.
     */
    private String innerError;

    /**
     * Get the code value.
     *
     * @return the code value
     */
    public String getCode() {
        return this.code;
    }

    /**
     * Set the code value.
     *
     * @param code the code value to set
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Get the message value.
     *
     * @return the message value
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * Set the message value.
     *
     * @param message the message value to set
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Get the target value.
     *
     * @return the target value
     */
    public String getTarget() {
        return this.target;
    }

    /**
     * Set the target value.
     *
     * @param target the target value to set
     */
    public void setTarget(String target) {
        this.target = target;
    }

    /**
     * Get the details value.
     *
     * @return the details value
     */
    public List<ErrorDetails> getDetails() {
        return this.details;
    }

    /**
     * Set the details value.
     *
     * @param details the details value to set
     */
    public void setDetails(List<ErrorDetails> details) {
        this.details = details;
    }

    /**
     * Get the innerError value.
     *
     * @return the innerError value
     */
    public String getInnerError() {
        return this.innerError;
    }

    /**
     * Set the innerError value.
     *
     * @param innerError the innerError value to set
     */
    public void setInnerError(String innerError) {
        this.innerError = innerError;
    }

}