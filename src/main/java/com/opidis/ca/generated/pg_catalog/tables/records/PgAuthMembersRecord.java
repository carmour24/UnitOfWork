/*
 * This file is generated by jOOQ.
 */
package com.opidis.ca.generated.pg_catalog.tables.records;


import com.opidis.ca.generated.pg_catalog.tables.PgAuthMembers;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record4;
import org.jooq.Row4;
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
public class PgAuthMembersRecord extends TableRecordImpl<PgAuthMembersRecord> implements Record4<Long, Long, Long, Boolean> {

    private static final long serialVersionUID = -2045787506;

    /**
     * Setter for <code>pg_catalog.pg_auth_members.roleid</code>.
     */
    public void setRoleid(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_auth_members.roleid</code>.
     */
    public Long getRoleid() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_auth_members.member</code>.
     */
    public void setMember(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_auth_members.member</code>.
     */
    public Long getMember() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_auth_members.grantor</code>.
     */
    public void setGrantor(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_auth_members.grantor</code>.
     */
    public Long getGrantor() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_auth_members.admin_option</code>.
     */
    public void setAdminOption(Boolean value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_auth_members.admin_option</code>.
     */
    public Boolean getAdminOption() {
        return (Boolean) get(3);
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Long, Long, Long, Boolean> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Long, Long, Long, Boolean> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return PgAuthMembers.PG_AUTH_MEMBERS.ROLEID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return PgAuthMembers.PG_AUTH_MEMBERS.MEMBER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field3() {
        return PgAuthMembers.PG_AUTH_MEMBERS.GRANTOR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field4() {
        return PgAuthMembers.PG_AUTH_MEMBERS.ADMIN_OPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getRoleid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component2() {
        return getMember();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component3() {
        return getGrantor();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component4() {
        return getAdminOption();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getRoleid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getMember();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value3() {
        return getGrantor();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value4() {
        return getAdminOption();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgAuthMembersRecord value1(Long value) {
        setRoleid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgAuthMembersRecord value2(Long value) {
        setMember(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgAuthMembersRecord value3(Long value) {
        setGrantor(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgAuthMembersRecord value4(Boolean value) {
        setAdminOption(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgAuthMembersRecord values(Long value1, Long value2, Long value3, Boolean value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgAuthMembersRecord
     */
    public PgAuthMembersRecord() {
        super(PgAuthMembers.PG_AUTH_MEMBERS);
    }

    /**
     * Create a detached, initialised PgAuthMembersRecord
     */
    public PgAuthMembersRecord(Long roleid, Long member, Long grantor, Boolean adminOption) {
        super(PgAuthMembers.PG_AUTH_MEMBERS);

        set(0, roleid);
        set(1, member);
        set(2, grantor);
        set(3, adminOption);
    }
}
