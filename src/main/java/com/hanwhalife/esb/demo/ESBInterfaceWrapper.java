package com.hanwhalife.esb.demo;

import java.util.List;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ESBInterfaceWrapper implements AServiceProvider {
	
	@Autowired
	private List<ESBCallInterface> esbCallInterfaces;
	
	private ESBCallInterface esbCallInterface;
	
	public ESBInterfaceWrapper() {
		
	}
	
	public ESBInterfaceWrapper(ESBCallInterface a) {
		// TODO Auto-generated constructor stub
		this.esbCallInterface = a;
	}

	public void setESBCallInterface(ESBCallInterface esbCallInterface) {
		this.esbCallInterface = esbCallInterface;
	}

	@Override
	public void process() {
		// TODO Auto-generated method stub
		System.out.println(">>>AServiceProvider Do Something...<<<");
		// this.esbCallInterface.callESB();
		Stream<ESBCallInterface> streams = esbCallInterfaces.stream();
		
		streams.forEach(s -> {
			s.callESB();
		});
	}

}
