/*
 * This file is generated by jOOQ.
 */
package com.opidis.ca.generated.pg_catalog.tables.records;


import com.opidis.ca.generated.pg_catalog.tables.PgStatActivity;

import java.time.OffsetDateTime;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record20;
import org.jooq.Row20;
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
public class PgStatActivityRecord extends TableRecordImpl<PgStatActivityRecord> implements Record20<Long, String, Integer, Long, String, String, Object, String, Integer, OffsetDateTime, OffsetDateTime, OffsetDateTime, OffsetDateTime, String, String, String, Long, Long, String, String> {

    private static final long serialVersionUID = -2036796596;

    /**
     * Setter for <code>pg_catalog.pg_stat_activity.datid</code>.
     */
    public void setDatid(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_activity.datid</code>.
     */
    public Long getDatid() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_activity.datname</code>.
     */
    public void setDatname(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_activity.datname</code>.
     */
    public String getDatname() {
        return (String) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_activity.pid</code>.
     */
    public void setPid(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_activity.pid</code>.
     */
    public Integer getPid() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_activity.usesysid</code>.
     */
    public void setUsesysid(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_activity.usesysid</code>.
     */
    public Long getUsesysid() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_activity.usename</code>.
     */
    public void setUsename(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_activity.usename</code>.
     */
    public String getUsename() {
        return (String) get(4);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_activity.application_name</code>.
     */
    public void setApplicationName(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_activity.application_name</code>.
     */
    public String getApplicationName() {
        return (String) get(5);
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public void setClientAddr(Object value) {
        set(6, value);
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public Object getClientAddr() {
        return get(6);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_activity.client_hostname</code>.
     */
    public void setClientHostname(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_activity.client_hostname</code>.
     */
    public String getClientHostname() {
        return (String) get(7);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_activity.client_port</code>.
     */
    public void setClientPort(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_activity.client_port</code>.
     */
    public Integer getClientPort() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_activity.backend_start</code>.
     */
    public void setBackendStart(OffsetDateTime value) {
        set(9, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_activity.backend_start</code>.
     */
    public OffsetDateTime getBackendStart() {
        return (OffsetDateTime) get(9);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_activity.xact_start</code>.
     */
    public void setXactStart(OffsetDateTime value) {
        set(10, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_activity.xact_start</code>.
     */
    public OffsetDateTime getXactStart() {
        return (OffsetDateTime) get(10);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_activity.query_start</code>.
     */
    public void setQueryStart(OffsetDateTime value) {
        set(11, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_activity.query_start</code>.
     */
    public OffsetDateTime getQueryStart() {
        return (OffsetDateTime) get(11);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_activity.state_change</code>.
     */
    public void setStateChange(OffsetDateTime value) {
        set(12, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_activity.state_change</code>.
     */
    public OffsetDateTime getStateChange() {
        return (OffsetDateTime) get(12);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_activity.wait_event_type</code>.
     */
    public void setWaitEventType(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_activity.wait_event_type</code>.
     */
    public String getWaitEventType() {
        return (String) get(13);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_activity.wait_event</code>.
     */
    public void setWaitEvent(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_activity.wait_event</code>.
     */
    public String getWaitEvent() {
        return (String) get(14);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_activity.state</code>.
     */
    public void setState(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_activity.state</code>.
     */
    public String getState() {
        return (String) get(15);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_activity.backend_xid</code>.
     */
    public void setBackendXid(Long value) {
        set(16, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_activity.backend_xid</code>.
     */
    public Long getBackendXid() {
        return (Long) get(16);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_activity.backend_xmin</code>.
     */
    public void setBackendXmin(Long value) {
        set(17, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_activity.backend_xmin</code>.
     */
    public Long getBackendXmin() {
        return (Long) get(17);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_activity.query</code>.
     */
    public void setQuery(String value) {
        set(18, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_activity.query</code>.
     */
    public String getQuery() {
        return (String) get(18);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_activity.backend_type</code>.
     */
    public void setBackendType(String value) {
        set(19, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_activity.backend_type</code>.
     */
    public String getBackendType() {
        return (String) get(19);
    }

    // -------------------------------------------------------------------------
    // Record20 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row20<Long, String, Integer, Long, String, String, Object, String, Integer, OffsetDateTime, OffsetDateTime, OffsetDateTime, OffsetDateTime, String, String, String, Long, Long, String, String> fieldsRow() {
        return (Row20) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row20<Long, String, Integer, Long, String, String, Object, String, Integer, OffsetDateTime, OffsetDateTime, OffsetDateTime, OffsetDateTime, String, String, String, Long, Long, String, String> valuesRow() {
        return (Row20) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return PgStatActivity.PG_STAT_ACTIVITY.DATID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return PgStatActivity.PG_STAT_ACTIVITY.DATNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return PgStatActivity.PG_STAT_ACTIVITY.PID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field4() {
        return PgStatActivity.PG_STAT_ACTIVITY.USESYSID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return PgStatActivity.PG_STAT_ACTIVITY.USENAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return PgStatActivity.PG_STAT_ACTIVITY.APPLICATION_NAME;
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    @Override
    public Field<Object> field7() {
        return PgStatActivity.PG_STAT_ACTIVITY.CLIENT_ADDR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return PgStatActivity.PG_STAT_ACTIVITY.CLIENT_HOSTNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field9() {
        return PgStatActivity.PG_STAT_ACTIVITY.CLIENT_PORT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<OffsetDateTime> field10() {
        return PgStatActivity.PG_STAT_ACTIVITY.BACKEND_START;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<OffsetDateTime> field11() {
        return PgStatActivity.PG_STAT_ACTIVITY.XACT_START;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<OffsetDateTime> field12() {
        return PgStatActivity.PG_STAT_ACTIVITY.QUERY_START;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<OffsetDateTime> field13() {
        return PgStatActivity.PG_STAT_ACTIVITY.STATE_CHANGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field14() {
        return PgStatActivity.PG_STAT_ACTIVITY.WAIT_EVENT_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field15() {
        return PgStatActivity.PG_STAT_ACTIVITY.WAIT_EVENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field16() {
        return PgStatActivity.PG_STAT_ACTIVITY.STATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field17() {
        return PgStatActivity.PG_STAT_ACTIVITY.BACKEND_XID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field18() {
        return PgStatActivity.PG_STAT_ACTIVITY.BACKEND_XMIN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field19() {
        return PgStatActivity.PG_STAT_ACTIVITY.QUERY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field20() {
        return PgStatActivity.PG_STAT_ACTIVITY.BACKEND_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getDatid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getDatname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getPid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component4() {
        return getUsesysid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getUsename();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getApplicationName();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    @Override
    public Object component7() {
        return getClientAddr();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getClientHostname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component9() {
        return getClientPort();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OffsetDateTime component10() {
        return getBackendStart();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OffsetDateTime component11() {
        return getXactStart();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OffsetDateTime component12() {
        return getQueryStart();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OffsetDateTime component13() {
        return getStateChange();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component14() {
        return getWaitEventType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component15() {
        return getWaitEvent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component16() {
        return getState();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component17() {
        return getBackendXid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component18() {
        return getBackendXmin();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component19() {
        return getQuery();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component20() {
        return getBackendType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getDatid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getDatname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getPid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value4() {
        return getUsesysid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getUsename();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getApplicationName();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    @Override
    public Object value7() {
        return getClientAddr();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getClientHostname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value9() {
        return getClientPort();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OffsetDateTime value10() {
        return getBackendStart();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OffsetDateTime value11() {
        return getXactStart();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OffsetDateTime value12() {
        return getQueryStart();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OffsetDateTime value13() {
        return getStateChange();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value14() {
        return getWaitEventType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value15() {
        return getWaitEvent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value16() {
        return getState();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value17() {
        return getBackendXid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value18() {
        return getBackendXmin();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value19() {
        return getQuery();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value20() {
        return getBackendType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatActivityRecord value1(Long value) {
        setDatid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatActivityRecord value2(String value) {
        setDatname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatActivityRecord value3(Integer value) {
        setPid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatActivityRecord value4(Long value) {
        setUsesysid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatActivityRecord value5(String value) {
        setUsename(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatActivityRecord value6(String value) {
        setApplicationName(value);
        return this;
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    @Override
    public PgStatActivityRecord value7(Object value) {
        setClientAddr(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatActivityRecord value8(String value) {
        setClientHostname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatActivityRecord value9(Integer value) {
        setClientPort(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatActivityRecord value10(OffsetDateTime value) {
        setBackendStart(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatActivityRecord value11(OffsetDateTime value) {
        setXactStart(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatActivityRecord value12(OffsetDateTime value) {
        setQueryStart(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatActivityRecord value13(OffsetDateTime value) {
        setStateChange(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatActivityRecord value14(String value) {
        setWaitEventType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatActivityRecord value15(String value) {
        setWaitEvent(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatActivityRecord value16(String value) {
        setState(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatActivityRecord value17(Long value) {
        setBackendXid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatActivityRecord value18(Long value) {
        setBackendXmin(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatActivityRecord value19(String value) {
        setQuery(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatActivityRecord value20(String value) {
        setBackendType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatActivityRecord values(Long value1, String value2, Integer value3, Long value4, String value5, String value6, Object value7, String value8, Integer value9, OffsetDateTime value10, OffsetDateTime value11, OffsetDateTime value12, OffsetDateTime value13, String value14, String value15, String value16, Long value17, Long value18, String value19, String value20) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        value17(value17);
        value18(value18);
        value19(value19);
        value20(value20);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgStatActivityRecord
     */
    public PgStatActivityRecord() {
        super(PgStatActivity.PG_STAT_ACTIVITY);
    }

    /**
     * Create a detached, initialised PgStatActivityRecord
     */
    public PgStatActivityRecord(Long datid, String datname, Integer pid, Long usesysid, String usename, String applicationName, Object clientAddr, String clientHostname, Integer clientPort, OffsetDateTime backendStart, OffsetDateTime xactStart, OffsetDateTime queryStart, OffsetDateTime stateChange, String waitEventType, String waitEvent, String state, Long backendXid, Long backendXmin, String query, String backendType) {
        super(PgStatActivity.PG_STAT_ACTIVITY);

        set(0, datid);
        set(1, datname);
        set(2, pid);
        set(3, usesysid);
        set(4, usename);
        set(5, applicationName);
        set(6, clientAddr);
        set(7, clientHostname);
        set(8, clientPort);
        set(9, backendStart);
        set(10, xactStart);
        set(11, queryStart);
        set(12, stateChange);
        set(13, waitEventType);
        set(14, waitEvent);
        set(15, state);
        set(16, backendXid);
        set(17, backendXmin);
        set(18, query);
        set(19, backendType);
    }
}
