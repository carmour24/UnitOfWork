/*
 * This file is generated by jOOQ.
 */
package com.opidis.ca.generated.pg_catalog.tables;


import com.opidis.ca.generated.pg_catalog.PgCatalog;
import com.opidis.ca.generated.pg_catalog.tables.records.PgStatSysTablesRecord;

import java.time.OffsetDateTime;

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
public class PgStatSysTables extends TableImpl<PgStatSysTablesRecord> {

    private static final long serialVersionUID = 860067421;

    /**
     * The reference instance of <code>pg_catalog.pg_stat_sys_tables</code>
     */
    public static final PgStatSysTables PG_STAT_SYS_TABLES = new PgStatSysTables();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgStatSysTablesRecord> getRecordType() {
        return PgStatSysTablesRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_stat_sys_tables.relid</code>.
     */
    public final TableField<PgStatSysTablesRecord, Long> RELID = createField("relid", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_sys_tables.schemaname</code>.
     */
    public final TableField<PgStatSysTablesRecord, String> SCHEMANAME = createField("schemaname", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_sys_tables.relname</code>.
     */
    public final TableField<PgStatSysTablesRecord, String> RELNAME = createField("relname", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_sys_tables.seq_scan</code>.
     */
    public final TableField<PgStatSysTablesRecord, Long> SEQ_SCAN = createField("seq_scan", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_sys_tables.seq_tup_read</code>.
     */
    public final TableField<PgStatSysTablesRecord, Long> SEQ_TUP_READ = createField("seq_tup_read", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_sys_tables.idx_scan</code>.
     */
    public final TableField<PgStatSysTablesRecord, Long> IDX_SCAN = createField("idx_scan", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_sys_tables.idx_tup_fetch</code>.
     */
    public final TableField<PgStatSysTablesRecord, Long> IDX_TUP_FETCH = createField("idx_tup_fetch", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_sys_tables.n_tup_ins</code>.
     */
    public final TableField<PgStatSysTablesRecord, Long> N_TUP_INS = createField("n_tup_ins", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_sys_tables.n_tup_upd</code>.
     */
    public final TableField<PgStatSysTablesRecord, Long> N_TUP_UPD = createField("n_tup_upd", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_sys_tables.n_tup_del</code>.
     */
    public final TableField<PgStatSysTablesRecord, Long> N_TUP_DEL = createField("n_tup_del", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_sys_tables.n_tup_hot_upd</code>.
     */
    public final TableField<PgStatSysTablesRecord, Long> N_TUP_HOT_UPD = createField("n_tup_hot_upd", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_sys_tables.n_live_tup</code>.
     */
    public final TableField<PgStatSysTablesRecord, Long> N_LIVE_TUP = createField("n_live_tup", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_sys_tables.n_dead_tup</code>.
     */
    public final TableField<PgStatSysTablesRecord, Long> N_DEAD_TUP = createField("n_dead_tup", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_sys_tables.n_mod_since_analyze</code>.
     */
    public final TableField<PgStatSysTablesRecord, Long> N_MOD_SINCE_ANALYZE = createField("n_mod_since_analyze", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_sys_tables.last_vacuum</code>.
     */
    public final TableField<PgStatSysTablesRecord, OffsetDateTime> LAST_VACUUM = createField("last_vacuum", org.jooq.impl.SQLDataType.TIMESTAMPWITHTIMEZONE, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_sys_tables.last_autovacuum</code>.
     */
    public final TableField<PgStatSysTablesRecord, OffsetDateTime> LAST_AUTOVACUUM = createField("last_autovacuum", org.jooq.impl.SQLDataType.TIMESTAMPWITHTIMEZONE, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_sys_tables.last_analyze</code>.
     */
    public final TableField<PgStatSysTablesRecord, OffsetDateTime> LAST_ANALYZE = createField("last_analyze", org.jooq.impl.SQLDataType.TIMESTAMPWITHTIMEZONE, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_sys_tables.last_autoanalyze</code>.
     */
    public final TableField<PgStatSysTablesRecord, OffsetDateTime> LAST_AUTOANALYZE = createField("last_autoanalyze", org.jooq.impl.SQLDataType.TIMESTAMPWITHTIMEZONE, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_sys_tables.vacuum_count</code>.
     */
    public final TableField<PgStatSysTablesRecord, Long> VACUUM_COUNT = createField("vacuum_count", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_sys_tables.autovacuum_count</code>.
     */
    public final TableField<PgStatSysTablesRecord, Long> AUTOVACUUM_COUNT = createField("autovacuum_count", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_sys_tables.analyze_count</code>.
     */
    public final TableField<PgStatSysTablesRecord, Long> ANALYZE_COUNT = createField("analyze_count", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_sys_tables.autoanalyze_count</code>.
     */
    public final TableField<PgStatSysTablesRecord, Long> AUTOANALYZE_COUNT = createField("autoanalyze_count", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * Create a <code>pg_catalog.pg_stat_sys_tables</code> table reference
     */
    public PgStatSysTables() {
        this(DSL.name("pg_stat_sys_tables"), null);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_stat_sys_tables</code> table reference
     */
    public PgStatSysTables(String alias) {
        this(DSL.name(alias), PG_STAT_SYS_TABLES);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_stat_sys_tables</code> table reference
     */
    public PgStatSysTables(Name alias) {
        this(alias, PG_STAT_SYS_TABLES);
    }

    private PgStatSysTables(Name alias, Table<PgStatSysTablesRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgStatSysTables(Name alias, Table<PgStatSysTablesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> PgStatSysTables(Table<O> child, ForeignKey<O, PgStatSysTablesRecord> key) {
        super(child, key, PG_STAT_SYS_TABLES);
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
    public PgStatSysTables as(String alias) {
        return new PgStatSysTables(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatSysTables as(Name alias) {
        return new PgStatSysTables(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgStatSysTables rename(String name) {
        return new PgStatSysTables(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgStatSysTables rename(Name name) {
        return new PgStatSysTables(name, null);
    }
}
