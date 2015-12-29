package com.zto.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zto.model.Person;
import com.zto.service.SelectService;

/**
 * 
 * @author yaoyuxiao
 *
 */
@Controller
public class SelectController {

	@Autowired
	private SelectService selectService;

	@RequestMapping("/select")
	public List<Person> select() {
		Person person = new Person();
		return selectService.SelectPerson(person);

	}

}
