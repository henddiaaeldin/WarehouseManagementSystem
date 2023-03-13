package com.developer.warehousemanagement;

import jakarta.persistence.PersistenceContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

@SpringBootApplication
public class WarehouseManagementApplication {

	public static void main(String[] args) throws SQLException {

		SpringApplication.run(WarehouseManagementApplication.class, args);



	}

}
