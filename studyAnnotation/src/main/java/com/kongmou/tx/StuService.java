package com.kongmou.tx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StuService {

	@Autowired
	private StudentDao studentDao;

	@Transactional
	public void insertStu() {
		studentDao.insert();
		System.out.println("插入完成");
		//int i = 10 / 0;
	}
}
