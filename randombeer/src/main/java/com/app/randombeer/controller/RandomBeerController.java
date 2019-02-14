package com.app.randombeer.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.app.randombeer.model.Beer;
import com.app.randombeer.service.BeerService;

@RestController
public class RandomBeerController {
	
	@Autowired
	BeerService beerService;

	public RandomBeerController() {
		// TODO Auto-generated constructor stub
	}

	@GetMapping("/beers/{id}")
	public ResponseEntity<Beer> getBeerById(@PathVariable("id") Long id) {
		Optional<Beer> beer = beerService.getBeerbyID(id);
		if (!beer.isPresent())
			return ResponseEntity.notFound().build();
		return new ResponseEntity<Beer>(beer.get(),HttpStatus.OK);
	}
	

	@GetMapping("/beers")
	public ResponseEntity<List<Beer>> getAllBeers(){
		return new ResponseEntity<List<Beer>>(beerService.getAllBeers(),HttpStatus.OK);
	}
}
