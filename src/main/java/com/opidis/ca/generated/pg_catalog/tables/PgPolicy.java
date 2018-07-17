/*
 * This file is generated by jOOQ.
 */
package com.opidis.ca.generated.pg_catalog.tables;


import com.opidis.ca.generated.pg_catalog.Indexes;
import com.opidis.ca.generated.pg_catalog.PgCatalog;
import com.opidis.ca.generated.pg_catalog.tables.records.PgPolicyRecord;

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
public class PgPolicy extends TableImpl<PgPolicyRecord> {

    private static final long serialVersionUID = 506889876;

    /**
     * The reference instance of <code>pg_catalog.pg_policy</code>
     */
    public static final PgPolicy PG_POLICY = new PgPolicy();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgPolicyRecord> getRecordType() {
        return PgPolicyRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_policy.polname</code>.
     */
    public final TableField<PgPolicyRecord, String> POLNAME = createField("polname", org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_policy.polrelid</code>.
     */
    public final TableField<PgPolicyRecord, Long> POLRELID = createField("polrelid", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_policy.polcmd</code>.
     */
    public final TableField<PgPolicyRecord, String> POLCMD = createField("polcmd", org.jooq.impl.SQLDataType.CHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_policy.polpermissive</code>.
     */
    public final TableField<PgPolicyRecord, Boolean> POLPERMISSIVE = createField("polpermissive", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_policy.polroles</code>.
     */
    public final TableField<PgPolicyRecord, Long[]> POLROLES = createField("polroles", org.jooq.impl.SQLDataType.BIGINT.getArrayDataType(), this, "");

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public final TableField<PgPolicyRecord, Object> POLQUAL = createField("polqual", , this, "");

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public final TableField<PgPolicyRecord, Object> POLWITHCHECK = createField("polwithcheck", , this, "");

    /**
     * Create a <code>pg_catalog.pg_policy</code> table reference
     */
    public PgPolicy() {
        this(DSL.name("pg_policy"), null);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_policy</code> table reference
     */
    public PgPolicy(String alias) {
        this(DSL.name(alias), PG_POLICY);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_policy</code> table reference
     */
    public PgPolicy(Name alias) {
        this(alias, PG_POLICY);
    }

    private PgPolicy(Name alias, Table<PgPolicyRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgPolicy(Name alias, Table<PgPolicyRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> PgPolicy(Table<O> child, ForeignKey<O, PgPolicyRecord> key) {
        super(child, key, PG_POLICY);
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
        return Arrays.<Index>asList(Indexes.PG_POLICY_POLRELID_POLNAME_INDEX);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgPolicy as(String alias) {
        return new PgPolicy(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgPolicy as(Name alias) {
        return new PgPolicy(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgPolicy rename(String name) {
        return new PgPolicy(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgPolicy rename(Name name) {
        return new PgPolicy(name, null);
    }
}
