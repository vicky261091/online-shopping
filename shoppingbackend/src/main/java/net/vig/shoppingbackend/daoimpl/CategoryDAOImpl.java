package net.vig.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import net.vig.shoppingbackend.dao.CategoryDAO;
import net.vig.shoppingbackend.dto.Category;

@Repository("categoryDAO")
@Transactional
public class CategoryDAOImpl implements CategoryDAO {
	
@Autowired
private SessionFactory sessionFactory;

private static 	List<Category> categories=new ArrayList<>();

static {
	Category category=new Category();
	category.setName("Cricket");
	category.setDescription("This is description for Cricket");
	category.setImageURL("CAT_1.png");
	categories.add(category);
	
	

	category=new Category();
	category.setName("Basketball");
	category.setDescription("This is description for Basketball");
	category.setImageURL("CAT_2.png");
	categories.add(category);
	
	

	 category=new Category();
	category.setName("Football");
	category.setDescription("This is description for Football");
	category.setImageURL("CAT_3.png");
	categories.add(category);


	 category=new Category();
	category.setName("Tennis");
	category.setDescription("This is description for Tennis");
	category.setImageURL("CAT_3.png");
	categories.add(category);

}
	@Override
	public List<Category> list() {

		// TODO Auto-generated method stub
		
		String selecctActiveCategory="From Category where active= :active";
		
		Query query=sessionFactory.getCurrentSession().createQuery(selecctActiveCategory);
		query.setParameter("active", true);
		
		return query.getResultList();
	}
	
	//for getting single category
	@Override
	public Category get(int id) {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().get(Category.class,Integer.valueOf(id));


	}
	@Override
	public boolean add(Category category) {
		try {
			sessionFactory.getCurrentSession().persist(category);
			return true;

		}catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}

	}
	@Override
	public boolean update(Category category) {
		// TODO Auto-generated method stub
		try {
			sessionFactory.getCurrentSession().update(category);
			return true;

		}catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}

	}
	@Override
	public boolean delete(Category category) {
		// TODO Auto-generated method stub
		category.setActive(false);
		try {
			sessionFactory.getCurrentSession().update(category);
			return true;

		}catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}

	}

}
