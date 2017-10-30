package net.vig.shoppingbackend.dao;

import java.util.List;

import net.vig.shoppingbackend.dto.Category;
import net.vig.shoppingbackend.dto.Product;

public interface ProductDAO {

	Product get(int productId);

	List<Product> list();

	boolean add(Product product);

	boolean update(Product product);

	boolean delete(Product product);

	// Business Methods
	List<Product> listActiveProducts();

	List<Product> listActiveProductsByCategory(int categoryId);

	List<Product> getLatestActiveProducts(int count);

}
