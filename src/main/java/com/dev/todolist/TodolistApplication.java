package com.dev.todolist;

import lombok.extern.java.Log;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@SpringBootApplication
@Log
public class TodolistApplication implements CommandLineRunner {

	private final DataSource dataSource;

	public TodolistApplication(final DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public static void main(String[] args) {
		SpringApplication.run(TodolistApplication.class, args);
	}

	@Override
	public void run(final String... args) {
		final JdbcTemplate restTemplate = new JdbcTemplate(dataSource);
		restTemplate.execute("select 1");
	}

}