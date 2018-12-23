package org.watch.entites;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


@Entity
public class Buyer implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue
	private Long id;
	private String full_name;
	private String card_number;
	private String email;
	@ManyToMany(fetch=FetchType.EAGER)
	private List<Product>list_product;
	

	public List<Product> getList_product() {
		return list_product;
	}
	public void setList_product(List<Product> list_product) {
		this.list_product = list_product;
	}
	public Buyer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Buyer(String full_name, String card_number, String email) {
		super();
		this.full_name = full_name;
		this.card_number = card_number;
		this.email = email;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFull_name() {
		return full_name;
	}
	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}
	public String getCard_number() {
		return card_number;
	}
	public void setCard_number(String card_number) {
		this.card_number = card_number;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	

}
