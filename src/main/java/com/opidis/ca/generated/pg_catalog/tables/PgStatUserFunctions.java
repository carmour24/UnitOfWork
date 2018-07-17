/*
 * This file is generated by jOOQ.
 */
package com.opidis.ca.generated.pg_catalog.tables;


import com.opidis.ca.generated.pg_catalog.PgCatalog;
import com.opidis.ca.generated.pg_catalog.tables.records.PgStatUserFunctionsRecord;

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
public class PgStatUserFunctions extends TableImpl<PgStatUserFunctionsRecord> {

    private static final long serialVersionUID = -1608443205;

    /**
     * The reference instance of <code>pg_catalog.pg_stat_user_functions</code>
     */
    public static final PgStatUserFunctions PG_STAT_USER_FUNCTIONS = new PgStatUserFunctions();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgStatUserFunctionsRecord> getRecordType() {
        return PgStatUserFunctionsRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_stat_user_functions.funcid</code>.
     */
    public final TableField<PgStatUserFunctionsRecord, Long> FUNCID = createField("funcid", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_user_functions.schemaname</code>.
     */
    public final TableField<PgStatUserFunctionsRecord, String> SCHEMANAME = createField("schemaname", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_user_functions.funcname</code>.
     */
    public final TableField<PgStatUserFunctionsRecord, String> FUNCNAME = createField("funcname", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_user_functions.calls</code>.
     */
    public final TableField<PgStatUserFunctionsRecord, Long> CALLS = createField("calls", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_user_functions.total_time</code>.
     */
    public final TableField<PgStatUserFunctionsRecord, Double> TOTAL_TIME = createField("total_time", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_user_functions.self_time</code>.
     */
    public final TableField<PgStatUserFunctionsRecord, Double> SELF_TIME = createField("self_time", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * Create a <code>pg_catalog.pg_stat_user_functions</code> table reference
     */
    public PgStatUserFunctions() {
        this(DSL.name("pg_stat_user_functions"), null);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_stat_user_functions</code> table reference
     */
    public PgStatUserFunctions(String alias) {
        this(DSL.name(alias), PG_STAT_USER_FUNCTIONS);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_stat_user_functions</code> table reference
     */
    public PgStatUserFunctions(Name alias) {
        this(alias, PG_STAT_USER_FUNCTIONS);
    }

    private PgStatUserFunctions(Name alias, Table<PgStatUserFunctionsRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgStatUserFunctions(Name alias, Table<PgStatUserFunctionsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> PgStatUserFunctions(Table<O> child, ForeignKey<O, PgStatUserFunctionsRecord> key) {
        super(child, key, PG_STAT_USER_FUNCTIONS);
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
    public PgStatUserFunctions as(String alias) {
        return new PgStatUserFunctions(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatUserFunctions as(Name alias) {
        return new PgStatUserFunctions(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgStatUserFunctions rename(String name) {
        return new PgStatUserFunctions(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgStatUserFunctions rename(Name name) {
        return new PgStatUserFunctions(name, null);
    }
}
