package com.mangocity.szd.service.test;

import java.io.IOException;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mangocity.szd.service.impl.HelloService;

public class Consumer {

	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "applicationContext.xml" });
		context.start();

		HelloService helloService = (HelloService) context
				.getBean("helloService"); 
		String hints = helloService.sayHello(" beautiful girl. ");
		System.out.println("hints: " + hints);
		System.in.read();
	}

}
