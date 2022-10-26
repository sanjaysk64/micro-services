package com.org.api.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

import org.hibernate.annotations.GeneratorType;

@Entity
public class StockPrice {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String stockName;
	private Double stockPrice;
	@Transient
 	private String portNumber;

	public StockPrice() {
		// TODO Auto-generated constructor stub
	}

	public StockPrice(Integer id, String stockName, Double stockPrice, String portNumber) {
		super();
		this.id = id;
		this.stockName = stockName;
		this.stockPrice = stockPrice;
		this.portNumber = portNumber;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getStockName() {
		return stockName;
	}

	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

	public Double getStockPrice() {
		return stockPrice;
	}

	public void setStockPrice(Double stockPrice) {
		this.stockPrice = stockPrice;
	}

	public String getPortNumber() {
		return portNumber;
	}

	public void setPortNumber(String portNumber) {
		this.portNumber = portNumber;
	}

	 

}
