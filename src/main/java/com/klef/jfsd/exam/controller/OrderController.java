package com.klef.jfsd.exam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.klef.jfsd.exam.model.Order;
import com.klef.jfsd.exam.service.OrderService;

@Controller
public class OrderController 
{
	@Autowired
	OrderService service;
	
	@GetMapping("/")
	@ResponseBody
	public String home()
	{
		return "This is Order page";
	}
	
	@GetMapping("viewallorders")
	@ResponseBody
	public List<Order> viewall()
	{
		return  service.viewallorders();
	}
}
