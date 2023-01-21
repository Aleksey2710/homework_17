package com.skypro.homework_17.types;

/**
 * Тип кузова.
 */

public enum BodyType {
    SEDAN("седан"),
    HATCHBACK("хэтчбек"),
    COUPE("купе"),
    UNIVERSAL("универсал"),
    SUV("внедорожник"),
    CROSSOVER("кроссовер"),
    PICKUP("пикап"),
    VAN("фургон"),
    MINIVAN("минивен");

    private final String translationBodyType;

    BodyType(String translationBodyType) {
        this.translationBodyType = translationBodyType;
    }

    public String getTranslationBodyType() {
        return translationBodyType;
    }

    @Override
    public String toString() {
        return "Тип кузова: " + translationBodyType;
    }
}

