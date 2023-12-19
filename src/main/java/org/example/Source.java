package org.example;

import lombok.Data;

@Data
public class Source {
    private long sourceNumber;

    public Source(long sourceNumber) {
        this.sourceNumber = sourceNumber;
    }
}
