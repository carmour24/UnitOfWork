/*
 * This file is generated by jOOQ.
 */
package com.opidis.ca.generated.pg_catalog.tables.records;


import com.opidis.ca.generated.pg_catalog.tables.PgStatGetActivity;

import java.time.OffsetDateTime;

import javax.annotation.Generated;

import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgStatGetActivityRecord extends TableRecordImpl<PgStatGetActivityRecord> {

    private static final long serialVersionUID = -1086254779;

    /**
     * Setter for <code>pg_catalog.pg_stat_get_activity.datid</code>.
     */
    public void setDatid(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_get_activity.datid</code>.
     */
    public Long getDatid() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_get_activity.pid</code>.
     */
    public void setPid(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_get_activity.pid</code>.
     */
    public Integer getPid() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_get_activity.usesysid</code>.
     */
    public void setUsesysid(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_get_activity.usesysid</code>.
     */
    public Long getUsesysid() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_get_activity.application_name</code>.
     */
    public void setApplicationName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_get_activity.application_name</code>.
     */
    public String getApplicationName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_get_activity.state</code>.
     */
    public void setState(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_get_activity.state</code>.
     */
    public String getState() {
        return (String) get(4);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_get_activity.query</code>.
     */
    public void setQuery(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_get_activity.query</code>.
     */
    public String getQuery() {
        return (String) get(5);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_get_activity.wait_event_type</code>.
     */
    public void setWaitEventType(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_get_activity.wait_event_type</code>.
     */
    public String getWaitEventType() {
        return (String) get(6);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_get_activity.wait_event</code>.
     */
    public void setWaitEvent(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_get_activity.wait_event</code>.
     */
    public String getWaitEvent() {
        return (String) get(7);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_get_activity.xact_start</code>.
     */
    public void setXactStart(OffsetDateTime value) {
        set(8, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_get_activity.xact_start</code>.
     */
    public OffsetDateTime getXactStart() {
        return (OffsetDateTime) get(8);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_get_activity.query_start</code>.
     */
    public void setQueryStart(OffsetDateTime value) {
        set(9, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_get_activity.query_start</code>.
     */
    public OffsetDateTime getQueryStart() {
        return (OffsetDateTime) get(9);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_get_activity.backend_start</code>.
     */
    public void setBackendStart(OffsetDateTime value) {
        set(10, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_get_activity.backend_start</code>.
     */
    public OffsetDateTime getBackendStart() {
        return (OffsetDateTime) get(10);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_get_activity.state_change</code>.
     */
    public void setStateChange(OffsetDateTime value) {
        set(11, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_get_activity.state_change</code>.
     */
    public OffsetDateTime getStateChange() {
        return (OffsetDateTime) get(11);
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public void setClientAddr(Object value) {
        set(12, value);
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public Object getClientAddr() {
        return get(12);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_get_activity.client_hostname</code>.
     */
    public void setClientHostname(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_get_activity.client_hostname</code>.
     */
    public String getClientHostname() {
        return (String) get(13);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_get_activity.client_port</code>.
     */
    public void setClientPort(Integer value) {
        set(14, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_get_activity.client_port</code>.
     */
    public Integer getClientPort() {
        return (Integer) get(14);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_get_activity.backend_xid</code>.
     */
    public void setBackendXid(Long value) {
        set(15, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_get_activity.backend_xid</code>.
     */
    public Long getBackendXid() {
        return (Long) get(15);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_get_activity.backend_xmin</code>.
     */
    public void setBackendXmin(Long value) {
        set(16, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_get_activity.backend_xmin</code>.
     */
    public Long getBackendXmin() {
        return (Long) get(16);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_get_activity.backend_type</code>.
     */
    public void setBackendType(String value) {
        set(17, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_get_activity.backend_type</code>.
     */
    public String getBackendType() {
        return (String) get(17);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_get_activity.ssl</code>.
     */
    public void setSsl(Boolean value) {
        set(18, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_get_activity.ssl</code>.
     */
    public Boolean getSsl() {
        return (Boolean) get(18);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_get_activity.sslversion</code>.
     */
    public void setSslversion(String value) {
        set(19, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_get_activity.sslversion</code>.
     */
    public String getSslversion() {
        return (String) get(19);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_get_activity.sslcipher</code>.
     */
    public void setSslcipher(String value) {
        set(20, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_get_activity.sslcipher</code>.
     */
    public String getSslcipher() {
        return (String) get(20);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_get_activity.sslbits</code>.
     */
    public void setSslbits(Integer value) {
        set(21, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_get_activity.sslbits</code>.
     */
    public Integer getSslbits() {
        return (Integer) get(21);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_get_activity.sslcompression</code>.
     */
    public void setSslcompression(Boolean value) {
        set(22, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_get_activity.sslcompression</code>.
     */
    public Boolean getSslcompression() {
        return (Boolean) get(22);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_get_activity.sslclientdn</code>.
     */
    public void setSslclientdn(String value) {
        set(23, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_get_activity.sslclientdn</code>.
     */
    public String getSslclientdn() {
        return (String) get(23);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgStatGetActivityRecord
     */
    public PgStatGetActivityRecord() {
        super(PgStatGetActivity.PG_STAT_GET_ACTIVITY);
    }

    /**
     * Create a detached, initialised PgStatGetActivityRecord
     */
    public PgStatGetActivityRecord(Long datid, Integer pid, Long usesysid, String applicationName, String state, String query, String waitEventType, String waitEvent, OffsetDateTime xactStart, OffsetDateTime queryStart, OffsetDateTime backendStart, OffsetDateTime stateChange, Object clientAddr, String clientHostname, Integer clientPort, Long backendXid, Long backendXmin, String backendType, Boolean ssl, String sslversion, String sslcipher, Integer sslbits, Boolean sslcompression, String sslclientdn) {
        super(PgStatGetActivity.PG_STAT_GET_ACTIVITY);

        set(0, datid);
        set(1, pid);
        set(2, usesysid);
        set(3, applicationName);
        set(4, state);
        set(5, query);
        set(6, waitEventType);
        set(7, waitEvent);
        set(8, xactStart);
        set(9, queryStart);
        set(10, backendStart);
        set(11, stateChange);
        set(12, clientAddr);
        set(13, clientHostname);
        set(14, clientPort);
        set(15, backendXid);
        set(16, backendXmin);
        set(17, backendType);
        set(18, ssl);
        set(19, sslversion);
        set(20, sslcipher);
        set(21, sslbits);
        set(22, sslcompression);
        set(23, sslclientdn);
    }
}
