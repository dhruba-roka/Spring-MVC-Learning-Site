package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.format.datetime.joda.LocalDateTimeParser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller 
public class HomeController {
		
		@RequestMapping("/home")
		public String home() {
			System.out.println("This is home url");
			return "index";
		}
		
		@RequestMapping("/about")
		public String about(Model model) {
			//setting the data
			model.addAttribute("name","Dhruba Roka");
			model.addAttribute("id",12345);
			
			List<String> friends=new ArrayList<String>();
	  		friends.add("ram");
			friends.add("shanti");
			friends.add("ramesh");
			model.addAttribute("f",friends);
			
			return "about";
		}
		
		@RequestMapping("/help")
		public ModelAndView help() {
			//creating model and view object
			ModelAndView modelAndView=new ModelAndView();
			//setting the data
			modelAndView.addObject("name","Samir");
			modelAndView.addObject("rollno",123);
			
			LocalDateTime now= LocalDateTime.now();
			modelAndView.addObject("time",now);
			
			List<Integer> list = new ArrayList<Integer>();
			list.add(12);
			list.add(10);
			list.add(14);
			modelAndView.addObject("marks",list);
			
			//setting the view name
			modelAndView.setViewName("help");
			return modelAndView;
		}
}
