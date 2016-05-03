package com.cubic.test;

import com.cubic.aw.DriveCar;
import com.cubic.util.SpringFactory;

public class SampleSpringTestAutowired {
	
	public static void main(String[] args) {
	DriveCar dc=SpringFactory.getInstance().getBean(DriveCar.class);
	dc.drive();
}
}