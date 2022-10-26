package com.org.api.client;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.org.api.binding.StockPrice;

@FeignClient(name ="stock-Api")
public interface StockFeignClient {


	@GetMapping("/getStocksPriceByName/{name}")
	public StockPrice invokeStockPrice(@PathVariable String name) ;
}
