package com.example.springdi.models.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

// @Primary
// @Component("myDummyService")
public class MyService implements IMyService {
	
	@Override
	public String operation() {
		return "Done!";
	}

}
