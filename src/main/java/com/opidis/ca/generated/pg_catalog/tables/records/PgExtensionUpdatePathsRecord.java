/*
 * This file is generated by jOOQ.
 */
package com.opidis.ca.generated.pg_catalog.tables.records;


import com.opidis.ca.generated.pg_catalog.tables.PgExtensionUpdatePaths;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Row3;
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
public class PgExtensionUpdatePathsRecord extends TableRecordImpl<PgExtensionUpdatePathsRecord> implements Record3<String, String, String> {

    private static final long serialVersionUID = 1199048692;

    /**
     * Setter for <code>pg_catalog.pg_extension_update_paths.source</code>.
     */
    public void setSource(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_extension_update_paths.source</code>.
     */
    public String getSource() {
        return (String) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_extension_update_paths.target</code>.
     */
    public void setTarget(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_extension_update_paths.target</code>.
     */
    public String getTarget() {
        return (String) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_extension_update_paths.path</code>.
     */
    public void setPath(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_extension_update_paths.path</code>.
     */
    public String getPath() {
        return (String) get(2);
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<String, String, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<String, String, String> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return PgExtensionUpdatePaths.PG_EXTENSION_UPDATE_PATHS.SOURCE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return PgExtensionUpdatePaths.PG_EXTENSION_UPDATE_PATHS.TARGET;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return PgExtensionUpdatePaths.PG_EXTENSION_UPDATE_PATHS.PATH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getSource();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getTarget();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getPath();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getSource();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getTarget();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getPath();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgExtensionUpdatePathsRecord value1(String value) {
        setSource(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgExtensionUpdatePathsRecord value2(String value) {
        setTarget(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgExtensionUpdatePathsRecord value3(String value) {
        setPath(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgExtensionUpdatePathsRecord values(String value1, String value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgExtensionUpdatePathsRecord
     */
    public PgExtensionUpdatePathsRecord() {
        super(PgExtensionUpdatePaths.PG_EXTENSION_UPDATE_PATHS);
    }

    /**
     * Create a detached, initialised PgExtensionUpdatePathsRecord
     */
    public PgExtensionUpdatePathsRecord(String source, String target, String path) {
        super(PgExtensionUpdatePaths.PG_EXTENSION_UPDATE_PATHS);

        set(0, source);
        set(1, target);
        set(2, path);
    }
}
