package com.cubic.aw;

import org.springframework.stereotype.Service;

@Service
public class MyCar implements Car {

	public Boolean start(int initialSpeed) {
		System.out.println("Started with time"+initialSpeed);
		return Boolean.TRUE;
	}

	public void stop(int seconds) {
		
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
