package org.watch;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.watch.service.PurchaseService;

@SpringBootApplication
public class WatchMeApplication implements CommandLineRunner{
	@Autowired
	PurchaseService purchaseService;
	public static void main(String[] args) {
		SpringApplication.run(WatchMeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		//purchaseService.addBuyer("omar", "0236546455", "houimelomar@gmail.com");
		//purchaseService.addProduct("Catch me if you can");
		//purchaseService.addProduct("Wtach you");
		//purchaseService.addProduct("Take me to heaven");
		//purchaseService.addProduct("Predestination");
		//purchaseService.addProduct("HIMYM");
		//purchaseService.addProduct("Friends");
		//purchaseService.buyProduct((long)1, (long)2);
		
		//purchaseService.getAllProductByBuyer((long)1).forEach(p->{
			//System.out.println(p.getName());
			
	//	});
		
		
	}

}

