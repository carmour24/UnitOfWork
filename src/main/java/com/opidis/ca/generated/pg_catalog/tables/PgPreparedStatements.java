/*
 * This file is generated by jOOQ.
 */
package com.opidis.ca.generated.pg_catalog.tables;


import com.opidis.ca.generated.pg_catalog.PgCatalog;
import com.opidis.ca.generated.pg_catalog.tables.records.PgPreparedStatementsRecord;

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
public class PgPreparedStatements extends TableImpl<PgPreparedStatementsRecord> {

    private static final long serialVersionUID = 2098796127;

    /**
     * The reference instance of <code>pg_catalog.pg_prepared_statements</code>
     */
    public static final PgPreparedStatements PG_PREPARED_STATEMENTS = new PgPreparedStatements();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgPreparedStatementsRecord> getRecordType() {
        return PgPreparedStatementsRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_prepared_statements.name</code>.
     */
    public final TableField<PgPreparedStatementsRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_prepared_statements.statement</code>.
     */
    public final TableField<PgPreparedStatementsRecord, String> STATEMENT = createField("statement", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_prepared_statements.prepare_time</code>.
     */
    public final TableField<PgPreparedStatementsRecord, OffsetDateTime> PREPARE_TIME = createField("prepare_time", org.jooq.impl.SQLDataType.TIMESTAMPWITHTIMEZONE, this, "");

    /**
     * The column <code>pg_catalog.pg_prepared_statements.parameter_types</code>.
     */
    public final TableField<PgPreparedStatementsRecord, Object[]> PARAMETER_TYPES = createField("parameter_types", org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"regtype\"").getArrayDataType(), this, "");

    /**
     * The column <code>pg_catalog.pg_prepared_statements.from_sql</code>.
     */
    public final TableField<PgPreparedStatementsRecord, Boolean> FROM_SQL = createField("from_sql", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * Create a <code>pg_catalog.pg_prepared_statements</code> table reference
     */
    public PgPreparedStatements() {
        this(DSL.name("pg_prepared_statements"), null);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_prepared_statements</code> table reference
     */
    public PgPreparedStatements(String alias) {
        this(DSL.name(alias), PG_PREPARED_STATEMENTS);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_prepared_statements</code> table reference
     */
    public PgPreparedStatements(Name alias) {
        this(alias, PG_PREPARED_STATEMENTS);
    }

    private PgPreparedStatements(Name alias, Table<PgPreparedStatementsRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgPreparedStatements(Name alias, Table<PgPreparedStatementsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> PgPreparedStatements(Table<O> child, ForeignKey<O, PgPreparedStatementsRecord> key) {
        super(child, key, PG_PREPARED_STATEMENTS);
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
    public PgPreparedStatements as(String alias) {
        return new PgPreparedStatements(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgPreparedStatements as(Name alias) {
        return new PgPreparedStatements(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgPreparedStatements rename(String name) {
        return new PgPreparedStatements(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgPreparedStatements rename(Name name) {
        return new PgPreparedStatements(name, null);
    }
}
