package com.wrampup.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the regions database table.
 * 
 */
@Entity
@Table(name = "regions")
@NamedQuery(name = "Region.findAll", query = "SELECT r FROM Region r")
public class Region implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "REGION_ID")
	private long regionId;

	@Column(name = "REGION_NAME")
	private String regionName;

	public Region() {
	}

	public long getRegionId() {
		return this.regionId;
	}

	public void setRegionId(long regionId) {
		this.regionId = regionId;
	}

	public String getRegionName() {
		return this.regionName;
	}

	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Region [regionId=");
		builder.append(regionId);
		builder.append(", regionName=");
		builder.append(regionName);
		builder.append("]");
		return builder.toString();
	}

}