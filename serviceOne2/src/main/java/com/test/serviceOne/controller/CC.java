package com.test.serviceOne.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;



	@Controller
	@RequestMapping("/test")
	public class CC {
		//指定get提交
		@RequestMapping(value = "/abc/{name}/{num}", method = RequestMethod.GET)
		@ResponseBody
		public String abc(@PathVariable("name") String name, @PathVariable("num") String num) {
			System.out.println("2222");
			return name+","+num+"two";
		}

	}		