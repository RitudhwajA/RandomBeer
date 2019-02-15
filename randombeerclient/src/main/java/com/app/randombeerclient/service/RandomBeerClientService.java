package com.app.randombeerclient.service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.app.randombeerclient.model.Beer;

@Service
public class RandomBeerClientService {

	@Autowired
	private RestTemplate restTemplate;
	private final String endPointUrl="http://localhost:8080/beers";
	
	
	public RandomBeerClientService() {
	}
	
	public Integer getTotalBeers(){
		return restTemplate.getForObject(endPointUrl+"/count", Integer.class);
	}
	
	public Beer getBeerById(int i) {
		return restTemplate.getForObject(endPointUrl+"/"+i, Beer.class);
	}

}
