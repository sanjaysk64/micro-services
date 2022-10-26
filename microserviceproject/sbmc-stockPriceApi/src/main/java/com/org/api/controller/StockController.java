package com.org.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.api.entity.StockPrice;
import com.org.api.service.StockService;

@RestController
public class StockController {

	@Autowired
	private StockService service;
	
	@Autowired
	private Environment env;
 
 

	@PostMapping("/add")
	public StockPrice add(@RequestBody StockPrice price) {
		return service.add(price);

	}

	@GetMapping("/getStocksPriceByName/{name}")
	public StockPrice getPriceByName(@PathVariable String name) {
 		StockPrice s = service.getPriceByName(name);
 		
 		String port=env.getProperty("server.port");
 		s.setPortNumber(port);
 		return  s;
	}
}
