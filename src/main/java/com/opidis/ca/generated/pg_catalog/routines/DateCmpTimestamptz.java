/*
 * This file is generated by jOOQ.
 */
package com.opidis.ca.generated.pg_catalog.routines;


import com.opidis.ca.generated.pg_catalog.PgCatalog;

import java.sql.Date;
import java.time.OffsetDateTime;

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
public class DateCmpTimestamptz extends AbstractRoutine<Integer> {

    private static final long serialVersionUID = -1337041167;

    /**
     * The parameter <code>pg_catalog.date_cmp_timestamptz.RETURN_VALUE</code>.
     */
    public static final Parameter<Integer> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.INTEGER, false, false);

    /**
     * The parameter <code>pg_catalog.date_cmp_timestamptz._1</code>.
     */
    public static final Parameter<Date> _1 = createParameter("_1", org.jooq.impl.SQLDataType.DATE, false, true);

    /**
     * The parameter <code>pg_catalog.date_cmp_timestamptz._2</code>.
     */
    public static final Parameter<OffsetDateTime> _2 = createParameter("_2", org.jooq.impl.SQLDataType.TIMESTAMPWITHTIMEZONE, false, true);

    /**
     * Create a new routine call instance
     */
    public DateCmpTimestamptz() {
        super("date_cmp_timestamptz", PgCatalog.PG_CATALOG, org.jooq.impl.SQLDataType.INTEGER);

        setReturnParameter(RETURN_VALUE);
        addInParameter(_1);
        addInParameter(_2);
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    public void set__1(Date value) {
        setValue(_1, value);
    }

    /**
     * Set the <code>_1</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void set__1(Field<Date> field) {
        setField(_1, field);
    }

    /**
     * Set the <code>_2</code> parameter IN value to the routine
     */
    public void set__2(OffsetDateTime value) {
        setValue(_2, value);
    }

    /**
     * Set the <code>_2</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void set__2(Field<OffsetDateTime> field) {
        setField(_2, field);
    }
}
