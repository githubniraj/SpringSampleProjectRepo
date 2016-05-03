package com.cubic.service;

import java.util.List;

import com.cubic.vo.PersonVO;

public interface PersonService {

	PersonVO save(PersonVO person);

	void removePerson(Long pk);
	
	List<PersonVO> getAll();
	
	List<PersonVO> searchPersons(final String name);
	
	public int getCount();
	
	public List<Object[]> getallColumns();
}
