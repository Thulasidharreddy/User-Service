/*
 * This file is generated by jOOQ.
 */
package com.neurasim.jooq.mysql.tables;


import com.neurasim.jooq.mysql.Keys;
import com.neurasim.jooq.mysql.Mysql;
import com.neurasim.jooq.mysql.enums.GlobalGrantsWithGrantOption;
import com.neurasim.jooq.mysql.tables.records.GlobalGrantsRecord;

import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function4;
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
 * Extended global grants
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class GlobalGrants extends TableImpl<GlobalGrantsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>mysql.global_grants</code>
     */
    public static final GlobalGrants GLOBAL_GRANTS = new GlobalGrants();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<GlobalGrantsRecord> getRecordType() {
        return GlobalGrantsRecord.class;
    }

    /**
     * The column <code>mysql.global_grants.USER</code>.
     */
    public final TableField<GlobalGrantsRecord, String> USER = createField(DSL.name("USER"), SQLDataType.CHAR(32).nullable(false).defaultValue(DSL.inline("", SQLDataType.CHAR)), this, "");

    /**
     * The column <code>mysql.global_grants.HOST</code>.
     */
    public final TableField<GlobalGrantsRecord, String> HOST = createField(DSL.name("HOST"), SQLDataType.CHAR(255).nullable(false).defaultValue(DSL.inline("", SQLDataType.CHAR)), this, "");

    /**
     * The column <code>mysql.global_grants.PRIV</code>.
     */
    public final TableField<GlobalGrantsRecord, String> PRIV = createField(DSL.name("PRIV"), SQLDataType.CHAR(32).nullable(false).defaultValue(DSL.inline("", SQLDataType.CHAR)), this, "");

    /**
     * The column <code>mysql.global_grants.WITH_GRANT_OPTION</code>.
     */
    public final TableField<GlobalGrantsRecord, GlobalGrantsWithGrantOption> WITH_GRANT_OPTION = createField(DSL.name("WITH_GRANT_OPTION"), SQLDataType.VARCHAR(1).nullable(false).defaultValue(DSL.inline("N", SQLDataType.VARCHAR)).asEnumDataType(com.neurasim.jooq.mysql.enums.GlobalGrantsWithGrantOption.class), this, "");

    private GlobalGrants(Name alias, Table<GlobalGrantsRecord> aliased) {
        this(alias, aliased, null);
    }

    private GlobalGrants(Name alias, Table<GlobalGrantsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Extended global grants"), TableOptions.table());
    }

    /**
     * Create an aliased <code>mysql.global_grants</code> table reference
     */
    public GlobalGrants(String alias) {
        this(DSL.name(alias), GLOBAL_GRANTS);
    }

    /**
     * Create an aliased <code>mysql.global_grants</code> table reference
     */
    public GlobalGrants(Name alias) {
        this(alias, GLOBAL_GRANTS);
    }

    /**
     * Create a <code>mysql.global_grants</code> table reference
     */
    public GlobalGrants() {
        this(DSL.name("global_grants"), null);
    }

    public <O extends Record> GlobalGrants(Table<O> child, ForeignKey<O, GlobalGrantsRecord> key) {
        super(child, key, GLOBAL_GRANTS);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Mysql.MYSQL;
    }

    @Override
    public UniqueKey<GlobalGrantsRecord> getPrimaryKey() {
        return Keys.KEY_GLOBAL_GRANTS_PRIMARY;
    }

    @Override
    public GlobalGrants as(String alias) {
        return new GlobalGrants(DSL.name(alias), this);
    }

    @Override
    public GlobalGrants as(Name alias) {
        return new GlobalGrants(alias, this);
    }

    @Override
    public GlobalGrants as(Table<?> alias) {
        return new GlobalGrants(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public GlobalGrants rename(String name) {
        return new GlobalGrants(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public GlobalGrants rename(Name name) {
        return new GlobalGrants(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public GlobalGrants rename(Table<?> name) {
        return new GlobalGrants(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<String, String, String, GlobalGrantsWithGrantOption> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function4<? super String, ? super String, ? super String, ? super GlobalGrantsWithGrantOption, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function4<? super String, ? super String, ? super String, ? super GlobalGrantsWithGrantOption, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
