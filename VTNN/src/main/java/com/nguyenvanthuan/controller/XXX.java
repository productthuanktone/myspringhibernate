package com.nguyenvanthuan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("ajax")
public class XXX {
	@GetMapping
	@ResponseBody
	public String y() {
		return  "czxcx";
	}
	
	@PostMapping
	@ResponseBody
	public String x(@RequestParam String x) {
		System.out.println(x);
		return "afafa";
	}
}
