package com.test.serviceOne.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.test.serviceOne.service.HelloRemote;


@Controller
@RequestMapping("/test")
public class ConsumerController {
	@Autowired
	private HelloRemote helloRemote;

	@RequestMapping("/abc/{name}/{num}")
	@ResponseBody
	public String index(@PathVariable("name") String name, @PathVariable("num") String num) {
		return helloRemote.hello(name,num);
	}
}
