/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.implementation;

import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Response for Azure Sql Import/Export Status operation.
 */
@JsonFlatten
public class ImportExportOperationStatusResponseInner {
    /**
     * Gets or sets the request type of the operation.
     */
    @JsonProperty(value = "properties.requestType")
    private String requestType;

    /**
     * Gets or sets the request type of the operation.
     */
    @JsonProperty(value = "properties.requestId")
    private UUID requestId;

    /**
     * Gets or sets the name of the Azure SQL Server.
     */
    @JsonProperty(value = "properties.serverName")
    private String serverName;

    /**
     * Gets or sets the name of the Azure SQL Database.
     */
    @JsonProperty(value = "properties.databaseName")
    private String databaseName;

    /**
     * Gets or sets the status message returned from the server.
     */
    @JsonProperty(value = "properties.status")
    private String status;

    /**
     * Gets or sets the operation status last modified time.
     */
    @JsonProperty(value = "properties.lastModifiedTime")
    private String lastModifiedTime;

    /**
     * Gets or sets the operation queued time.
     */
    @JsonProperty(value = "properties.queuedTime")
    private String queuedTime;

    /**
     * Gets or sets the blob uri.
     */
    @JsonProperty(value = "properties.blobUri")
    private String blobUri;

    /**
     * Gets or sets the error message returned from the server.
     */
    @JsonProperty(value = "properties.errorMessage")
    private String errorMessage;

    /**
     * Gets or sets the id returned from the server.
     */
    private String id;

    /**
     * Gets or sets the name returned from the server.
     */
    private String name;

    /**
     * Gets or sets the type returned from the server.
     */
    private String type;

    /**
     * Get the requestType value.
     *
     * @return the requestType value
     */
    public String requestType() {
        return this.requestType;
    }

    /**
     * Set the requestType value.
     *
     * @param requestType the requestType value to set
     * @return the ImportExportOperationStatusResponseInner object itself.
     */
    public ImportExportOperationStatusResponseInner withRequestType(String requestType) {
        this.requestType = requestType;
        return this;
    }

    /**
     * Get the requestId value.
     *
     * @return the requestId value
     */
    public UUID requestId() {
        return this.requestId;
    }

    /**
     * Set the requestId value.
     *
     * @param requestId the requestId value to set
     * @return the ImportExportOperationStatusResponseInner object itself.
     */
    public ImportExportOperationStatusResponseInner withRequestId(UUID requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * Get the serverName value.
     *
     * @return the serverName value
     */
    public String serverName() {
        return this.serverName;
    }

    /**
     * Set the serverName value.
     *
     * @param serverName the serverName value to set
     * @return the ImportExportOperationStatusResponseInner object itself.
     */
    public ImportExportOperationStatusResponseInner withServerName(String serverName) {
        this.serverName = serverName;
        return this;
    }

    /**
     * Get the databaseName value.
     *
     * @return the databaseName value
     */
    public String databaseName() {
        return this.databaseName;
    }

    /**
     * Set the databaseName value.
     *
     * @param databaseName the databaseName value to set
     * @return the ImportExportOperationStatusResponseInner object itself.
     */
    public ImportExportOperationStatusResponseInner withDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * Get the status value.
     *
     * @return the status value
     */
    public String status() {
        return this.status;
    }

    /**
     * Set the status value.
     *
     * @param status the status value to set
     * @return the ImportExportOperationStatusResponseInner object itself.
     */
    public ImportExportOperationStatusResponseInner withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Get the lastModifiedTime value.
     *
     * @return the lastModifiedTime value
     */
    public String lastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * Set the lastModifiedTime value.
     *
     * @param lastModifiedTime the lastModifiedTime value to set
     * @return the ImportExportOperationStatusResponseInner object itself.
     */
    public ImportExportOperationStatusResponseInner withLastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    /**
     * Get the queuedTime value.
     *
     * @return the queuedTime value
     */
    public String queuedTime() {
        return this.queuedTime;
    }

    /**
     * Set the queuedTime value.
     *
     * @param queuedTime the queuedTime value to set
     * @return the ImportExportOperationStatusResponseInner object itself.
     */
    public ImportExportOperationStatusResponseInner withQueuedTime(String queuedTime) {
        this.queuedTime = queuedTime;
        return this;
    }

    /**
     * Get the blobUri value.
     *
     * @return the blobUri value
     */
    public String blobUri() {
        return this.blobUri;
    }

    /**
     * Set the blobUri value.
     *
     * @param blobUri the blobUri value to set
     * @return the ImportExportOperationStatusResponseInner object itself.
     */
    public ImportExportOperationStatusResponseInner withBlobUri(String blobUri) {
        this.blobUri = blobUri;
        return this;
    }

    /**
     * Get the errorMessage value.
     *
     * @return the errorMessage value
     */
    public String errorMessage() {
        return this.errorMessage;
    }

    /**
     * Set the errorMessage value.
     *
     * @param errorMessage the errorMessage value to set
     * @return the ImportExportOperationStatusResponseInner object itself.
     */
    public ImportExportOperationStatusResponseInner withErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * Get the id value.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id value.
     *
     * @param id the id value to set
     * @return the ImportExportOperationStatusResponseInner object itself.
     */
    public ImportExportOperationStatusResponseInner withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     * @return the ImportExportOperationStatusResponseInner object itself.
     */
    public ImportExportOperationStatusResponseInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type value.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type value.
     *
     * @param type the type value to set
     * @return the ImportExportOperationStatusResponseInner object itself.
     */
    public ImportExportOperationStatusResponseInner withType(String type) {
        this.type = type;
        return this;
    }

}