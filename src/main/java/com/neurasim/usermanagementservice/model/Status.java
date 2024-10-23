package com.neurasim.usermanagementservice.model;

import lombok.Data;

@Data
public class Status {
    public Status(boolean success) {
        this.success = success;
    }
    boolean success;
}
