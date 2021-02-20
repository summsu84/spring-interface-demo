package com.hanwhalife.esb.demo;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class BService extends AbstractESBCallClass implements ESBCallInterface {

	@Override
	public void callESB() {
		// TODO Auto-generated method stub
		
		super.abstractCall();
		this.dosomething();
		this.dosomething2();
	}

	@Override
	void dosomething() {
		// TODO Auto-generated method stub
		//System.out.println(">>>B dosomething<<<");
		log.info(">>>B dosomething<<<");
	}

	@Override
	void dosomething2() {
		// TODO Auto-generated method stub
		//System.out.println(">>>B dosomething2<<<");
		log.info(">>>B dosomething 2<<<");
	}

}
