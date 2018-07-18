/*
 * This file is generated by jOOQ.
 */
package com.opidis.ca.generated.public_;


import com.opidis.ca.generated.DefaultCatalog;
import com.opidis.ca.generated.public_.tables.Tbl1;
import com.opidis.ca.generated.public_.tables.Tbl2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Catalog;
import org.jooq.Sequence;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


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
public class Public extends SchemaImpl {

    private static final long serialVersionUID = 2103349400;

    /**
     * The reference instance of <code>public</code>
     */
    public static final Public PUBLIC = new Public();

    /**
     * The table <code>public.tbl1</code>.
     */
    public final Tbl1 TBL1 = com.opidis.ca.generated.public_.tables.Tbl1.TBL1;

    /**
     * The table <code>public.tbl2</code>.
     */
    public final Tbl2 TBL2 = com.opidis.ca.generated.public_.tables.Tbl2.TBL2;

    /**
     * No further instances allowed
     */
    private Public() {
        super("public", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Sequence<?>> getSequences() {
        List result = new ArrayList();
        result.addAll(getSequences0());
        return result;
    }

    private final List<Sequence<?>> getSequences0() {
        return Arrays.<Sequence<?>>asList(
            Sequences.TLB2_ID_SEQ);
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            Tbl1.TBL1,
            Tbl2.TBL2);
    }
}