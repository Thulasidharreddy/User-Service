/*
 * This file is generated by jOOQ.
 */
package com.neurasim.jooq.mysql.tables.records;


import com.neurasim.jooq.mysql.enums.RoleEdgesWithAdminOption;
import com.neurasim.jooq.mysql.tables.RoleEdges;

import org.jooq.Field;
import org.jooq.Record4;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * Role hierarchy and role grants
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RoleEdgesRecord extends UpdatableRecordImpl<RoleEdgesRecord> implements Record5<String, String, String, String, RoleEdgesWithAdminOption> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>mysql.role_edges.FROM_HOST</code>.
     */
    public RoleEdgesRecord setFromHost(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>mysql.role_edges.FROM_HOST</code>.
     */
    public String getFromHost() {
        return (String) get(0);
    }

    /**
     * Setter for <code>mysql.role_edges.FROM_USER</code>.
     */
    public RoleEdgesRecord setFromUser(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>mysql.role_edges.FROM_USER</code>.
     */
    public String getFromUser() {
        return (String) get(1);
    }

    /**
     * Setter for <code>mysql.role_edges.TO_HOST</code>.
     */
    public RoleEdgesRecord setToHost(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>mysql.role_edges.TO_HOST</code>.
     */
    public String getToHost() {
        return (String) get(2);
    }

    /**
     * Setter for <code>mysql.role_edges.TO_USER</code>.
     */
    public RoleEdgesRecord setToUser(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>mysql.role_edges.TO_USER</code>.
     */
    public String getToUser() {
        return (String) get(3);
    }

    /**
     * Setter for <code>mysql.role_edges.WITH_ADMIN_OPTION</code>.
     */
    public RoleEdgesRecord setWithAdminOption(RoleEdgesWithAdminOption value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>mysql.role_edges.WITH_ADMIN_OPTION</code>.
     */
    public RoleEdgesWithAdminOption getWithAdminOption() {
        return (RoleEdgesWithAdminOption) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record4<String, String, String, String> key() {
        return (Record4) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row5<String, String, String, String, RoleEdgesWithAdminOption> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    @Override
    public Row5<String, String, String, String, RoleEdgesWithAdminOption> valuesRow() {
        return (Row5) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return RoleEdges.ROLE_EDGES.FROM_HOST;
    }

    @Override
    public Field<String> field2() {
        return RoleEdges.ROLE_EDGES.FROM_USER;
    }

    @Override
    public Field<String> field3() {
        return RoleEdges.ROLE_EDGES.TO_HOST;
    }

    @Override
    public Field<String> field4() {
        return RoleEdges.ROLE_EDGES.TO_USER;
    }

    @Override
    public Field<RoleEdgesWithAdminOption> field5() {
        return RoleEdges.ROLE_EDGES.WITH_ADMIN_OPTION;
    }

    @Override
    public String component1() {
        return getFromHost();
    }

    @Override
    public String component2() {
        return getFromUser();
    }

    @Override
    public String component3() {
        return getToHost();
    }

    @Override
    public String component4() {
        return getToUser();
    }

    @Override
    public RoleEdgesWithAdminOption component5() {
        return getWithAdminOption();
    }

    @Override
    public String value1() {
        return getFromHost();
    }

    @Override
    public String value2() {
        return getFromUser();
    }

    @Override
    public String value3() {
        return getToHost();
    }

    @Override
    public String value4() {
        return getToUser();
    }

    @Override
    public RoleEdgesWithAdminOption value5() {
        return getWithAdminOption();
    }

    @Override
    public RoleEdgesRecord value1(String value) {
        setFromHost(value);
        return this;
    }

    @Override
    public RoleEdgesRecord value2(String value) {
        setFromUser(value);
        return this;
    }

    @Override
    public RoleEdgesRecord value3(String value) {
        setToHost(value);
        return this;
    }

    @Override
    public RoleEdgesRecord value4(String value) {
        setToUser(value);
        return this;
    }

    @Override
    public RoleEdgesRecord value5(RoleEdgesWithAdminOption value) {
        setWithAdminOption(value);
        return this;
    }

    @Override
    public RoleEdgesRecord values(String value1, String value2, String value3, String value4, RoleEdgesWithAdminOption value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached RoleEdgesRecord
     */
    public RoleEdgesRecord() {
        super(RoleEdges.ROLE_EDGES);
    }

    /**
     * Create a detached, initialised RoleEdgesRecord
     */
    public RoleEdgesRecord(String fromHost, String fromUser, String toHost, String toUser, RoleEdgesWithAdminOption withAdminOption) {
        super(RoleEdges.ROLE_EDGES);

        setFromHost(fromHost);
        setFromUser(fromUser);
        setToHost(toHost);
        setToUser(toUser);
        setWithAdminOption(withAdminOption);
    }

    /**
     * Create a detached, initialised RoleEdgesRecord
     */
    public RoleEdgesRecord(com.neurasim.jooq.mysql.tables.pojos.RoleEdges value) {
        super(RoleEdges.ROLE_EDGES);

        if (value != null) {
            setFromHost(value.getFromHost());
            setFromUser(value.getFromUser());
            setToHost(value.getToHost());
            setToUser(value.getToUser());
            setWithAdminOption(value.getWithAdminOption());
        }
    }
}
