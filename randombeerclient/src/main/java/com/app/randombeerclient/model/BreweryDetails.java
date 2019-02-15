/**
 * 
 */
package com.app.randombeerclient.model;

/**
 * @author 35389
 *
 */
public class BreweryDetails {
	private Long addressId;
	private String name;
	private String city;
	private String country;

	/**
	 * 
	 */
	public BreweryDetails() {
	}

	/**
	 * @param address_id
	 * @param name
	 * @param city
	 * @param country
	 */
	public BreweryDetails(String name, String city, String country) {
		this.name = name;
		this.city = city;
		this.country = country;
	}

	/**
	 * @return the id
	 */
	public Long getAddressId() {
		return addressId;
	}

	/**
	 * @param id the id to set
	 */
	public void setAddressId(Long id) {
		this.addressId = id;
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
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the state to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "BreweryDetails [id=" + addressId + ", name=" + name + ", city=" + city + ", country=" + country + "]";
	}

}
