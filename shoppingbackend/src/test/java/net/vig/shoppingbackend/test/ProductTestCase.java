package net.vig.shoppingbackend.test;

import static org.junit.Assert.*;

import java.util.logging.Logger;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import net.vig.shoppingbackend.dao.CategoryDAO;
import net.vig.shoppingbackend.dao.ProductDAO;
import net.vig.shoppingbackend.dto.Category;
import net.vig.shoppingbackend.dto.Product;

public class ProductTestCase {

	private static AnnotationConfigApplicationContext context;
	
	private static ProductDAO productDAO;
	
	
    private Product product;
    
    
	private final static Logger log = Logger.getLogger(CategoryTestCase.class.getName());

    @BeforeClass
    public static void init() {
    	context=new AnnotationConfigApplicationContext();
    	context.scan("net.vig.shoppingbackend");

    	context.refresh();

    	productDAO=(ProductDAO)context.getBean("productDAO");
    	
    }
    
   /* @Test
    public void testAddCategory() {
    	
    	category=new Category();
    	category.setName("Cricket");
    	category.setDescription("This is description for Cricket");
    	category.setImageURL("CAT_1.png");
    	
    	assertEquals("Successfully added a category inside the table!",true,categoryDAO.add(category));
    	
    }*/

    @Test
    public void testGetProduct() {
    	
    	product=productDAO.get(1);
    	
    	assertEquals("Successfully fetch  a  single category from the table!","iPhone 5s",product.getName());
    	
    }
    
   
    
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
