/*
 * This file is generated by jOOQ.
 */
package com.opidis.ca.generated.pg_catalog.tables;


import com.opidis.ca.generated.pg_catalog.PgCatalog;
import com.opidis.ca.generated.pg_catalog.tables.records.GenerateSeriesRecord;

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
public class GenerateSeries extends TableImpl<GenerateSeriesRecord> {

    private static final long serialVersionUID = -2106888673;

    /**
     * The reference instance of <code>pg_catalog.generate_series</code>
     */
    public static final GenerateSeries GENERATE_SERIES = new GenerateSeries();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<GenerateSeriesRecord> getRecordType() {
        return GenerateSeriesRecord.class;
    }

    /**
     * The column <code>pg_catalog.generate_series.generate_series</code>.
     */
    public final TableField<GenerateSeriesRecord, Integer> GENERATE_SERIES_ = createField("generate_series", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>pg_catalog.generate_series</code> table reference
     */
    public GenerateSeries() {
        this(DSL.name("generate_series"), null);
    }

    /**
     * Create an aliased <code>pg_catalog.generate_series</code> table reference
     */
    public GenerateSeries(String alias) {
        this(DSL.name(alias), GENERATE_SERIES);
    }

    /**
     * Create an aliased <code>pg_catalog.generate_series</code> table reference
     */
    public GenerateSeries(Name alias) {
        this(alias, GENERATE_SERIES);
    }

    private GenerateSeries(Name alias, Table<GenerateSeriesRecord> aliased) {
        this(alias, aliased, new Field[3]);
    }

    private GenerateSeries(Name alias, Table<GenerateSeriesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> GenerateSeries(Table<O> child, ForeignKey<O, GenerateSeriesRecord> key) {
        super(child, key, GENERATE_SERIES);
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
    public GenerateSeries as(String alias) {
        return new GenerateSeries(DSL.name(alias), this, parameters);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GenerateSeries as(Name alias) {
        return new GenerateSeries(alias, this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public GenerateSeries rename(String name) {
        return new GenerateSeries(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public GenerateSeries rename(Name name) {
        return new GenerateSeries(name, null, parameters);
    }

    /**
     * Call this table-valued function
     */
    public GenerateSeries call(Integer __1, Integer __2, Integer __3) {
        return new GenerateSeries(DSL.name(getName()), null, new Field[] { 
              DSL.val(__1, org.jooq.impl.SQLDataType.INTEGER)
            , DSL.val(__2, org.jooq.impl.SQLDataType.INTEGER)
            , DSL.val(__3, org.jooq.impl.SQLDataType.INTEGER)
        });
    }

    /**
     * Call this table-valued function
     */
    public GenerateSeries call(Field<Integer> __1, Field<Integer> __2, Field<Integer> __3) {
        return new GenerateSeries(DSL.name(getName()), null, new Field[] { 
              __1
            , __2
            , __3
        });
    }
}