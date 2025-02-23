/*
 * This file is generated by jOOQ.
 */
package com.neurasim.jooq.performance_schema.tables.pojos;


import com.neurasim.jooq.performance_schema.enums.EventsStagesHistoryLongNestingEventType;

import java.io.Serializable;

import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class EventsStagesHistoryLong implements Serializable {

    private static final long serialVersionUID = 1L;

    private final ULong threadId;
    private final ULong eventId;
    private final ULong endEventId;
    private final String eventName;
    private final String source;
    private final ULong timerStart;
    private final ULong timerEnd;
    private final ULong timerWait;
    private final ULong workCompleted;
    private final ULong workEstimated;
    private final ULong nestingEventId;
    private final EventsStagesHistoryLongNestingEventType nestingEventType;

    public EventsStagesHistoryLong(EventsStagesHistoryLong value) {
        this.threadId = value.threadId;
        this.eventId = value.eventId;
        this.endEventId = value.endEventId;
        this.eventName = value.eventName;
        this.source = value.source;
        this.timerStart = value.timerStart;
        this.timerEnd = value.timerEnd;
        this.timerWait = value.timerWait;
        this.workCompleted = value.workCompleted;
        this.workEstimated = value.workEstimated;
        this.nestingEventId = value.nestingEventId;
        this.nestingEventType = value.nestingEventType;
    }

    public EventsStagesHistoryLong(
        ULong threadId,
        ULong eventId,
        ULong endEventId,
        String eventName,
        String source,
        ULong timerStart,
        ULong timerEnd,
        ULong timerWait,
        ULong workCompleted,
        ULong workEstimated,
        ULong nestingEventId,
        EventsStagesHistoryLongNestingEventType nestingEventType
    ) {
        this.threadId = threadId;
        this.eventId = eventId;
        this.endEventId = endEventId;
        this.eventName = eventName;
        this.source = source;
        this.timerStart = timerStart;
        this.timerEnd = timerEnd;
        this.timerWait = timerWait;
        this.workCompleted = workCompleted;
        this.workEstimated = workEstimated;
        this.nestingEventId = nestingEventId;
        this.nestingEventType = nestingEventType;
    }

    /**
     * Getter for
     * <code>performance_schema.events_stages_history_long.THREAD_ID</code>.
     */
    public ULong getThreadId() {
        return this.threadId;
    }

    /**
     * Getter for
     * <code>performance_schema.events_stages_history_long.EVENT_ID</code>.
     */
    public ULong getEventId() {
        return this.eventId;
    }

    /**
     * Getter for
     * <code>performance_schema.events_stages_history_long.END_EVENT_ID</code>.
     */
    public ULong getEndEventId() {
        return this.endEventId;
    }

    /**
     * Getter for
     * <code>performance_schema.events_stages_history_long.EVENT_NAME</code>.
     */
    public String getEventName() {
        return this.eventName;
    }

    /**
     * Getter for
     * <code>performance_schema.events_stages_history_long.SOURCE</code>.
     */
    public String getSource() {
        return this.source;
    }

    /**
     * Getter for
     * <code>performance_schema.events_stages_history_long.TIMER_START</code>.
     */
    public ULong getTimerStart() {
        return this.timerStart;
    }

    /**
     * Getter for
     * <code>performance_schema.events_stages_history_long.TIMER_END</code>.
     */
    public ULong getTimerEnd() {
        return this.timerEnd;
    }

    /**
     * Getter for
     * <code>performance_schema.events_stages_history_long.TIMER_WAIT</code>.
     */
    public ULong getTimerWait() {
        return this.timerWait;
    }

    /**
     * Getter for
     * <code>performance_schema.events_stages_history_long.WORK_COMPLETED</code>.
     */
    public ULong getWorkCompleted() {
        return this.workCompleted;
    }

    /**
     * Getter for
     * <code>performance_schema.events_stages_history_long.WORK_ESTIMATED</code>.
     */
    public ULong getWorkEstimated() {
        return this.workEstimated;
    }

    /**
     * Getter for
     * <code>performance_schema.events_stages_history_long.NESTING_EVENT_ID</code>.
     */
    public ULong getNestingEventId() {
        return this.nestingEventId;
    }

    /**
     * Getter for
     * <code>performance_schema.events_stages_history_long.NESTING_EVENT_TYPE</code>.
     */
    public EventsStagesHistoryLongNestingEventType getNestingEventType() {
        return this.nestingEventType;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final EventsStagesHistoryLong other = (EventsStagesHistoryLong) obj;
        if (this.threadId == null) {
            if (other.threadId != null)
                return false;
        }
        else if (!this.threadId.equals(other.threadId))
            return false;
        if (this.eventId == null) {
            if (other.eventId != null)
                return false;
        }
        else if (!this.eventId.equals(other.eventId))
            return false;
        if (this.endEventId == null) {
            if (other.endEventId != null)
                return false;
        }
        else if (!this.endEventId.equals(other.endEventId))
            return false;
        if (this.eventName == null) {
            if (other.eventName != null)
                return false;
        }
        else if (!this.eventName.equals(other.eventName))
            return false;
        if (this.source == null) {
            if (other.source != null)
                return false;
        }
        else if (!this.source.equals(other.source))
            return false;
        if (this.timerStart == null) {
            if (other.timerStart != null)
                return false;
        }
        else if (!this.timerStart.equals(other.timerStart))
            return false;
        if (this.timerEnd == null) {
            if (other.timerEnd != null)
                return false;
        }
        else if (!this.timerEnd.equals(other.timerEnd))
            return false;
        if (this.timerWait == null) {
            if (other.timerWait != null)
                return false;
        }
        else if (!this.timerWait.equals(other.timerWait))
            return false;
        if (this.workCompleted == null) {
            if (other.workCompleted != null)
                return false;
        }
        else if (!this.workCompleted.equals(other.workCompleted))
            return false;
        if (this.workEstimated == null) {
            if (other.workEstimated != null)
                return false;
        }
        else if (!this.workEstimated.equals(other.workEstimated))
            return false;
        if (this.nestingEventId == null) {
            if (other.nestingEventId != null)
                return false;
        }
        else if (!this.nestingEventId.equals(other.nestingEventId))
            return false;
        if (this.nestingEventType == null) {
            if (other.nestingEventType != null)
                return false;
        }
        else if (!this.nestingEventType.equals(other.nestingEventType))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.threadId == null) ? 0 : this.threadId.hashCode());
        result = prime * result + ((this.eventId == null) ? 0 : this.eventId.hashCode());
        result = prime * result + ((this.endEventId == null) ? 0 : this.endEventId.hashCode());
        result = prime * result + ((this.eventName == null) ? 0 : this.eventName.hashCode());
        result = prime * result + ((this.source == null) ? 0 : this.source.hashCode());
        result = prime * result + ((this.timerStart == null) ? 0 : this.timerStart.hashCode());
        result = prime * result + ((this.timerEnd == null) ? 0 : this.timerEnd.hashCode());
        result = prime * result + ((this.timerWait == null) ? 0 : this.timerWait.hashCode());
        result = prime * result + ((this.workCompleted == null) ? 0 : this.workCompleted.hashCode());
        result = prime * result + ((this.workEstimated == null) ? 0 : this.workEstimated.hashCode());
        result = prime * result + ((this.nestingEventId == null) ? 0 : this.nestingEventId.hashCode());
        result = prime * result + ((this.nestingEventType == null) ? 0 : this.nestingEventType.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("EventsStagesHistoryLong (");

        sb.append(threadId);
        sb.append(", ").append(eventId);
        sb.append(", ").append(endEventId);
        sb.append(", ").append(eventName);
        sb.append(", ").append(source);
        sb.append(", ").append(timerStart);
        sb.append(", ").append(timerEnd);
        sb.append(", ").append(timerWait);
        sb.append(", ").append(workCompleted);
        sb.append(", ").append(workEstimated);
        sb.append(", ").append(nestingEventId);
        sb.append(", ").append(nestingEventType);

        sb.append(")");
        return sb.toString();
    }
}
