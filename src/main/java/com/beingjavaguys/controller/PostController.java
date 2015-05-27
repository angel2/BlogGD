package com.beingjavaguys.controller;

import com.beingjavaguys.domain.Post;
import com.beingjavaguys.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class PostController {
	
	@Autowired
	PostService postService;

	@RequestMapping("formPost")
	public ModelAndView getForm(@ModelAttribute Post post) {
		return new ModelAndView("addPost");
	}
	
	@RequestMapping("newPost")
	public ModelAndView register(@ModelAttribute Post post) {
		postService.insertRow(post);
        ModelAndView mm = new ModelAndView("redirect:formPost");
        mm.getModel().put("id", post.getId());
        return mm;
	}
	
	@RequestMapping("listPost")
	public ModelAndView getList() {
		List postList = postService.getList();
		return new ModelAndView("index","postList",postList);
	}
	
	@RequestMapping("deletePost")
	public ModelAndView delete(@RequestParam int id) {
		postService.deleteRow(id);
		return new ModelAndView("redirect:listPost");
	}
	
	@RequestMapping("viewPost")
	public ModelAndView edit(@RequestParam int id,@ModelAttribute Post post) {
		Post postObject = postService.getRowById(id);
		return new ModelAndView("post","postObject",postObject);
	}
    @RequestMapping("editPost")
    public ModelAndView edit2(@RequestParam int id,@ModelAttribute Post post) {
        Post postObject = postService.getRowById(id);
        return new ModelAndView("editProfile","postObject",postObject);
    }
	
	@RequestMapping("updatePost")
	public ModelAndView update(@ModelAttribute Post post) {
		postService.updateRow(post);
        ModelAndView mm = new ModelAndView("redirect:showPost");
        mm.getModel().put("id", post.getId());
		return mm;
	}

}