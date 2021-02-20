package com.hanwhalife.esb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.hanwhalife.esb.demo.AService;
import com.hanwhalife.esb.demo.AServiceProvider;
import com.hanwhalife.esb.demo.BService;
import com.hanwhalife.esb.demo.ESBCallInterface;
import com.hanwhalife.esb.demo.ESBInterfaceWrapper;

@SpringBootApplication
public class HliEsbDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(HliEsbDemoApplication.class, args);
		
//		ESBCallInterface a = new AService();
//		
//		
//		ESBCallInterface b = new BService();
//		
//		a.callESB();
//		
//		b.callESB();
//		
//		System.out.println(">>>>>>> Wrapper Start <<<<<<");
//		
//		AServiceProvider aspInterface = new ESBInterfaceWrapper(a);
//		aspInterface.process();
//		
//		aspInterface = new ESBInterfaceWrapper(b);
//		aspInterface.process();
	}

}
