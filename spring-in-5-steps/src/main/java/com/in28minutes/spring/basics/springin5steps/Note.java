package com.in28minutes.spring.basics.springin5steps;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="note")
public class Note {
	private int id;
	private String name;
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
}
