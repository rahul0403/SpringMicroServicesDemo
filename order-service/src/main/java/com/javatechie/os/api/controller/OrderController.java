package com.javatechie.os.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javatechie.os.api.entity.Order;
import com.javatechie.os.api.service.OrderService;

@RestController
@RequestMapping("/orders")
public class OrderController {
	
	@Autowired
	private OrderService service;
	
	@PostMapping("/bookOrder")
	public Order BookOrder(@RequestBody Order order)
	{
		return service.orderSave(order);
	}

}
