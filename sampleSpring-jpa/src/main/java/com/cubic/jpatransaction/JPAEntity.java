package com.cubic.jpatransaction;

import javax.persistence.EntityManager;

import com.cubic.entity.PersonEntity;

public interface JPAEntity {
	EntityManager getEntityManager();
	
	void setEntityManager(EntityManager em);
	
	PersonEntity executeInsert(final String firstName, final String lastName);
}
