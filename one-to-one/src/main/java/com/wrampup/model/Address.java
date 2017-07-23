package com.wrampup.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "address")
public class Address {

	@Column(name = "address")
	private String address;

	@Id
	@Column(name = "addr_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@OneToOne(mappedBy="address")
	private Employee employee;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Address [address=");
		builder.append(address);
		builder.append(", id=");
		builder.append(id);
		builder.append(", employee=");
		builder.append(employee);
		builder.append("]");
		return builder.toString();
	}
}
