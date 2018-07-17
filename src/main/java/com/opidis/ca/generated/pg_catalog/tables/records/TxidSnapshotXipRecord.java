/*
 * This file is generated by jOOQ.
 */
package com.opidis.ca.generated.pg_catalog.tables.records;


import com.opidis.ca.generated.pg_catalog.tables.TxidSnapshotXip;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Row1;
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
public class TxidSnapshotXipRecord extends TableRecordImpl<TxidSnapshotXipRecord> implements Record1<Long> {

    private static final long serialVersionUID = 320281813;

    /**
     * Setter for <code>pg_catalog.txid_snapshot_xip.txid_snapshot_xip</code>.
     */
    public void setTxidSnapshotXip(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.txid_snapshot_xip.txid_snapshot_xip</code>.
     */
    public Long getTxidSnapshotXip() {
        return (Long) get(0);
    }

    // -------------------------------------------------------------------------
    // Record1 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row1<Long> fieldsRow() {
        return (Row1) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row1<Long> valuesRow() {
        return (Row1) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return TxidSnapshotXip.TXID_SNAPSHOT_XIP.TXID_SNAPSHOT_XIP_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getTxidSnapshotXip();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getTxidSnapshotXip();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TxidSnapshotXipRecord value1(Long value) {
        setTxidSnapshotXip(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TxidSnapshotXipRecord values(Long value1) {
        value1(value1);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TxidSnapshotXipRecord
     */
    public TxidSnapshotXipRecord() {
        super(TxidSnapshotXip.TXID_SNAPSHOT_XIP);
    }

    /**
     * Create a detached, initialised TxidSnapshotXipRecord
     */
    public TxidSnapshotXipRecord(Long txidSnapshotXip) {
        super(TxidSnapshotXip.TXID_SNAPSHOT_XIP);

        set(0, txidSnapshotXip);
    }
}
