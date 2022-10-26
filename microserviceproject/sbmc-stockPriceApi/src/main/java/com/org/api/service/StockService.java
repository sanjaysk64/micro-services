package com.org.api.service;

import org.springframework.stereotype.Service;

import com.org.api.entity.StockPrice;

public interface StockService {

	public StockPrice add(StockPrice price);
	public StockPrice getPriceByName(String name);
	
}
