/*
 * This file is generated by jOOQ.
 */
package com.opidis.ca.generated.pg_catalog.tables;


import com.opidis.ca.generated.pg_catalog.PgCatalog;
import com.opidis.ca.generated.pg_catalog.tables.records.PgStatioAllTablesRecord;

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
public class PgStatioAllTables extends TableImpl<PgStatioAllTablesRecord> {

    private static final long serialVersionUID = 1083968449;

    /**
     * The reference instance of <code>pg_catalog.pg_statio_all_tables</code>
     */
    public static final PgStatioAllTables PG_STATIO_ALL_TABLES = new PgStatioAllTables();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgStatioAllTablesRecord> getRecordType() {
        return PgStatioAllTablesRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_statio_all_tables.relid</code>.
     */
    public final TableField<PgStatioAllTablesRecord, Long> RELID = createField("relid", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_statio_all_tables.schemaname</code>.
     */
    public final TableField<PgStatioAllTablesRecord, String> SCHEMANAME = createField("schemaname", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_statio_all_tables.relname</code>.
     */
    public final TableField<PgStatioAllTablesRecord, String> RELNAME = createField("relname", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_statio_all_tables.heap_blks_read</code>.
     */
    public final TableField<PgStatioAllTablesRecord, Long> HEAP_BLKS_READ = createField("heap_blks_read", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_statio_all_tables.heap_blks_hit</code>.
     */
    public final TableField<PgStatioAllTablesRecord, Long> HEAP_BLKS_HIT = createField("heap_blks_hit", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_statio_all_tables.idx_blks_read</code>.
     */
    public final TableField<PgStatioAllTablesRecord, Long> IDX_BLKS_READ = createField("idx_blks_read", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_statio_all_tables.idx_blks_hit</code>.
     */
    public final TableField<PgStatioAllTablesRecord, Long> IDX_BLKS_HIT = createField("idx_blks_hit", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_statio_all_tables.toast_blks_read</code>.
     */
    public final TableField<PgStatioAllTablesRecord, Long> TOAST_BLKS_READ = createField("toast_blks_read", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_statio_all_tables.toast_blks_hit</code>.
     */
    public final TableField<PgStatioAllTablesRecord, Long> TOAST_BLKS_HIT = createField("toast_blks_hit", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_statio_all_tables.tidx_blks_read</code>.
     */
    public final TableField<PgStatioAllTablesRecord, Long> TIDX_BLKS_READ = createField("tidx_blks_read", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_statio_all_tables.tidx_blks_hit</code>.
     */
    public final TableField<PgStatioAllTablesRecord, Long> TIDX_BLKS_HIT = createField("tidx_blks_hit", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * Create a <code>pg_catalog.pg_statio_all_tables</code> table reference
     */
    public PgStatioAllTables() {
        this(DSL.name("pg_statio_all_tables"), null);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_statio_all_tables</code> table reference
     */
    public PgStatioAllTables(String alias) {
        this(DSL.name(alias), PG_STATIO_ALL_TABLES);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_statio_all_tables</code> table reference
     */
    public PgStatioAllTables(Name alias) {
        this(alias, PG_STATIO_ALL_TABLES);
    }

    private PgStatioAllTables(Name alias, Table<PgStatioAllTablesRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgStatioAllTables(Name alias, Table<PgStatioAllTablesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> PgStatioAllTables(Table<O> child, ForeignKey<O, PgStatioAllTablesRecord> key) {
        super(child, key, PG_STATIO_ALL_TABLES);
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
    public PgStatioAllTables as(String alias) {
        return new PgStatioAllTables(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatioAllTables as(Name alias) {
        return new PgStatioAllTables(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgStatioAllTables rename(String name) {
        return new PgStatioAllTables(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgStatioAllTables rename(Name name) {
        return new PgStatioAllTables(name, null);
    }
}
