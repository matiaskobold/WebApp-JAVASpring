package user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

//Controller

@Controller
public class UserController {

	@Autowired
	private UserService service;

	@RequestMapping("/")
	public ModelAndView home() {
		List<User> listUser = service.listAll();
		ModelAndView mav = new ModelAndView("index");
		mav.addObject("listUser", listUser);
		return mav;
	}
}
