package com.kongmou.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.kongmou.dao.PersonDao;

@Service
public class PersonService {

	@Resource
	// @Qualifier("bookDao2")
	// '@Autowired()
	private PersonDao personDao;

}
