package com.skypro.homework_17.categorys;

/**
 * Категории прав (общие для всех).
 */

public abstract class Category {
    private final String category;

    public Category(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }
}
