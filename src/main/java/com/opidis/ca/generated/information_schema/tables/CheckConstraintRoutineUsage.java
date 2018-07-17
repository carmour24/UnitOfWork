/*
 * This file is generated by jOOQ.
 */
package com.opidis.ca.generated.information_schema.tables;


import com.opidis.ca.generated.information_schema.InformationSchema;
import com.opidis.ca.generated.information_schema.tables.records.CheckConstraintRoutineUsageRecord;

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
public class CheckConstraintRoutineUsage extends TableImpl<CheckConstraintRoutineUsageRecord> {

    private static final long serialVersionUID = 1286050138;

    /**
     * The reference instance of <code>information_schema.check_constraint_routine_usage</code>
     */
    public static final CheckConstraintRoutineUsage CHECK_CONSTRAINT_ROUTINE_USAGE = new CheckConstraintRoutineUsage();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CheckConstraintRoutineUsageRecord> getRecordType() {
        return CheckConstraintRoutineUsageRecord.class;
    }

    /**
     * The column <code>information_schema.check_constraint_routine_usage.constraint_catalog</code>.
     */
    public final TableField<CheckConstraintRoutineUsageRecord, String> CONSTRAINT_CATALOG = createField("constraint_catalog", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.check_constraint_routine_usage.constraint_schema</code>.
     */
    public final TableField<CheckConstraintRoutineUsageRecord, String> CONSTRAINT_SCHEMA = createField("constraint_schema", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.check_constraint_routine_usage.constraint_name</code>.
     */
    public final TableField<CheckConstraintRoutineUsageRecord, String> CONSTRAINT_NAME = createField("constraint_name", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.check_constraint_routine_usage.specific_catalog</code>.
     */
    public final TableField<CheckConstraintRoutineUsageRecord, String> SPECIFIC_CATALOG = createField("specific_catalog", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.check_constraint_routine_usage.specific_schema</code>.
     */
    public final TableField<CheckConstraintRoutineUsageRecord, String> SPECIFIC_SCHEMA = createField("specific_schema", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.check_constraint_routine_usage.specific_name</code>.
     */
    public final TableField<CheckConstraintRoutineUsageRecord, String> SPECIFIC_NAME = createField("specific_name", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * Create a <code>information_schema.check_constraint_routine_usage</code> table reference
     */
    public CheckConstraintRoutineUsage() {
        this(DSL.name("check_constraint_routine_usage"), null);
    }

    /**
     * Create an aliased <code>information_schema.check_constraint_routine_usage</code> table reference
     */
    public CheckConstraintRoutineUsage(String alias) {
        this(DSL.name(alias), CHECK_CONSTRAINT_ROUTINE_USAGE);
    }

    /**
     * Create an aliased <code>information_schema.check_constraint_routine_usage</code> table reference
     */
    public CheckConstraintRoutineUsage(Name alias) {
        this(alias, CHECK_CONSTRAINT_ROUTINE_USAGE);
    }

    private CheckConstraintRoutineUsage(Name alias, Table<CheckConstraintRoutineUsageRecord> aliased) {
        this(alias, aliased, null);
    }

    private CheckConstraintRoutineUsage(Name alias, Table<CheckConstraintRoutineUsageRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> CheckConstraintRoutineUsage(Table<O> child, ForeignKey<O, CheckConstraintRoutineUsageRecord> key) {
        super(child, key, CHECK_CONSTRAINT_ROUTINE_USAGE);
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
    public CheckConstraintRoutineUsage as(String alias) {
        return new CheckConstraintRoutineUsage(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CheckConstraintRoutineUsage as(Name alias) {
        return new CheckConstraintRoutineUsage(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CheckConstraintRoutineUsage rename(String name) {
        return new CheckConstraintRoutineUsage(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CheckConstraintRoutineUsage rename(Name name) {
        return new CheckConstraintRoutineUsage(name, null);
    }
}
