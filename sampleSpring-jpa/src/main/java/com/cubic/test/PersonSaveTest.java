	package com.cubic.test;

import java.util.List;

import com.cubic.service.PersonService;
import com.cubic.util.SpringFactory;
import com.cubic.vo.PersonVO;

public class PersonSaveTest {

	public static void main(String[] args) {
		PersonService ps = SpringFactory.getInstance().getBean(PersonService.class);
	//	PersonVO person = ps.save(createPersonVO()); // insert
		//ps.removePerson(new Long(185)); // remove
//		System.out.println(person); // insert
//		List<PersonVO> list = ps.getAll(); // get all
	//	List<PersonVO> list = ps.searchPersons("c");
		//System.out.println(list); // get all
		//System.out.println();

	/*public static PersonVO createPersonVO() { // insert
		PersonVO person = new PersonVO();
		person.setFirstName("C");
		person.setLastName("S");
//		person.setPk(new Long(10));
		return person;
	}*/
	
		/*List<Object[]> lColumns=ps.getallColumns(); 
		for (Object[] result : lColumns) {
		System.out.println(result[0] + "==>" + result[1]);
		}*/
	
		//Testing for update
		PersonVO person = new PersonVO();
		person.setFirstName("NIRAJ");
		person.setLastName("KARKI");
		person.setPk(new Long(186));
		PersonVO p=ps.save(person);
		System.out.println(p);
}
}
