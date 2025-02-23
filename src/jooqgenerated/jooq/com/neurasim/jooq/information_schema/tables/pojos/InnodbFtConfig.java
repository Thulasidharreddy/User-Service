/*
 * This file is generated by jOOQ.
 */
package com.neurasim.jooq.information_schema.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class InnodbFtConfig implements Serializable {

    private static final long serialVersionUID = 1L;

    private final String key;
    private final String value;

    public InnodbFtConfig(InnodbFtConfig value) {
        this.key = value.key;
        this.value = value.value;
    }

    public InnodbFtConfig(
        String key,
        String value
    ) {
        this.key = key;
        this.value = value;
    }

    /**
     * Getter for <code>information_schema.INNODB_FT_CONFIG.KEY</code>.
     */
    public String getKey() {
        return this.key;
    }

    /**
     * Getter for <code>information_schema.INNODB_FT_CONFIG.VALUE</code>.
     */
    public String getValue() {
        return this.value;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final InnodbFtConfig other = (InnodbFtConfig) obj;
        if (this.key == null) {
            if (other.key != null)
                return false;
        }
        else if (!this.key.equals(other.key))
            return false;
        if (this.value == null) {
            if (other.value != null)
                return false;
        }
        else if (!this.value.equals(other.value))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.key == null) ? 0 : this.key.hashCode());
        result = prime * result + ((this.value == null) ? 0 : this.value.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("InnodbFtConfig (");

        sb.append(key);
        sb.append(", ").append(value);

        sb.append(")");
        return sb.toString();
    }
}
