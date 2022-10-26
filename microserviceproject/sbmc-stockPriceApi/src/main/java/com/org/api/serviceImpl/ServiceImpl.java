package com.org.api.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.api.entity.StockPrice;
import com.org.api.repo.StockRepo;
import com.org.api.service.StockService;

@Service
public class ServiceImpl implements StockService {
	@Autowired
	private StockRepo repo;

	@Override
	public StockPrice add(StockPrice price) {

		return repo.save(price);
	}
	
	@Override
	public StockPrice getPriceByName(String name) {
		StockPrice p= repo.findByStockName(name);
		return p ;
	}
}
