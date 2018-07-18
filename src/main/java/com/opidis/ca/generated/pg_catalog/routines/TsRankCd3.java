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
public class TsRankCd3 extends AbstractRoutine<Float> {

    private static final long serialVersionUID = 197551482;

    /**
     * The parameter <code>pg_catalog.ts_rank_cd.RETURN_VALUE</code>.
     */
    public static final Parameter<Float> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.REAL, false, false);

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public static final Parameter<Object> _1 = createParameter("_1", org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"tsvector\""), false, true);

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public static final Parameter<Object> _2 = createParameter("_2", org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"tsquery\""), false, true);

    /**
     * The parameter <code>pg_catalog.ts_rank_cd._3</code>.
     */
    public static final Parameter<Integer> _3 = createParameter("_3", org.jooq.impl.SQLDataType.INTEGER, false, true);

    /**
     * Create a new routine call instance
     */
    public TsRankCd3() {
        super("ts_rank_cd", PgCatalog.PG_CATALOG, org.jooq.impl.SQLDataType.REAL);

        setReturnParameter(RETURN_VALUE);
        addInParameter(_1);
        addInParameter(_2);
        addInParameter(_3);
        setOverloaded(true);
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    public void set__1(Object value) {
        setValue(_1, value);
    }

    /**
     * Set the <code>_1</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void set__1(Field<Object> field) {
        setField(_1, field);
    }

    /**
     * Set the <code>_2</code> parameter IN value to the routine
     */
    public void set__2(Object value) {
        setValue(_2, value);
    }

    /**
     * Set the <code>_2</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void set__2(Field<Object> field) {
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