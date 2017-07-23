package com.wrampup.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
@Table(name = "employee_one")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "emp_id")
	private long id;
	@Column(name = "name")
	private String name;
	@Column(name = "designation")
	private String designation;

	@OneToOne
	@Cascade(value = CascadeType.ALL)
	@JoinColumn(name = "addr_id")
	private Address address;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", designation=");
		builder.append(designation);
		builder.append(", address=");
		builder.append(address);
		builder.append("]");
		return builder.toString();
	}
}
