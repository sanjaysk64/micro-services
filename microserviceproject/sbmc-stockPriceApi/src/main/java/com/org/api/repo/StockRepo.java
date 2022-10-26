package com.org.api.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.org.api.entity.StockPrice;

@Repository
public interface StockRepo extends JpaRepository<StockPrice, Integer> {

   public StockPrice findByStockName(String name);
}
