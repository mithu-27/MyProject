package DTproject.shoppingcart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SupplierController {
	@Autowired
	private UserDAO userDAO;
	@Autowired
	private User user;
	@PostMapping("/supplier/save")
	public ModelAndView saveSupplier(@RequestParam String emailID,
			@RequestParam String name,
			@RequestParam String password,
			@RequestParam String confirm_password,
			@RequestParam String mobile,
			@RequestParam String address)
	{
		ModelAndView mv= new ModelAndView("redirect:"/"manage_suppliers")
         user.setEmailID()
	}

}
