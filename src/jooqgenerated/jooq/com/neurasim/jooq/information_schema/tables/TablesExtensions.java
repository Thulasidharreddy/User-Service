/*
 * This file is generated by jOOQ.
 */
package com.neurasim.jooq.information_schema.tables;


import com.neurasim.jooq.information_schema.InformationSchema;
import com.neurasim.jooq.information_schema.tables.records.TablesExtensionsRecord;

import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function5;
import org.jooq.JSON;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row5;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TablesExtensions extends TableImpl<TablesExtensionsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>information_schema.TABLES_EXTENSIONS</code>
     */
    public static final TablesExtensions TABLES_EXTENSIONS = new TablesExtensions();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TablesExtensionsRecord> getRecordType() {
        return TablesExtensionsRecord.class;
    }

    /**
     * The column
     * <code>information_schema.TABLES_EXTENSIONS.TABLE_CATALOG</code>.
     */
    public final TableField<TablesExtensionsRecord, String> TABLE_CATALOG = createField(DSL.name("TABLE_CATALOG"), SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column
     * <code>information_schema.TABLES_EXTENSIONS.TABLE_SCHEMA</code>.
     */
    public final TableField<TablesExtensionsRecord, String> TABLE_SCHEMA = createField(DSL.name("TABLE_SCHEMA"), SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>information_schema.TABLES_EXTENSIONS.TABLE_NAME</code>.
     */
    public final TableField<TablesExtensionsRecord, String> TABLE_NAME = createField(DSL.name("TABLE_NAME"), SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column
     * <code>information_schema.TABLES_EXTENSIONS.ENGINE_ATTRIBUTE</code>.
     */
    public final TableField<TablesExtensionsRecord, JSON> ENGINE_ATTRIBUTE = createField(DSL.name("ENGINE_ATTRIBUTE"), SQLDataType.JSON, this, "");

    /**
     * The column
     * <code>information_schema.TABLES_EXTENSIONS.SECONDARY_ENGINE_ATTRIBUTE</code>.
     */
    public final TableField<TablesExtensionsRecord, JSON> SECONDARY_ENGINE_ATTRIBUTE = createField(DSL.name("SECONDARY_ENGINE_ATTRIBUTE"), SQLDataType.JSON, this, "");

    private TablesExtensions(Name alias, Table<TablesExtensionsRecord> aliased) {
        this(alias, aliased, null);
    }

    private TablesExtensions(Name alias, Table<TablesExtensionsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>information_schema.TABLES_EXTENSIONS</code> table
     * reference
     */
    public TablesExtensions(String alias) {
        this(DSL.name(alias), TABLES_EXTENSIONS);
    }

    /**
     * Create an aliased <code>information_schema.TABLES_EXTENSIONS</code> table
     * reference
     */
    public TablesExtensions(Name alias) {
        this(alias, TABLES_EXTENSIONS);
    }

    /**
     * Create a <code>information_schema.TABLES_EXTENSIONS</code> table
     * reference
     */
    public TablesExtensions() {
        this(DSL.name("TABLES_EXTENSIONS"), null);
    }

    public <O extends Record> TablesExtensions(Table<O> child, ForeignKey<O, TablesExtensionsRecord> key) {
        super(child, key, TABLES_EXTENSIONS);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public TablesExtensions as(String alias) {
        return new TablesExtensions(DSL.name(alias), this);
    }

    @Override
    public TablesExtensions as(Name alias) {
        return new TablesExtensions(alias, this);
    }

    @Override
    public TablesExtensions as(Table<?> alias) {
        return new TablesExtensions(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public TablesExtensions rename(String name) {
        return new TablesExtensions(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TablesExtensions rename(Name name) {
        return new TablesExtensions(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public TablesExtensions rename(Table<?> name) {
        return new TablesExtensions(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row5<String, String, String, JSON, JSON> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function5<? super String, ? super String, ? super String, ? super JSON, ? super JSON, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function5<? super String, ? super String, ? super String, ? super JSON, ? super JSON, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
