package com.service.model;

public class ConsumeResponse {

	private Integer totalInstallment;
	private String message;
	
	protected ConsumeResponse() {
		
	}
	
	public ConsumeResponse(Integer totalInstallment, String message) {
		super();
		this.totalInstallment = totalInstallment;
		this.message = message;
	}
	
	public Integer getTotalInstallment() {
		return totalInstallment;
	}
	public void setTotalInstallment(Integer totalInstallment) {
		this.totalInstallment = totalInstallment;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}
