/*
 * This file is generated by jOOQ.
 */
package com.neurasim.jooq.information_schema.tables;


import com.neurasim.jooq.information_schema.InformationSchema;
import com.neurasim.jooq.information_schema.tables.records.InnodbCmpResetRecord;

import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function6;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row6;
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
public class InnodbCmpReset extends TableImpl<InnodbCmpResetRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>information_schema.INNODB_CMP_RESET</code>
     */
    public static final InnodbCmpReset INNODB_CMP_RESET = new InnodbCmpReset();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<InnodbCmpResetRecord> getRecordType() {
        return InnodbCmpResetRecord.class;
    }

    /**
     * The column <code>information_schema.INNODB_CMP_RESET.page_size</code>.
     */
    public final TableField<InnodbCmpResetRecord, Integer> PAGE_SIZE = createField(DSL.name("page_size"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>information_schema.INNODB_CMP_RESET.compress_ops</code>.
     */
    public final TableField<InnodbCmpResetRecord, Integer> COMPRESS_OPS = createField(DSL.name("compress_ops"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("", SQLDataType.INTEGER)), this, "");

    /**
     * The column
     * <code>information_schema.INNODB_CMP_RESET.compress_ops_ok</code>.
     */
    public final TableField<InnodbCmpResetRecord, Integer> COMPRESS_OPS_OK = createField(DSL.name("compress_ops_ok"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("", SQLDataType.INTEGER)), this, "");

    /**
     * The column
     * <code>information_schema.INNODB_CMP_RESET.compress_time</code>.
     */
    public final TableField<InnodbCmpResetRecord, Integer> COMPRESS_TIME = createField(DSL.name("compress_time"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("", SQLDataType.INTEGER)), this, "");

    /**
     * The column
     * <code>information_schema.INNODB_CMP_RESET.uncompress_ops</code>.
     */
    public final TableField<InnodbCmpResetRecord, Integer> UNCOMPRESS_OPS = createField(DSL.name("uncompress_ops"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("", SQLDataType.INTEGER)), this, "");

    /**
     * The column
     * <code>information_schema.INNODB_CMP_RESET.uncompress_time</code>.
     */
    public final TableField<InnodbCmpResetRecord, Integer> UNCOMPRESS_TIME = createField(DSL.name("uncompress_time"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("", SQLDataType.INTEGER)), this, "");

    private InnodbCmpReset(Name alias, Table<InnodbCmpResetRecord> aliased) {
        this(alias, aliased, null);
    }

    private InnodbCmpReset(Name alias, Table<InnodbCmpResetRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>information_schema.INNODB_CMP_RESET</code> table
     * reference
     */
    public InnodbCmpReset(String alias) {
        this(DSL.name(alias), INNODB_CMP_RESET);
    }

    /**
     * Create an aliased <code>information_schema.INNODB_CMP_RESET</code> table
     * reference
     */
    public InnodbCmpReset(Name alias) {
        this(alias, INNODB_CMP_RESET);
    }

    /**
     * Create a <code>information_schema.INNODB_CMP_RESET</code> table reference
     */
    public InnodbCmpReset() {
        this(DSL.name("INNODB_CMP_RESET"), null);
    }

    public <O extends Record> InnodbCmpReset(Table<O> child, ForeignKey<O, InnodbCmpResetRecord> key) {
        super(child, key, INNODB_CMP_RESET);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public InnodbCmpReset as(String alias) {
        return new InnodbCmpReset(DSL.name(alias), this);
    }

    @Override
    public InnodbCmpReset as(Name alias) {
        return new InnodbCmpReset(alias, this);
    }

    @Override
    public InnodbCmpReset as(Table<?> alias) {
        return new InnodbCmpReset(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public InnodbCmpReset rename(String name) {
        return new InnodbCmpReset(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public InnodbCmpReset rename(Name name) {
        return new InnodbCmpReset(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public InnodbCmpReset rename(Table<?> name) {
        return new InnodbCmpReset(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row6<Integer, Integer, Integer, Integer, Integer, Integer> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function6<? super Integer, ? super Integer, ? super Integer, ? super Integer, ? super Integer, ? super Integer, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function6<? super Integer, ? super Integer, ? super Integer, ? super Integer, ? super Integer, ? super Integer, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
