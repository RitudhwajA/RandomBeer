package com.app.randombeerclient.controller;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.app.randombeerclient.service.RandomBeerClientService;

@Controller
public class RandomBeerClientController {

	@Autowired
	RandomBeerClientService service;

	public RandomBeerClientController() {
		// TODO Auto-generated constructor stub
	}

	@RequestMapping(value = "/beers", method = RequestMethod.GET)
	public String getRandomBeer(Model model) {
		int length = service.getTotalBeers();
		model.addAttribute("beer", service.getBeerById(new Random().nextInt(length) + 1));
		return "RandomBeer";
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index() {
		return "RandomBeer";
	}

}
