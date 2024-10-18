package com.dev.todolist;

import com.dev.todolist.domain.entities.CategoryEntity;
import com.dev.todolist.domain.entities.TaskEntity;

public final class TestDataUtil {
    private TestDataUtil() {
    }

    public static TaskEntity createTestTaskA(final CategoryEntity category) {
        return TaskEntity.builder()
                .name("Searching Job")
                .tag("important")
                .status("")
                .category(category)
                .build();
    }

    public static TaskEntity createTestTaskB(final CategoryEntity category) {
        return TaskEntity.builder()
                .name("Course")
                .tag("medium")
                .status("")
                .category(category)
                .build();
    }

    public static TaskEntity createTestTaskC(final CategoryEntity category) {
        return TaskEntity.builder()
                .name("Gym")
                .tag("medium")
                .status("")
                .category(category)
                .build();
    }

    public static CategoryEntity createTestCategoryA() {
        return CategoryEntity.builder()
                .name("Work")
                .build();
    }

    public static CategoryEntity createTestCategoryB() {
        return CategoryEntity.builder()
                .name("Health")
                .build();
    }

}