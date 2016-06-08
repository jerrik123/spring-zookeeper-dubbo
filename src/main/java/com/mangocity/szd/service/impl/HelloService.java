package com.mangocity.szd.service.impl;

import com.mangocity.szd.service.IHelloService;

public class HelloService implements IHelloService {

	public String sayHello(String hints) {
		System.out.println("sayHello: " + hints);
		return hints;
	}

}
