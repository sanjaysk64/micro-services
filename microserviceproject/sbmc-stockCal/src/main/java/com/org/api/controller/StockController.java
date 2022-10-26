package com.org.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.org.api.client.StockFeignClient;
 
@RestController
public class StockController {

	@Autowired
	private StockFeignClient client;
	
	@GetMapping("gettotal/{stockName}/{Quntity}")
	public String calc(@PathVariable String stockName, @PathVariable Integer Quntity) {
		
        com.org.api.binding.StockPrice invokeStockPrice = client.invokeStockPrice(stockName);
		Double d= invokeStockPrice.getStockPrice();
		String port =invokeStockPrice.getPortNumber();
		return "total price ="+d*Quntity+" port="+port;

	}
	 
}
