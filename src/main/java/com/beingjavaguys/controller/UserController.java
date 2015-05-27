package com.beingjavaguys.controller;

import com.beingjavaguys.domain.User;
import com.beingjavaguys.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class UserController {
    
    @Autowired
    UserService userService;

        @RequestMapping("admin/formUser")
    public ModelAndView getForm(@ModelAttribute User user) {
        return new ModelAndView("addUser");
    }

    @RequestMapping("loginUser")
    public ModelAndView getLogin() {
        return new ModelAndView("login");
    }

    @RequestMapping("logout")
    public ModelAndView logout(HttpSession session) {
        session.invalidate();
        return new ModelAndView("login");
    }
    @RequestMapping("login")
    public ModelAndView pastLogin
            (@RequestParam String email,
             @RequestParam String pass,
             HttpSession session) {
        List<User> userList = userService.getList();
        User user = userList.remove(0);
        if (  user != null ) {
            session.setAttribute("idUser" , user.getId());
            session.setAttribute("role" , user.getRole());
            ModelAndView mm = new ModelAndView("redirect:collaborator/showUser");
            mm.getModel().put("id", user.getId());
            return mm;

        }
        return new ModelAndView("login");
    }
    
    @RequestMapping("admin/registerUser")
    public ModelAndView register(@ModelAttribute User user) {
        userService.insertRow(user);
        ModelAndView mm = new ModelAndView("redirect:showUser");
        mm.getModel().put("id", user.getId());
        return mm;
    }
    
    @RequestMapping("collaborator/showUser")
    public ModelAndView edit(@RequestParam int id,@ModelAttribute User user) {
        User userObject = userService.getRowById(id);
        return new ModelAndView("profile","userObject",userObject);
    }
    @RequestMapping("collaborator/editUser")
    public ModelAndView edit2(@RequestParam int id,@ModelAttribute User user) {
        User userObject = userService.getRowById(id);
        return new ModelAndView("editProfile","userObject",userObject);
    }
    
    @RequestMapping("collaborator/updateUser")
    public ModelAndView update(@ModelAttribute User user) {
        userService.updateRow(user);
        ModelAndView mm = new ModelAndView("redirect:showUser");
        mm.getModel().put("id", user.getId());
        return mm;
    }

}