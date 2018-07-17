/*
 * This file is generated by jOOQ.
 */
package com.opidis.ca.generated.pg_catalog.tables.records;


import com.opidis.ca.generated.pg_catalog.tables.PgSubscription;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record8;
import org.jooq.Row8;
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
public class PgSubscriptionRecord extends TableRecordImpl<PgSubscriptionRecord> implements Record8<Long, String, Long, Boolean, String, String, String, String[]> {

    private static final long serialVersionUID = 134369105;

    /**
     * Setter for <code>pg_catalog.pg_subscription.subdbid</code>.
     */
    public void setSubdbid(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_subscription.subdbid</code>.
     */
    public Long getSubdbid() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_subscription.subname</code>.
     */
    public void setSubname(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_subscription.subname</code>.
     */
    public String getSubname() {
        return (String) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_subscription.subowner</code>.
     */
    public void setSubowner(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_subscription.subowner</code>.
     */
    public Long getSubowner() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_subscription.subenabled</code>.
     */
    public void setSubenabled(Boolean value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_subscription.subenabled</code>.
     */
    public Boolean getSubenabled() {
        return (Boolean) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_subscription.subconninfo</code>.
     */
    public void setSubconninfo(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_subscription.subconninfo</code>.
     */
    public String getSubconninfo() {
        return (String) get(4);
    }

    /**
     * Setter for <code>pg_catalog.pg_subscription.subslotname</code>.
     */
    public void setSubslotname(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_subscription.subslotname</code>.
     */
    public String getSubslotname() {
        return (String) get(5);
    }

    /**
     * Setter for <code>pg_catalog.pg_subscription.subsynccommit</code>.
     */
    public void setSubsynccommit(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_subscription.subsynccommit</code>.
     */
    public String getSubsynccommit() {
        return (String) get(6);
    }

    /**
     * Setter for <code>pg_catalog.pg_subscription.subpublications</code>.
     */
    public void setSubpublications(String... value) {
        set(7, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_subscription.subpublications</code>.
     */
    public String[] getSubpublications() {
        return (String[]) get(7);
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Long, String, Long, Boolean, String, String, String, String[]> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Long, String, Long, Boolean, String, String, String, String[]> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return PgSubscription.PG_SUBSCRIPTION.SUBDBID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return PgSubscription.PG_SUBSCRIPTION.SUBNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field3() {
        return PgSubscription.PG_SUBSCRIPTION.SUBOWNER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field4() {
        return PgSubscription.PG_SUBSCRIPTION.SUBENABLED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return PgSubscription.PG_SUBSCRIPTION.SUBCONNINFO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return PgSubscription.PG_SUBSCRIPTION.SUBSLOTNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return PgSubscription.PG_SUBSCRIPTION.SUBSYNCCOMMIT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String[]> field8() {
        return PgSubscription.PG_SUBSCRIPTION.SUBPUBLICATIONS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getSubdbid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getSubname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component3() {
        return getSubowner();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component4() {
        return getSubenabled();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getSubconninfo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getSubslotname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getSubsynccommit();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] component8() {
        return getSubpublications();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getSubdbid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getSubname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value3() {
        return getSubowner();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value4() {
        return getSubenabled();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getSubconninfo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getSubslotname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getSubsynccommit();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] value8() {
        return getSubpublications();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgSubscriptionRecord value1(Long value) {
        setSubdbid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgSubscriptionRecord value2(String value) {
        setSubname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgSubscriptionRecord value3(Long value) {
        setSubowner(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgSubscriptionRecord value4(Boolean value) {
        setSubenabled(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgSubscriptionRecord value5(String value) {
        setSubconninfo(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgSubscriptionRecord value6(String value) {
        setSubslotname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgSubscriptionRecord value7(String value) {
        setSubsynccommit(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgSubscriptionRecord value8(String... value) {
        setSubpublications(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgSubscriptionRecord values(Long value1, String value2, Long value3, Boolean value4, String value5, String value6, String value7, String[] value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgSubscriptionRecord
     */
    public PgSubscriptionRecord() {
        super(PgSubscription.PG_SUBSCRIPTION);
    }

    /**
     * Create a detached, initialised PgSubscriptionRecord
     */
    public PgSubscriptionRecord(Long subdbid, String subname, Long subowner, Boolean subenabled, String subconninfo, String subslotname, String subsynccommit, String[] subpublications) {
        super(PgSubscription.PG_SUBSCRIPTION);

        set(0, subdbid);
        set(1, subname);
        set(2, subowner);
        set(3, subenabled);
        set(4, subconninfo);
        set(5, subslotname);
        set(6, subsynccommit);
        set(7, subpublications);
    }
}
