package org.watch.restService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.watch.entites.Buyer;
import org.watch.entites.Product;
import org.watch.service.PurchaseService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class PurchaseRestService {
	@Autowired
	PurchaseService purchaseService;
	
	@RequestMapping(value = "/buyer/{id}",method=RequestMethod.GET)
	public Buyer getBuyerByID(@PathVariable Long id){
		return purchaseService.getBuyerByID(id);
	}
	@RequestMapping(value = "/buyProduct/{id_buyer}/{id_product}",method=RequestMethod.GET)
	public String buyProduct(@PathVariable Long id_buyer,@PathVariable Long id_product){
		
		try {
			purchaseService.buyProduct(id_buyer, id_product);
			return("succeded");
			
		} catch (Exception e) {
			// TODO: handle exception
			return e.toString();
		}
	}
	@RequestMapping(value = "/productBought/{id}",method=RequestMethod.GET)
	public List<Product> getProductByBuyer(@PathVariable Long id){
		return purchaseService.getAllProductByBuyer(id);
	}

}
