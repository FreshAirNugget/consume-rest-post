package com.service.model;

public class SimulationResponse {
	
	private Integer totalInstallment;

	protected SimulationResponse() {
		
	}
	
	@Override
	public String toString() {
		return "SimulationResponse [totalInstallment=" + totalInstallment + "]";
	}

	public Integer getTotalInstallment() {
		return totalInstallment;
	}

	public void setTotalInstallment(Integer totalInstallment) {
		this.totalInstallment = totalInstallment;
	}
	

}
