package com.biss.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class IncrementTab {
	
	@Id
	private Integer id;
	private Integer counter;
	
	public IncrementTab() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCounter() {
		return counter;
	}

	public void setCounter(Integer counter) {
		this.counter = counter;
	}

	@Override
	public String toString() {
		return "IncrementTab [id=" + id + ", counter=" + counter + "]";
	}
	
}
