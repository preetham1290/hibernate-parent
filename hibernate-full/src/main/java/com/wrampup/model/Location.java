package com.wrampup.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the locations database table.
 * 
 */
@Entity
@Table(name = "locations")
@NamedQuery(name = "Location.findAll", query = "SELECT l FROM Location l")
public class Location implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "LOCATION_ID")
	private long locationId;

	@Column(name = "CITY")
	private String city;

	@Column(name = "COUNTRY_ID")
	private String countryId;

	@Column(name = "POSTAL_CODE")
	private String postalCode;

	@Column(name = "STATE_PROVINCE")
	private String stateProvince;

	@Column(name = "STREET_ADDRESS")
	private String streetAddress;

	public Location() {
	}

	public long getLocationId() {
		return this.locationId;
	}

	public void setLocationId(long locationId) {
		this.locationId = locationId;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountryId() {
		return this.countryId;
	}

	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}

	public String getPostalCode() {
		return this.postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getStateProvince() {
		return this.stateProvince;
	}

	public void setStateProvince(String stateProvince) {
		this.stateProvince = stateProvince;
	}

	public String getStreetAddress() {
		return this.streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Location [locationId=");
		builder.append(locationId);
		builder.append(", city=");
		builder.append(city);
		builder.append(", countryId=");
		builder.append(countryId);
		builder.append(", postalCode=");
		builder.append(postalCode);
		builder.append(", stateProvince=");
		builder.append(stateProvince);
		builder.append(", streetAddress=");
		builder.append(streetAddress);
		builder.append("]");
		return builder.toString();
	}

}