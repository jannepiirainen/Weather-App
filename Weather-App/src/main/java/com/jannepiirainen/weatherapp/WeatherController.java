package com.jannepiirainen.weatherapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WeatherController {
	private boolean flag = false;
	
	@RequestMapping("/")
	public ModelAndView index(ModelAndView mav) {
		mav.setViewName("index");
		return mav;
	}
	
	@RequestMapping(value="/today", method=RequestMethod.GET)
	public ModelAndView today(@RequestParam("city") String city, ModelAndView mav) {
		mav.addObject("city", city );
		mav.setViewName("today");
		return mav;
	}
	
	@RequestMapping(value="/hourly", method=RequestMethod.GET)
	public ModelAndView hourly(@RequestParam("city") String city, ModelAndView mav) {
		mav.addObject("city", city );
		mav.setViewName("hourly");
		return mav;
	}
	
	@RequestMapping(value="/daily", method=RequestMethod.GET)
	public ModelAndView daily(@RequestParam("city") String city, ModelAndView mav) {
		mav.addObject("city", city );
		mav.setViewName("daily");
		return mav;
	}
}
