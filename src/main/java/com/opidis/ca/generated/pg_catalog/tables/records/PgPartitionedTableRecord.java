/*
 * This file is generated by jOOQ.
 */
package com.opidis.ca.generated.pg_catalog.tables.records;


import com.opidis.ca.generated.pg_catalog.tables.PgPartitionedTable;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.TableRecordImpl;


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
public class PgPartitionedTableRecord extends TableRecordImpl<PgPartitionedTableRecord> implements Record7<Long, String, Short, Object[], Long[], Long[], Object> {

    private static final long serialVersionUID = -1372613800;

    /**
     * Setter for <code>pg_catalog.pg_partitioned_table.partrelid</code>.
     */
    public void setPartrelid(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_partitioned_table.partrelid</code>.
     */
    public Long getPartrelid() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_partitioned_table.partstrat</code>.
     */
    public void setPartstrat(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_partitioned_table.partstrat</code>.
     */
    public String getPartstrat() {
        return (String) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_partitioned_table.partnatts</code>.
     */
    public void setPartnatts(Short value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_partitioned_table.partnatts</code>.
     */
    public Short getPartnatts() {
        return (Short) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_partitioned_table.partattrs</code>.
     */
    public void setPartattrs(Object... value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_partitioned_table.partattrs</code>.
     */
    public Object[] getPartattrs() {
        return (Object[]) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_partitioned_table.partclass</code>.
     */
    public void setPartclass(Long... value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_partitioned_table.partclass</code>.
     */
    public Long[] getPartclass() {
        return (Long[]) get(4);
    }

    /**
     * Setter for <code>pg_catalog.pg_partitioned_table.partcollation</code>.
     */
    public void setPartcollation(Long... value) {
        set(5, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_partitioned_table.partcollation</code>.
     */
    public Long[] getPartcollation() {
        return (Long[]) get(5);
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public void setPartexprs(Object value) {
        set(6, value);
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public Object getPartexprs() {
        return get(6);
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Long, String, Short, Object[], Long[], Long[], Object> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Long, String, Short, Object[], Long[], Long[], Object> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return PgPartitionedTable.PG_PARTITIONED_TABLE.PARTRELID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return PgPartitionedTable.PG_PARTITIONED_TABLE.PARTSTRAT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field3() {
        return PgPartitionedTable.PG_PARTITIONED_TABLE.PARTNATTS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Object[]> field4() {
        return PgPartitionedTable.PG_PARTITIONED_TABLE.PARTATTRS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long[]> field5() {
        return PgPartitionedTable.PG_PARTITIONED_TABLE.PARTCLASS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long[]> field6() {
        return PgPartitionedTable.PG_PARTITIONED_TABLE.PARTCOLLATION;
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    @Override
    public Field<Object> field7() {
        return PgPartitionedTable.PG_PARTITIONED_TABLE.PARTEXPRS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getPartrelid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getPartstrat();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component3() {
        return getPartnatts();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object[] component4() {
        return getPartattrs();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long[] component5() {
        return getPartclass();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long[] component6() {
        return getPartcollation();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    @Override
    public Object component7() {
        return getPartexprs();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getPartrelid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getPartstrat();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value3() {
        return getPartnatts();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object[] value4() {
        return getPartattrs();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long[] value5() {
        return getPartclass();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long[] value6() {
        return getPartcollation();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    @Override
    public Object value7() {
        return getPartexprs();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgPartitionedTableRecord value1(Long value) {
        setPartrelid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgPartitionedTableRecord value2(String value) {
        setPartstrat(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgPartitionedTableRecord value3(Short value) {
        setPartnatts(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgPartitionedTableRecord value4(Object... value) {
        setPartattrs(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgPartitionedTableRecord value5(Long... value) {
        setPartclass(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgPartitionedTableRecord value6(Long... value) {
        setPartcollation(value);
        return this;
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    @Override
    public PgPartitionedTableRecord value7(Object value) {
        setPartexprs(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgPartitionedTableRecord values(Long value1, String value2, Short value3, Object[] value4, Long[] value5, Long[] value6, Object value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgPartitionedTableRecord
     */
    public PgPartitionedTableRecord() {
        super(PgPartitionedTable.PG_PARTITIONED_TABLE);
    }

    /**
     * Create a detached, initialised PgPartitionedTableRecord
     */
    public PgPartitionedTableRecord(Long partrelid, String partstrat, Short partnatts, Object[] partattrs, Long[] partclass, Long[] partcollation, Object partexprs) {
        super(PgPartitionedTable.PG_PARTITIONED_TABLE);

        set(0, partrelid);
        set(1, partstrat);
        set(2, partnatts);
        set(3, partattrs);
        set(4, partclass);
        set(5, partcollation);
        set(6, partexprs);
    }
}
