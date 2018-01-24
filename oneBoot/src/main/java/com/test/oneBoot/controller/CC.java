package com.test.oneBoot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.test.oneBoot.domain.Student;

import lombok.extern.slf4j.Slf4j;

	@Controller
	@RequestMapping("/test")
	@Slf4j
	public class CC {
		//指定get提交
		@RequestMapping(value = "/abc/{name}/{num}", method = RequestMethod.GET)
		@ResponseBody
		public String abc(@PathVariable("name") String name, @PathVariable("num") String num) {
			Student s = new Student(name, num);
			log.info("----------name :{},num: {}", name, num);
			log.info("少時誦詩書所所");
			System.out.println("2222");
			System.out.println("1111111111111111");
			return s.toString();
		}

	}		