package com.ecommerce.microcommerce;

import com.ecommerce.microcommerce.models.Product;
import com.ecommerce.microcommerce.web.controllers.ProductController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class MicrocommerceApplicationTests {
	@Autowired
	private ProductController produitController;

	@Test
	void contextLoads() {
	}

	@Test
	public void testGetProduct() {
		int id = 3;
		Product produit = produitController.afficherUnProduit(id);

		String name = "Table de Ping Pong";
		assertEquals(name, produit.getNom());
	}

}
