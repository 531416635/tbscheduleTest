package com.zto.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zto.dao.SelectDao;
import com.zto.model.Person;
import com.zto.service.SelectService;

@Service("selectService")
public class SelectServiceImpl implements SelectService {

	@Autowired
	private SelectDao selectDao;

	@Override
	public List<Person> SelectPerson(Person person) {
		// TODO Auto-generated method stub
		return selectDao.SelectPerson(person);
	}

}
