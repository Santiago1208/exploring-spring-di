package com.example.springdi.models.services;

import org.springframework.stereotype.Component;

// @Component("myDummyService2")
public class MyService2 implements IMyService {
	
	@Override
	public String operation() {
		return "Done 2!";
	}

}
