package com.devsuperior.bds01.dto;

import java.io.Serializable;

import com.devsuperior.bds01.entities.Department;

public class DepartmentDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	public long id;
	public String name;
	
	public DepartmentDTO() {
		
	}

	public DepartmentDTO(long id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public DepartmentDTO(Department entity) {
		id = entity.getId();
		name = entity.getName();
	}

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
	
	
}
