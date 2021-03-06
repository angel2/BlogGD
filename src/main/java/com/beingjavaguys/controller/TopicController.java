package com.beingjavaguys.controller;

import com.beingjavaguys.domain.Topic;
import com.beingjavaguys.services.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class TopicController {
	
	@Autowired
	TopicService topicService;

	@RequestMapping("admin/formTopic")
	public ModelAndView getForm(@ModelAttribute Topic topic) {
		return new ModelAndView("addTopic");
	}
	
	@RequestMapping("admin/newTopic")
	public ModelAndView register(@ModelAttribute Topic topic) {
		topicService.insertRow(topic);
        return new ModelAndView("redirect:formTopic");
	}

	@RequestMapping("listTopic")
	public ModelAndView getList() {
		List topicList = topicService.getList();
		return new ModelAndView("listTopic","topicList",topicList);
	}

}