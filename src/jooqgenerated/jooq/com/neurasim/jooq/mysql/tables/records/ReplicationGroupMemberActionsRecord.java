/*
 * This file is generated by jOOQ.
 */
package com.neurasim.jooq.mysql.tables.records;


import com.neurasim.jooq.mysql.tables.ReplicationGroupMemberActions;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UByte;


/**
 * The member actions configuration.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ReplicationGroupMemberActionsRecord extends UpdatableRecordImpl<ReplicationGroupMemberActionsRecord> implements Record6<String, String, Byte, String, UByte, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>mysql.replication_group_member_actions.name</code>. The
     * action name.
     */
    public ReplicationGroupMemberActionsRecord setName(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>mysql.replication_group_member_actions.name</code>. The
     * action name.
     */
    public String getName() {
        return (String) get(0);
    }

    /**
     * Setter for <code>mysql.replication_group_member_actions.event</code>. The
     * event that will trigger the action.
     */
    public ReplicationGroupMemberActionsRecord setEvent(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>mysql.replication_group_member_actions.event</code>. The
     * event that will trigger the action.
     */
    public String getEvent() {
        return (String) get(1);
    }

    /**
     * Setter for <code>mysql.replication_group_member_actions.enabled</code>.
     * Whether the action is enabled.
     */
    public ReplicationGroupMemberActionsRecord setEnabled(Byte value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>mysql.replication_group_member_actions.enabled</code>.
     * Whether the action is enabled.
     */
    public Byte getEnabled() {
        return (Byte) get(2);
    }

    /**
     * Setter for <code>mysql.replication_group_member_actions.type</code>. The
     * action type.
     */
    public ReplicationGroupMemberActionsRecord setType(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>mysql.replication_group_member_actions.type</code>. The
     * action type.
     */
    public String getType() {
        return (String) get(3);
    }

    /**
     * Setter for <code>mysql.replication_group_member_actions.priority</code>.
     * The order on which the action will be run, value between 1 and 100, lower
     * values first.
     */
    public ReplicationGroupMemberActionsRecord setPriority(UByte value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>mysql.replication_group_member_actions.priority</code>.
     * The order on which the action will be run, value between 1 and 100, lower
     * values first.
     */
    public UByte getPriority() {
        return (UByte) get(4);
    }

    /**
     * Setter for
     * <code>mysql.replication_group_member_actions.error_handling</code>. On
     * errors during the action will be handled: IGNORE, CRITICAL.
     */
    public ReplicationGroupMemberActionsRecord setErrorHandling(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for
     * <code>mysql.replication_group_member_actions.error_handling</code>. On
     * errors during the action will be handled: IGNORE, CRITICAL.
     */
    public String getErrorHandling() {
        return (String) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record2<String, String> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row6<String, String, Byte, String, UByte, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    @Override
    public Row6<String, String, Byte, String, UByte, String> valuesRow() {
        return (Row6) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return ReplicationGroupMemberActions.REPLICATION_GROUP_MEMBER_ACTIONS.NAME;
    }

    @Override
    public Field<String> field2() {
        return ReplicationGroupMemberActions.REPLICATION_GROUP_MEMBER_ACTIONS.EVENT;
    }

    @Override
    public Field<Byte> field3() {
        return ReplicationGroupMemberActions.REPLICATION_GROUP_MEMBER_ACTIONS.ENABLED;
    }

    @Override
    public Field<String> field4() {
        return ReplicationGroupMemberActions.REPLICATION_GROUP_MEMBER_ACTIONS.TYPE;
    }

    @Override
    public Field<UByte> field5() {
        return ReplicationGroupMemberActions.REPLICATION_GROUP_MEMBER_ACTIONS.PRIORITY;
    }

    @Override
    public Field<String> field6() {
        return ReplicationGroupMemberActions.REPLICATION_GROUP_MEMBER_ACTIONS.ERROR_HANDLING;
    }

    @Override
    public String component1() {
        return getName();
    }

    @Override
    public String component2() {
        return getEvent();
    }

    @Override
    public Byte component3() {
        return getEnabled();
    }

    @Override
    public String component4() {
        return getType();
    }

    @Override
    public UByte component5() {
        return getPriority();
    }

    @Override
    public String component6() {
        return getErrorHandling();
    }

    @Override
    public String value1() {
        return getName();
    }

    @Override
    public String value2() {
        return getEvent();
    }

    @Override
    public Byte value3() {
        return getEnabled();
    }

    @Override
    public String value4() {
        return getType();
    }

    @Override
    public UByte value5() {
        return getPriority();
    }

    @Override
    public String value6() {
        return getErrorHandling();
    }

    @Override
    public ReplicationGroupMemberActionsRecord value1(String value) {
        setName(value);
        return this;
    }

    @Override
    public ReplicationGroupMemberActionsRecord value2(String value) {
        setEvent(value);
        return this;
    }

    @Override
    public ReplicationGroupMemberActionsRecord value3(Byte value) {
        setEnabled(value);
        return this;
    }

    @Override
    public ReplicationGroupMemberActionsRecord value4(String value) {
        setType(value);
        return this;
    }

    @Override
    public ReplicationGroupMemberActionsRecord value5(UByte value) {
        setPriority(value);
        return this;
    }

    @Override
    public ReplicationGroupMemberActionsRecord value6(String value) {
        setErrorHandling(value);
        return this;
    }

    @Override
    public ReplicationGroupMemberActionsRecord values(String value1, String value2, Byte value3, String value4, UByte value5, String value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ReplicationGroupMemberActionsRecord
     */
    public ReplicationGroupMemberActionsRecord() {
        super(ReplicationGroupMemberActions.REPLICATION_GROUP_MEMBER_ACTIONS);
    }

    /**
     * Create a detached, initialised ReplicationGroupMemberActionsRecord
     */
    public ReplicationGroupMemberActionsRecord(String name, String event, Byte enabled, String type, UByte priority, String errorHandling) {
        super(ReplicationGroupMemberActions.REPLICATION_GROUP_MEMBER_ACTIONS);

        setName(name);
        setEvent(event);
        setEnabled(enabled);
        setType(type);
        setPriority(priority);
        setErrorHandling(errorHandling);
    }

    /**
     * Create a detached, initialised ReplicationGroupMemberActionsRecord
     */
    public ReplicationGroupMemberActionsRecord(com.neurasim.jooq.mysql.tables.pojos.ReplicationGroupMemberActions value) {
        super(ReplicationGroupMemberActions.REPLICATION_GROUP_MEMBER_ACTIONS);

        if (value != null) {
            setName(value.getName());
            setEvent(value.getEvent());
            setEnabled(value.getEnabled());
            setType(value.getType());
            setPriority(value.getPriority());
            setErrorHandling(value.getErrorHandling());
        }
    }
}
