package com.org.api.binding;

 
public class StockPrice {
	private Integer id;
	private String stockName;
	private Double stockPrice;
  	private String portNumber;
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
