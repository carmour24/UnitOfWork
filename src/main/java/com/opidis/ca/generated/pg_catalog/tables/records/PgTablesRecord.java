/*
 * This file is generated by jOOQ.
 */
package com.opidis.ca.generated.pg_catalog.tables.records;


import com.opidis.ca.generated.pg_catalog.tables.PgTables;

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
public class PgTablesRecord extends TableRecordImpl<PgTablesRecord> implements Record8<String, String, String, String, Boolean, Boolean, Boolean, Boolean> {

    private static final long serialVersionUID = -1794935477;

    /**
     * Setter for <code>pg_catalog.pg_tables.schemaname</code>.
     */
    public void setSchemaname(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_tables.schemaname</code>.
     */
    public String getSchemaname() {
        return (String) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_tables.tablename</code>.
     */
    public void setTablename(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_tables.tablename</code>.
     */
    public String getTablename() {
        return (String) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_tables.tableowner</code>.
     */
    public void setTableowner(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_tables.tableowner</code>.
     */
    public String getTableowner() {
        return (String) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_tables.tablespace</code>.
     */
    public void setTablespace(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_tables.tablespace</code>.
     */
    public String getTablespace() {
        return (String) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_tables.hasindexes</code>.
     */
    public void setHasindexes(Boolean value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_tables.hasindexes</code>.
     */
    public Boolean getHasindexes() {
        return (Boolean) get(4);
    }

    /**
     * Setter for <code>pg_catalog.pg_tables.hasrules</code>.
     */
    public void setHasrules(Boolean value) {
        set(5, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_tables.hasrules</code>.
     */
    public Boolean getHasrules() {
        return (Boolean) get(5);
    }

    /**
     * Setter for <code>pg_catalog.pg_tables.hastriggers</code>.
     */
    public void setHastriggers(Boolean value) {
        set(6, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_tables.hastriggers</code>.
     */
    public Boolean getHastriggers() {
        return (Boolean) get(6);
    }

    /**
     * Setter for <code>pg_catalog.pg_tables.rowsecurity</code>.
     */
    public void setRowsecurity(Boolean value) {
        set(7, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_tables.rowsecurity</code>.
     */
    public Boolean getRowsecurity() {
        return (Boolean) get(7);
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<String, String, String, String, Boolean, Boolean, Boolean, Boolean> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<String, String, String, String, Boolean, Boolean, Boolean, Boolean> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return PgTables.PG_TABLES.SCHEMANAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return PgTables.PG_TABLES.TABLENAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return PgTables.PG_TABLES.TABLEOWNER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return PgTables.PG_TABLES.TABLESPACE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field5() {
        return PgTables.PG_TABLES.HASINDEXES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field6() {
        return PgTables.PG_TABLES.HASRULES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field7() {
        return PgTables.PG_TABLES.HASTRIGGERS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field8() {
        return PgTables.PG_TABLES.ROWSECURITY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getSchemaname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getTablename();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getTableowner();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getTablespace();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component5() {
        return getHasindexes();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component6() {
        return getHasrules();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component7() {
        return getHastriggers();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component8() {
        return getRowsecurity();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getSchemaname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getTablename();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getTableowner();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getTablespace();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value5() {
        return getHasindexes();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value6() {
        return getHasrules();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value7() {
        return getHastriggers();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value8() {
        return getRowsecurity();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgTablesRecord value1(String value) {
        setSchemaname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgTablesRecord value2(String value) {
        setTablename(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgTablesRecord value3(String value) {
        setTableowner(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgTablesRecord value4(String value) {
        setTablespace(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgTablesRecord value5(Boolean value) {
        setHasindexes(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgTablesRecord value6(Boolean value) {
        setHasrules(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgTablesRecord value7(Boolean value) {
        setHastriggers(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgTablesRecord value8(Boolean value) {
        setRowsecurity(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgTablesRecord values(String value1, String value2, String value3, String value4, Boolean value5, Boolean value6, Boolean value7, Boolean value8) {
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
     * Create a detached PgTablesRecord
     */
    public PgTablesRecord() {
        super(PgTables.PG_TABLES);
    }

    /**
     * Create a detached, initialised PgTablesRecord
     */
    public PgTablesRecord(String schemaname, String tablename, String tableowner, String tablespace, Boolean hasindexes, Boolean hasrules, Boolean hastriggers, Boolean rowsecurity) {
        super(PgTables.PG_TABLES);

        set(0, schemaname);
        set(1, tablename);
        set(2, tableowner);
        set(3, tablespace);
        set(4, hasindexes);
        set(5, hasrules);
        set(6, hastriggers);
        set(7, rowsecurity);
    }
}
