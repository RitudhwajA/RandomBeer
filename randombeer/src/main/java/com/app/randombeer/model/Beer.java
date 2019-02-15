/**
 * 
 */
package com.app.randombeer.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * @author 35389
 *
 */
@Entity(name = "Beer")
public class Beer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String description;
	private String alcoholPercentage;
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER, targetEntity = BreweryDetails.class)
	@JoinColumn(name = "addressId")
	private BreweryDetails address;

	/**
	 * 
	 */
	public Beer() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param name
	 * @param description
	 * @param alcoholPercentage
	 * @param address
	 */
	public Beer(String name, String description, String alcoholPercentage, BreweryDetails address) {
		this.name = name;
		this.description = description;
		this.alcoholPercentage = alcoholPercentage;
		this.address = address;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the alcoholPercentage
	 */
	public String getAlcoholPercentage() {
		return alcoholPercentage;
	}

	/**
	 * @param alcoholPercentage the alcoholPercentage to set
	 */
	public void setAlcoholPercentage(String alcoholPercentage) {
		this.alcoholPercentage = alcoholPercentage;
	}

	/**
	 * @return the address
	 */
	public BreweryDetails getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(BreweryDetails address) {
		this.address = address;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Beer [id=" + id + ", name=" + name + ", description=" + description + ", alcoholPercentage="
				+ alcoholPercentage + ", address=" + address + "]";
	}

}
