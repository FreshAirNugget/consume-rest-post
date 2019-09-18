package com.service.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.apache.logging.log4j.*;

import com.service.model.ConsumeRequest;
import com.service.model.ConsumeResponse;
import com.service.model.SimulationResponse;

@RestController
public class ConsumeController {
	
	@Autowired
	RestTemplate restTemplate;

	private static Logger Logger = LogManager.getLogger(ConsumeController.class);
	
	@PostMapping("/")
	@ResponseBody
	public ConsumeResponse consume(@RequestBody ConsumeRequest consumeRequest) {
		
//		RestTemplate restTemplate = new RestTemplate();
		
		SimulationResponse resp = restTemplate.postForObject("http://149.129.225.229:7743/simulationbpl", consumeRequest, SimulationResponse.class);
		
		Logger.info(resp.toString());
		
		return new ConsumeResponse(resp.getTotalInstallment(),"This is consumed");
			
	}
	 @Bean
	 public RestTemplate rest() {
	 return new RestTemplate();
	 }
}
