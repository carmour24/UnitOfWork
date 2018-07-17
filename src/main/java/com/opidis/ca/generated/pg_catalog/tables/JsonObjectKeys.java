/*
 * This file is generated by jOOQ.
 */
package com.opidis.ca.generated.pg_catalog.tables;


import com.opidis.ca.generated.pg_catalog.PgCatalog;
import com.opidis.ca.generated.pg_catalog.tables.records.JsonObjectKeysRecord;

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
public class JsonObjectKeys extends TableImpl<JsonObjectKeysRecord> {

    private static final long serialVersionUID = 54097793;

    /**
     * The reference instance of <code>pg_catalog.json_object_keys</code>
     */
    public static final JsonObjectKeys JSON_OBJECT_KEYS = new JsonObjectKeys();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<JsonObjectKeysRecord> getRecordType() {
        return JsonObjectKeysRecord.class;
    }

    /**
     * The column <code>pg_catalog.json_object_keys.json_object_keys</code>.
     */
    public final TableField<JsonObjectKeysRecord, String> JSON_OBJECT_KEYS_ = createField("json_object_keys", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * Create a <code>pg_catalog.json_object_keys</code> table reference
     */
    public JsonObjectKeys() {
        this(DSL.name("json_object_keys"), null);
    }

    /**
     * Create an aliased <code>pg_catalog.json_object_keys</code> table reference
     */
    public JsonObjectKeys(String alias) {
        this(DSL.name(alias), JSON_OBJECT_KEYS);
    }

    /**
     * Create an aliased <code>pg_catalog.json_object_keys</code> table reference
     */
    public JsonObjectKeys(Name alias) {
        this(alias, JSON_OBJECT_KEYS);
    }

    private JsonObjectKeys(Name alias, Table<JsonObjectKeysRecord> aliased) {
        this(alias, aliased, new Field[1]);
    }

    private JsonObjectKeys(Name alias, Table<JsonObjectKeysRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> JsonObjectKeys(Table<O> child, ForeignKey<O, JsonObjectKeysRecord> key) {
        super(child, key, JSON_OBJECT_KEYS);
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
    public JsonObjectKeys as(String alias) {
        return new JsonObjectKeys(DSL.name(alias), this, parameters);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonObjectKeys as(Name alias) {
        return new JsonObjectKeys(alias, this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public JsonObjectKeys rename(String name) {
        return new JsonObjectKeys(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public JsonObjectKeys rename(Name name) {
        return new JsonObjectKeys(name, null, parameters);
    }

    /**
     * Call this table-valued function
     */
    public JsonObjectKeys call(Object __1) {
        return new JsonObjectKeys(DSL.name(getName()), null, new Field[] { 
              DSL.val(__1, org.jooq.impl.SQLDataType.OTHER)
        });
    }

    /**
     * Call this table-valued function
     */
    public JsonObjectKeys call(Field<Object> __1) {
        return new JsonObjectKeys(DSL.name(getName()), null, new Field[] { 
              __1
        });
    }
}
