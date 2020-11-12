package com.spring.weather;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	
	ApiExplorer api;
	
	@RequestMapping(value = "/index.do", method = RequestMethod.GET) 
	public String index(Locale locale, Model model) {
	  logger.info("Welcome home! The client locale is {}.", locale);
	    
	  Date date = new Date(); DateFormat dateFormat =
	  DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
	  
	  String formattedDate = dateFormat.format(date);
	  
	  model.addAttribute("serverTime", formattedDate );
	  
	  return "index"; 
	  
	} 
	
	@RequestMapping(value = "/api.do", method = RequestMethod.GET)
	@ResponseBody
	public void home1(@RequestParam String a, HttpServletRequest reqeust,
		HttpServletResponse response) throws Exception { 
 
		String s = api.api11(a);
		System.out.println(s);
		response.getWriter().print(s);
	
	}
	
	@RequestMapping(value = "/o.do", method = RequestMethod.GET)
	public String o(HttpServletRequest reqeust,
			HttpServletResponse response) throws Exception { 
		 
		return "home";
	}
	
}
