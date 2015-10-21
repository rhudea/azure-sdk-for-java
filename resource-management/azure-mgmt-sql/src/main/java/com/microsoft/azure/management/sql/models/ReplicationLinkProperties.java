/**
 * 
 * Copyright (c) Microsoft and contributors.  All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

// Warning: This code was generated by a tool.
// 
// Changes to this file may cause incorrect behavior and will be lost if the
// code is regenerated.

package com.microsoft.azure.management.sql.models;

import java.util.Calendar;

/**
* Represents the properties of an Azure SQL Database Replication Link.
*/
public class ReplicationLinkProperties {
    private String partnerDatabase;
    
    /**
    * Optional. Gets the name of the partner Azure SQL Database.
    * @return The PartnerDatabase value.
    */
    public String getPartnerDatabase() {
        return this.partnerDatabase;
    }
    
    /**
    * Optional. Gets the name of the partner Azure SQL Database.
    * @param partnerDatabaseValue The PartnerDatabase value.
    */
    public void setPartnerDatabase(final String partnerDatabaseValue) {
        this.partnerDatabase = partnerDatabaseValue;
    }
    
    private String partnerLocation;
    
    /**
    * Optional. Gets the Azure Region of the partner Azure SQL Database.
    * @return The PartnerLocation value.
    */
    public String getPartnerLocation() {
        return this.partnerLocation;
    }
    
    /**
    * Optional. Gets the Azure Region of the partner Azure SQL Database.
    * @param partnerLocationValue The PartnerLocation value.
    */
    public void setPartnerLocation(final String partnerLocationValue) {
        this.partnerLocation = partnerLocationValue;
    }
    
    private String partnerRole;
    
    /**
    * Optional. Gets the role of the partner Azure SQL Database in the
    * replication link.
    * @return The PartnerRole value.
    */
    public String getPartnerRole() {
        return this.partnerRole;
    }
    
    /**
    * Optional. Gets the role of the partner Azure SQL Database in the
    * replication link.
    * @param partnerRoleValue The PartnerRole value.
    */
    public void setPartnerRole(final String partnerRoleValue) {
        this.partnerRole = partnerRoleValue;
    }
    
    private String partnerServer;
    
    /**
    * Optional. Gets the name of the Azure SQL Server hosting the partner Azure
    * SQL Database.
    * @return The PartnerServer value.
    */
    public String getPartnerServer() {
        return this.partnerServer;
    }
    
    /**
    * Optional. Gets the name of the Azure SQL Server hosting the partner Azure
    * SQL Database.
    * @param partnerServerValue The PartnerServer value.
    */
    public void setPartnerServer(final String partnerServerValue) {
        this.partnerServer = partnerServerValue;
    }
    
    private String percentComplete;
    
    /**
    * Optional. Gets the percentage of seeding complete for the replication
    * link.
    * @return The PercentComplete value.
    */
    public String getPercentComplete() {
        return this.percentComplete;
    }
    
    /**
    * Optional. Gets the percentage of seeding complete for the replication
    * link.
    * @param percentCompleteValue The PercentComplete value.
    */
    public void setPercentComplete(final String percentCompleteValue) {
        this.percentComplete = percentCompleteValue;
    }
    
    private String replicationState;
    
    /**
    * Optional. Gets the replication state for the replication link.
    * @return The ReplicationState value.
    */
    public String getReplicationState() {
        return this.replicationState;
    }
    
    /**
    * Optional. Gets the replication state for the replication link.
    * @param replicationStateValue The ReplicationState value.
    */
    public void setReplicationState(final String replicationStateValue) {
        this.replicationState = replicationStateValue;
    }
    
    private String role;
    
    /**
    * Optional. Gets the role of the Azure SQL Database in the replication link.
    * @return The Role value.
    */
    public String getRole() {
        return this.role;
    }
    
    /**
    * Optional. Gets the role of the Azure SQL Database in the replication link.
    * @param roleValue The Role value.
    */
    public void setRole(final String roleValue) {
        this.role = roleValue;
    }
    
    private Calendar startTime;
    
    /**
    * Optional. Gets the start time for the replication link.
    * @return The StartTime value.
    */
    public Calendar getStartTime() {
        return this.startTime;
    }
    
    /**
    * Optional. Gets the start time for the replication link.
    * @param startTimeValue The StartTime value.
    */
    public void setStartTime(final Calendar startTimeValue) {
        this.startTime = startTimeValue;
    }
}