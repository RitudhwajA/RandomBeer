/**
 * 
 */
package com.app.randombeer.service;

import java.util.List;
import java.util.Optional;

import com.app.randombeer.model.Beer;

/**
 * @author 35389
 *
 */
public interface BeerService {
	
	List<Beer> getAllBeers();
	
	Optional<Beer> getBeerbyID(Long id);

}
