package org.watch.entites;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Product implements Serializable{
	private static final long serialVersionUID = 3L;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Id @GeneratedValue	
	private Long id;
	private String name;
	public Product(String name) {
		super();
		this.name = name;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
