/*
 * This file is generated by jOOQ.
 */
package com.neurasim.jooq.performance_schema.tables.pojos;


import java.io.Serializable;

import org.jooq.types.UInteger;
import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class EventsStatementsHistogramGlobal implements Serializable {

    private static final long serialVersionUID = 1L;

    private final UInteger bucketNumber;
    private final ULong bucketTimerLow;
    private final ULong bucketTimerHigh;
    private final ULong countBucket;
    private final ULong countBucketAndLower;
    private final Double bucketQuantile;

    public EventsStatementsHistogramGlobal(EventsStatementsHistogramGlobal value) {
        this.bucketNumber = value.bucketNumber;
        this.bucketTimerLow = value.bucketTimerLow;
        this.bucketTimerHigh = value.bucketTimerHigh;
        this.countBucket = value.countBucket;
        this.countBucketAndLower = value.countBucketAndLower;
        this.bucketQuantile = value.bucketQuantile;
    }

    public EventsStatementsHistogramGlobal(
        UInteger bucketNumber,
        ULong bucketTimerLow,
        ULong bucketTimerHigh,
        ULong countBucket,
        ULong countBucketAndLower,
        Double bucketQuantile
    ) {
        this.bucketNumber = bucketNumber;
        this.bucketTimerLow = bucketTimerLow;
        this.bucketTimerHigh = bucketTimerHigh;
        this.countBucket = countBucket;
        this.countBucketAndLower = countBucketAndLower;
        this.bucketQuantile = bucketQuantile;
    }

    /**
     * Getter for
     * <code>performance_schema.events_statements_histogram_global.BUCKET_NUMBER</code>.
     */
    public UInteger getBucketNumber() {
        return this.bucketNumber;
    }

    /**
     * Getter for
     * <code>performance_schema.events_statements_histogram_global.BUCKET_TIMER_LOW</code>.
     */
    public ULong getBucketTimerLow() {
        return this.bucketTimerLow;
    }

    /**
     * Getter for
     * <code>performance_schema.events_statements_histogram_global.BUCKET_TIMER_HIGH</code>.
     */
    public ULong getBucketTimerHigh() {
        return this.bucketTimerHigh;
    }

    /**
     * Getter for
     * <code>performance_schema.events_statements_histogram_global.COUNT_BUCKET</code>.
     */
    public ULong getCountBucket() {
        return this.countBucket;
    }

    /**
     * Getter for
     * <code>performance_schema.events_statements_histogram_global.COUNT_BUCKET_AND_LOWER</code>.
     */
    public ULong getCountBucketAndLower() {
        return this.countBucketAndLower;
    }

    /**
     * Getter for
     * <code>performance_schema.events_statements_histogram_global.BUCKET_QUANTILE</code>.
     */
    public Double getBucketQuantile() {
        return this.bucketQuantile;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final EventsStatementsHistogramGlobal other = (EventsStatementsHistogramGlobal) obj;
        if (this.bucketNumber == null) {
            if (other.bucketNumber != null)
                return false;
        }
        else if (!this.bucketNumber.equals(other.bucketNumber))
            return false;
        if (this.bucketTimerLow == null) {
            if (other.bucketTimerLow != null)
                return false;
        }
        else if (!this.bucketTimerLow.equals(other.bucketTimerLow))
            return false;
        if (this.bucketTimerHigh == null) {
            if (other.bucketTimerHigh != null)
                return false;
        }
        else if (!this.bucketTimerHigh.equals(other.bucketTimerHigh))
            return false;
        if (this.countBucket == null) {
            if (other.countBucket != null)
                return false;
        }
        else if (!this.countBucket.equals(other.countBucket))
            return false;
        if (this.countBucketAndLower == null) {
            if (other.countBucketAndLower != null)
                return false;
        }
        else if (!this.countBucketAndLower.equals(other.countBucketAndLower))
            return false;
        if (this.bucketQuantile == null) {
            if (other.bucketQuantile != null)
                return false;
        }
        else if (!this.bucketQuantile.equals(other.bucketQuantile))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.bucketNumber == null) ? 0 : this.bucketNumber.hashCode());
        result = prime * result + ((this.bucketTimerLow == null) ? 0 : this.bucketTimerLow.hashCode());
        result = prime * result + ((this.bucketTimerHigh == null) ? 0 : this.bucketTimerHigh.hashCode());
        result = prime * result + ((this.countBucket == null) ? 0 : this.countBucket.hashCode());
        result = prime * result + ((this.countBucketAndLower == null) ? 0 : this.countBucketAndLower.hashCode());
        result = prime * result + ((this.bucketQuantile == null) ? 0 : this.bucketQuantile.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("EventsStatementsHistogramGlobal (");

        sb.append(bucketNumber);
        sb.append(", ").append(bucketTimerLow);
        sb.append(", ").append(bucketTimerHigh);
        sb.append(", ").append(countBucket);
        sb.append(", ").append(countBucketAndLower);
        sb.append(", ").append(bucketQuantile);

        sb.append(")");
        return sb.toString();
    }
}
