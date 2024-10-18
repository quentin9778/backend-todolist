package com.dev.todolist.repositories;

import com.dev.todolist.TestDataUtil;
import com.dev.todolist.domain.entities.CategoryEntity;
import com.dev.todolist.domain.entities.TaskEntity;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@ExtendWith(SpringExtension.class)
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)

public class TaskRepositoryImplIntegrationTests {
    private TaskRepository underTest;
    private CategoryRepository categoryTest;
    @Autowired
    public TaskRepositoryImplIntegrationTests(TaskRepository underTest, CategoryRepository categoryTest){
        this.underTest=underTest;
        this.categoryTest=categoryTest;

    }
}
