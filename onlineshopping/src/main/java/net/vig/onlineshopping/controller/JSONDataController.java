package net.vig.onlineshopping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import net.vig.shoppingbackend.dao.ProductDAO;
import net.vig.shoppingbackend.dto.Product;

@RestController
@RequestMapping("/json/data")
public class JSONDataController {

	@Autowired
	private ProductDAO productDAO;

	@RequestMapping("/all/products")
	@ResponseBody
	public List<Product> getAllProducts() {

		return productDAO.listActiveProducts();
	}

	@RequestMapping("/category/{id}/products")
	@ResponseBody
	public List<Product> getProductsById(@PathVariable int id) {

		return productDAO.listActiveProductsByCategory(id);
	}

}
