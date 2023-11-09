package com.tp.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import webComponent.userList;

import java.sql.*;
import java.time.LocalDateTime;

@SpringBootApplication
public class Application {
	public static dbController.callBdd bdd = new dbController.callBdd();
	public static userList user = new userList();

	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);
		bdd.connection();
	}

}
