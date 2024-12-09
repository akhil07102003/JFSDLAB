package com.klef.jfsd.exam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.exam.model.Order;
import com.klef.jfsd.exam.repository.OrderRepository;

@Service
public class OrderServiceImpl implements OrderService 
{
	@Autowired
	OrderRepository orderRepository;
	
	@Override
	public List<Order> viewallorders() 
	{
		return (List<Order>)orderRepository.findAll();
		
		
	}
	

}
