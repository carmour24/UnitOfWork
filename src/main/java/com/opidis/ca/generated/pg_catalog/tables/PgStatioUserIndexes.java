/*
 * This file is generated by jOOQ.
 */
package com.opidis.ca.generated.pg_catalog.tables;


import com.opidis.ca.generated.pg_catalog.PgCatalog;
import com.opidis.ca.generated.pg_catalog.tables.records.PgStatioUserIndexesRecord;

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
public class PgStatioUserIndexes extends TableImpl<PgStatioUserIndexesRecord> {

    private static final long serialVersionUID = -2116248712;

    /**
     * The reference instance of <code>pg_catalog.pg_statio_user_indexes</code>
     */
    public static final PgStatioUserIndexes PG_STATIO_USER_INDEXES = new PgStatioUserIndexes();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgStatioUserIndexesRecord> getRecordType() {
        return PgStatioUserIndexesRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_statio_user_indexes.relid</code>.
     */
    public final TableField<PgStatioUserIndexesRecord, Long> RELID = createField("relid", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_statio_user_indexes.indexrelid</code>.
     */
    public final TableField<PgStatioUserIndexesRecord, Long> INDEXRELID = createField("indexrelid", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_statio_user_indexes.schemaname</code>.
     */
    public final TableField<PgStatioUserIndexesRecord, String> SCHEMANAME = createField("schemaname", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_statio_user_indexes.relname</code>.
     */
    public final TableField<PgStatioUserIndexesRecord, String> RELNAME = createField("relname", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_statio_user_indexes.indexrelname</code>.
     */
    public final TableField<PgStatioUserIndexesRecord, String> INDEXRELNAME = createField("indexrelname", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_statio_user_indexes.idx_blks_read</code>.
     */
    public final TableField<PgStatioUserIndexesRecord, Long> IDX_BLKS_READ = createField("idx_blks_read", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_statio_user_indexes.idx_blks_hit</code>.
     */
    public final TableField<PgStatioUserIndexesRecord, Long> IDX_BLKS_HIT = createField("idx_blks_hit", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * Create a <code>pg_catalog.pg_statio_user_indexes</code> table reference
     */
    public PgStatioUserIndexes() {
        this(DSL.name("pg_statio_user_indexes"), null);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_statio_user_indexes</code> table reference
     */
    public PgStatioUserIndexes(String alias) {
        this(DSL.name(alias), PG_STATIO_USER_INDEXES);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_statio_user_indexes</code> table reference
     */
    public PgStatioUserIndexes(Name alias) {
        this(alias, PG_STATIO_USER_INDEXES);
    }

    private PgStatioUserIndexes(Name alias, Table<PgStatioUserIndexesRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgStatioUserIndexes(Name alias, Table<PgStatioUserIndexesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> PgStatioUserIndexes(Table<O> child, ForeignKey<O, PgStatioUserIndexesRecord> key) {
        super(child, key, PG_STATIO_USER_INDEXES);
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
    public PgStatioUserIndexes as(String alias) {
        return new PgStatioUserIndexes(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatioUserIndexes as(Name alias) {
        return new PgStatioUserIndexes(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgStatioUserIndexes rename(String name) {
        return new PgStatioUserIndexes(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgStatioUserIndexes rename(Name name) {
        return new PgStatioUserIndexes(name, null);
    }
}