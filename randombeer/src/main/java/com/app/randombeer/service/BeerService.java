/**
 * 
 */
package com.app.randombeer.service;

import java.util.Optional;

import com.app.randombeer.model.Beer;

/**
 * @author 35389
 *
 */
public interface BeerService {

	Long getCount();

	Optional<Beer> getBeerbyID(Long id);

}
