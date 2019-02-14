/**
 * 
 */
package com.app.randombeer.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.randombeer.model.Beer;

/**
 * @author 35389
 *
 */
public interface BeerDao extends JpaRepository<Beer, Long> {

}
