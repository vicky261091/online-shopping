package net.vig.shoppingbackend.test;

import static org.junit.Assert.assertEquals;

import java.util.logging.Logger;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import net.vig.shoppingbackend.dao.CategoryDAO;
import net.vig.shoppingbackend.dto.Category;

public class CategoryTestCase {
    

	private static AnnotationConfigApplicationContext context;
	
	private static CategoryDAO categoryDAO;
	
	
    private Category category;
    
    
	private final static Logger log = Logger.getLogger(CategoryTestCase.class.getName());


   /* @Test
    public void testAddCategory() {
    	
    	category=new Category();
    	category.setName("Cricket");
    	category.setDescription("This is description for Cricket");
    	category.setImageURL("CAT_1.png");
    	
    	assertEquals("Successfully added a category inside the table!",true,categoryDAO.add(category));
    	
    }*/
/*
    @Test
    public void testGetCategory() {
    	
    	category=categoryDAO.get(1);
    	
    	assertEquals("Successfully fetch  a  single category from the table!","Cricket",category.getName());
    	
    }
    
    */
    
    /*@Test
    public void testUpdateCategory() {
    	category=categoryDAO.get(1);
    	category.setName("Main Dish");
    	category.setDescription("This is description for Main Dish");
    	category.setImageURL("CAT_1.png");
    	
    	
    	
    	assertEquals("Successfully fetch  a  single category from the table!","true",categoryDAO.update(category));
    	
    }*/
    /*
    @Test
    public void testListCategory() {
    	category=categoryDAO.get(1);
    	category.setName("Main Dish");
    	category.setDescription("This is description for Main Dish");
    	category.setImageURL("CAT_1.png");
    	assertEquals("Successfully fetch  the list of categories from the table!",2,categoryDAO.list().size());
    	
    }*/
}
