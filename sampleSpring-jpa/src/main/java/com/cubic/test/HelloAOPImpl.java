package com.cubic.test;

import com.cubic.vo.CustomerVO;

public class HelloAOPImpl {
	
	private String message;
	
	public CustomerVO sayHello(){
		System.out.println(this.getMessage());
		CustomerVO vo=new CustomerVO();
		vo.setCustormerName("Hey niraj");
		return vo;
	}
	
	public CustomerVo callme(){
		throw new IllegalArgumentException("Throw an exception");
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
