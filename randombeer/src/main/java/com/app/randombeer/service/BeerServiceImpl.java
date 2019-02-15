/**
 * 
 */
package com.app.randombeer.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.randombeer.dao.BeerDao;
import com.app.randombeer.model.Beer;

/**
 * @author 35389
 *
 */
@Service
public class BeerServiceImpl implements BeerService {
	@Autowired
	BeerDao beerDao;

	/**
	 * 
	 */
	public BeerServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Optional<Beer> getBeerbyID(Long id) {
		return beerDao.findById(id);
	}

	@Override
	public Long getCount() {
		return beerDao.count();
	}

}
