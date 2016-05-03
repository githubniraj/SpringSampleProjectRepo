package com.cubic.jpatransaction;

import org.springframework.stereotype.Service;

import com.cubic.entity.PersonEntity;

@Service
public class HibernateInsertRecord extends AbstractJPA{
	
	public PersonEntity executeInsert(final String firstName, final String lastName){
		System.out.println("inside hibernateInsertRecord");
		PersonEntity entity = new PersonEntity();
		entity.setFirstName(firstName);
		entity.setLastName(lastName);
		this.getEntityManager().persist(entity);
		System.out.println("exiting hibernateInsertRecord");
		return entity;
	}
}
