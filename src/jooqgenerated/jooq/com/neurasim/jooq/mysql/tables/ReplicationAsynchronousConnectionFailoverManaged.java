/*
 * This file is generated by jOOQ.
 */
package com.neurasim.jooq.mysql.tables;


import com.neurasim.jooq.mysql.Keys;
import com.neurasim.jooq.mysql.Mysql;
import com.neurasim.jooq.mysql.tables.records.ReplicationAsynchronousConnectionFailoverManagedRecord;

import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function4;
import org.jooq.JSON;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row4;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * The managed source configuration details
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ReplicationAsynchronousConnectionFailoverManaged extends TableImpl<ReplicationAsynchronousConnectionFailoverManagedRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>mysql.replication_asynchronous_connection_failover_managed</code>
     */
    public static final ReplicationAsynchronousConnectionFailoverManaged REPLICATION_ASYNCHRONOUS_CONNECTION_FAILOVER_MANAGED = new ReplicationAsynchronousConnectionFailoverManaged();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ReplicationAsynchronousConnectionFailoverManagedRecord> getRecordType() {
        return ReplicationAsynchronousConnectionFailoverManagedRecord.class;
    }

    /**
     * The column
     * <code>mysql.replication_asynchronous_connection_failover_managed.Channel_name</code>.
     * The replication channel name that connects source and replica.
     */
    public final TableField<ReplicationAsynchronousConnectionFailoverManagedRecord, String> CHANNEL_NAME = createField(DSL.name("Channel_name"), SQLDataType.CHAR(64).nullable(false), this, "The replication channel name that connects source and replica.");

    /**
     * The column
     * <code>mysql.replication_asynchronous_connection_failover_managed.Managed_name</code>.
     * The name of the source which needs to be managed.
     */
    public final TableField<ReplicationAsynchronousConnectionFailoverManagedRecord, String> MANAGED_NAME = createField(DSL.name("Managed_name"), SQLDataType.CHAR(64).nullable(false).defaultValue(DSL.inline("", SQLDataType.CHAR)), this, "The name of the source which needs to be managed.");

    /**
     * The column
     * <code>mysql.replication_asynchronous_connection_failover_managed.Managed_type</code>.
     * Determines the managed type.
     */
    public final TableField<ReplicationAsynchronousConnectionFailoverManagedRecord, String> MANAGED_TYPE = createField(DSL.name("Managed_type"), SQLDataType.CHAR(64).nullable(false).defaultValue(DSL.inline("", SQLDataType.CHAR)), this, "Determines the managed type.");

    /**
     * The column
     * <code>mysql.replication_asynchronous_connection_failover_managed.Configuration</code>.
     * The data to help manage group. For Managed_type = GroupReplication,
     * Configuration value should contain {"Primary_weight": 80,
     * "Secondary_weight": 60}, so that it assigns weight=80 to PRIMARY of the
     * group, and weight=60 for rest of the members in
     * mysql.replication_asynchronous_connection_failover table.
     */
    public final TableField<ReplicationAsynchronousConnectionFailoverManagedRecord, JSON> CONFIGURATION = createField(DSL.name("Configuration"), SQLDataType.JSON, this, "The data to help manage group. For Managed_type = GroupReplication, Configuration value should contain {\"Primary_weight\": 80, \"Secondary_weight\": 60}, so that it assigns weight=80 to PRIMARY of the group, and weight=60 for rest of the members in mysql.replication_asynchronous_connection_failover table.");

    private ReplicationAsynchronousConnectionFailoverManaged(Name alias, Table<ReplicationAsynchronousConnectionFailoverManagedRecord> aliased) {
        this(alias, aliased, null);
    }

    private ReplicationAsynchronousConnectionFailoverManaged(Name alias, Table<ReplicationAsynchronousConnectionFailoverManagedRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("The managed source configuration details"), TableOptions.table());
    }

    /**
     * Create an aliased
     * <code>mysql.replication_asynchronous_connection_failover_managed</code>
     * table reference
     */
    public ReplicationAsynchronousConnectionFailoverManaged(String alias) {
        this(DSL.name(alias), REPLICATION_ASYNCHRONOUS_CONNECTION_FAILOVER_MANAGED);
    }

    /**
     * Create an aliased
     * <code>mysql.replication_asynchronous_connection_failover_managed</code>
     * table reference
     */
    public ReplicationAsynchronousConnectionFailoverManaged(Name alias) {
        this(alias, REPLICATION_ASYNCHRONOUS_CONNECTION_FAILOVER_MANAGED);
    }

    /**
     * Create a
     * <code>mysql.replication_asynchronous_connection_failover_managed</code>
     * table reference
     */
    public ReplicationAsynchronousConnectionFailoverManaged() {
        this(DSL.name("replication_asynchronous_connection_failover_managed"), null);
    }

    public <O extends Record> ReplicationAsynchronousConnectionFailoverManaged(Table<O> child, ForeignKey<O, ReplicationAsynchronousConnectionFailoverManagedRecord> key) {
        super(child, key, REPLICATION_ASYNCHRONOUS_CONNECTION_FAILOVER_MANAGED);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Mysql.MYSQL;
    }

    @Override
    public UniqueKey<ReplicationAsynchronousConnectionFailoverManagedRecord> getPrimaryKey() {
        return Keys.KEY_REPLICATION_ASYNCHRONOUS_CONNECTION_FAILOVER_MANAGED_PRIMARY;
    }

    @Override
    public ReplicationAsynchronousConnectionFailoverManaged as(String alias) {
        return new ReplicationAsynchronousConnectionFailoverManaged(DSL.name(alias), this);
    }

    @Override
    public ReplicationAsynchronousConnectionFailoverManaged as(Name alias) {
        return new ReplicationAsynchronousConnectionFailoverManaged(alias, this);
    }

    @Override
    public ReplicationAsynchronousConnectionFailoverManaged as(Table<?> alias) {
        return new ReplicationAsynchronousConnectionFailoverManaged(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public ReplicationAsynchronousConnectionFailoverManaged rename(String name) {
        return new ReplicationAsynchronousConnectionFailoverManaged(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ReplicationAsynchronousConnectionFailoverManaged rename(Name name) {
        return new ReplicationAsynchronousConnectionFailoverManaged(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public ReplicationAsynchronousConnectionFailoverManaged rename(Table<?> name) {
        return new ReplicationAsynchronousConnectionFailoverManaged(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<String, String, String, JSON> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function4<? super String, ? super String, ? super String, ? super JSON, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function4<? super String, ? super String, ? super String, ? super JSON, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
