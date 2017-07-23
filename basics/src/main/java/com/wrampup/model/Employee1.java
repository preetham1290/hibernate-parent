package com.wrampup.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "Employee", uniqueConstraints = { @UniqueConstraint(columnNames = { "ID" }) })
public class Employee1 {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", nullable = false, unique = true, length = 11)
	private int id;

	@Column(name = "NAME", length = 20, nullable = true)
	private String name;

	@Column(name = "ROLE", length = 20, nullable = true)
	private String role;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee1 [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", role=");
		builder.append(role);
		builder.append("]");
		return builder.toString();
	}
}