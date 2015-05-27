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

	@RequestMapping("formTopic")
	public ModelAndView getForm(@ModelAttribute Topic topic) {
		return new ModelAndView("addTopic");
	}
	
	@RequestMapping("newTopic")
	public ModelAndView register(@ModelAttribute Topic topic) {
		topicService.insertRow(topic);
        return new ModelAndView("redirect:formTopic");
	}
	
	@RequestMapping("listTopic")
	public ModelAndView getList() {
		List topicList = topicService.getList();
		return new ModelAndView("listTopic","topics",topicList);
	}
	
	@RequestMapping("deleteTopic")
	public ModelAndView delete(@RequestParam int id) {
		topicService.deleteRow(id);
		return new ModelAndView("redirect:listTopic");
	}
	
	@RequestMapping("showTopic")
	public ModelAndView edit(@RequestParam int id,@ModelAttribute Topic topic) {
		Topic topicObject = topicService.getRowById(id);
		return new ModelAndView("profile","topicObject",topicObject);
	}
    @RequestMapping("editTopic")
    public ModelAndView edit2(@RequestParam int id,@ModelAttribute Topic topic) {
        Topic topicObject = topicService.getRowById(id);
        return new ModelAndView("updateTopic","topic",topicObject);
    }
	
	@RequestMapping("updateTopic")
	public ModelAndView update(@ModelAttribute Topic topic) {
		topicService.updateRow(topic);
        ModelAndView mm = new ModelAndView("redirect:listTopic");
		return mm;
	}

}