/*
 * This file is generated by jOOQ.
 */
package com.opidis.ca.generated.pg_catalog.tables.records;


import com.opidis.ca.generated.pg_catalog.tables.PgTsParser;

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
public class PgTsParserRecord extends TableRecordImpl<PgTsParserRecord> implements Record7<String, Long, String, String, String, String, String> {

    private static final long serialVersionUID = 712486199;

    /**
     * Setter for <code>pg_catalog.pg_ts_parser.prsname</code>.
     */
    public void setPrsname(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_ts_parser.prsname</code>.
     */
    public String getPrsname() {
        return (String) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_ts_parser.prsnamespace</code>.
     */
    public void setPrsnamespace(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_ts_parser.prsnamespace</code>.
     */
    public Long getPrsnamespace() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_ts_parser.prsstart</code>.
     */
    public void setPrsstart(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_ts_parser.prsstart</code>.
     */
    public String getPrsstart() {
        return (String) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_ts_parser.prstoken</code>.
     */
    public void setPrstoken(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_ts_parser.prstoken</code>.
     */
    public String getPrstoken() {
        return (String) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_ts_parser.prsend</code>.
     */
    public void setPrsend(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_ts_parser.prsend</code>.
     */
    public String getPrsend() {
        return (String) get(4);
    }

    /**
     * Setter for <code>pg_catalog.pg_ts_parser.prsheadline</code>.
     */
    public void setPrsheadline(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_ts_parser.prsheadline</code>.
     */
    public String getPrsheadline() {
        return (String) get(5);
    }

    /**
     * Setter for <code>pg_catalog.pg_ts_parser.prslextype</code>.
     */
    public void setPrslextype(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_ts_parser.prslextype</code>.
     */
    public String getPrslextype() {
        return (String) get(6);
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<String, Long, String, String, String, String, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<String, Long, String, String, String, String, String> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return PgTsParser.PG_TS_PARSER.PRSNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return PgTsParser.PG_TS_PARSER.PRSNAMESPACE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return PgTsParser.PG_TS_PARSER.PRSSTART;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return PgTsParser.PG_TS_PARSER.PRSTOKEN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return PgTsParser.PG_TS_PARSER.PRSEND;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return PgTsParser.PG_TS_PARSER.PRSHEADLINE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return PgTsParser.PG_TS_PARSER.PRSLEXTYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getPrsname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component2() {
        return getPrsnamespace();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getPrsstart();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getPrstoken();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getPrsend();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getPrsheadline();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getPrslextype();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getPrsname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getPrsnamespace();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getPrsstart();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getPrstoken();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getPrsend();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getPrsheadline();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getPrslextype();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgTsParserRecord value1(String value) {
        setPrsname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgTsParserRecord value2(Long value) {
        setPrsnamespace(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgTsParserRecord value3(String value) {
        setPrsstart(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgTsParserRecord value4(String value) {
        setPrstoken(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgTsParserRecord value5(String value) {
        setPrsend(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgTsParserRecord value6(String value) {
        setPrsheadline(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgTsParserRecord value7(String value) {
        setPrslextype(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgTsParserRecord values(String value1, Long value2, String value3, String value4, String value5, String value6, String value7) {
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
     * Create a detached PgTsParserRecord
     */
    public PgTsParserRecord() {
        super(PgTsParser.PG_TS_PARSER);
    }

    /**
     * Create a detached, initialised PgTsParserRecord
     */
    public PgTsParserRecord(String prsname, Long prsnamespace, String prsstart, String prstoken, String prsend, String prsheadline, String prslextype) {
        super(PgTsParser.PG_TS_PARSER);

        set(0, prsname);
        set(1, prsnamespace);
        set(2, prsstart);
        set(3, prstoken);
        set(4, prsend);
        set(5, prsheadline);
        set(6, prslextype);
    }
}
