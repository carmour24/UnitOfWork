/*
 * This file is generated by jOOQ.
 */
package com.opidis.ca.generated.pg_catalog.tables;


import com.opidis.ca.generated.pg_catalog.PgCatalog;
import com.opidis.ca.generated.pg_catalog.tables.records.PgViewsRecord;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


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
public class PgViews extends TableImpl<PgViewsRecord> {

    private static final long serialVersionUID = -2139913500;

    /**
     * The reference instance of <code>pg_catalog.pg_views</code>
     */
    public static final PgViews PG_VIEWS = new PgViews();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgViewsRecord> getRecordType() {
        return PgViewsRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_views.schemaname</code>.
     */
    public final TableField<PgViewsRecord, String> SCHEMANAME = createField("schemaname", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_views.viewname</code>.
     */
    public final TableField<PgViewsRecord, String> VIEWNAME = createField("viewname", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_views.viewowner</code>.
     */
    public final TableField<PgViewsRecord, String> VIEWOWNER = createField("viewowner", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_views.definition</code>.
     */
    public final TableField<PgViewsRecord, String> DEFINITION = createField("definition", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * Create a <code>pg_catalog.pg_views</code> table reference
     */
    public PgViews() {
        this(DSL.name("pg_views"), null);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_views</code> table reference
     */
    public PgViews(String alias) {
        this(DSL.name(alias), PG_VIEWS);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_views</code> table reference
     */
    public PgViews(Name alias) {
        this(alias, PG_VIEWS);
    }

    private PgViews(Name alias, Table<PgViewsRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgViews(Name alias, Table<PgViewsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> PgViews(Table<O> child, ForeignKey<O, PgViewsRecord> key) {
        super(child, key, PG_VIEWS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return PgCatalog.PG_CATALOG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgViews as(String alias) {
        return new PgViews(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgViews as(Name alias) {
        return new PgViews(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgViews rename(String name) {
        return new PgViews(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgViews rename(Name name) {
        return new PgViews(name, null);
    }
}
