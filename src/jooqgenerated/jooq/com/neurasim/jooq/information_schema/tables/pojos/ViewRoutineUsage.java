/*
 * This file is generated by jOOQ.
 */
package com.neurasim.jooq.information_schema.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ViewRoutineUsage implements Serializable {

    private static final long serialVersionUID = 1L;

    private final String tableCatalog;
    private final String tableSchema;
    private final String tableName;
    private final String specificCatalog;
    private final String specificSchema;
    private final String specificName;

    public ViewRoutineUsage(ViewRoutineUsage value) {
        this.tableCatalog = value.tableCatalog;
        this.tableSchema = value.tableSchema;
        this.tableName = value.tableName;
        this.specificCatalog = value.specificCatalog;
        this.specificSchema = value.specificSchema;
        this.specificName = value.specificName;
    }

    public ViewRoutineUsage(
        String tableCatalog,
        String tableSchema,
        String tableName,
        String specificCatalog,
        String specificSchema,
        String specificName
    ) {
        this.tableCatalog = tableCatalog;
        this.tableSchema = tableSchema;
        this.tableName = tableName;
        this.specificCatalog = specificCatalog;
        this.specificSchema = specificSchema;
        this.specificName = specificName;
    }

    /**
     * Getter for
     * <code>information_schema.VIEW_ROUTINE_USAGE.TABLE_CATALOG</code>.
     */
    public String getTableCatalog() {
        return this.tableCatalog;
    }

    /**
     * Getter for
     * <code>information_schema.VIEW_ROUTINE_USAGE.TABLE_SCHEMA</code>.
     */
    public String getTableSchema() {
        return this.tableSchema;
    }

    /**
     * Getter for <code>information_schema.VIEW_ROUTINE_USAGE.TABLE_NAME</code>.
     */
    public String getTableName() {
        return this.tableName;
    }

    /**
     * Getter for
     * <code>information_schema.VIEW_ROUTINE_USAGE.SPECIFIC_CATALOG</code>.
     */
    public String getSpecificCatalog() {
        return this.specificCatalog;
    }

    /**
     * Getter for
     * <code>information_schema.VIEW_ROUTINE_USAGE.SPECIFIC_SCHEMA</code>.
     */
    public String getSpecificSchema() {
        return this.specificSchema;
    }

    /**
     * Getter for
     * <code>information_schema.VIEW_ROUTINE_USAGE.SPECIFIC_NAME</code>.
     */
    public String getSpecificName() {
        return this.specificName;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final ViewRoutineUsage other = (ViewRoutineUsage) obj;
        if (this.tableCatalog == null) {
            if (other.tableCatalog != null)
                return false;
        }
        else if (!this.tableCatalog.equals(other.tableCatalog))
            return false;
        if (this.tableSchema == null) {
            if (other.tableSchema != null)
                return false;
        }
        else if (!this.tableSchema.equals(other.tableSchema))
            return false;
        if (this.tableName == null) {
            if (other.tableName != null)
                return false;
        }
        else if (!this.tableName.equals(other.tableName))
            return false;
        if (this.specificCatalog == null) {
            if (other.specificCatalog != null)
                return false;
        }
        else if (!this.specificCatalog.equals(other.specificCatalog))
            return false;
        if (this.specificSchema == null) {
            if (other.specificSchema != null)
                return false;
        }
        else if (!this.specificSchema.equals(other.specificSchema))
            return false;
        if (this.specificName == null) {
            if (other.specificName != null)
                return false;
        }
        else if (!this.specificName.equals(other.specificName))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.tableCatalog == null) ? 0 : this.tableCatalog.hashCode());
        result = prime * result + ((this.tableSchema == null) ? 0 : this.tableSchema.hashCode());
        result = prime * result + ((this.tableName == null) ? 0 : this.tableName.hashCode());
        result = prime * result + ((this.specificCatalog == null) ? 0 : this.specificCatalog.hashCode());
        result = prime * result + ((this.specificSchema == null) ? 0 : this.specificSchema.hashCode());
        result = prime * result + ((this.specificName == null) ? 0 : this.specificName.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ViewRoutineUsage (");

        sb.append(tableCatalog);
        sb.append(", ").append(tableSchema);
        sb.append(", ").append(tableName);
        sb.append(", ").append(specificCatalog);
        sb.append(", ").append(specificSchema);
        sb.append(", ").append(specificName);

        sb.append(")");
        return sb.toString();
    }
}
