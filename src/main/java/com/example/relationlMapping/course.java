package com.example.relationlMapping;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;



import javax.persistence.JoinColumn;



@Entity
public class course {
	  private Integer id;
	  private String name;
	  
	



		public course() {
			super();
			// TODO Auto-generated constructor stub
		}
	  
	public course(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	
	}
	

	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	

}
