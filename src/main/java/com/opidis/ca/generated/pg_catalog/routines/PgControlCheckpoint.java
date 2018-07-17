/*
 * This file is generated by jOOQ.
 */
package com.opidis.ca.generated.pg_catalog.routines;


import com.opidis.ca.generated.pg_catalog.PgCatalog;

import java.time.OffsetDateTime;

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
public class PgControlCheckpoint extends AbstractRoutine<java.lang.Void> {

    private static final long serialVersionUID = 1218751435;

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public static final Parameter<Object> CHECKPOINT_LSN = createParameter("checkpoint_lsn", org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_lsn\""), false, false);

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public static final Parameter<Object> PRIOR_LSN = createParameter("prior_lsn", org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_lsn\""), false, false);

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public static final Parameter<Object> REDO_LSN = createParameter("redo_lsn", org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_lsn\""), false, false);

    /**
     * The parameter <code>pg_catalog.pg_control_checkpoint.redo_wal_file</code>.
     */
    public static final Parameter<String> REDO_WAL_FILE = createParameter("redo_wal_file", org.jooq.impl.SQLDataType.CLOB, false, false);

    /**
     * The parameter <code>pg_catalog.pg_control_checkpoint.timeline_id</code>.
     */
    public static final Parameter<Integer> TIMELINE_ID = createParameter("timeline_id", org.jooq.impl.SQLDataType.INTEGER, false, false);

    /**
     * The parameter <code>pg_catalog.pg_control_checkpoint.prev_timeline_id</code>.
     */
    public static final Parameter<Integer> PREV_TIMELINE_ID = createParameter("prev_timeline_id", org.jooq.impl.SQLDataType.INTEGER, false, false);

    /**
     * The parameter <code>pg_catalog.pg_control_checkpoint.full_page_writes</code>.
     */
    public static final Parameter<Boolean> FULL_PAGE_WRITES = createParameter("full_page_writes", org.jooq.impl.SQLDataType.BOOLEAN, false, false);

    /**
     * The parameter <code>pg_catalog.pg_control_checkpoint.next_xid</code>.
     */
    public static final Parameter<String> NEXT_XID = createParameter("next_xid", org.jooq.impl.SQLDataType.CLOB, false, false);

    /**
     * The parameter <code>pg_catalog.pg_control_checkpoint.next_oid</code>.
     */
    public static final Parameter<Long> NEXT_OID = createParameter("next_oid", org.jooq.impl.SQLDataType.BIGINT, false, false);

    /**
     * The parameter <code>pg_catalog.pg_control_checkpoint.next_multixact_id</code>.
     */
    public static final Parameter<Long> NEXT_MULTIXACT_ID = createParameter("next_multixact_id", org.jooq.impl.SQLDataType.BIGINT, false, false);

    /**
     * The parameter <code>pg_catalog.pg_control_checkpoint.next_multi_offset</code>.
     */
    public static final Parameter<Long> NEXT_MULTI_OFFSET = createParameter("next_multi_offset", org.jooq.impl.SQLDataType.BIGINT, false, false);

    /**
     * The parameter <code>pg_catalog.pg_control_checkpoint.oldest_xid</code>.
     */
    public static final Parameter<Long> OLDEST_XID = createParameter("oldest_xid", org.jooq.impl.SQLDataType.BIGINT, false, false);

    /**
     * The parameter <code>pg_catalog.pg_control_checkpoint.oldest_xid_dbid</code>.
     */
    public static final Parameter<Long> OLDEST_XID_DBID = createParameter("oldest_xid_dbid", org.jooq.impl.SQLDataType.BIGINT, false, false);

    /**
     * The parameter <code>pg_catalog.pg_control_checkpoint.oldest_active_xid</code>.
     */
    public static final Parameter<Long> OLDEST_ACTIVE_XID = createParameter("oldest_active_xid", org.jooq.impl.SQLDataType.BIGINT, false, false);

    /**
     * The parameter <code>pg_catalog.pg_control_checkpoint.oldest_multi_xid</code>.
     */
    public static final Parameter<Long> OLDEST_MULTI_XID = createParameter("oldest_multi_xid", org.jooq.impl.SQLDataType.BIGINT, false, false);

    /**
     * The parameter <code>pg_catalog.pg_control_checkpoint.oldest_multi_dbid</code>.
     */
    public static final Parameter<Long> OLDEST_MULTI_DBID = createParameter("oldest_multi_dbid", org.jooq.impl.SQLDataType.BIGINT, false, false);

    /**
     * The parameter <code>pg_catalog.pg_control_checkpoint.oldest_commit_ts_xid</code>.
     */
    public static final Parameter<Long> OLDEST_COMMIT_TS_XID = createParameter("oldest_commit_ts_xid", org.jooq.impl.SQLDataType.BIGINT, false, false);

    /**
     * The parameter <code>pg_catalog.pg_control_checkpoint.newest_commit_ts_xid</code>.
     */
    public static final Parameter<Long> NEWEST_COMMIT_TS_XID = createParameter("newest_commit_ts_xid", org.jooq.impl.SQLDataType.BIGINT, false, false);

    /**
     * The parameter <code>pg_catalog.pg_control_checkpoint.checkpoint_time</code>.
     */
    public static final Parameter<OffsetDateTime> CHECKPOINT_TIME = createParameter("checkpoint_time", org.jooq.impl.SQLDataType.TIMESTAMPWITHTIMEZONE, false, false);

    /**
     * Create a new routine call instance
     */
    public PgControlCheckpoint() {
        super("pg_control_checkpoint", PgCatalog.PG_CATALOG);

        addOutParameter(CHECKPOINT_LSN);
        addOutParameter(PRIOR_LSN);
        addOutParameter(REDO_LSN);
        addOutParameter(REDO_WAL_FILE);
        addOutParameter(TIMELINE_ID);
        addOutParameter(PREV_TIMELINE_ID);
        addOutParameter(FULL_PAGE_WRITES);
        addOutParameter(NEXT_XID);
        addOutParameter(NEXT_OID);
        addOutParameter(NEXT_MULTIXACT_ID);
        addOutParameter(NEXT_MULTI_OFFSET);
        addOutParameter(OLDEST_XID);
        addOutParameter(OLDEST_XID_DBID);
        addOutParameter(OLDEST_ACTIVE_XID);
        addOutParameter(OLDEST_MULTI_XID);
        addOutParameter(OLDEST_MULTI_DBID);
        addOutParameter(OLDEST_COMMIT_TS_XID);
        addOutParameter(NEWEST_COMMIT_TS_XID);
        addOutParameter(CHECKPOINT_TIME);
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public Object getCheckpointLsn() {
        return get(CHECKPOINT_LSN);
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public Object getPriorLsn() {
        return get(PRIOR_LSN);
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public Object getRedoLsn() {
        return get(REDO_LSN);
    }

    /**
     * Get the <code>redo_wal_file</code> parameter OUT value from the routine
     */
    public String getRedoWalFile() {
        return get(REDO_WAL_FILE);
    }

    /**
     * Get the <code>timeline_id</code> parameter OUT value from the routine
     */
    public Integer getTimelineId() {
        return get(TIMELINE_ID);
    }

    /**
     * Get the <code>prev_timeline_id</code> parameter OUT value from the routine
     */
    public Integer getPrevTimelineId() {
        return get(PREV_TIMELINE_ID);
    }

    /**
     * Get the <code>full_page_writes</code> parameter OUT value from the routine
     */
    public Boolean getFullPageWrites() {
        return get(FULL_PAGE_WRITES);
    }

    /**
     * Get the <code>next_xid</code> parameter OUT value from the routine
     */
    public String getNextXid() {
        return get(NEXT_XID);
    }

    /**
     * Get the <code>next_oid</code> parameter OUT value from the routine
     */
    public Long getNextOid() {
        return get(NEXT_OID);
    }

    /**
     * Get the <code>next_multixact_id</code> parameter OUT value from the routine
     */
    public Long getNextMultixactId() {
        return get(NEXT_MULTIXACT_ID);
    }

    /**
     * Get the <code>next_multi_offset</code> parameter OUT value from the routine
     */
    public Long getNextMultiOffset() {
        return get(NEXT_MULTI_OFFSET);
    }

    /**
     * Get the <code>oldest_xid</code> parameter OUT value from the routine
     */
    public Long getOldestXid() {
        return get(OLDEST_XID);
    }

    /**
     * Get the <code>oldest_xid_dbid</code> parameter OUT value from the routine
     */
    public Long getOldestXidDbid() {
        return get(OLDEST_XID_DBID);
    }

    /**
     * Get the <code>oldest_active_xid</code> parameter OUT value from the routine
     */
    public Long getOldestActiveXid() {
        return get(OLDEST_ACTIVE_XID);
    }

    /**
     * Get the <code>oldest_multi_xid</code> parameter OUT value from the routine
     */
    public Long getOldestMultiXid() {
        return get(OLDEST_MULTI_XID);
    }

    /**
     * Get the <code>oldest_multi_dbid</code> parameter OUT value from the routine
     */
    public Long getOldestMultiDbid() {
        return get(OLDEST_MULTI_DBID);
    }

    /**
     * Get the <code>oldest_commit_ts_xid</code> parameter OUT value from the routine
     */
    public Long getOldestCommitTsXid() {
        return get(OLDEST_COMMIT_TS_XID);
    }

    /**
     * Get the <code>newest_commit_ts_xid</code> parameter OUT value from the routine
     */
    public Long getNewestCommitTsXid() {
        return get(NEWEST_COMMIT_TS_XID);
    }

    /**
     * Get the <code>checkpoint_time</code> parameter OUT value from the routine
     */
    public OffsetDateTime getCheckpointTime() {
        return get(CHECKPOINT_TIME);
    }
}
