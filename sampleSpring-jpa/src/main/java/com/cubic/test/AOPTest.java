package com.cubic.test;

import com.cubic.jpatransaction.JPAEntity;
import com.cubic.util.SpringFactory;

public class AOPTest {

	public static void main(String[] args) {
		JPAEntity ir = SpringFactory.getInstance().getBean(JPAEntity.class);
		ir.executeInsert("jon", "smith");
		
	}
	
}
