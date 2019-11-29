package com.fluex404.springjpaspecification;

import com.fluex404.springjpaspecification.dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJpaSpecificationApplication{

	private @Autowired StudentDao studentDao;

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaSpecificationApplication.class, args);
	}
}
