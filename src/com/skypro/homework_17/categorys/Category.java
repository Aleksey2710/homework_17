package com.skypro.homework_17.categorys;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Category category1 = (Category) o;
        return Objects.equals(category, category1.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(category);
    }

    @Override
    public String toString() {
        return category;
    }
}
