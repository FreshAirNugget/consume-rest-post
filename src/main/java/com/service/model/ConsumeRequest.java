package com.service.model;

public class ConsumeRequest {
	
	private String product;
	private Integer tenor;
	private Integer loan;
	
	protected ConsumeRequest() {
		
	}
	
	public ConsumeRequest(String product, Integer tenor, Integer loan) {
		super();
		this.product = product;
		this.tenor = tenor;
		this.loan = loan;
	}
	
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public Integer getTenor() {
		return tenor;
	}
	public void setTenor(Integer tenor) {
		this.tenor = tenor;
	}
	public Integer getLoan() {
		return loan;
	}
	public void setLoan(Integer loan) {
		this.loan = loan;
	}

}
