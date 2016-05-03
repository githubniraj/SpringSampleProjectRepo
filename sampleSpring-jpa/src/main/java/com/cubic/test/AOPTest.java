package com.cubic.test;

import com.cubic.jpatransaction.JPAEntity;
import com.cubic.util.SpringFactory;

public class AOPTest {

	public static void main(String[] args) {
		//Previoulsy there was HibernateEntityObject
		//Added from workiing directory that need to be updated in the Remote
		//Added another line for learning tag
		JPAEntity ir = SpringFactory.getInstance().getBean(JPAEntity.class);
		ir.executeInsert("jon", "smith");
		
	}
	
}
