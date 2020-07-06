package com.spring.demo.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.spring.demo.service.BookService;

//import com.spring.demo.HomeController;

@Controller
public class BookController {
	private static final Logger logger = LoggerFactory.getLogger(BookController.class);
	
	@Autowired
	BookService bookService;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	@RequestMapping("/list")
	public ModelAndView list(Locale local) {
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("list",bookService.showList());
		mav.setViewName("listForm");
		
		return mav;
	}
	
	@RequestMapping("/searchForm")
	public String searchForm(Model model) {
		return "searchForm";
	}
	
	@RequestMapping("/search")
	public ModelAndView search(@RequestParam String srch) {
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("list",bookService.showMatched(srch));
		mav.setViewName("search");
		
		return mav;
	}
	
}
