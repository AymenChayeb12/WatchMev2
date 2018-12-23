package org.watch.service;


import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;
import org.watch.entites.Buyer;
import org.watch.entites.Product;
import org.watch.entites.Purchase;
@Transactional
@Service
public class PurchaseService {
	@PersistenceContext
	private EntityManager em;
	
	public void buyProduct(Long id_buyer,Long id_product) {
		Buyer b = getBuyerByID(id_buyer);
		Product p = getProductByID(id_product);
		if(b!=null&&p!=null) {
			
		Purchase purchase = new Purchase();
		
		
		List<Product> list = b.getList_product();
		list.add(p);
		purchase.setBuyer(b);
		purchase.setDate(new Date());
		em.persist(purchase);
		
		
		}
		else throw new IllegalArgumentException("there is no such product");
		
	}
	public void addBuyer(String name,String creditCard,String email) {
		Buyer b = new Buyer(name, creditCard, email);
		em.persist(b);
	}
	public Buyer getBuyerByID (Long id) {
		return em.find(Buyer.class, id);
	}
	
	public void addProduct(String name) {
		Product p = new Product(name);
		em.persist(p);
	}
	public Product getProductByID (Long id) {
		return em.find(Product.class, id);
	}
	public List<Product> getAllProductByBuyer(Long id) {
		Buyer b = em.find(Buyer.class, id);
		return b.getList_product(); 
		
	}
	

}
