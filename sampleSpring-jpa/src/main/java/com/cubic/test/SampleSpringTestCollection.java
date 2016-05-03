package com.cubic.test;

import com.cubic.service.ProductService;
import com.cubic.util.SpringFactory;
import com.cubic.vo.ProductVO;


public class SampleSpringTestCollection {

	public static void main(String[] args) {
		ProductService ps = SpringFactory.getInstance().getBean("psCollection", ProductService.class);
		
		for(Double price:ps.)

}
