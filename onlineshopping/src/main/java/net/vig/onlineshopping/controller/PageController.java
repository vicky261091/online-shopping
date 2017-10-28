package net.vig.onlineshopping.controller;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import net.vig.shoppingbackend.dao.CategoryDAO;
import net.vig.shoppingbackend.dto.Category;

@Controller
public class PageController {
	private final static Logger log = Logger.getLogger(PageController.class.getName());

	@Autowired
	private CategoryDAO categoryDAO;

	@RequestMapping(value = { "/", "/home", "/index" })
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title","Home");

		//passing the list of categories
      mv.addObject("categories",categoryDAO.list());
	
		mv.addObject("userClickHome",true);
		return mv;
	}
	@RequestMapping(value = { "/about" })
	public ModelAndView about() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title","About Us");
		mv.addObject("userClickAbout",true);
		return mv;
	}
	@RequestMapping(value = { "/contact" })
	public ModelAndView contact() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title","Contact");
		mv.addObject("userClickContact",true);
		return mv;
	}
	
	@RequestMapping(value = { "/show/category/{id}/Menu"})
	public ModelAndView showCategoryMenu(@PathVariable("id") int id) {
		ModelAndView mv = new ModelAndView("page");
		Category category=null;
		category=categoryDAO.get(id);
		mv.addObject("title",category.getName());

		mv.addObject("category",category);
	      mv.addObject("categories",categoryDAO.list());

		mv.addObject("userClickCategoryMenu",true);
		return mv;
	}
	@RequestMapping(value = {"/show/all/Menu"})
	public ModelAndView showAllMenu() {
		ModelAndView mv = new ModelAndView("page");


		mv.addObject("title","Menu");
		
	      mv.addObject("categories",categoryDAO.list());

		
		mv.addObject("userClickAllmenu",true);
		return mv;
	}
	
}
