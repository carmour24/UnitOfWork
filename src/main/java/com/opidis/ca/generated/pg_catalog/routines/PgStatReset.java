/*
 * This file is generated by jOOQ.
 */
package com.opidis.ca.generated.pg_catalog.routines;


import com.opidis.ca.generated.pg_catalog.PgCatalog;

import javax.annotation.Generated;

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
public class PgStatReset extends AbstractRoutine<java.lang.Void> {

    private static final long serialVersionUID = -180190657;

    /**
     * Create a new routine call instance
     */
    public PgStatReset() {
        super("pg_stat_reset", PgCatalog.PG_CATALOG);
    }
}
