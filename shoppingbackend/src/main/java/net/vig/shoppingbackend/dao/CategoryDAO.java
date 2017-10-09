package net.vig.shoppingbackend.dao;

import java.util.List;

import net.vig.shoppingbackend.dto.Category;

public interface CategoryDAO {
	
	List<Category> list();
	Category getId(int id);

}
