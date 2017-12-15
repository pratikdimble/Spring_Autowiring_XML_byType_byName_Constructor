package com.app.beans;

import java.util.List;

public class Employee_cnstr {

	private int id;
	private String name;
	private Address addr;
	
	public Employee_cnstr(int id, String name, Address addr) {
		super();
		this.id = id;
		this.name = name;
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "Employee_cnstr [id=" + id + ", name=" + name + ", addr=" + addr +  "]";
	}

	
	
	
	
	
}
