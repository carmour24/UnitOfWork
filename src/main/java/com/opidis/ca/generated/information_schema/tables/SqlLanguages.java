/*
 * This file is generated by jOOQ.
 */
package com.opidis.ca.generated.information_schema.tables;


import com.opidis.ca.generated.information_schema.InformationSchema;
import com.opidis.ca.generated.information_schema.tables.records.SqlLanguagesRecord;

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
public class SqlLanguages extends TableImpl<SqlLanguagesRecord> {

    private static final long serialVersionUID = -142779410;

    /**
     * The reference instance of <code>information_schema.sql_languages</code>
     */
    public static final SqlLanguages SQL_LANGUAGES = new SqlLanguages();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SqlLanguagesRecord> getRecordType() {
        return SqlLanguagesRecord.class;
    }

    /**
     * The column <code>information_schema.sql_languages.sql_language_source</code>.
     */
    public final TableField<SqlLanguagesRecord, String> SQL_LANGUAGE_SOURCE = createField("sql_language_source", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.sql_languages.sql_language_year</code>.
     */
    public final TableField<SqlLanguagesRecord, String> SQL_LANGUAGE_YEAR = createField("sql_language_year", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.sql_languages.sql_language_conformance</code>.
     */
    public final TableField<SqlLanguagesRecord, String> SQL_LANGUAGE_CONFORMANCE = createField("sql_language_conformance", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.sql_languages.sql_language_integrity</code>.
     */
    public final TableField<SqlLanguagesRecord, String> SQL_LANGUAGE_INTEGRITY = createField("sql_language_integrity", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.sql_languages.sql_language_implementation</code>.
     */
    public final TableField<SqlLanguagesRecord, String> SQL_LANGUAGE_IMPLEMENTATION = createField("sql_language_implementation", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.sql_languages.sql_language_binding_style</code>.
     */
    public final TableField<SqlLanguagesRecord, String> SQL_LANGUAGE_BINDING_STYLE = createField("sql_language_binding_style", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.sql_languages.sql_language_programming_language</code>.
     */
    public final TableField<SqlLanguagesRecord, String> SQL_LANGUAGE_PROGRAMMING_LANGUAGE = createField("sql_language_programming_language", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * Create a <code>information_schema.sql_languages</code> table reference
     */
    public SqlLanguages() {
        this(DSL.name("sql_languages"), null);
    }

    /**
     * Create an aliased <code>information_schema.sql_languages</code> table reference
     */
    public SqlLanguages(String alias) {
        this(DSL.name(alias), SQL_LANGUAGES);
    }

    /**
     * Create an aliased <code>information_schema.sql_languages</code> table reference
     */
    public SqlLanguages(Name alias) {
        this(alias, SQL_LANGUAGES);
    }

    private SqlLanguages(Name alias, Table<SqlLanguagesRecord> aliased) {
        this(alias, aliased, null);
    }

    private SqlLanguages(Name alias, Table<SqlLanguagesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> SqlLanguages(Table<O> child, ForeignKey<O, SqlLanguagesRecord> key) {
        super(child, key, SQL_LANGUAGES);
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
    public SqlLanguages as(String alias) {
        return new SqlLanguages(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlLanguages as(Name alias) {
        return new SqlLanguages(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SqlLanguages rename(String name) {
        return new SqlLanguages(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SqlLanguages rename(Name name) {
        return new SqlLanguages(name, null);
    }
}
