package com.kongmou.controller;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.kongmou.service.PersonService;

@Controller
public class PersonController {

	//@Resource
	@Autowired
	private PersonService personService;

}
