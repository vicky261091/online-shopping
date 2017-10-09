package net.vig.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import net.vig.shoppingbackend.dao.CategoryDAO;
import net.vig.shoppingbackend.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {
	

private static 	List<Category> categories=new ArrayList<>();

static {
	Category category=new Category();
	category.setId(1);
	category.setName("Cricket");
	category.setDescription("This is description for Cricket");
	category.setImageURL("CAT_1.png");
	categories.add(category);
	
	

	category=new Category();
	category.setId(2);
	category.setName("Basketball");
	category.setDescription("This is description for Basketball");
	category.setImageURL("CAT_2.png");
	categories.add(category);
	
	

	 category=new Category();
	category.setId(3);
	category.setName("Football");
	category.setDescription("This is description for Football");
	category.setImageURL("CAT_3.png");
	categories.add(category);


	 category=new Category();
	category.setId(4);
	category.setName("Tennis");
	category.setDescription("This is description for Tennis");
	category.setImageURL("CAT_3.png");
	categories.add(category);

}
	@Override
	public List<Category> list() {

		// TODO Auto-generated method stub
		
		return categories;
	}
	@Override
	public Category getId(int id) {
		// TODO Auto-generated method stub
		for(Category category: categories){
		if(category.getId()==id) {
			return category;
		}
		}
		return null;
	}

}
