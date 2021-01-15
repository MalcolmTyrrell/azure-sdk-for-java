// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.Map;

/** An update request for an Azure SQL Database managed instance. */
@JsonFlatten
@Fluent
public class ManagedInstanceUpdate {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ManagedInstanceUpdate.class);

    /*
     * Managed instance sku
     */
    @JsonProperty(value = "sku")
    private Sku sku;

    /*
     * Resource tags.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /*
     * Specifies the mode of database creation.
     *
     * Default: Regular instance creation.
     *
     * Restore: Creates an instance by restoring a set of backups to specific
     * point in time. RestorePointInTime and SourceManagedInstanceId must be
     * specified.
     */
    @JsonProperty(value = "properties.managedInstanceCreateMode")
    private ManagedServerCreateMode managedInstanceCreateMode;

    /*
     * The fully qualified domain name of the managed instance.
     */
    @JsonProperty(value = "properties.fullyQualifiedDomainName", access = JsonProperty.Access.WRITE_ONLY)
    private String fullyQualifiedDomainName;

    /*
     * Administrator username for the managed instance. Can only be specified
     * when the managed instance is being created (and is required for
     * creation).
     */
    @JsonProperty(value = "properties.administratorLogin")
    private String administratorLogin;

    /*
     * The administrator login password (required for managed instance
     * creation).
     */
    @JsonProperty(value = "properties.administratorLoginPassword")
    private String administratorLoginPassword;

    /*
     * Subnet resource ID for the managed instance.
     */
    @JsonProperty(value = "properties.subnetId")
    private String subnetId;

    /*
     * The state of the managed instance.
     */
    @JsonProperty(value = "properties.state", access = JsonProperty.Access.WRITE_ONLY)
    private String state;

    /*
     * The license type. Possible values are 'LicenseIncluded' (regular price
     * inclusive of a new SQL license) and 'BasePrice' (discounted AHB price
     * for bringing your own SQL licenses).
     */
    @JsonProperty(value = "properties.licenseType")
    private ManagedInstanceLicenseType licenseType;

    /*
     * The number of vCores. Allowed values: 8, 16, 24, 32, 40, 64, 80.
     */
    @JsonProperty(value = "properties.vCores")
    private Integer vCores;

    /*
     * Storage size in GB. Minimum value: 32. Maximum value: 8192. Increments
     * of 32 GB allowed only.
     */
    @JsonProperty(value = "properties.storageSizeInGB")
    private Integer storageSizeInGB;

    /*
     * Collation of the managed instance.
     */
    @JsonProperty(value = "properties.collation")
    private String collation;

    /*
     * The Dns Zone that the managed instance is in.
     */
    @JsonProperty(value = "properties.dnsZone", access = JsonProperty.Access.WRITE_ONLY)
    private String dnsZone;

    /*
     * The resource id of another managed instance whose DNS zone this managed
     * instance will share after creation.
     */
    @JsonProperty(value = "properties.dnsZonePartner")
    private String dnsZonePartner;

    /*
     * Whether or not the public data endpoint is enabled.
     */
    @JsonProperty(value = "properties.publicDataEndpointEnabled")
    private Boolean publicDataEndpointEnabled;

    /*
     * The resource identifier of the source managed instance associated with
     * create operation of this instance.
     */
    @JsonProperty(value = "properties.sourceManagedInstanceId")
    private String sourceManagedInstanceId;

    /*
     * Specifies the point in time (ISO8601 format) of the source database that
     * will be restored to create the new database.
     */
    @JsonProperty(value = "properties.restorePointInTime")
    private OffsetDateTime restorePointInTime;

    /*
     * Connection type used for connecting to the instance.
     */
    @JsonProperty(value = "properties.proxyOverride")
    private ManagedInstanceProxyOverride proxyOverride;

    /*
     * Id of the timezone. Allowed values are timezones supported by Windows.
     * Windows keeps details on supported timezones, including the id, in
     * registry under
     * KEY_LOCAL_MACHINE\SOFTWARE\Microsoft\Windows NT\CurrentVersion\Time
     * Zones.
     * You can get those registry values via SQL Server by querying SELECT name
     * AS timezone_id FROM sys.time_zone_info.
     * List of Ids can also be obtained by executing
     * [System.TimeZoneInfo]::GetSystemTimeZones() in PowerShell.
     * An example of valid timezone id is "Pacific Standard Time" or "W. Europe
     * Standard Time".
     */
    @JsonProperty(value = "properties.timezoneId")
    private String timezoneId;

    /*
     * The Id of the instance pool this managed server belongs to.
     */
    @JsonProperty(value = "properties.instancePoolId")
    private String instancePoolId;

    /*
     * Minimal TLS version. Allowed values: 'None', '1.0', '1.1', '1.2'
     */
    @JsonProperty(value = "properties.minimalTlsVersion")
    private String minimalTlsVersion;

    /**
     * Get the sku property: Managed instance sku.
     *
     * @return the sku value.
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: Managed instance sku.
     *
     * @param sku the sku value to set.
     * @return the ManagedInstanceUpdate object itself.
     */
    public ManagedInstanceUpdate withSku(Sku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the tags property: Resource tags.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Resource tags.
     *
     * @param tags the tags value to set.
     * @return the ManagedInstanceUpdate object itself.
     */
    public ManagedInstanceUpdate withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the managedInstanceCreateMode property: Specifies the mode of database creation.
     *
     * <p>Default: Regular instance creation.
     *
     * <p>Restore: Creates an instance by restoring a set of backups to specific point in time. RestorePointInTime and
     * SourceManagedInstanceId must be specified.
     *
     * @return the managedInstanceCreateMode value.
     */
    public ManagedServerCreateMode managedInstanceCreateMode() {
        return this.managedInstanceCreateMode;
    }

    /**
     * Set the managedInstanceCreateMode property: Specifies the mode of database creation.
     *
     * <p>Default: Regular instance creation.
     *
     * <p>Restore: Creates an instance by restoring a set of backups to specific point in time. RestorePointInTime and
     * SourceManagedInstanceId must be specified.
     *
     * @param managedInstanceCreateMode the managedInstanceCreateMode value to set.
     * @return the ManagedInstanceUpdate object itself.
     */
    public ManagedInstanceUpdate withManagedInstanceCreateMode(ManagedServerCreateMode managedInstanceCreateMode) {
        this.managedInstanceCreateMode = managedInstanceCreateMode;
        return this;
    }

    /**
     * Get the fullyQualifiedDomainName property: The fully qualified domain name of the managed instance.
     *
     * @return the fullyQualifiedDomainName value.
     */
    public String fullyQualifiedDomainName() {
        return this.fullyQualifiedDomainName;
    }

    /**
     * Get the administratorLogin property: Administrator username for the managed instance. Can only be specified when
     * the managed instance is being created (and is required for creation).
     *
     * @return the administratorLogin value.
     */
    public String administratorLogin() {
        return this.administratorLogin;
    }

    /**
     * Set the administratorLogin property: Administrator username for the managed instance. Can only be specified when
     * the managed instance is being created (and is required for creation).
     *
     * @param administratorLogin the administratorLogin value to set.
     * @return the ManagedInstanceUpdate object itself.
     */
    public ManagedInstanceUpdate withAdministratorLogin(String administratorLogin) {
        this.administratorLogin = administratorLogin;
        return this;
    }

    /**
     * Get the administratorLoginPassword property: The administrator login password (required for managed instance
     * creation).
     *
     * @return the administratorLoginPassword value.
     */
    public String administratorLoginPassword() {
        return this.administratorLoginPassword;
    }

    /**
     * Set the administratorLoginPassword property: The administrator login password (required for managed instance
     * creation).
     *
     * @param administratorLoginPassword the administratorLoginPassword value to set.
     * @return the ManagedInstanceUpdate object itself.
     */
    public ManagedInstanceUpdate withAdministratorLoginPassword(String administratorLoginPassword) {
        this.administratorLoginPassword = administratorLoginPassword;
        return this;
    }

    /**
     * Get the subnetId property: Subnet resource ID for the managed instance.
     *
     * @return the subnetId value.
     */
    public String subnetId() {
        return this.subnetId;
    }

    /**
     * Set the subnetId property: Subnet resource ID for the managed instance.
     *
     * @param subnetId the subnetId value to set.
     * @return the ManagedInstanceUpdate object itself.
     */
    public ManagedInstanceUpdate withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * Get the state property: The state of the managed instance.
     *
     * @return the state value.
     */
    public String state() {
        return this.state;
    }

    /**
     * Get the licenseType property: The license type. Possible values are 'LicenseIncluded' (regular price inclusive of
     * a new SQL license) and 'BasePrice' (discounted AHB price for bringing your own SQL licenses).
     *
     * @return the licenseType value.
     */
    public ManagedInstanceLicenseType licenseType() {
        return this.licenseType;
    }

    /**
     * Set the licenseType property: The license type. Possible values are 'LicenseIncluded' (regular price inclusive of
     * a new SQL license) and 'BasePrice' (discounted AHB price for bringing your own SQL licenses).
     *
     * @param licenseType the licenseType value to set.
     * @return the ManagedInstanceUpdate object itself.
     */
    public ManagedInstanceUpdate withLicenseType(ManagedInstanceLicenseType licenseType) {
        this.licenseType = licenseType;
        return this;
    }

    /**
     * Get the vCores property: The number of vCores. Allowed values: 8, 16, 24, 32, 40, 64, 80.
     *
     * @return the vCores value.
     */
    public Integer vCores() {
        return this.vCores;
    }

    /**
     * Set the vCores property: The number of vCores. Allowed values: 8, 16, 24, 32, 40, 64, 80.
     *
     * @param vCores the vCores value to set.
     * @return the ManagedInstanceUpdate object itself.
     */
    public ManagedInstanceUpdate withVCores(Integer vCores) {
        this.vCores = vCores;
        return this;
    }

    /**
     * Get the storageSizeInGB property: Storage size in GB. Minimum value: 32. Maximum value: 8192. Increments of 32 GB
     * allowed only.
     *
     * @return the storageSizeInGB value.
     */
    public Integer storageSizeInGB() {
        return this.storageSizeInGB;
    }

    /**
     * Set the storageSizeInGB property: Storage size in GB. Minimum value: 32. Maximum value: 8192. Increments of 32 GB
     * allowed only.
     *
     * @param storageSizeInGB the storageSizeInGB value to set.
     * @return the ManagedInstanceUpdate object itself.
     */
    public ManagedInstanceUpdate withStorageSizeInGB(Integer storageSizeInGB) {
        this.storageSizeInGB = storageSizeInGB;
        return this;
    }

    /**
     * Get the collation property: Collation of the managed instance.
     *
     * @return the collation value.
     */
    public String collation() {
        return this.collation;
    }

    /**
     * Set the collation property: Collation of the managed instance.
     *
     * @param collation the collation value to set.
     * @return the ManagedInstanceUpdate object itself.
     */
    public ManagedInstanceUpdate withCollation(String collation) {
        this.collation = collation;
        return this;
    }

    /**
     * Get the dnsZone property: The Dns Zone that the managed instance is in.
     *
     * @return the dnsZone value.
     */
    public String dnsZone() {
        return this.dnsZone;
    }

    /**
     * Get the dnsZonePartner property: The resource id of another managed instance whose DNS zone this managed instance
     * will share after creation.
     *
     * @return the dnsZonePartner value.
     */
    public String dnsZonePartner() {
        return this.dnsZonePartner;
    }

    /**
     * Set the dnsZonePartner property: The resource id of another managed instance whose DNS zone this managed instance
     * will share after creation.
     *
     * @param dnsZonePartner the dnsZonePartner value to set.
     * @return the ManagedInstanceUpdate object itself.
     */
    public ManagedInstanceUpdate withDnsZonePartner(String dnsZonePartner) {
        this.dnsZonePartner = dnsZonePartner;
        return this;
    }

    /**
     * Get the publicDataEndpointEnabled property: Whether or not the public data endpoint is enabled.
     *
     * @return the publicDataEndpointEnabled value.
     */
    public Boolean publicDataEndpointEnabled() {
        return this.publicDataEndpointEnabled;
    }

    /**
     * Set the publicDataEndpointEnabled property: Whether or not the public data endpoint is enabled.
     *
     * @param publicDataEndpointEnabled the publicDataEndpointEnabled value to set.
     * @return the ManagedInstanceUpdate object itself.
     */
    public ManagedInstanceUpdate withPublicDataEndpointEnabled(Boolean publicDataEndpointEnabled) {
        this.publicDataEndpointEnabled = publicDataEndpointEnabled;
        return this;
    }

    /**
     * Get the sourceManagedInstanceId property: The resource identifier of the source managed instance associated with
     * create operation of this instance.
     *
     * @return the sourceManagedInstanceId value.
     */
    public String sourceManagedInstanceId() {
        return this.sourceManagedInstanceId;
    }

    /**
     * Set the sourceManagedInstanceId property: The resource identifier of the source managed instance associated with
     * create operation of this instance.
     *
     * @param sourceManagedInstanceId the sourceManagedInstanceId value to set.
     * @return the ManagedInstanceUpdate object itself.
     */
    public ManagedInstanceUpdate withSourceManagedInstanceId(String sourceManagedInstanceId) {
        this.sourceManagedInstanceId = sourceManagedInstanceId;
        return this;
    }

    /**
     * Get the restorePointInTime property: Specifies the point in time (ISO8601 format) of the source database that
     * will be restored to create the new database.
     *
     * @return the restorePointInTime value.
     */
    public OffsetDateTime restorePointInTime() {
        return this.restorePointInTime;
    }

    /**
     * Set the restorePointInTime property: Specifies the point in time (ISO8601 format) of the source database that
     * will be restored to create the new database.
     *
     * @param restorePointInTime the restorePointInTime value to set.
     * @return the ManagedInstanceUpdate object itself.
     */
    public ManagedInstanceUpdate withRestorePointInTime(OffsetDateTime restorePointInTime) {
        this.restorePointInTime = restorePointInTime;
        return this;
    }

    /**
     * Get the proxyOverride property: Connection type used for connecting to the instance.
     *
     * @return the proxyOverride value.
     */
    public ManagedInstanceProxyOverride proxyOverride() {
        return this.proxyOverride;
    }

    /**
     * Set the proxyOverride property: Connection type used for connecting to the instance.
     *
     * @param proxyOverride the proxyOverride value to set.
     * @return the ManagedInstanceUpdate object itself.
     */
    public ManagedInstanceUpdate withProxyOverride(ManagedInstanceProxyOverride proxyOverride) {
        this.proxyOverride = proxyOverride;
        return this;
    }

    /**
     * Get the timezoneId property: Id of the timezone. Allowed values are timezones supported by Windows. Windows keeps
     * details on supported timezones, including the id, in registry under KEY_LOCAL_MACHINE\SOFTWARE\Microsoft\Windows
     * NT\CurrentVersion\Time Zones. You can get those registry values via SQL Server by querying SELECT name AS
     * timezone_id FROM sys.time_zone_info. List of Ids can also be obtained by executing
     * [System.TimeZoneInfo]::GetSystemTimeZones() in PowerShell. An example of valid timezone id is "Pacific Standard
     * Time" or "W. Europe Standard Time".
     *
     * @return the timezoneId value.
     */
    public String timezoneId() {
        return this.timezoneId;
    }

    /**
     * Set the timezoneId property: Id of the timezone. Allowed values are timezones supported by Windows. Windows keeps
     * details on supported timezones, including the id, in registry under KEY_LOCAL_MACHINE\SOFTWARE\Microsoft\Windows
     * NT\CurrentVersion\Time Zones. You can get those registry values via SQL Server by querying SELECT name AS
     * timezone_id FROM sys.time_zone_info. List of Ids can also be obtained by executing
     * [System.TimeZoneInfo]::GetSystemTimeZones() in PowerShell. An example of valid timezone id is "Pacific Standard
     * Time" or "W. Europe Standard Time".
     *
     * @param timezoneId the timezoneId value to set.
     * @return the ManagedInstanceUpdate object itself.
     */
    public ManagedInstanceUpdate withTimezoneId(String timezoneId) {
        this.timezoneId = timezoneId;
        return this;
    }

    /**
     * Get the instancePoolId property: The Id of the instance pool this managed server belongs to.
     *
     * @return the instancePoolId value.
     */
    public String instancePoolId() {
        return this.instancePoolId;
    }

    /**
     * Set the instancePoolId property: The Id of the instance pool this managed server belongs to.
     *
     * @param instancePoolId the instancePoolId value to set.
     * @return the ManagedInstanceUpdate object itself.
     */
    public ManagedInstanceUpdate withInstancePoolId(String instancePoolId) {
        this.instancePoolId = instancePoolId;
        return this;
    }

    /**
     * Get the minimalTlsVersion property: Minimal TLS version. Allowed values: 'None', '1.0', '1.1', '1.2'.
     *
     * @return the minimalTlsVersion value.
     */
    public String minimalTlsVersion() {
        return this.minimalTlsVersion;
    }

    /**
     * Set the minimalTlsVersion property: Minimal TLS version. Allowed values: 'None', '1.0', '1.1', '1.2'.
     *
     * @param minimalTlsVersion the minimalTlsVersion value to set.
     * @return the ManagedInstanceUpdate object itself.
     */
    public ManagedInstanceUpdate withMinimalTlsVersion(String minimalTlsVersion) {
        this.minimalTlsVersion = minimalTlsVersion;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sku() != null) {
            sku().validate();
        }
    }
}
