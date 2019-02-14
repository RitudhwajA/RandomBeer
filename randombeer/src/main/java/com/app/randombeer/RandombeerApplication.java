package com.app.randombeer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.app.randombeer.dao.BeerDao;
import com.app.randombeer.model.Beer;
import com.app.randombeer.model.BreweryDetails;

@SpringBootApplication
public class RandombeerApplication {

	private static final Logger log = LoggerFactory.getLogger(RandombeerApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(RandombeerApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(BeerDao beerDao) {
		return (args) -> {
			// save a couple of customers
			beerDao.save(
					new Beer("beer1", "beer1 type", new BreweryDetails("dhwaj's beer", "dublin", "dublin", "Ireland")));
			beerDao.save(new Beer("beer2", "beer2 type",
					new BreweryDetails("dhwaj's second beer", "dublin", "dublin", "Ireland")));
			beerDao.save(new Beer("beer3", "beer3 type",
					new BreweryDetails("dhwaj's third beer", "dublin", "dublin", "Ireland")));
			beerDao.save(new Beer("beer4", "beer4 type",
					new BreweryDetails("dhwaj's fourth beer", "dublin", "dublin", "Ireland")));
			// fetch all customers

			for (Beer beer : beerDao.findAll()) {
				log.info(beer.toString());
			}
			log.info("");

			// fetch an individual customer by ID
			beerDao.findById(1L).ifPresent(beer -> {
				log.info(beer.toString());
			});

		};

	}
}
