/*
 * This file is generated by jOOQ.
 */
package com.neurasim.jooq.performance_schema.tables.records;


import com.neurasim.jooq.performance_schema.tables.StatusByThread;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class StatusByThreadRecord extends UpdatableRecordImpl<StatusByThreadRecord> implements Record3<ULong, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>performance_schema.status_by_thread.THREAD_ID</code>.
     */
    public StatusByThreadRecord setThreadId(ULong value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>performance_schema.status_by_thread.THREAD_ID</code>.
     */
    public ULong getThreadId() {
        return (ULong) get(0);
    }

    /**
     * Setter for
     * <code>performance_schema.status_by_thread.VARIABLE_NAME</code>.
     */
    public StatusByThreadRecord setVariableName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for
     * <code>performance_schema.status_by_thread.VARIABLE_NAME</code>.
     */
    public String getVariableName() {
        return (String) get(1);
    }

    /**
     * Setter for
     * <code>performance_schema.status_by_thread.VARIABLE_VALUE</code>.
     */
    public StatusByThreadRecord setVariableValue(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for
     * <code>performance_schema.status_by_thread.VARIABLE_VALUE</code>.
     */
    public String getVariableValue() {
        return (String) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record2<ULong, String> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row3<ULong, String, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<ULong, String, String> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<ULong> field1() {
        return StatusByThread.STATUS_BY_THREAD.THREAD_ID;
    }

    @Override
    public Field<String> field2() {
        return StatusByThread.STATUS_BY_THREAD.VARIABLE_NAME;
    }

    @Override
    public Field<String> field3() {
        return StatusByThread.STATUS_BY_THREAD.VARIABLE_VALUE;
    }

    @Override
    public ULong component1() {
        return getThreadId();
    }

    @Override
    public String component2() {
        return getVariableName();
    }

    @Override
    public String component3() {
        return getVariableValue();
    }

    @Override
    public ULong value1() {
        return getThreadId();
    }

    @Override
    public String value2() {
        return getVariableName();
    }

    @Override
    public String value3() {
        return getVariableValue();
    }

    @Override
    public StatusByThreadRecord value1(ULong value) {
        setThreadId(value);
        return this;
    }

    @Override
    public StatusByThreadRecord value2(String value) {
        setVariableName(value);
        return this;
    }

    @Override
    public StatusByThreadRecord value3(String value) {
        setVariableValue(value);
        return this;
    }

    @Override
    public StatusByThreadRecord values(ULong value1, String value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached StatusByThreadRecord
     */
    public StatusByThreadRecord() {
        super(StatusByThread.STATUS_BY_THREAD);
    }

    /**
     * Create a detached, initialised StatusByThreadRecord
     */
    public StatusByThreadRecord(ULong threadId, String variableName, String variableValue) {
        super(StatusByThread.STATUS_BY_THREAD);

        setThreadId(threadId);
        setVariableName(variableName);
        setVariableValue(variableValue);
    }

    /**
     * Create a detached, initialised StatusByThreadRecord
     */
    public StatusByThreadRecord(com.neurasim.jooq.performance_schema.tables.pojos.StatusByThread value) {
        super(StatusByThread.STATUS_BY_THREAD);

        if (value != null) {
            setThreadId(value.getThreadId());
            setVariableName(value.getVariableName());
            setVariableValue(value.getVariableValue());
        }
    }
}
