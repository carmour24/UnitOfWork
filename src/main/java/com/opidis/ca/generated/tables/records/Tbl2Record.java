/*
 * This file is generated by jOOQ.
 */
package com.opidis.ca.generated.tables.records;


import com.opidis.ca.generated.tables.Tbl2;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;


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
public class Tbl2Record extends UpdatableRecordImpl<Tbl2Record> implements Record2<Integer, String> {

    private static final long serialVersionUID = 1442767785;

    /**
     * Setter for <code>public.tbl2.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.tbl2.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.tbl2.foreign_name</code>.
     */
    public void setForeignName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.tbl2.foreign_name</code>.
     */
    public String getForeignName() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Integer, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Integer, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Tbl2.TBL2.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Tbl2.TBL2.FOREIGN_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getForeignName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getForeignName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Tbl2Record value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Tbl2Record value2(String value) {
        setForeignName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Tbl2Record values(Integer value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached Tbl2Record
     */
    public Tbl2Record() {
        super(Tbl2.TBL2);
    }

    /**
     * Create a detached, initialised Tbl2Record
     */
    public Tbl2Record(Integer id, String foreignName) {
        super(Tbl2.TBL2);

        set(0, id);
        set(1, foreignName);
    }
}