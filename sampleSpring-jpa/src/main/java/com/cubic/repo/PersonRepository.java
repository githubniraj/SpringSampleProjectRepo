package com.cubic.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.cubic.entity.PersonEntity;

public interface PersonRepository extends CrudRepository<PersonEntity, Long> {

	@Query("select p from PersonEntity p")
	public List<PersonEntity> getAllPersons();
	
	@Query("select p from PersonEntity p where UPPER(p.firstName) like UPPER(?1) OR UPPER(p.lastName) like UPPER(?2)")
	List<PersonEntity> searchPerson(final String firstName, final String lastName);
	
	@Query(nativeQuery=true, value="select count(*) from Person")
	public int getPersonCOunt();
	
	@Query(nativeQuery=true, value="select PERSON_ID,FIRST_NAME,LAST_NAME from Person")
	public List<Object[]> getallColumns();

}
