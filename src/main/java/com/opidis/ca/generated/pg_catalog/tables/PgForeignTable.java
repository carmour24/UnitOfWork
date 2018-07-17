/*
 * This file is generated by jOOQ.
 */
package com.opidis.ca.generated.pg_catalog.tables;


import com.opidis.ca.generated.pg_catalog.Indexes;
import com.opidis.ca.generated.pg_catalog.PgCatalog;
import com.opidis.ca.generated.pg_catalog.tables.records.PgForeignTableRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
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
public class PgForeignTable extends TableImpl<PgForeignTableRecord> {

    private static final long serialVersionUID = 574838696;

    /**
     * The reference instance of <code>pg_catalog.pg_foreign_table</code>
     */
    public static final PgForeignTable PG_FOREIGN_TABLE = new PgForeignTable();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgForeignTableRecord> getRecordType() {
        return PgForeignTableRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_foreign_table.ftrelid</code>.
     */
    public final TableField<PgForeignTableRecord, Long> FTRELID = createField("ftrelid", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_foreign_table.ftserver</code>.
     */
    public final TableField<PgForeignTableRecord, Long> FTSERVER = createField("ftserver", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_foreign_table.ftoptions</code>.
     */
    public final TableField<PgForeignTableRecord, String[]> FTOPTIONS = createField("ftoptions", org.jooq.impl.SQLDataType.CLOB.getArrayDataType(), this, "");

    /**
     * Create a <code>pg_catalog.pg_foreign_table</code> table reference
     */
    public PgForeignTable() {
        this(DSL.name("pg_foreign_table"), null);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_foreign_table</code> table reference
     */
    public PgForeignTable(String alias) {
        this(DSL.name(alias), PG_FOREIGN_TABLE);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_foreign_table</code> table reference
     */
    public PgForeignTable(Name alias) {
        this(alias, PG_FOREIGN_TABLE);
    }

    private PgForeignTable(Name alias, Table<PgForeignTableRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgForeignTable(Name alias, Table<PgForeignTableRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> PgForeignTable(Table<O> child, ForeignKey<O, PgForeignTableRecord> key) {
        super(child, key, PG_FOREIGN_TABLE);
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
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.PG_FOREIGN_TABLE_RELID_INDEX);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgForeignTable as(String alias) {
        return new PgForeignTable(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgForeignTable as(Name alias) {
        return new PgForeignTable(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgForeignTable rename(String name) {
        return new PgForeignTable(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgForeignTable rename(Name name) {
        return new PgForeignTable(name, null);
    }
}
