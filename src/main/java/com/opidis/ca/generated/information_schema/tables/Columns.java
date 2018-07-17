/*
 * This file is generated by jOOQ.
 */
package com.opidis.ca.generated.information_schema.tables;


import com.opidis.ca.generated.information_schema.InformationSchema;
import com.opidis.ca.generated.information_schema.tables.records.ColumnsRecord;

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
public class Columns extends TableImpl<ColumnsRecord> {

    private static final long serialVersionUID = -422798932;

    /**
     * The reference instance of <code>information_schema.columns</code>
     */
    public static final Columns COLUMNS = new Columns();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ColumnsRecord> getRecordType() {
        return ColumnsRecord.class;
    }

    /**
     * The column <code>information_schema.columns.table_catalog</code>.
     */
    public final TableField<ColumnsRecord, String> TABLE_CATALOG = createField("table_catalog", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.columns.table_schema</code>.
     */
    public final TableField<ColumnsRecord, String> TABLE_SCHEMA = createField("table_schema", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.columns.table_name</code>.
     */
    public final TableField<ColumnsRecord, String> TABLE_NAME = createField("table_name", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.columns.column_name</code>.
     */
    public final TableField<ColumnsRecord, String> COLUMN_NAME = createField("column_name", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.columns.ordinal_position</code>.
     */
    public final TableField<ColumnsRecord, Integer> ORDINAL_POSITION = createField("ordinal_position", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>information_schema.columns.column_default</code>.
     */
    public final TableField<ColumnsRecord, String> COLUMN_DEFAULT = createField("column_default", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.columns.is_nullable</code>.
     */
    public final TableField<ColumnsRecord, String> IS_NULLABLE = createField("is_nullable", org.jooq.impl.SQLDataType.VARCHAR(3), this, "");

    /**
     * The column <code>information_schema.columns.data_type</code>.
     */
    public final TableField<ColumnsRecord, String> DATA_TYPE = createField("data_type", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.columns.character_maximum_length</code>.
     */
    public final TableField<ColumnsRecord, Integer> CHARACTER_MAXIMUM_LENGTH = createField("character_maximum_length", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>information_schema.columns.character_octet_length</code>.
     */
    public final TableField<ColumnsRecord, Integer> CHARACTER_OCTET_LENGTH = createField("character_octet_length", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>information_schema.columns.numeric_precision</code>.
     */
    public final TableField<ColumnsRecord, Integer> NUMERIC_PRECISION = createField("numeric_precision", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>information_schema.columns.numeric_precision_radix</code>.
     */
    public final TableField<ColumnsRecord, Integer> NUMERIC_PRECISION_RADIX = createField("numeric_precision_radix", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>information_schema.columns.numeric_scale</code>.
     */
    public final TableField<ColumnsRecord, Integer> NUMERIC_SCALE = createField("numeric_scale", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>information_schema.columns.datetime_precision</code>.
     */
    public final TableField<ColumnsRecord, Integer> DATETIME_PRECISION = createField("datetime_precision", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>information_schema.columns.interval_type</code>.
     */
    public final TableField<ColumnsRecord, String> INTERVAL_TYPE = createField("interval_type", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.columns.interval_precision</code>.
     */
    public final TableField<ColumnsRecord, Integer> INTERVAL_PRECISION = createField("interval_precision", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>information_schema.columns.character_set_catalog</code>.
     */
    public final TableField<ColumnsRecord, String> CHARACTER_SET_CATALOG = createField("character_set_catalog", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.columns.character_set_schema</code>.
     */
    public final TableField<ColumnsRecord, String> CHARACTER_SET_SCHEMA = createField("character_set_schema", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.columns.character_set_name</code>.
     */
    public final TableField<ColumnsRecord, String> CHARACTER_SET_NAME = createField("character_set_name", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.columns.collation_catalog</code>.
     */
    public final TableField<ColumnsRecord, String> COLLATION_CATALOG = createField("collation_catalog", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.columns.collation_schema</code>.
     */
    public final TableField<ColumnsRecord, String> COLLATION_SCHEMA = createField("collation_schema", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.columns.collation_name</code>.
     */
    public final TableField<ColumnsRecord, String> COLLATION_NAME = createField("collation_name", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.columns.domain_catalog</code>.
     */
    public final TableField<ColumnsRecord, String> DOMAIN_CATALOG = createField("domain_catalog", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.columns.domain_schema</code>.
     */
    public final TableField<ColumnsRecord, String> DOMAIN_SCHEMA = createField("domain_schema", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.columns.domain_name</code>.
     */
    public final TableField<ColumnsRecord, String> DOMAIN_NAME = createField("domain_name", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.columns.udt_catalog</code>.
     */
    public final TableField<ColumnsRecord, String> UDT_CATALOG = createField("udt_catalog", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.columns.udt_schema</code>.
     */
    public final TableField<ColumnsRecord, String> UDT_SCHEMA = createField("udt_schema", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.columns.udt_name</code>.
     */
    public final TableField<ColumnsRecord, String> UDT_NAME = createField("udt_name", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.columns.scope_catalog</code>.
     */
    public final TableField<ColumnsRecord, String> SCOPE_CATALOG = createField("scope_catalog", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.columns.scope_schema</code>.
     */
    public final TableField<ColumnsRecord, String> SCOPE_SCHEMA = createField("scope_schema", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.columns.scope_name</code>.
     */
    public final TableField<ColumnsRecord, String> SCOPE_NAME = createField("scope_name", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.columns.maximum_cardinality</code>.
     */
    public final TableField<ColumnsRecord, Integer> MAXIMUM_CARDINALITY = createField("maximum_cardinality", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>information_schema.columns.dtd_identifier</code>.
     */
    public final TableField<ColumnsRecord, String> DTD_IDENTIFIER = createField("dtd_identifier", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.columns.is_self_referencing</code>.
     */
    public final TableField<ColumnsRecord, String> IS_SELF_REFERENCING = createField("is_self_referencing", org.jooq.impl.SQLDataType.VARCHAR(3), this, "");

    /**
     * The column <code>information_schema.columns.is_identity</code>.
     */
    public final TableField<ColumnsRecord, String> IS_IDENTITY = createField("is_identity", org.jooq.impl.SQLDataType.VARCHAR(3), this, "");

    /**
     * The column <code>information_schema.columns.identity_generation</code>.
     */
    public final TableField<ColumnsRecord, String> IDENTITY_GENERATION = createField("identity_generation", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.columns.identity_start</code>.
     */
    public final TableField<ColumnsRecord, String> IDENTITY_START = createField("identity_start", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.columns.identity_increment</code>.
     */
    public final TableField<ColumnsRecord, String> IDENTITY_INCREMENT = createField("identity_increment", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.columns.identity_maximum</code>.
     */
    public final TableField<ColumnsRecord, String> IDENTITY_MAXIMUM = createField("identity_maximum", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.columns.identity_minimum</code>.
     */
    public final TableField<ColumnsRecord, String> IDENTITY_MINIMUM = createField("identity_minimum", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.columns.identity_cycle</code>.
     */
    public final TableField<ColumnsRecord, String> IDENTITY_CYCLE = createField("identity_cycle", org.jooq.impl.SQLDataType.VARCHAR(3), this, "");

    /**
     * The column <code>information_schema.columns.is_generated</code>.
     */
    public final TableField<ColumnsRecord, String> IS_GENERATED = createField("is_generated", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.columns.generation_expression</code>.
     */
    public final TableField<ColumnsRecord, String> GENERATION_EXPRESSION = createField("generation_expression", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.columns.is_updatable</code>.
     */
    public final TableField<ColumnsRecord, String> IS_UPDATABLE = createField("is_updatable", org.jooq.impl.SQLDataType.VARCHAR(3), this, "");

    /**
     * Create a <code>information_schema.columns</code> table reference
     */
    public Columns() {
        this(DSL.name("columns"), null);
    }

    /**
     * Create an aliased <code>information_schema.columns</code> table reference
     */
    public Columns(String alias) {
        this(DSL.name(alias), COLUMNS);
    }

    /**
     * Create an aliased <code>information_schema.columns</code> table reference
     */
    public Columns(Name alias) {
        this(alias, COLUMNS);
    }

    private Columns(Name alias, Table<ColumnsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Columns(Name alias, Table<ColumnsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Columns(Table<O> child, ForeignKey<O, ColumnsRecord> key) {
        super(child, key, COLUMNS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return InformationSchema.INFORMATION_SCHEMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Columns as(String alias) {
        return new Columns(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Columns as(Name alias) {
        return new Columns(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Columns rename(String name) {
        return new Columns(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Columns rename(Name name) {
        return new Columns(name, null);
    }
}
