package com.skypro.homework_17.types;

/**
 * Вместимость автобуса.
 */

public enum CapacityBus {
    VERY_SMALL(0,10),
    SMALL(10,25),
    MIDDLE(40,50),
    BIG(60,80),
    VERY_BIG(100,120);

    private final int from;

    private final int to;

    CapacityBus(int from, int to) {
        this.from = from;
        this.to = to;
    }

    public int getFrom() {
        return from;
    }

    public int getTo() {
        return to;
    }

    @Override
    public String toString() {
        if (from == 0) {
            return "Вместимость автобуса до " + getTo() + " мест.";
        } else {
            return "Вместимость автобуса от " + getFrom() +
                    " до " + getTo() + " мест.";
        }
    }
}
