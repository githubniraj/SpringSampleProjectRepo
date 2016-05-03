package com.cubic.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.cubic.entity.PersonEntity;
import com.cubic.vo.PersonVO;

@Component
public class PersonMapper {
	public PersonEntity toPersonEntity(PersonVO vo) {
		PersonEntity entity = new PersonEntity();
		entity.setFirstName(vo.getFirstName());
		entity.setLastName(vo.getLastName());
		entity.setPk(vo.getPk());
		return entity;
	}

	public PersonVO toPatientVO(PersonEntity entity) {
		PersonVO vo = null;
		if (entity != null) {
			vo = new PersonVO();
			vo.setFirstName(entity.getFirstName());
			vo.setLastName(entity.getLastName());
			vo.setPk(entity.getPk());
		}
		return vo;
	}

	public List<PersonVO> toPersonVOList(List<PersonEntity> entityList) {
		List<PersonVO> results = new ArrayList<PersonVO>();
		for (PersonEntity entity : entityList) {
			results.add(toPatientVO(entity));
		}
		return results;
	}
	
}
