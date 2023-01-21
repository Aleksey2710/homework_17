package com.skypro.homework_17.types;

/**
 * Грузоподъемность.
 */

public enum LoadCapacity {
    N1(0.0f, 3.5f),
    N2(3.5f, 12.0f),
    N3(12.0f, 0.0f);

    private final float to;
    private final float from;

    LoadCapacity(float from, float to) {
        this.to = to;
        this.from = from;
    }

    public float getTo() {
        return to;
    }

    public float getFrom() {
        return from;
    }

    @Override
    public String toString() {
        if (from == 0) {
            return "Грузоподъемность грузовика до " + getTo() + " тонн.";
        } else if (to == 0) {
            return "Грузоподъемность грузовика от " + getFrom() + " тонн.";
        } else {
            return "Грузоподъемность грузовика от " + getFrom() +
                    " до " + getTo() + " тонн.";
        }
    }
}
