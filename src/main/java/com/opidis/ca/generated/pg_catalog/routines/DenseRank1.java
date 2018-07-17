/*
 * This file is generated by jOOQ.
 */
package com.opidis.ca.generated.pg_catalog.routines;


import com.opidis.ca.generated.pg_catalog.PgCatalog;

import javax.annotation.Generated;

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
public class DenseRank1 extends AbstractRoutine<Long> {

    private static final long serialVersionUID = -1640443115;

    /**
     * The parameter <code>pg_catalog.dense_rank.RETURN_VALUE</code>.
     */
    public static final Parameter<Long> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.BIGINT, false, false);

    /**
     * Create a new routine call instance
     */
    public DenseRank1() {
        super("dense_rank", PgCatalog.PG_CATALOG, org.jooq.impl.SQLDataType.BIGINT);

        setReturnParameter(RETURN_VALUE);
        setOverloaded(true);
    }
}
