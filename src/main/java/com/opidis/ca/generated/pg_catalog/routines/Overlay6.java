/*
 * This file is generated by jOOQ.
 */
package com.opidis.ca.generated.pg_catalog.routines;


import com.opidis.ca.generated.pg_catalog.PgCatalog;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;


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
public class Overlay6 extends AbstractRoutine<byte[]> {

    private static final long serialVersionUID = 580458020;

    /**
     * The parameter <code>pg_catalog.overlay.RETURN_VALUE</code>.
     */
    public static final Parameter<byte[]> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.BLOB, false, false);

    /**
     * The parameter <code>pg_catalog.overlay._1</code>.
     */
    public static final Parameter<byte[]> _1 = createParameter("_1", org.jooq.impl.SQLDataType.BLOB, false, true);

    /**
     * The parameter <code>pg_catalog.overlay._2</code>.
     */
    public static final Parameter<byte[]> _2 = createParameter("_2", org.jooq.impl.SQLDataType.BLOB, false, true);

    /**
     * The parameter <code>pg_catalog.overlay._3</code>.
     */
    public static final Parameter<Integer> _3 = createParameter("_3", org.jooq.impl.SQLDataType.INTEGER, false, true);

    /**
     * Create a new routine call instance
     */
    public Overlay6() {
        super("overlay", PgCatalog.PG_CATALOG, org.jooq.impl.SQLDataType.BLOB);

        setReturnParameter(RETURN_VALUE);
        addInParameter(_1);
        addInParameter(_2);
        addInParameter(_3);
        setOverloaded(true);
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    public void set__1(byte... value) {
        setValue(_1, value);
    }

    /**
     * Set the <code>_1</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void set__1(Field<byte[]> field) {
        setField(_1, field);
    }

    /**
     * Set the <code>_2</code> parameter IN value to the routine
     */
    public void set__2(byte... value) {
        setValue(_2, value);
    }

    /**
     * Set the <code>_2</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void set__2(Field<byte[]> field) {
        setField(_2, field);
    }

    /**
     * Set the <code>_3</code> parameter IN value to the routine
     */
    public void set__3(Integer value) {
        setValue(_3, value);
    }

    /**
     * Set the <code>_3</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void set__3(Field<Integer> field) {
        setField(_3, field);
    }
}
