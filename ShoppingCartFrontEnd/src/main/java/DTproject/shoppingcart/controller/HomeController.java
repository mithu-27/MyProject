package DTproject.shoppingcart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import DTproject.shoppingcart.dao.CategoryDAO;
import DTproject.shoppingcart.domain.Category;

//convert this class into Servlet / Controller
@Controller
public class HomeController {
	
	
	@Autowired
	private CategoryDAO categoryDAO;
	
	@Autowired
	private Category category;
	
	
	
	//we have to define hadler mapping
	//Different types of mappings
	//@GetMapping - doGet
	//@PostMapping - doPost  - create
	//@PutMapping	-doPut   - update
	//@DeleteMapping - doDelete - delete
	
	
	//   http://localhost:8080/shoppingcart/
		@GetMapping("/")
	//@RequestMapping(value="/",   method = RequestMethod.GET)
	public ModelAndView homePage()
	{
			ModelAndView mv = new ModelAndView("home");
			
			//get all the categories categoryDAO.list()
		List<Category> categories=	categoryDAO.list();
		
		mv.addObject("categories", categories);
		
		return mv;
		
			
	}
		
	//http://localhost:8080/shoppingcart/login	
	@GetMapping("/login")	
	public ModelAndView login()
	{
		ModelAndView mv = new ModelAndView("home");
		//mv.addObject("loginMessage", "Thank for login");
		mv.addObject("isUserClickedLogin", true);
		return mv;

	}
	//http://localhost:8080/shoppingcart/register
		@GetMapping("/register")	
		
	public ModelAndView registration()
	{
			//if the user click register, this method will call
			//--discuss tomorrow.
			//Model,  ModelAndView
			//navigate to home page
		ModelAndView mv= new ModelAndView("home");	
		
		//carry the data
		//mv.addObject("msg", "Thank you for registration");
		mv.addObject("isUserClickedRegister", true);
			
		
		return mv;
	}
	
	
	
	@GetMapping("/logout")
	public ModelAndView logout()
	{
		ModelAndView mv = new ModelAndView("home");
		mv.addObject("msg", "You successfully logged out from the app");
		//we need to write some other code to 
		//do actual logout functionality.
		//will add later.
		
		return mv;
	}
}