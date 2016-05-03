package com.cubic.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cubic.entity.PersonEntity;
import com.cubic.repo.PersonRepository;
import com.cubic.vo.PersonVO;

@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	private PersonMapper mapper;

	@Autowired
	private PersonRepository repo;

	public PersonVO save(PersonVO person) {
		PersonVO person1=null;
		PersonEntity entity=null;
		if(person.getPk()==null){
			entity = mapper.toPersonEntity(person);
			repo.save(entity);
			person1 = mapper.toPatientVO(entity);
		}else{
			entity = mapper.toPersonEntity(person);
			repo.save(entity);
			person1 = mapper.toPatientVO(entity);
		}
		return person1;
	}

	public void removePerson(Long pk) {
		repo.delete(pk);
	}

	public List<PersonVO> getAll() {
		List<PersonEntity> persons = repo.getAllPersons();
		return mapper.toPersonVOList(persons);
	}

	public List<PersonVO> searchPersons(String name) {
		//name = "%" + name + "%";
		List<PersonEntity> persons = repo.searchPerson(name, name);
		return mapper.toPersonVOList(persons);
	}
	
	public int getCount(){
		return repo.getPersonCOunt();
	}

	public List<Object[]> getallColumns() {
		List<Object[]> pL=repo.getallColumns();
		return pL;
	}

}
