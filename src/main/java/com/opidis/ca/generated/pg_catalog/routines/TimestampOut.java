/*
 * This file is generated by jOOQ.
 */
package com.opidis.ca.generated.pg_catalog.routines;


import com.opidis.ca.generated.pg_catalog.PgCatalog;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;



/**
 * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
 */
@java.lang.Deprecated
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TimestampOut extends AbstractRoutine<Object> {

    private static final long serialVersionUID = 1200005722;

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public static final Parameter<Object> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"cstring\""), false, false);

    /**
     * The parameter <code>pg_catalog.timestamp_out._1</code>.
     */
    public static final Parameter<Timestamp> _1 = createParameter("_1", org.jooq.impl.SQLDataType.TIMESTAMP, false, true);

    /**
     * Create a new routine call instance
     */
    public TimestampOut() {
        super("timestamp_out", PgCatalog.PG_CATALOG, org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"cstring\""));

        setReturnParameter(RETURN_VALUE);
        addInParameter(_1);
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    public void set__1(Timestamp value) {
        setValue(_1, value);
    }

    /**
     * Set the <code>_1</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void set__1(Field<Timestamp> field) {
        setField(_1, field);
    }
}
