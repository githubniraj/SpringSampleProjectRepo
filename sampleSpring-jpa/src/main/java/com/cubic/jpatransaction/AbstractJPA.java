package com.cubic.jpatransaction;

import javax.persistence.EntityManager;

import com.cubic.entity.PersonEntity;

public class AbstractJPA implements JPAEntity{

	private EntityManager em = null;
	
	public EntityManager getEntityManager() {
		return em;
	}

	public void setEntityManager(EntityManager em) {
		this.em = em;
	}

	public PersonEntity executeInsert(String firstName, String lastName) {
		PersonEntity entity = new PersonEntity();
		return entity;
	}

	
}
