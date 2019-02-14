package com.app.randombeer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.app.randombeer.dao.BeerDao;
import com.app.randombeer.model.Beer;

@SpringBootApplication
public class RandombeerApplication {

	private static final Logger log = LoggerFactory.getLogger(RandombeerApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(RandombeerApplication.class, args);
	}

}

