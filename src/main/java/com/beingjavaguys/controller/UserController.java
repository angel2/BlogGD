package com.beingjavaguys.controller;

import com.beingjavaguys.domain.User;
import com.beingjavaguys.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class UserController {
	
	@Autowired
	UserService userService;

	@RequestMapping("formUser")
	public ModelAndView getForm(@ModelAttribute User user) {
		return new ModelAndView("addUser");
	}
	
	@RequestMapping("registerUser")
	public ModelAndView register(@ModelAttribute User user) {
		userService.insertRow(user);
        ModelAndView mm = new ModelAndView("redirect:showUser");
        mm.getModel().put("id", user.getId());
        return mm;
	}
	
	@RequestMapping("listUser")
	public ModelAndView getList() {
		List userList = userService.getList();
		return new ModelAndView("listUser","userList",userList);
	}
	
	@RequestMapping("deleteUser")
	public ModelAndView delete(@RequestParam int id) {
		userService.deleteRow(id);
		return new ModelAndView("redirect:listUser");
	}
	
	@RequestMapping("showUser")
	public ModelAndView edit(@RequestParam int id,@ModelAttribute User user) {
		User userObject = userService.getRowById(id);
		return new ModelAndView("profile","userObject",userObject);
	}
    @RequestMapping("editUser")
    public ModelAndView edit2(@RequestParam int id,@ModelAttribute User user) {
        User userObject = userService.getRowById(id);
        return new ModelAndView("editProfile","userObject",userObject);
    }
	
	@RequestMapping("updateUser")
	public ModelAndView update(@ModelAttribute User user) {
		userService.updateRow(user);
        ModelAndView mm = new ModelAndView("redirect:showUser");
        mm.getModel().put("id", user.getId());
		return mm;
	}

}