/*
 * This file is generated by jOOQ.
 */
package com.opidis.ca.generated.information_schema.tables;


import com.opidis.ca.generated.information_schema.InformationSchema;
import com.opidis.ca.generated.information_schema.tables.records.SqlImplementationInfoRecord;

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
public class SqlImplementationInfo extends TableImpl<SqlImplementationInfoRecord> {

    private static final long serialVersionUID = 16381949;

    /**
     * The reference instance of <code>information_schema.sql_implementation_info</code>
     */
    public static final SqlImplementationInfo SQL_IMPLEMENTATION_INFO = new SqlImplementationInfo();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SqlImplementationInfoRecord> getRecordType() {
        return SqlImplementationInfoRecord.class;
    }

    /**
     * The column <code>information_schema.sql_implementation_info.implementation_info_id</code>.
     */
    public final TableField<SqlImplementationInfoRecord, String> IMPLEMENTATION_INFO_ID = createField("implementation_info_id", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.sql_implementation_info.implementation_info_name</code>.
     */
    public final TableField<SqlImplementationInfoRecord, String> IMPLEMENTATION_INFO_NAME = createField("implementation_info_name", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.sql_implementation_info.integer_value</code>.
     */
    public final TableField<SqlImplementationInfoRecord, Integer> INTEGER_VALUE = createField("integer_value", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>information_schema.sql_implementation_info.character_value</code>.
     */
    public final TableField<SqlImplementationInfoRecord, String> CHARACTER_VALUE = createField("character_value", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.sql_implementation_info.comments</code>.
     */
    public final TableField<SqlImplementationInfoRecord, String> COMMENTS = createField("comments", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * Create a <code>information_schema.sql_implementation_info</code> table reference
     */
    public SqlImplementationInfo() {
        this(DSL.name("sql_implementation_info"), null);
    }

    /**
     * Create an aliased <code>information_schema.sql_implementation_info</code> table reference
     */
    public SqlImplementationInfo(String alias) {
        this(DSL.name(alias), SQL_IMPLEMENTATION_INFO);
    }

    /**
     * Create an aliased <code>information_schema.sql_implementation_info</code> table reference
     */
    public SqlImplementationInfo(Name alias) {
        this(alias, SQL_IMPLEMENTATION_INFO);
    }

    private SqlImplementationInfo(Name alias, Table<SqlImplementationInfoRecord> aliased) {
        this(alias, aliased, null);
    }

    private SqlImplementationInfo(Name alias, Table<SqlImplementationInfoRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> SqlImplementationInfo(Table<O> child, ForeignKey<O, SqlImplementationInfoRecord> key) {
        super(child, key, SQL_IMPLEMENTATION_INFO);
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
    public SqlImplementationInfo as(String alias) {
        return new SqlImplementationInfo(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlImplementationInfo as(Name alias) {
        return new SqlImplementationInfo(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SqlImplementationInfo rename(String name) {
        return new SqlImplementationInfo(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SqlImplementationInfo rename(Name name) {
        return new SqlImplementationInfo(name, null);
    }
}
