/*
 * This file is generated by jOOQ.
 */
package com.opidis.ca.generated.pg_catalog.tables;


import com.opidis.ca.generated.pg_catalog.Indexes;
import com.opidis.ca.generated.pg_catalog.PgCatalog;
import com.opidis.ca.generated.pg_catalog.tables.records.PgTypeRecord;

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
public class PgType extends TableImpl<PgTypeRecord> {

    private static final long serialVersionUID = 338793769;

    /**
     * The reference instance of <code>pg_catalog.pg_type</code>
     */
    public static final PgType PG_TYPE = new PgType();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgTypeRecord> getRecordType() {
        return PgTypeRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_type.typname</code>.
     */
    public final TableField<PgTypeRecord, String> TYPNAME = createField("typname", org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_type.typnamespace</code>.
     */
    public final TableField<PgTypeRecord, Long> TYPNAMESPACE = createField("typnamespace", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_type.typowner</code>.
     */
    public final TableField<PgTypeRecord, Long> TYPOWNER = createField("typowner", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_type.typlen</code>.
     */
    public final TableField<PgTypeRecord, Short> TYPLEN = createField("typlen", org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_type.typbyval</code>.
     */
    public final TableField<PgTypeRecord, Boolean> TYPBYVAL = createField("typbyval", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_type.typtype</code>.
     */
    public final TableField<PgTypeRecord, String> TYPTYPE = createField("typtype", org.jooq.impl.SQLDataType.CHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_type.typcategory</code>.
     */
    public final TableField<PgTypeRecord, String> TYPCATEGORY = createField("typcategory", org.jooq.impl.SQLDataType.CHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_type.typispreferred</code>.
     */
    public final TableField<PgTypeRecord, Boolean> TYPISPREFERRED = createField("typispreferred", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_type.typisdefined</code>.
     */
    public final TableField<PgTypeRecord, Boolean> TYPISDEFINED = createField("typisdefined", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_type.typdelim</code>.
     */
    public final TableField<PgTypeRecord, String> TYPDELIM = createField("typdelim", org.jooq.impl.SQLDataType.CHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_type.typrelid</code>.
     */
    public final TableField<PgTypeRecord, Long> TYPRELID = createField("typrelid", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_type.typelem</code>.
     */
    public final TableField<PgTypeRecord, Long> TYPELEM = createField("typelem", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_type.typarray</code>.
     */
    public final TableField<PgTypeRecord, Long> TYPARRAY = createField("typarray", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_type.typinput</code>.
     */
    public final TableField<PgTypeRecord, String> TYPINPUT = createField("typinput", org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_type.typoutput</code>.
     */
    public final TableField<PgTypeRecord, String> TYPOUTPUT = createField("typoutput", org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_type.typreceive</code>.
     */
    public final TableField<PgTypeRecord, String> TYPRECEIVE = createField("typreceive", org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_type.typsend</code>.
     */
    public final TableField<PgTypeRecord, String> TYPSEND = createField("typsend", org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_type.typmodin</code>.
     */
    public final TableField<PgTypeRecord, String> TYPMODIN = createField("typmodin", org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_type.typmodout</code>.
     */
    public final TableField<PgTypeRecord, String> TYPMODOUT = createField("typmodout", org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_type.typanalyze</code>.
     */
    public final TableField<PgTypeRecord, String> TYPANALYZE = createField("typanalyze", org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_type.typalign</code>.
     */
    public final TableField<PgTypeRecord, String> TYPALIGN = createField("typalign", org.jooq.impl.SQLDataType.CHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_type.typstorage</code>.
     */
    public final TableField<PgTypeRecord, String> TYPSTORAGE = createField("typstorage", org.jooq.impl.SQLDataType.CHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_type.typnotnull</code>.
     */
    public final TableField<PgTypeRecord, Boolean> TYPNOTNULL = createField("typnotnull", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_type.typbasetype</code>.
     */
    public final TableField<PgTypeRecord, Long> TYPBASETYPE = createField("typbasetype", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_type.typtypmod</code>.
     */
    public final TableField<PgTypeRecord, Integer> TYPTYPMOD = createField("typtypmod", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_type.typndims</code>.
     */
    public final TableField<PgTypeRecord, Integer> TYPNDIMS = createField("typndims", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_type.typcollation</code>.
     */
    public final TableField<PgTypeRecord, Long> TYPCOLLATION = createField("typcollation", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public final TableField<PgTypeRecord, Object> TYPDEFAULTBIN = createField("typdefaultbin", , this, "");

    /**
     * The column <code>pg_catalog.pg_type.typdefault</code>.
     */
    public final TableField<PgTypeRecord, String> TYPDEFAULT = createField("typdefault", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_type.typacl</code>.
     */
    public final TableField<PgTypeRecord, String[]> TYPACL = createField("typacl", org.jooq.impl.SQLDataType.VARCHAR.getArrayDataType(), this, "");

    /**
     * Create a <code>pg_catalog.pg_type</code> table reference
     */
    public PgType() {
        this(DSL.name("pg_type"), null);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_type</code> table reference
     */
    public PgType(String alias) {
        this(DSL.name(alias), PG_TYPE);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_type</code> table reference
     */
    public PgType(Name alias) {
        this(alias, PG_TYPE);
    }

    private PgType(Name alias, Table<PgTypeRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgType(Name alias, Table<PgTypeRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> PgType(Table<O> child, ForeignKey<O, PgTypeRecord> key) {
        super(child, key, PG_TYPE);
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
        return Arrays.<Index>asList(Indexes.PG_TYPE_TYPNAME_NSP_INDEX);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgType as(String alias) {
        return new PgType(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgType as(Name alias) {
        return new PgType(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgType rename(String name) {
        return new PgType(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgType rename(Name name) {
        return new PgType(name, null);
    }
}
