package com.cubic.test;

import com.cubic.service.ProductServiceImpl;
import com.cubic.util.SpringFactory;


public class SampleSpringTest {

	public static void main(String[] args) {
		ProductServiceImpl ps = SpringFactory.getInstance().getBean("productServiceBean", ProductServiceImpl.class);
		ProductServiceImpl ps1 = SpringFactory.getInstance().getBean("productServiceBean", ProductServiceImpl.class);
		System.out.println(ps.getDefaultManufac());
		System.out.println(ps1.getDefaultManufac());

		ps.setDefaultManufac("TARGET");
		System.out.println();
		System.out.println(ps.getDefaultManufac());
		System.out.println(ps1.getDefaultManufac());

	}

}
