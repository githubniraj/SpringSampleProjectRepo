package com.cubic.aw;

import org.springframework.stereotype.Service;

@Service//I can even give a name as this @Service("test") so we do not have to write a qualifier adn we can specify name of the variable as that as customerCar
public class CustomerCar  implements Car{
	public Boolean start(int initialSpeed) {
		System.out.println("Started with time"+initialSpeed);
		return Boolean.TRUE;
	}

	public void stop(int seconds) {
		seconds=seconds+5;
		System.out.println("waiting for car for stopping in"+seconds);
		long startTimme=System.currentTimeMillis();
		try {
			Thread.sleep(seconds*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("stopped in"+(System.currentTimeMillis()-startTimme));
	}

}