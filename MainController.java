package com.wheebox.controller;

import java.util.List;


import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.wheebox.Service.UserService;
import com.wheebox.model.student_data;


@Controller
public class MainController {

	@Autowired
	UserService userService;
	
	@RequestMapping("/" )
	public String flag()
	{
		return "index";
	}
	
	@RequestMapping(path = "/details")
	public ModelAndView made(HttpServletRequest req) {
		ModelAndView model = new ModelAndView();

		List<student_data> listdata = this.userService.getAlldata();
		System.out.println("Userlistdata:"+listdata );
		
//		if(!listdata.isEmpty()) {
//			for(student_data i:listdata) {
//				System.out.println(i);
//			}
//		}
//		
		
		return model;
}
}
