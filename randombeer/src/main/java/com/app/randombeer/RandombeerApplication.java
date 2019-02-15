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
			// save few Beers
			beerDao.save(new Beer("Red Biddy / Real Biddy", "", "4.9",
					new BreweryDetails("Biddy Early Brewery", "Ennis", "Ireland")));
			beerDao.save(
					new Beer("1798 Revolution", "", "0", new BreweryDetails("Dublin Brewing", "dublin", "Ireland")));
			beerDao.save(new Beer("St Patrick's Ale",
					"A deep copper coloured traditional Irish Ale with highly developed and complex flavours.", "6",
					new BreweryDetails("Strangford Lough Brewing Company Ltd", "Killyleagh", "Ireland")));
			beerDao.save(new Beer("Genuine Irish Stout", "", "4.1",
					new BreweryDetails("Beamish & Crawford", "Cork", "Ireland")));
			beerDao.save(new Beer("Legbiter Ale",
					"Brilliant golden ale with an inviting citrus fragrance of late added Cascade and Glacier hops.",
					"4.7", new BreweryDetails("Strangford Lough Brewing Company Ltd", "Killyleagh", "Ireland")));
			beerDao.save(new Beer("O'Hara's Celtic Stout",
					"Unlike the image, does not have the creamy head like many Irish stouts (Beamish, Guinness, Murphys) and as a result lighter on the stomach and nice with a meal.",
					"4.3", new BreweryDetails("Carlow Brewing Company", "Carlow", "Ireland")));
			beerDao.save(new Beer("Guinness Draught", "", "4.3",
					new BreweryDetails("Arthur Guinness & Son", "dublin", "Ireland")));
			beerDao.save(new Beer("Guinness Extra Stout",
					"GUINNESS® Extra Stout is steeped in heritage - a whole costume drama in a bottle. It", "5",
					new BreweryDetails("Arthur Guinness & Son", "dublin", "Ireland")));
			beerDao.save(new Beer("Harp Lager",
					"This rich, golden pilsner style lager, with a smooth, refreshing hoppy taste, is brewed the irish way, using only the finest barley and pure spring water from the Cooley Mountains of Dundalk, Ireland.",
					"5", new BreweryDetails("Arthur Guinness & Son", "dublin", "Ireland")));
			beerDao.save(new Beer("Smithwick's", "", "4.5",
					new BreweryDetails("St. Francis Abbey Brewery", "Kilkenny", "Ireland")));
			beerDao.save(new Beer("Guinness Draught", "Adored since 1959, it", "4.3",
					new BreweryDetails("Arthur Guinness & Son", "dublin", "Ireland")));
			beerDao.save(new Beer("Guinness 250th Anniversary Stout",
					"This premium recipe provides a refreshing taste, which underlies the complex flavor of stout.",
					"5", new BreweryDetails("Arthur Guinness & Son", "dublin", "Ireland")));
			beerDao.save(new Beer("St. Patrick's Best",
					"Light amber in colour, this smooth beer has hints of caramel with a woody bitterness.", "4.2",
					new BreweryDetails("Strangford Lough Brewing Company Ltd", "Killyleagh", "Ireland")));
			beerDao.save(new Beer("St. Patrick's Gold",
					"Golden in colour, St. Patrick's Gold is brewed with barley and wheat malt. Citrus peel and coriander are added to the Goldings and Saaz hops for a symphony of authentic flavour.",
					"4.8", new BreweryDetails("Strangford Lough Brewing Company Ltd", "Killyleagh", "Ireland")));
			beerDao.save(new Beer("Foreign Extra Stout",
					"Foreign Extra Stout is brewed with generous hops and roasted barley for a bittersweet balance & full-flavored, natural bite.",
					"7.5", new BreweryDetails("Arthur Guinness & Son", "dublin", "Ireland")));
			beerDao.save(new Beer("Barelegs Brew",
					"Golden with a hint of red (towards sunset). Barelegs tastes of fresh fruit, especially red current and malt fragrance.",
					"4.5", new BreweryDetails("Strangford Lough Brewing Company Ltd", "Killyleagh", "Ireland")));
			// fetch all Beers

			for (Beer beer : beerDao.findAll()) {
				log.info(beer.toString());
			}
			log.info("");

			// fetch an beer by ID
			beerDao.findById(1L).ifPresent(beer -> {
				log.info(beer.toString());
			});

		};

	}
}
