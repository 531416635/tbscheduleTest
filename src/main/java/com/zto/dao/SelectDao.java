package com.zto.dao;

import java.util.List;

import com.zto.model.Person;

/**
 * 
 * @author yaoyuxiao
 *
 */
public interface SelectDao {

	List<Person> SelectPerson(Person person);
	
	
}