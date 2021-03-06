/*
 * This file is generated by jOOQ.
 */
package com.opidis.unitofwork.data.generated.tables;


import com.opidis.unitofwork.data.generated.Indexes;
import com.opidis.unitofwork.data.generated.Keys;
import com.opidis.unitofwork.data.generated.Public;
import com.opidis.unitofwork.data.generated.tables.records.Tbl1Record;

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
import org.jooq.UniqueKey;
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
public class Tbl1 extends TableImpl<Tbl1Record> {

    private static final long serialVersionUID = -111983798;

    /**
     * The reference instance of <code>public.tbl1</code>
     */
    public static final Tbl1 TBL1 = new Tbl1();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Tbl1Record> getRecordType() {
        return Tbl1Record.class;
    }

    /**
     * The column <code>public.tbl1.id</code>.
     */
    public final TableField<Tbl1Record, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.tbl1.foreign_name</code>.
     */
    public final TableField<Tbl1Record, Integer> FOREIGN_NAME = createField("foreign_name", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.tbl1.name</code>.
     */
    public final TableField<Tbl1Record, String> NAME = createField("name", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * Create a <code>public.tbl1</code> table reference
     */
    public Tbl1() {
        this(DSL.name("tbl1"), null);
    }

    /**
     * Create an aliased <code>public.tbl1</code> table reference
     */
    public Tbl1(String alias) {
        this(DSL.name(alias), TBL1);
    }

    /**
     * Create an aliased <code>public.tbl1</code> table reference
     */
    public Tbl1(Name alias) {
        this(alias, TBL1);
    }

    private Tbl1(Name alias, Table<Tbl1Record> aliased) {
        this(alias, aliased, null);
    }

    private Tbl1(Name alias, Table<Tbl1Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Tbl1(Table<O> child, ForeignKey<O, Tbl1Record> key) {
        super(child, key, TBL1);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.TBL1_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<Tbl1Record> getPrimaryKey() {
        return Keys.TBL1_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<Tbl1Record>> getKeys() {
        return Arrays.<UniqueKey<Tbl1Record>>asList(Keys.TBL1_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<Tbl1Record, ?>> getReferences() {
        return Arrays.<ForeignKey<Tbl1Record, ?>>asList(Keys.TBL1__TBL1_FOREIGN_NAME_FKEY);
    }

    public Tbl2 tbl2() {
        return new Tbl2(this, Keys.TBL1__TBL1_FOREIGN_NAME_FKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Tbl1 as(String alias) {
        return new Tbl1(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Tbl1 as(Name alias) {
        return new Tbl1(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Tbl1 rename(String name) {
        return new Tbl1(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Tbl1 rename(Name name) {
        return new Tbl1(name, null);
    }
}
