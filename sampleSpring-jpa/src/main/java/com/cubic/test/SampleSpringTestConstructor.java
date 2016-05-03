package com.cubic.test;

import com.cubic.util.SpringFactory;
import com.cubic.vo.CustomerVO;

public class SampleSpringTestConstructor {

	public static void main(String[] main){
		CustomerVO vo=SpringFactory.getInstance().getBean(CustomerVO.class);
		System.out.println(vo);
		
		
		
	}
	
}
