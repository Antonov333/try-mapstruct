package org.example;

import lombok.Data;

@Data
public class Target {
    private long targetId;

    public Target() {
    }

    public Target(long targetId) {
        this.targetId = targetId;
    }
}
