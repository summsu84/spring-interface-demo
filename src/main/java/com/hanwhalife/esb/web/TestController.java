package com.hanwhalife.esb.web;

import java.util.List;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hanwhalife.esb.demo.AServiceProvider;
import com.hanwhalife.esb.demo.ESBCallInterface;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/mycontract")
@Slf4j
public class TestController {
	
	@Autowired
	private List<ESBCallInterface> esbCallInterfaces;
	
	@Autowired
	private AServiceProvider aServiceProvider;
	

	
	@GetMapping(value = "/insurances")
	public void retrieveInsuranceList() {
		//insuranceService.retrieveInsuranceContract();
		log.info("call controller");
		Stream<ESBCallInterface> strem = esbCallInterfaces.stream();
		strem.forEach(s -> {
			s.callESB();
		});
	}
	
	@GetMapping(value = "/insurances2")
	public void retrieveInsuranceList2() {
		//insuranceService.retrieveInsuranceContract();
		log.info("call2 controller");
		aServiceProvider.process();
	}
	
	
}