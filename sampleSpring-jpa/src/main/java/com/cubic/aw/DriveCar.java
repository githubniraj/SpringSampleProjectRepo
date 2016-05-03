package com.cubic.aw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class DriveCar {

	@Autowired
	@Qualifier("myCar")
	private Car test;
	
	public void drive()
	{
		test.start(100);
		test.stop(10);
	}
	
}
