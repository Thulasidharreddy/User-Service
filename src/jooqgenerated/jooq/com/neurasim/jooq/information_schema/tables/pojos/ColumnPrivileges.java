/*
 * This file is generated by jOOQ.
 */
package com.neurasim.jooq.information_schema.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ColumnPrivileges implements Serializable {

    private static final long serialVersionUID = 1L;

    private final String grantee;
    private final String tableCatalog;
    private final String tableSchema;
    private final String tableName;
    private final String columnName;
    private final String privilegeType;
    private final String isGrantable;

    public ColumnPrivileges(ColumnPrivileges value) {
        this.grantee = value.grantee;
        this.tableCatalog = value.tableCatalog;
        this.tableSchema = value.tableSchema;
        this.tableName = value.tableName;
        this.columnName = value.columnName;
        this.privilegeType = value.privilegeType;
        this.isGrantable = value.isGrantable;
    }

    public ColumnPrivileges(
        String grantee,
        String tableCatalog,
        String tableSchema,
        String tableName,
        String columnName,
        String privilegeType,
        String isGrantable
    ) {
        this.grantee = grantee;
        this.tableCatalog = tableCatalog;
        this.tableSchema = tableSchema;
        this.tableName = tableName;
        this.columnName = columnName;
        this.privilegeType = privilegeType;
        this.isGrantable = isGrantable;
    }

    /**
     * Getter for <code>information_schema.COLUMN_PRIVILEGES.GRANTEE</code>.
     */
    public String getGrantee() {
        return this.grantee;
    }

    /**
     * Getter for
     * <code>information_schema.COLUMN_PRIVILEGES.TABLE_CATALOG</code>.
     */
    public String getTableCatalog() {
        return this.tableCatalog;
    }

    /**
     * Getter for
     * <code>information_schema.COLUMN_PRIVILEGES.TABLE_SCHEMA</code>.
     */
    public String getTableSchema() {
        return this.tableSchema;
    }

    /**
     * Getter for <code>information_schema.COLUMN_PRIVILEGES.TABLE_NAME</code>.
     */
    public String getTableName() {
        return this.tableName;
    }

    /**
     * Getter for <code>information_schema.COLUMN_PRIVILEGES.COLUMN_NAME</code>.
     */
    public String getColumnName() {
        return this.columnName;
    }

    /**
     * Getter for
     * <code>information_schema.COLUMN_PRIVILEGES.PRIVILEGE_TYPE</code>.
     */
    public String getPrivilegeType() {
        return this.privilegeType;
    }

    /**
     * Getter for
     * <code>information_schema.COLUMN_PRIVILEGES.IS_GRANTABLE</code>.
     */
    public String getIsGrantable() {
        return this.isGrantable;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final ColumnPrivileges other = (ColumnPrivileges) obj;
        if (this.grantee == null) {
            if (other.grantee != null)
                return false;
        }
        else if (!this.grantee.equals(other.grantee))
            return false;
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
        if (this.columnName == null) {
            if (other.columnName != null)
                return false;
        }
        else if (!this.columnName.equals(other.columnName))
            return false;
        if (this.privilegeType == null) {
            if (other.privilegeType != null)
                return false;
        }
        else if (!this.privilegeType.equals(other.privilegeType))
            return false;
        if (this.isGrantable == null) {
            if (other.isGrantable != null)
                return false;
        }
        else if (!this.isGrantable.equals(other.isGrantable))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.grantee == null) ? 0 : this.grantee.hashCode());
        result = prime * result + ((this.tableCatalog == null) ? 0 : this.tableCatalog.hashCode());
        result = prime * result + ((this.tableSchema == null) ? 0 : this.tableSchema.hashCode());
        result = prime * result + ((this.tableName == null) ? 0 : this.tableName.hashCode());
        result = prime * result + ((this.columnName == null) ? 0 : this.columnName.hashCode());
        result = prime * result + ((this.privilegeType == null) ? 0 : this.privilegeType.hashCode());
        result = prime * result + ((this.isGrantable == null) ? 0 : this.isGrantable.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ColumnPrivileges (");

        sb.append(grantee);
        sb.append(", ").append(tableCatalog);
        sb.append(", ").append(tableSchema);
        sb.append(", ").append(tableName);
        sb.append(", ").append(columnName);
        sb.append(", ").append(privilegeType);
        sb.append(", ").append(isGrantable);

        sb.append(")");
        return sb.toString();
    }
}
